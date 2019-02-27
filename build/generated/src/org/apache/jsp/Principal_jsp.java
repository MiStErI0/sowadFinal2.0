package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.usuario;
import funciones.usuarioBD;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/body.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");

        usuarioBD usu = new usuarioBD();

        usuario e;
        String nombre = null;
        e = usu.usuActivo();
        if (e.getEstado() == 2) {
            nombre = usu.nomUsuAc();
        } else {
            response.sendRedirect("login.jsp");
        }


    
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function usuario() {\r\n");
      out.write("            var fsfd = \"");
      out.print( nombre);
      out.write("\";\r\n");
      out.write("            document.getElementById(\"peru\").innerHTML = fsfd;\r\n");
      out.write("            document.getElementById(\"hola\").innerHTML = fsfd;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"nav-md\" onload=\"usuario()\">\r\n");
      out.write("    <div class=\"container body\">\r\n");
      out.write("        <div class=\"main_container\">\r\n");
      out.write("            <div class=\"col-md-3 left_col\">\r\n");
      out.write("                <div class=\"left_col scroll-view\">\r\n");
      out.write("                    <div class=\"navbar nav_title\"  style=\"border: 0;text-align: center; font-family: 'Federant', cursive;\">\r\n");
      out.write("                        <a href=\"Home.htm\" class=\"site_title\"> <span>Sistema de Reclamos</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                    <br />\r\n");
      out.write("\r\n");
      out.write("                    <!-- sidebar menu -->\r\n");
      out.write("                    <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("                        <div class=\"menu_section\">\r\n");
      out.write("                            <h3>General</h3>\r\n");
      out.write("                            <ul class=\"nav side-menu\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <li><a href=\"ReclamoServlet?accion=REGISTRAR\">\r\n");
      out.write("                                        <i class=\"fa fa-pencil-square-o\" style=\"font-size:20px\"></i> Registrar Reclamo\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"ReclamoServlet?accion=LISTAR\">\r\n");
      out.write("                                        <i class=\"fas fa-list\" style='font-size:15px'></i> Lista de Reclamos\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("                                 \r\n");
      out.write("                                <li><a href=\"#\">\r\n");
      out.write("                                        <i class='far fa-user' style='font-size:20px'></i> Usuarios\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"ReclamoServlet?accion=AJUSTES\">\r\n");
      out.write("                                        <i class=\"fas fa-list\" style='font-size:15px'></i> Ajustes\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /sidebar menu -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- /menu footer buttons -->\r\n");
      out.write("                    <div class=\"sidebar-footer hidden-small\">\r\n");
      out.write("                        <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\" href=\"login.html\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /menu footer buttons -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- top navigation -->\r\n");
      out.write("            <div class=\"top_nav\">\r\n");
      out.write("                <div class=\"nav_menu\">\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <div class=\"nav toggle\">\r\n");
      out.write("                            <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                            <li class=\"\">\r\n");
      out.write("                                <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                    <img src=\"images/img.jpg\" alt=\"\"><label id=\"hola\" ></label>\r\n");
      out.write("                                    <span class=\" fa fa-angle-down\"></span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\r\n");
      out.write("                                    <li><a href=\"javascript:;\"> Profile</a></li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"javascript:;\">\r\n");
      out.write("                                            <span class=\"badge bg-red pull-right\">50%</span>\r\n");
      out.write("                                            <span>Settings</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"javascript:;\">Help</a></li>\r\n");
      out.write("                                    <li><a href=\"login.html\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("                                <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("                                    <span class=\"badge bg-green\">6</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a>\r\n");
      out.write("                                            <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                                            <span>\r\n");
      out.write("                                                <span>John Smith</span>\r\n");
      out.write("                                                <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"message\">\r\n");
      out.write("                                                Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a>\r\n");
      out.write("                                            <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                                            <span>\r\n");
      out.write("                                                <span>John Smith</span>\r\n");
      out.write("                                                <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"message\">\r\n");
      out.write("                                                Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a>\r\n");
      out.write("                                            <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                                            <span>\r\n");
      out.write("                                                <span>John Smith</span>\r\n");
      out.write("                                                <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"message\">\r\n");
      out.write("                                                Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a>\r\n");
      out.write("                                            <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                                            <span>\r\n");
      out.write("                                                <span>John Smith</span>\r\n");
      out.write("                                                <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"message\">\r\n");
      out.write("                                                Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <a>\r\n");
      out.write("                                                <strong>See All Alerts</strong>\r\n");
      out.write("                                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /top navigation -->\r\n");
      out.write("            <div class=\"right_col\" role=\"main\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function ()\r\n");
      out.write("        {\r\n");
      out.write("            $(\"#mostrarmodal\").modal(\"show\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <div class=\"modal fade\" id=\"mostrarmodal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"basicModal\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <h3 class=\"text\" style=\"text-align: center\" id=\"peru\">Bienvenido ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <a href=\"#\" data-dismiss=\"modal\" class=\"btn btn-danger\">Cerrar</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
