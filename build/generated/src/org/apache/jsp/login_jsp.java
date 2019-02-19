package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <script src=\"resource/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"resource/vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: url(source/fondo-login.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .login-container{\n");
      out.write("               \n");
      out.write("                margin-top: 15%;\n");
      out.write("                margin-left: 26%;\n");
      out.write("            }\n");
      out.write("            .login-form-1{\n");
      out.write("                padding: 1%;\n");
      out.write("                box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("                background-color: #fff; \n");
      out.write("            }\n");
      out.write("            .login-form-1 h3{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #333;\n");
      out.write("                font: bold 300% sans-serif;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .login-container form{\n");
      out.write("                padding: 1%;\n");
      out.write("            }\n");
      out.write("            .btnSubmit\n");
      out.write("            {\n");
      out.write("                width: 50%;\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                padding: 1%;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .login-form-1 .btnSubmit{\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #2a3f54;\n");
      out.write("                margin-left: 26%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-form-1 .ForgetPwd{\n");
      out.write("                color: #2a3f54;\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-left: 35%\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"container login-container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-7 login-form-1\">\n");
      out.write("                        <h3>Bienvenidos</h3>\n");
      out.write("                        <form action=\"usuario\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Usuario *\" value=\"\" name=\"usuario\" required/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Contraseña *\" value=\"\" name=\"pass\" required/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" class=\"btnSubmit\" value=\"Login\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <a href=\"#\" class=\"ForgetPwd\">Olvido la Contraseña?</a>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
