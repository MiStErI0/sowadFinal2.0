package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.reclamos;

public final class modal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    ");

        reclamos reclamo = (reclamos) request.getSession().getAttribute("reclamo");
    
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"ProductoServlet?accion=MODIFICARBD\" method=\"post\">\n");
      out.write("            \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"box-body bg-gray-c\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"\" class=\"control-label\" style=\"color: #676a6c !important \">\n");
      out.write("                                Ticket 00000");
      out.print(reclamo.getIdreclamos());
      out.write(" - ");
      out.print(reclamo.getFechahecho());
      out.write(" - ");
      out.print(reclamo.getNombreestado());
      out.write("\n");
      out.write("                            </label><br></br>\n");
      out.write("                            <label for=\"\" class=\"control-label\" style=\"color: #676a6c !important\">\n");
      out.write("                                Denunciante\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Doc. Identidad</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cdireccion\" id=\"cdireccion\" class=\"form-control \" value=\"");
      out.print(reclamo.getNum_documento());
      out.write(" >\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Telefono</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cdireccion\" id=\"cdireccion\" class=\"form-control\" >\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Apeliidos y nombres</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" value=\"");
      out.print(reclamo.getNombreP());
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Ubigeo</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" value=\"");
      out.print(reclamo.getNombreP());
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>domicilio</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" value=\"");
      out.print(reclamo.getNombreP());
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Correo Electronico</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" value=\"");
      out.print(reclamo.getNombreP());
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"\" class=\"control-label\" style=\"color: #676a6c !important\">\n");
      out.write("                                Denunciado\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>\n");
      out.write("                                        Funcionario\n");
      out.write("                                    </label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"simbolo\" id=\"simbolo\" class=\"form-control\" placeholder=\"Simbolo\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>\n");
      out.write("                                        Area\n");
      out.write("                                    </label>\n");
      out.write("                                    <input type=\"text\" disabled id=\"valorcambio\" class=\"form-control\" placeholder=\"Cambio\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Descripcion de la Denuncia</label>\n");
      out.write("                                    <textarea type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" > </textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Archivos Adjuntos</label>\n");
      out.write("                                    <textarea type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" > </textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Categoria</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" > \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Derivar Area</label>\n");
      out.write("                                    <input type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" > \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Detalle</label>\n");
      out.write("                                    <textarea type=\"text\" disabled name=\"cnro_documento\" id=\"cnro_documento\" class=\"form-control\" > </textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
