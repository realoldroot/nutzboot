# logback扩展功能

## loglevel -- 动态修改NB项目日志等级


### 实现原理

* 客户端同步实例名称、进程ID到Redis，并通过TTL实现心跳机制

* 客户端订阅频道，当监听到命令则根据命令修改logback日志等级

### 配置文件(客户端与服务端一样)
```
#动态修改日志等级
logback.exts.loglevel.enabled=true
#心跳间隔(单位:秒)
logback.exts.loglevel.heartbeat=5
```

### 服务端发送命令
```
@Inject
private LoglevelService loglevelService;
    
LoglevelCommand loglevelCommand=new LoglevelCommand();
loglevelCommand.setAction("name");//action=name时 
loglevelCommand.setLevel("error");
loglevelCommand.setName("wk-nb-dubbo-sys");//action=name 时不为空
//loglevelCommand.setProcessId("1234");//action=processId 时不为空
loglevelService.changeLoglevel(loglevelCommand);

redis.host=127.0.0.1
redis.port=6379
redis.timeout=2000
redis.max_redir=10
redis.database=0
redis.maxTotal=100
#redis.password=test123
#redis集群模式设置 redis.mode=cluster
redis.mode=normal
#redis.nodes=
```

### pom.xml
```
        <dependency>
            <groupId>org.nutz</groupId>
            <artifactId>nutzboot-starter-redis</artifactId>
            <version>${nutzboot.version}</version>
        </dependency>
         <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>${slf4j.version}</version>
        </dependency>
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-core</artifactId>
            <version>${logback.version}</version>
        </dependency>
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>${logback.version}</version>
        </dependency>
        <dependency>
            <groupId>org.nutz</groupId>
            <artifactId>nutzboot-starter-logback-exts</artifactId>
            <version>${nutzboot.version}</version>
        </dependency>
```