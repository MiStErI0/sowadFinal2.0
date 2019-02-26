package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <script src=\"resource/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"resource/vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"resource/vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <script src=\"resource/vendors/jquery/dist/jquery.js\"></script>\n");
      out.write("        <script src=\"validar/validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: url(source/fondo-login.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .login-container{\n");
      out.write("\n");
      out.write("                margin-top: 10%;\n");
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
      out.write("\n");
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
      out.write("                margin-left: 25%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-form-1 .ForgetPwd{\n");
      out.write("                color: #2a3f54;\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-left: 38.5%\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .toggle {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 10px;\n");
      out.write("                right: 7px;\n");
      out.write("                width: 130px;\n");
      out.write("                height: 30px;\n");
      out.write("                font-size: 12px;\n");
      out.write("                line-height: 25px;\n");
      out.write("                text-align: center;\n");
      out.write("                border-top: 2px solid #2a3f54;\n");
      out.write("                border-bottom: 2px solid #2a3f54;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: all .5s ease;\n");
      out.write("            }\n");
      out.write("            .toggle:hover {\n");
      out.write("                border-top: 2px solid #00b3ee;\n");
      out.write("                border-bottom: 2px solid #00b3ee;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .contenedor-form .toggle span {\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("            }\n");
      out.write("            .formulario{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .formulario:nth-child(2) {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function carga()\n");
      out.write("            {\n");
      out.write("                titulo = \"Cambiar Contraseña\";\n");
      out.write("                document.getElementById('prueba').innerHTML = titulo;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"carga()\">\n");
      out.write("        <div>\n");
      out.write("            <div class=\"container login-container\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-7 login-form-1\">\n");
      out.write("                    <div class=\"toggle\">\n");
      out.write("\n");
      out.write("                        <span id=\"prueba\"  ></span>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"formulario\">\n");
      out.write("                        <h3>Bienvenidos</h3>\n");
      out.write("                        <form action=\"usuario?accion=iniciarU\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" id=\"nom\" class=\"form-control\" placeholder=\"Usuario *\" onkeypress=\"return soloLetras(event,'nom')\" value=\"\" name=\"usuario\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Contraseña *\" onkeypress=\"return soloNumeros(event)\" value=\"\" name=\"pass\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" class=\"btnSubmit\"  value=\"Login\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <a href=\"#\" class=\"col-md-4\">Olvido la Contraseña?</a>\n");
      out.write("                                <a href=\"#\" class=\"col-md-4 col-md-offset-4\">Seguimiento de Ticket</a><br/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h4 style=\"color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; \">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</h4>    \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"formulario\">\n");
      out.write("                        <h3>Cambiar contraseña</h3>\n");
      out.write("                        <form action=\"usuario?accion=cambiarCon\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Usuario *\" value=\"\" name=\"usuarioCam\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Antigua Contraseña *\" value=\"\" name=\"oldpass\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Nueva Contraseña *\" value=\"\" name=\"newpass\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" class=\"btnSubmit\"  value=\"Cambiar Contraseña\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <a href=\"#\" class=\"col-md-4\">Olvido la Contraseña?</a>\n");
      out.write("                                <a href=\"#\" class=\"col-md-4 col-md-offset-4\">Seguimiento de Ticket</a><br/>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h4 style=\"color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; \">");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</h4>    \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $('.toggle').click(function () {\n");
      out.write("                $('.formulario').animate({\n");
      out.write("                    height: \"toggle\",\n");
      out.write("                    'padding-top': 'toggle',\n");
      out.write("                    'padding-bottom': 'toggle',\n");
      out.write("                    opacity: 'toggle'\n");
      out.write("                }, \"slow\");\n");
      out.write("                var titulo = document.getElementById('prueba').innerHTML;\n");
      out.write("                if (titulo === \"iniciar Sesion\")\n");
      out.write("                {\n");
      out.write("                    titulo = \"Cambiar contraseña\";\n");
      out.write("                    document.getElementById('prueba').innerHTML = titulo;\n");
      out.write("                } else {\n");
      out.write("                    titulo = \"iniciar Sesion\";\n");
      out.write("                    document.getElementById('prueba').innerHTML = titulo;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
