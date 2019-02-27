package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.usuario;
import funciones.usuarioBD;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    usuarioBD usu = new usuarioBD();
    
    usuario e=null;
    e=usu.usuActivo();
    if(e.getEstado()== 2){
    response.sendRedirect("Principal.jsp");
    }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <script src=\"resource/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link href=\"resource/vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"resource/vendors/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"resource/vendors/jquery/dist/jquery.js\"></script>\r\n");
      out.write("        <script src=\"validar/validaciones.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background: url(source/fondo-login.jpg);\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                background-attachment: fixed;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .login-container{\r\n");
      out.write("\r\n");
      out.write("                margin-top: 10%;\r\n");
      out.write("                margin-left: 26%;\r\n");
      out.write("            }\r\n");
      out.write("            .login-form-1{\r\n");
      out.write("                padding: 1%;\r\n");
      out.write("                box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("                background-color: #fff; \r\n");
      out.write("            }\r\n");
      out.write("            .login-form-1 h3{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                color: #333;\r\n");
      out.write("                font: bold 300% sans-serif;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .login-container form{\r\n");
      out.write("                padding: 1%;\r\n");
      out.write("            }\r\n");
      out.write("            .btnSubmit\r\n");
      out.write("            {\r\n");
      out.write("                width: 50%;\r\n");
      out.write("                border-radius: 1rem;\r\n");
      out.write("                padding: 1%;\r\n");
      out.write("                border: none;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("            .login-form-1 .btnSubmit{\r\n");
      out.write("                font-weight: 600;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                background-color: #2a3f54;\r\n");
      out.write("                margin-left: 25%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .login-form-1 .ForgetPwd{\r\n");
      out.write("                color: #2a3f54;\r\n");
      out.write("                font-weight: 600;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                margin-left: 38.5%\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .toggle {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 10px;\r\n");
      out.write("                right: 7px;\r\n");
      out.write("                width: 130px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("                line-height: 25px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                border-top: 2px solid #2a3f54;\r\n");
      out.write("                border-bottom: 2px solid #2a3f54;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                transition: all .5s ease;\r\n");
      out.write("            }\r\n");
      out.write("            .toggle:hover {\r\n");
      out.write("                border-top: 2px solid #00b3ee;\r\n");
      out.write("                border-bottom: 2px solid #00b3ee;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .contenedor-form .toggle span {\r\n");
      out.write("                letter-spacing: 1px;\r\n");
      out.write("            }\r\n");
      out.write("            .formulario{\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .formulario:nth-child(2) {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            function carga()\r\n");
      out.write("            {\r\n");
      out.write("                titulo = \"Cambiar Contraseña\";\r\n");
      out.write("                document.getElementById('prueba').innerHTML = titulo;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"carga()\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"container login-container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-7 login-form-1\">\r\n");
      out.write("                    <div class=\"toggle\">\r\n");
      out.write("\r\n");
      out.write("                        <span id=\"prueba\"  ></span>\r\n");
      out.write("                    </div>  \r\n");
      out.write("                    <div class=\"formulario\">\r\n");
      out.write("                        <h3>Bienvenidos</h3>\r\n");
      out.write("                        <form action=\"usuario?accion=iniciarU\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"text\" id=\"nom\" class=\"form-control\" placeholder=\"Usuario *\" onkeypress=\"return soloLetras(event,this.value,10)\" value=\"\" name=\"usuario\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Contraseña *\" onkeypress=\"return soloNumeros(event,this.value,10)\" value=\"\" name=\"pass\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btnSubmit\"  value=\"Login\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <a href=\"#\" class=\"col-md-4\">Olvido la Contraseña?</a>\r\n");
      out.write("                                <a href=\"#\" class=\"col-md-4 col-md-offset-4\">Seguimiento de Ticket</a><br/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <h4 style=\"color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; \">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</h4>    \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"formulario\">\r\n");
      out.write("                        <h3>Cambiar contraseña</h3>\r\n");
      out.write("                        <form action=\"usuario?accion=cambiarCon\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Usuario *\" value=\"\" name=\"usuarioCam\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Antigua Contraseña *\" value=\"\" name=\"oldpass\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Nueva Contraseña *\" value=\"\" name=\"newpass\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btnSubmit\"  value=\"Cambiar Contraseña\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <a href=\"#\" class=\"col-md-4\">Olvido la Contraseña?</a>\r\n");
      out.write("                                <a href=\"#\" class=\"col-md-4 col-md-offset-4\">Seguimiento de Ticket</a><br/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <h4 style=\"color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; \">");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</h4>    \r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $('.toggle').click(function () {\r\n");
      out.write("                $('.formulario').animate({\r\n");
      out.write("                    height: \"toggle\",\r\n");
      out.write("                    'padding-top': 'toggle',\r\n");
      out.write("                    'padding-bottom': 'toggle',\r\n");
      out.write("                    opacity: 'toggle'\r\n");
      out.write("                }, \"slow\");\r\n");
      out.write("                var titulo = document.getElementById('prueba').innerHTML;\r\n");
      out.write("                if (titulo === \"iniciar Sesion\")\r\n");
      out.write("                {\r\n");
      out.write("                    titulo = \"Cambiar contraseña\";\r\n");
      out.write("                    document.getElementById('prueba').innerHTML = titulo;\r\n");
      out.write("                } else {\r\n");
      out.write("                    titulo = \"iniciar Sesion\";\r\n");
      out.write("                    document.getElementById('prueba').innerHTML = titulo;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
