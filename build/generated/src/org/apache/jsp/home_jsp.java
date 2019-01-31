package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "body.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"box-body bg-gray-c\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\t\t\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Tipo Documento</label>\n");
      out.write("                                    <select id=\"a\" name=\"marca_producto\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\" disabled selected >Selecione Tipo de Producto</option>\n");
      out.write("                                        <option value=\"DNI\">DNI</option>\n");
      out.write("                                        <option value=\"RUC\">RUC</option>\n");
      out.write("                                        <option value=\"PASAPORTE\">PASAPORTE</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\t\t\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Tipo Documento</label>\n");
      out.write("                                    <input type=\"text\" id=\"iddocumento\" name=\"documento\" class=\"form-control\" placeholder=\"ingrese documento...\" >\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Nombres</label>  \n");
      out.write("                                    <input id=\"idnombre\" type=\"text\" name=\"nombre\" class=\"form-control\"  placeholder=\"ingrese nombres...\">\t\n");
      out.write("                                </div> \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Apellido Paterno</label>\n");
      out.write("                                    <input id=\"idpaterno\" type=\"text\" name=\"paterno\" class=\"form-control\"  placeholder=\"ingrese apellido...\">\t\n");
      out.write("                                </div>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Apellido Materno</label>\n");
      out.write("                                    <input id=\"idmaterno\" type=\"text\" name=\"materno\" class=\"form-control\"  placeholder=\"ingrese apellido...\">\t\n");
      out.write("                                </div> \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\t\t\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Departamento</label>\n");
      out.write("                                    <select id=\"iddepartamento\" name=\"departamento\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\" disabled selected >Selecione Departamento</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\t\t\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Provincia</label>\n");
      out.write("                                    <select id=\"idprovincia\" name=\"provincia\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\" disabled selected >Selecione Provincia</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"col-sm-4\">\t\t\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Distrito</label>\n");
      out.write("                                    <select id=\"iddistrito\" name=\"distrito\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\" disabled selected >Selecione Distrito</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Direccion</label> \n");
      out.write("                                    <input id=\"iddireccion\" type=\"text\" name=\"direccion\" class=\"form-control\" placeholder=\"Ingrese Direccion ...\">\t\n");
      out.write("                                </div>   \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Correo Electronico</label> \n");
      out.write("                                    <input id=\"idcorreo\" type=\"text\" name=\"correo\" class=\"form-control\" placeholder=\"Ingrese correo ...\">\t\n");
      out.write("                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Telefono</label> \n");
      out.write("                                    <input id=\"idtelefono\" type=\"text\" name=\"telefono\" class=\"form-control\" placeholder=\"Ingrese telefono ...\">\t\n");
      out.write("                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Celular</label> \n");
      out.write("                                    <input id=\"idcelular\" type=\"text\" name=\"celular\" class=\"form-control\" placeholder=\"Ingrese celular ...\">\t\n");
      out.write("                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Fecha del hecho</label> \n");
      out.write("                                    <input id=\"idfecha\" type=\"text\" name=\"fecha\" class=\"form-control\" placeholder=\"Ingrese correo ...\">\t\n");
      out.write("                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Funcionario</label> \n");
      out.write("                                    <input id=\"idfuncionario\" type=\"text\" name=\"funcionario\" class=\"form-control\" placeholder=\"Ingrese telefono ...\">\t\n");
      out.write("                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Descripcion</label> \n");
      out.write("                                    <textarea id=\"iddescripcion\" type=\"text\" name=\"descripcion\" class=\"form-control\" placeholder=\"Descripción...\"></textarea>\n");
      out.write("                                </div>\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Adjuntar archivos</label> \n");
      out.write("                                    <input id=\"idarchivo\" type=\"file\" name=\"archivo\" class=\"form-control\" placeholder=\"Ingrese archivo\">\t\n");
      out.write("                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-top: 23px\" class=\"col-sm-2\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <button  type=\"button\" class=\"btn btn-primary\"> Enviar</button>\n");
      out.write("                                </div>\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
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
