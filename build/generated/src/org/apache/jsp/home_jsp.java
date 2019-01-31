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
      out.write("    <section class=\"content-header\">\n");
      out.write("        <h1 style=\"margin-top: 55px;\">\n");
      out.write("            Panel de Administrador\n");
      out.write("            <small>Version 2.3.0</small>\n");
      out.write("        </h1>\n");
      out.write("        <ol class=\"breadcrumb\" style=\"margin-top: 55px;\">\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"fas fa-dolly\"></i> Productos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"active\">Fiemec</li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    Nuevo</a>\n");
      out.write("            </li>\n");
      out.write("        </ol>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"box\" style=\"border-top: 3px solid #18A689\">\n");
      out.write("                    <div class=\"box-header with-border\" style=\"padding: 10px !important\">\n");
      out.write("                        <h4>\n");
      out.write("                            <strong style=\"font-weight: 400\">\n");
      out.write("                                <i class=\"fas fa-dolly\"></i> Datos Productos Fiemec\n");
      out.write("                            </strong>\n");
      out.write("                        </h4>\n");
      out.write("                        @if(count($errors)>0)\n");
      out.write("                        <div class=\"alert-alert-danger\">\n");
      out.write("                            <ul>\n");
      out.write("                                @foreach ($errors->all() as $error)\n");
      out.write("                                <li>{{$error}}</li>\n");
      out.write("                                @endforeach \n");
      out.write("                            </ul>\t\n");
      out.write("                        </div>\n");
      out.write("                        @endif\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.box-header -->\n");
      out.write("                    {!!Form::open(array('url'=>'proforma/producto','method'=>'POST','autocomplete'=>'off','files'=>'true'))!!}\n");
      out.write("\n");
      out.write("                    {{Form::token()}}\n");
      out.write("                    <div class=\"box-body bg-gray-c\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <div class=\"panel panel-default panel-shadow\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\t\t\t\t\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Tipo Producto</label>\n");
      out.write("                                                    <select id=\"a\" name=\"marca_producto\" class=\"form-control\">\n");
      out.write("                                                        <option value=\"\" disabled selected >Selecione Tipo de Producto</option>\n");
      out.write("                                                        <option value=\"CAS\">Catalogo</option>\n");
      out.write("                                                        <option value=\"Bandejas\">Bandejas</option>\n");
      out.write("                                                        <option value=\"Tableros\">Tableros</option>\n");
      out.write("                                                        <option value=\"Accesorios\">Accesorios</option>\n");
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\t\n");
      out.write("\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <div class=\"form-group label-floating\">  \n");
      out.write("                                                    <label>Nombre de Familia</label>                                     \n");
      out.write("                                                    <select required name=\"idFamilia\" class=\"form-control selectpicker\" id=\"b\" data-live-search=\"true\">\n");
      out.write("\n");
      out.write("                                                        <option value=\"\" disabled selected>Seleccione Familia</option>\n");
      out.write("                                                        @foreach($familia as $fa)\n");
      out.write("\n");
      out.write("                                                        <option value=\"{{$fa->idFamilia}}_{{$fa->nombre_familia}}\">{{$fa->nombre_familia}}</option>\n");
      out.write("                                                        @endforeach  \n");
      out.write("                                                    </select>\n");
      out.write("                                                </div> \n");
      out.write("                                            </div> \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Serie Producto</label>  \n");
      out.write("                                                    <input id=\"c\" type=\"text\" name=\"serie_producto\" class=\"form-control\" {{old('serie_producto')}} placeholder=\"Número Serie ...\">\t\n");
      out.write("                                                </div> \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Codigo Pedido</label>\n");
      out.write("                                                    <input id=\"d\" type=\"text\" name=\"codigo_pedido\" class=\"form-control\" {{old('codigo_pedido')}} placeholder=\"Código Pedido ...\">\t\n");
      out.write("                                                </div>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Codigo Producto</label>\n");
      out.write("                                                    <input id=\"e\" type=\"text\" name=\"codigo_producto\" class=\"form-control\" {{old('odigo_producto')}} placeholder=\"Código Producto ...\">\t\n");
      out.write("                                                </div> \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-8\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Nombre Producto</label>\n");
      out.write("                                                    <input id=\"f\" type=\"text\" name=\"nombre_producto\" class=\"form-control\"  {{old('nombre_producto')}} placeholder=\"Nombre Producto ...\">\t\n");
      out.write("                                                </div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"form-group label-floating\"> \n");
      out.write("                                                    <label>Marca Producto</label>                                      \n");
      out.write("                                                    <select name=\"idMarca\" class=\"form-control selectpicker\" id=\"g\" data-live-search=\"true\">\n");
      out.write("\n");
      out.write("                                                        <option value=\"\" disabled selected>Seleccione Marca</option>\n");
      out.write("                                                        @foreach($marca as $fa)\n");
      out.write("\n");
      out.write("                                                        <option value=\"{{$fa->idMarca}}\">{{$fa->nombre_proveedor}}</option>\n");
      out.write("                                                        @endforeach  \n");
      out.write("                                                    </select>\n");
      out.write("                                                </div> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Stock</label> \n");
      out.write("                                                    <input id=\"h\" type=\"text\" name=\"stock\" class=\"form-control\" placeholder=\"Stock ...\">\t\n");
      out.write("                                                </div>   \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Precio</label> \n");
      out.write("                                                    <input id=\"i\" type=\"text\" name=\"precio_unitario\" class=\"form-control\" placeholder=\"Precio ...\">\t\n");
      out.write("                                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <div class=\"from-group\">\n");
      out.write("                                                    <label>Categoria</label> \n");
      out.write("                                                    <select id=\"j\" name=\"categoria_producto\" class=\"form-control\" >\n");
      out.write("                                                        <option value=\"\" disabled selected>Categoria</option>\n");
      out.write("                                                        <option value=\"Catalogo\">Catalogo</option>\n");
      out.write("                                                        <option value=\"Producto Fiemec\">Producto Fiemec</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Descripcion</label> \n");
      out.write("                                                    <input id=\"k\" type=\"text\" name=\"descripcion_producto\" class=\"form-control\" placeholder=\"Descripción...\">\n");
      out.write("                                                </div>\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <button  type=\"button\" class=\"btn btn-primary\"><i class=\"fas fa-plus\"></i> Consultar</button>\n");
      out.write("                                                </div>\t\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("                            </html>\n");
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
