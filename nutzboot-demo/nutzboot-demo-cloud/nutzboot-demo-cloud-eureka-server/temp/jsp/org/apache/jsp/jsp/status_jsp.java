/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2018-01-05 05:44:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.Map.Entry;
import com.netflix.discovery.shared.Pair;
import com.netflix.discovery.shared.*;
import com.netflix.eureka.util.*;
import com.netflix.appinfo.InstanceInfo.*;
import com.netflix.appinfo.DataCenterInfo.*;
import com.netflix.appinfo.AmazonInfo.MetaDataKey;
import com.netflix.eureka.resources.*;
import com.netflix.eureka.*;
import com.netflix.appinfo.*;
import com.netflix.eureka.util.StatusUtil;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("com.netflix.appinfo.DataCenterInfo");
    _jspx_imports_packages.add("com.netflix.eureka.resources");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.netflix.appinfo.InstanceInfo");
    _jspx_imports_packages.add("com.netflix.discovery.shared");
    _jspx_imports_packages.add("com.netflix.eureka.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.netflix.eureka");
    _jspx_imports_packages.add("com.netflix.appinfo");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.netflix.discovery.shared.Pair");
    _jspx_imports_classes.add("java.util.Map.Entry");
    _jspx_imports_classes.add("com.netflix.appinfo.AmazonInfo.MetaDataKey");
    _jspx_imports_classes.add("com.netflix.eureka.util.StatusUtil");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("    <title>Eureka</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/main.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery-1.11.1.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery.dataTables.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" >\r\n");
      out.write("       $(document).ready(function() {\r\n");
      out.write("           $('table.stripeable tr:odd').addClass('odd');\r\n");
      out.write("           $('table.stripeable tr:even').addClass('even');\r\n");
      out.write("           $('#instances thead th').each(function () {\r\n");
      out.write("               var title = $('#instances thead th').eq($(this).index()).text();\r\n");
      out.write("               $(this).html(title + '</br><input type=\"text\" placeholder=\"Search ' + title + '\" />');\r\n");
      out.write("           });\r\n");
      out.write("           // DataTable\r\n");
      out.write("           var table = $('#instances').DataTable({\"paging\": false, \"bInfo\": false, \"sDom\": 'ltipr', \"bSort\": false});\r\n");
      out.write("           // Apply the search\r\n");
      out.write("           table.columns().eq(0).each(function (colIdx) {\r\n");
      out.write("               $('input', table.column(colIdx).header()).on('keyup change', function () {\r\n");
      out.write("                   table.column(colIdx).search(this.value).draw();\r\n");
      out.write("               });\r\n");
      out.write("           });\r\n");
      out.write("       });\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body id=\"one\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("      <div class=\"sectionTitle\">Instances currently registered with Eureka</div>\r\n");
      out.write("        <table id='instances' class=\"stripeable\">\r\n");
      out.write("           <thead><tr><th>Application</th><th>AMIs</th><th>Availability Zones</th><th>Status</th></tr></thead>\r\n");
      out.write("           <tfoot><tr><th>Application</th><th>AMIs</th><th>Availability Zones</th><th>Status</th></tr></tfoot>\r\n");
      out.write("           <tbody>\r\n");
      out.write("           ");

           EurekaServerContext serverContext = (EurekaServerContext) pageContext.getServletContext()
                   .getAttribute(EurekaServerContext.class.getName());
           for(Application app : serverContext.getRegistry().getSortedApplications()) {
               out.print("<tr><td><b>" + app.getName() + "</b></td>");
               Map<String, Integer> amiCounts = new HashMap<String, Integer>();
               Map<InstanceStatus,List<Pair<String, String>>> instancesByStatus =
                   new HashMap<InstanceStatus, List<Pair<String,String>>>();
               Map<String,Integer> zoneCounts = new HashMap<String, Integer>();
               
               for(InstanceInfo info : app.getInstances()){
                   String id = info.getId();
                   String url = info.getStatusPageUrl();
                   InstanceStatus status = info.getStatus();
                   String ami = "n/a";
                   String zone = "";
                   if(info.getDataCenterInfo().getName() == Name.Amazon){
                       AmazonInfo dcInfo = (AmazonInfo)info.getDataCenterInfo();
                       ami = dcInfo.get(MetaDataKey.amiId);
                       zone = dcInfo.get(MetaDataKey.availabilityZone);
                   }
                   
                   Integer count = amiCounts.get(ami);
                   if(count != null){
                       amiCounts.put(ami, Integer.valueOf(count.intValue()+1));
                   }else {
                       amiCounts.put(ami, Integer.valueOf(1));
                   }
                   
                   count = zoneCounts.get(zone);
                   if(count != null){
                       zoneCounts.put(zone, Integer.valueOf(count.intValue()+1));
                   }else {
                       zoneCounts.put(zone, Integer.valueOf(1));
                   }
                   List<Pair<String, String>> list = instancesByStatus.get(status);
                   
                   if(list == null){
                       list = new ArrayList<Pair<String,String>>();
                       instancesByStatus.put(status, list);
                   }
                   list.add(new Pair<String, String>(id, url));  
               }
               StringBuilder buf = new StringBuilder();
               for (Iterator<Entry<String, Integer>> iter = 
                   amiCounts.entrySet().iterator(); iter.hasNext();) {
                   Entry<String, Integer> entry = iter.next();
                   buf.append("<b>").append(entry.getKey()).append("</b> (").append(entry.getValue()).append("), ");
               }
               out.println("<td>" + buf.toString() + "</td>");
               buf = new StringBuilder();
               for (Iterator<Entry<String, Integer>> iter = 
                   zoneCounts.entrySet().iterator(); iter.hasNext();) {
                   Entry<String, Integer> entry = iter.next();
                   buf.append("<b>").append(entry.getKey()).append("</b> (").append(entry.getValue()).append("), ");
               }
               out.println("<td>" + buf.toString() + "</td>");
               buf = new StringBuilder();
               for (Iterator<Entry<InstanceStatus, List<Pair<String,String>>>> iter = 
                   instancesByStatus.entrySet().iterator(); iter.hasNext();) {
                   Entry<InstanceStatus, List<Pair<String,String>>> entry = iter.next();
                   List<Pair<String, String>> value = entry.getValue();
                   InstanceStatus status = entry.getKey();
                   if(status != InstanceStatus.UP){
                       buf.append("<font color=red size=+1><b>");
                   }
                   buf.append("<b>").append(status.name()).append("</b> (").append(value.size()).append(") - ");
                   if(status != InstanceStatus.UP){
                       buf.append("</font></b>");
                   }
                   
                   for(Pair<String,String> p : value) {
                       String id = p.first();
                       String url = p.second();
                       if(url != null && url.startsWith("http")){
                           buf.append("<a href=\"").append(url).append("\">");
                       }else {
                           url = null;
                       }
                       buf.append(id);
                       if(url != null){
                           buf.append("</a>");
                       }
                       buf.append(", ");
                   }
               }
               out.println("<td>" + buf.toString() + "</td></tr>");
           }
           
      out.write("\r\n");
      out.write("           </tbody>\r\n");
      out.write("           </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div>\r\n");
      out.write("      <div class=\"sectionTitle\">General Info</div>\r\n");
      out.write("      <table id='generalInfo' class=\"stripeable\">\r\n");
      out.write("          <tr><th>Name</th><th>Value</th></tr>\r\n");
      out.write("           ");

           StatusInfo statusInfo = (new StatusUtil(serverContext)).getStatusInfo();
           Map<String,String> genMap = statusInfo.getGeneralStats();
           for (Map.Entry<String,String> entry : genMap.entrySet()) {
             out.print("<tr>");
             out.print("<td>" + entry.getKey() +  "</td><td>" + entry.getValue() + "</td>");
             out.print("</tr>");
           }
           Map<String,String> appMap = statusInfo.getApplicationStats();
           for (Map.Entry<String,String> entry : appMap.entrySet()) {
             out.print("<tr>");
             out.print("<td>" + entry.getKey() +  "</td><td>" + entry.getValue() + "</td>");
             out.print("</tr>");
           }
           
      out.write("\r\n");
      out.write("           </table>      \r\n");
      out.write("      </div>\r\n");
      out.write("      <div>\r\n");
      out.write("      <div class=\"sectionTitle\">Instance Info</div>\r\n");
      out.write("        <table id='instanceInfo' class=\"stripeable\">\r\n");
      out.write("          <tr><th>Name</th><th>Value</th></tr>\r\n");
      out.write("           ");

           InstanceInfo instanceInfo = statusInfo.getInstanceInfo();
           Map<String,String> instanceMap = new HashMap<String,String>();
           instanceMap.put("ipAddr", instanceInfo.getIPAddr());
           instanceMap.put("status", instanceInfo.getStatus().toString());
           if(instanceInfo.getDataCenterInfo().getName() == DataCenterInfo.Name.Amazon) {
               AmazonInfo info = (AmazonInfo) instanceInfo.getDataCenterInfo();
               instanceMap.put("availability-zone", info.get(AmazonInfo.MetaDataKey.availabilityZone));
               instanceMap.put("public-ipv4", info.get(AmazonInfo.MetaDataKey.publicIpv4));
               instanceMap.put("instance-id", info.get(AmazonInfo.MetaDataKey.instanceId));
               instanceMap.put("public-hostname", info.get(AmazonInfo.MetaDataKey.publicHostname));
               instanceMap.put("ami-id", info.get(AmazonInfo.MetaDataKey.amiId));
               instanceMap.put("instance-type", info.get(AmazonInfo.MetaDataKey.instanceType));
           }
           for (Map.Entry<String,String> entry : instanceMap.entrySet()) {
             out.print("<tr>");
             out.print("<td>" + entry.getKey() +  "</td><td>" + entry.getValue() + "</td>");
             out.print("</tr>");
           }
           
      out.write("\r\n");
      out.write("           </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
