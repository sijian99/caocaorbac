/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-12-09 07:42:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        /***\r\n");
      out.write("         * 一、问题:\r\n");
      out.write("         *    一级菜单点击后会新增一个标签页显示，但是一级菜单是不需要的，怎么办?\r\n");
      out.write("         * 解决:\r\n");
      out.write("         *   我们需要在菜单节点的单击事件中，新增逻辑，判断当前点击的菜单是否为\r\n");
      out.write("         *   一级菜单，如果是则不新增标签页，如果不是则继续其他逻辑。\r\n");
      out.write("         * 注意:\r\n");
      out.write("         *     菜单节点的单击事件中获取获取一个为node的实参，node为当前点击的菜单节点的\r\n");
      out.write("         *     信息的json对象。node中的数据其实是Tree组件的异步加载的响应数据。那么我们\r\n");
      out.write("         *     是不是可以在node中添加一个标记，标记该菜单节点是否为一级菜单，而在node中\r\n");
      out.write("         *     新增标记数据，说白了，就让Tree组件的响应数据中的json中新增标记数据。而Tree组件的\r\n");
      out.write("         *     响应数据是后台给的，一个菜单节点的响应数据为一个TreeResult对象的json。\r\n");
      out.write("         *     也就是说我们需要在TreeResult中新增新的属性存储新的数据即可。但是TreeResult中的\r\n");
      out.write("         *     属性是不能随便声明的，因为需要和Tree组件配套使用，就需要再次查看Tree组件的API文档\r\n");
      out.write("         *     查看TreeResult中如何声明除id,text,state属性以外的属性。通过API发现，每个Tree组件的\r\n");
      out.write("         *     节点可以定义6个属性:\r\n");
      out.write("         *          id：表示菜单节点的ID\r\n");
      out.write("         *          text:菜单节点的名称\r\n");
      out.write("         *          state:菜单节点的状态\r\n");
      out.write("         *          attributes:节点的自定义属性，放到TreeResult实体类中，就是一个map集合\r\n");
      out.write("         *          children:子节点集合\r\n");
      out.write("         *          checked:是否显示多选框效果\r\n");
      out.write("         *   实现：\r\n");
      out.write("         *        ① 在TreeResult实体类中新增属性 attributes,属性类型为map集合\r\n");
      out.write("         *        ② 修改MenuServiceImpl的业务代码，在将Menu转换为TreeResult对象时，新增给attributes属性赋值\r\n");
      out.write("         *          使用attributes属性存储菜单的自定义的数据，比如:节点的类型，节点的url地址\r\n");
      out.write("         *        ③ 在Tree的单击事件中，新增判断逻辑，判断当前点击的节点的node中的attributes中的isparent的属性值，\r\n");
      out.write("         *          如果为1，则表示为父节点，则不需要新增标签页。\r\n");
      out.write("         * 二、问题:\r\n");
      out.write("         *      点击菜单已经实现，新增一个标签页了，但是在标签页面并没有实现显示当前菜单的url地址资源，怎么办?\r\n");
      out.write("         *    解决:\r\n");
      out.write("         *      新增的标签页中显示当前点击的节点的url地址资源，而标签页本质其实一个DIV标签。\r\n");
      out.write("         *      而Div标签本身是不具备URL地址访问的功能的。那么我们就需要在DIv中开辟一个可以\r\n");
      out.write("         *      根据URL地址显示资源的空间，考虑使用iframe标签。也就是当我们点击菜单节点，新增一个\r\n");
      out.write("         *      标签页的时候，在新增的标签页中添加一个iframe标签，并将点击的节点的url地址给\r\n");
      out.write("         *      iframe，让其去加载对应的资源显示给用户。\r\n");
      out.write("         *    实现:\r\n");
      out.write("         *        ① 在新增的标签页面，初始化时使用content属性，在新增的标签页中添加一个iframe标签，用来\r\n");
      out.write("         *          加载节点的url资源\r\n");
      out.write("         *        ② 将单击的节点的url地址赋值给新增的标签页中的iframe标签。\r\n");
      out.write("         *\r\n");
      out.write("         * /\r\n");
      out.write("        /***************实现菜单节点和tabs组件的联动效果******************************/\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $('#menuTree').tree({\r\n");
      out.write("                onClick: function (node) {//node为存储了当前点击的节点的信息的Json对象\r\n");
      out.write("                    console.log(node)\r\n");
      out.write("                    if(node.attributes.isparent==1){return;}\r\n");
      out.write("                    //判断标签页是否存在\r\n");
      out.write("                    var has=$(\"#tabs\").tabs('exists',node.text);\r\n");
      out.write("                    if(has){\r\n");
      out.write("                        //选择已经存在的标签页\r\n");
      out.write("                        $(\"#tabs\").tabs('select',node.text);\r\n");
      out.write("                    }else{\r\n");
      out.write("                        //新增标签页\r\n");
      out.write("                        $(\"#tabs\").tabs('add',{\r\n");
      out.write("                            title:node.text,\r\n");
      out.write("                            content:\"<iframe src='\"+node.attributes.url+\"' style='width: 100%;height: 100%;border: none' />\",\r\n");
      out.write("                            closable:true\r\n");
      out.write("                        })\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("        /***********************给数组件添加onLoadError监听**********************************/\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#menuTree\").tree({\r\n");
      out.write("                onLoadError:function (arguments) {\r\n");
      out.write("                    //跳转登录页面\r\n");
      out.write("                    window.location.href=\"login.jsp\";\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("<div data-options=\"region:'north',split:false\" style=\"height:70px;\"></div>\r\n");
      out.write("<div data-options=\"region:'south',split:false\" style=\"height:50px;\"></div>\r\n");
      out.write("<div data-options=\"region:'west',title:'系统菜单',split:false\" style=\"width:200px;\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <ul class=\"easyui-tree\" id=\"menuTree\" data-options=\"url:'menuInfo'\"></ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-options=\"region:'center'\" style=\"padding:5px;background:#eee;\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div id=\"tabs\" class=\"easyui-tabs\" data-options=\"fit:true\">\r\n");
      out.write("        <div title=\"Tab1\" style=\"padding:20px;display:none;\">首页</div>\r\n");
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