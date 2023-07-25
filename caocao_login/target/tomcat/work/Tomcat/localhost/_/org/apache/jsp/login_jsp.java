/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-12-09 07:52:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    //http://localhost:8080/01_sxtoa_war_exploded/

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/themes/icon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/demo.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"static/js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"static/js/jquery.easyui.min.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        /*声明代码:判断登录页面是否在顶层中显示，不是则置顶显示*/\r\n");
      out.write("        var p=window.top.location.href;//获取最顶层的url地址\r\n");
      out.write("        var c=window.location.href;//获取当前区域的url地址\r\n");
      out.write("        if(p!=c){\r\n");
      out.write("            window.top.location.href=window.location.href;\r\n");
      out.write("        }\r\n");
      out.write("        /********声明页面加载事件:给登录按钮添加单击事件，完成登录请求的发送****************************/\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#userLogin\").click(function () {\r\n");
      out.write("                //提交表单,使用easyUI的表单异步提交\r\n");
      out.write("                $(\"#userFm\").form('submit',{\r\n");
      out.write("                    url:\"userLogin\",\r\n");
      out.write("                    success:function (data) {//只要有响应结果就会触发，无论后台处理结果施成功还是失败，data接收的就是响应结果\r\n");
      out.write("                        if(eval(data)){\r\n");
      out.write("                            window.location.href=\"main.jsp\";\r\n");
      out.write("                        }else{\r\n");
      out.write("                            alert(\"登录失败:用户名或密码错误\")\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 430px;height: 300px;margin: auto;margin-top: 100px;\">\r\n");
      out.write("    <div class=\"easyui-panel\" style=\"text-align: center\" data-options=\"title:'登录',iconCls:'icon-save',fit:true\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <form  id=\"userFm\" method=\"post\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div style=\"margin-top: 40px;\">\r\n");
      out.write("                <input class=\"easyui-textbox\" name=\"uname\" data-options=\"width:250\" prompt=\"用户名/手机号/邮箱\" label=\"账号:\" labelWidth=\"60\">\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div style=\"margin-top: 40px;\">\r\n");
      out.write("                <input class=\"easyui-passwordbox\" name=\"pwd\" prompt=\"请输入密码\" data-options=\"width:250\" label=\"密码:\" labelWidth=\"60\">\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div style=\"margin-top: 40px;\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <a id=\"userLogin\" href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\">点击登录</a>\r\n");
      out.write("                &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <input class=\"easyui-checkbox\" label=\"记住密码\" labelPosition=\"after\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}