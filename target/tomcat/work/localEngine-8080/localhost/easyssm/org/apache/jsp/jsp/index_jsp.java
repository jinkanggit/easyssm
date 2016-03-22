package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write("div#container{width:100%;height:100%}\r\n");
      out.write("div#header {background-color:#438eb9;}\r\n");
      out.write("div#menu {background-color:#F2F2F2;height:93%;width:5%;float:left;clear:both}\r\n");
      out.write("div#content {background-color:#FFFFFF;height:93%;width:92%;float:left;}\r\n");
      out.write("div#footer {background-color:#99bbbb;clear:both;text-align:center;height:33px;}\r\n");
      out.write("div#menu {background-color:#999999;height:93%;width:8%;}\r\n");
      out.write("\tbody,html {\r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\theight:99%;\r\n");
      out.write("\t\t\tcolor: #000;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tfont-family: \"Helvetica Neue\",Helvetica,STheiti,微软雅黑,宋体,Arial,Tahoma,sans-serif,serif;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t/*左侧菜单*/\r\n");
      out.write("\t\t.sidebar-menu{\r\n");
      out.write("\t\t\tborder-right: 1px solid #c4c8cb;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*一级菜单*/\r\n");
      out.write("\t\t.menu-first{\r\n");
      out.write("\t\t\theight:35px;\r\n");
      out.write("\t\t\tline-height:35px;\r\n");
      out.write("\t\t\tbackground-color: #e9e9e9;\r\n");
      out.write("\t\t\tborder-top: 1px solid #efefef;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid #e1e1e1;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\tfont-weight: normal;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*一级菜单鼠标划过状态*/\r\n");
      out.write("\t\t.menu-first:hover{\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tbackground-color: #d6d4d5;\r\n");
      out.write("\t\t\tborder-top: 1px solid #b7b7b7;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid #acacac;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*二级菜单*/\r\n");
      out.write("\t\t.menu-second li a{\r\n");
      out.write("\t\t\tbackground-color: #f6f6f6;\r\n");
      out.write("\t\t\theight:31px;\r\n");
      out.write("\t\t\tline-height:31px;\r\n");
      out.write("\t\t\tborder-top: 1px solid #efefef;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid #efefef;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*二级菜单鼠标划过样式*/\r\n");
      out.write("\t\t.menu-second li a:hover {\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tbackground-color: #66c3ec;\r\n");
      out.write("\t\t\tborder-top: 1px solid #83ceed;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid #83ceed;\r\n");
      out.write("\t\t\tborder-right: 3px solid #f8881c;\r\n");
      out.write("\t\t\tborder-left: 3px solid #66c3ec;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*二级菜单选中状态*/\r\n");
      out.write("\t\t.menu-second-selected {\r\n");
      out.write("\t\t\tbackground-color: #66c3ec;\r\n");
      out.write("\t\t\theight:31px;\r\n");
      out.write("\t\t\tline-height:31px;\r\n");
      out.write("\t\t\tborder-top: 1px solid #83ceed;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid #83ceed;\r\n");
      out.write("\t\t\tborder-right: 3px solid #f8881c;\r\n");
      out.write("\t\t\tborder-left: 3px solid #66c3ec;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*覆盖bootstrap的样式*/\r\n");
      out.write("\t\t.nav-list,.nav-list li a{\r\n");
      out.write("\t\t\tpadding: 0px;\r\n");
      out.write("\t\t\tmargin: 0px;\r\n");
      out.write("\t\t} \r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://www.huosen.net/demo/bootstrap-menu/css/bootstrap.min.css\">\r\n");
      out.write("\t \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://www.huosen.net/demo/bootstrap-menu/css/font-awesome.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"http://www.huosen.net/demo/bootstrap-menu/js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("\t<script src=\"http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("\t<script src=\"http://www.huosen.net/demo/bootstrap-menu/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t/*手动调节的样式*/\r\n");
      out.write("\t\t.nav-list>li>a {\r\n");
      out.write("    \t\tpadding: 5px 20px 0px 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"></head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\"> <img src=\"/easyssm/src/main/webapp/images/1.jpg\" alt=\"1\" /> </div>\r\n");
      out.write("  <div id=\"menu\"> \r\n");
      out.write("\t    \r\n");
      out.write("\t\t   <div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"offset span12\">\r\n");
      out.write("\t\t\t   <!--Sidebar content-->\r\n");
      out.write("\t\t\t   <div class=\"sidebar-menu\"> <a href=\"#userMeun\" style=\"padding-top:13px;padding-left:0px\" class=\"nav-header menu-first collapsed\" data-toggle=\"collapse\"><i class=\"icon-user-md icon-large\"></i> 用户管理</a>\r\n");
      out.write("\t\t\t\t<ul id=\"userMeun\" class=\"nav nav-list collapse menu-second\">\r\n");
      out.write("\t\t\t\t   <li><a href=\"#\"><i class=\"icon-user\"></i> 增加用户</a></li>\r\n");
      out.write("\t\t\t\t   <li><a href=\"#\"><i class=\"icon-edit\"></i> 修改用户</a></li>\r\n");
      out.write("\t\t\t\t   <li><a href=\"#\"><i class=\"icon-trash\"></i> 删除用户</a></li>\r\n");
      out.write("\t\t\t\t   <li><a href=\"#\"><i class=\"icon-list\"></i> 用户列表</a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t\t<a href=\"#articleMenu\" style=\"padding-top:13px;padding-left:0px\" class=\"nav-header menu-first collapsed\" data-toggle=\"collapse\"><i class=\"icon-book icon-large\"></i> 文章管理</a>\r\n");
      out.write("\t\t\t\t<ul id=\"articleMenu\" class=\"nav nav-list collapse menu-second\">\r\n");
      out.write("\t\t\t\t   <li><a href=\"#\"><i class=\"icon-pencil\"></i> 添加文章</a></li>\r\n");
      out.write("\t\t\t\t   <li><a href=\"#\"><i class=\"icon-list-alt\"></i> 文章列表</a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t \r\n");
      out.write("  </div>\r\n");
      out.write("   <div id=\"content\">\r\n");
      out.write("    <iframe style=\"width:100%;height:100%;\" scrolling=\"no\"  frameborder=\"0\"  src=\"note.jsp\"></iframe>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"footer\">Copyright W3School.com.cn</div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
