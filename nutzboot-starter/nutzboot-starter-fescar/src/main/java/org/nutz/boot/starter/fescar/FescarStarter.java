package org.nutz.boot.starter.fescar;

import org.nutz.boot.AppContext;
import org.nutz.boot.annotation.PropDoc;
import org.nutz.boot.starter.ServerFace;
import org.nutz.ioc.impl.PropertiesProxy;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import com.alibaba.fescar.common.util.StringUtils;
import com.alibaba.fescar.rm.RMClient;
import com.alibaba.fescar.tm.TMClient;

@IocBean
public class FescarStarter implements ServerFace {

    private static final Log log = Logs.get();

    protected static final String PRE = "fescar.";

    @PropDoc(value = "fescar应用id", need = true)
    public static String PROP_APPID = PRE + "applicationId";

    @PropDoc(value = "fescar事务组", need = true)
    public static String PROP_TXGROUP = PRE + "txServiceGroup";

    @PropDoc(value = "自动创建undo表", defaultValue = "true")
    public static String PROP_CREATE_UNDO = PRE + "create_undo_table";

    @Inject
    protected PropertiesProxy conf;

    @Inject
    protected AppContext appContext;

    private String applicationId;
    private String txServiceGroup;

    @Override
    public void start() throws Exception {
        if (FescarHelper.disableGlobalTransaction) {
            if (log.isInfoEnabled()) {
                log.info("Global transaction is disabled.");
            }
            return;
        }
        if (!conf.getBoolean("fescar.enable", true)) {
            log.info("Global transaction is disabled.");
            return;
        }
        applicationId = conf.check(PROP_APPID);
        txServiceGroup = conf.check(PROP_TXGROUP);
        log.infof("fescar applicationId=%s txServiceGroup=%s", applicationId, txServiceGroup);

        initClient();
    }

    protected void initClient() {
        if (log.isInfoEnabled()) {
            log.info("Initializing Global Transaction Clients ... ");
        }
        if (StringUtils.isNullOrEmpty(applicationId) || StringUtils.isNullOrEmpty(txServiceGroup)) {
            throw new IllegalArgumentException("applicationId: " + applicationId + ", txServiceGroup: " + txServiceGroup);
        }
        // init TM
        TMClient.init(applicationId, txServiceGroup);
        if (log.isInfoEnabled()) {
            log.info("Transaction Manager Client is initialized. applicationId[" + applicationId + "] txServiceGroup[" + txServiceGroup + "]");
        }
        // init RM
        RMClient.init(applicationId, txServiceGroup);
        if (log.isInfoEnabled()) {
            log.info("Resource Manager is initialized. applicationId[" + applicationId + "] txServiceGroup[" + txServiceGroup + "]");
        }

        if (log.isInfoEnabled()) {
            log.info("Global Transaction Clients are initialized. ");
        }
    }
}
