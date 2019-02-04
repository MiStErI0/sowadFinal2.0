package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.distrito;
import modelo.provincia;
import java.util.ArrayList;
import funciones.reclamoDB;
import modelo.departamento;
import java.util.List;

public final class RegistrarReclamo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<select id=\"selProv\" name=\"selProv\">\r\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</select>  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "body.html", out, false);
      out.write("\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("        <h1 style=\"margin-top: 55px; text-align: center\">\r\n");
      out.write("            Registrar de Reclamo\r\n");
      out.write("\r\n");
      out.write("        </h1>\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </ol>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"ReclamoServlet?accion=REGISTRARBD\" method=\"POST\">\r\n");
      out.write("        <div class=\"box-body bg-gray-c\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"panel panel-default panel-shadow\">\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\t\t\t\t\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Tipo Documento</label>\r\n");
      out.write("                                        <select id=\"a\" name=\"marca_producto\" class=\"form-control\">\r\n");
      out.write("                                            <option value=\"\" disabled selected >Selecione Tipo de Producto</option>\r\n");
      out.write("                                            <option value=\"DNI\">DNI</option>\r\n");
      out.write("                                            <option value=\"RUC\">RUC</option>\r\n");
      out.write("                                            <option value=\"PASAPORTE\">PASAPORTE</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\t\t\t\t\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Tipo Documento</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"iddocumento\" name=\"documento\" class=\"form-control\" placeholder=\"ingrese documento...\" >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Nombres</label>  \r\n");
      out.write("                                        <input id=\"idnombre\" type=\"text\" name=\"nombre\" class=\"form-control\"  placeholder=\"ingrese nombres...\">\t\r\n");
      out.write("                                    </div> \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Apellido Paterno</label>\r\n");
      out.write("                                        <input id=\"idpaterno\" type=\"text\" name=\"paterno\" class=\"form-control\"  placeholder=\"ingrese apellido...\">\t\r\n");
      out.write("                                    </div>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Apellido Materno</label>\r\n");
      out.write("                                        <input id=\"idmaterno\" type=\"text\" name=\"materno\" class=\"form-control\"  placeholder=\"ingrese apellido...\">\t\r\n");
      out.write("                                    </div> \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                List<departamento> listaB = (ArrayList<departamento>) request.getSession().getAttribute("listaB");
                            
      out.write("\r\n");
      out.write("                            ");

                                List<provincia> listaC = (ArrayList<provincia>) request.getSession().getAttribute("listaC");
                            
      out.write("\r\n");
      out.write("                            ");

                                List<distrito> listaD = (ArrayList<distrito>) request.getSession().getAttribute("listaD");
                            
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-4\">\t\t\t\t\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Departamento</label>\r\n");
      out.write("                                        <select id=\"iddepartamento\" name=\"departamento\" class=\"form-control\">\r\n");
      out.write("                                            ");

                                                for (departamento e : listaB) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(e.getIddepa());
      out.write('"');
      out.write('>');
      out.print(e.getDepartamento());
      out.write("</option>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-4\">\t\t\t\t\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Provincia</label>\r\n");
      out.write("                                        <select id=\"idprovincia\" name=\"provincia\" class=\"form-control\">\r\n");
      out.write("                                            ");

                                                for (provincia e : listaC) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(e.getIdprov());
      out.write('"');
      out.write('>');
      out.print(e.getProvincia());
      out.write("</option>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>      \r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"col-sm-4\">\t\t\t\t\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Distrito</label>\r\n");
      out.write("                                        <select id=\"iddistrito\" name=\"distrito\" class=\"form-control\">\r\n");
      out.write("                                        ");

                                                for (distrito e : listaD) {
                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(e.getIddist());
      out.write('"');
      out.write('>');
      out.print(e.getDistrito());
      out.write("</option>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Direccion</label> \r\n");
      out.write("                                        <input id=\"iddireccion\" type=\"text\" name=\"direccion\" class=\"form-control\" placeholder=\"Ingrese Direccion ...\">\t\r\n");
      out.write("                                    </div>   \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Correo Electronico</label> \r\n");
      out.write("                                        <input id=\"idcorreo\" type=\"text\" name=\"correo\" class=\"form-control\" placeholder=\"Ingrese correo ...\">\t\r\n");
      out.write("                                    </div>  \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Telefono</label> \r\n");
      out.write("                                        <input id=\"idtelefono\" type=\"text\" name=\"telefono\" class=\"form-control\" placeholder=\"Ingrese telefono ...\">\t\r\n");
      out.write("                                    </div>  \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Celular</label> \r\n");
      out.write("                                        <input id=\"idcelular\" type=\"text\" name=\"celular\" class=\"form-control\" placeholder=\"Ingrese celular ...\">\t\r\n");
      out.write("                                    </div>  \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Fecha del hecho</label> \r\n");
      out.write("                                        <input id=\"idfecha\" type=\"text\" name=\"fecha\" class=\"form-control\" placeholder=\"Ingrese correo ...\">\t\r\n");
      out.write("                                    </div>  \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-8\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Funcionario</label> \r\n");
      out.write("                                        <input id=\"idfuncionario\" type=\"text\" name=\"funcionario\" class=\"form-control\" placeholder=\"Ingrese telefono ...\">\t\r\n");
      out.write("                                    </div>  \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Descripcion</label> \r\n");
      out.write("                                        <textarea id=\"iddescripcion\" type=\"text\" name=\"descripcion\" class=\"form-control\" placeholder=\"Descripción...\"></textarea>\r\n");
      out.write("                                    </div>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-10\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Adjuntar archivos</label> \r\n");
      out.write("                                        <input id=\"idarchivo\" type=\"file\" name=\"archivo\" class=\"form-control\" placeholder=\"Ingrese archivo\">\t\r\n");
      out.write("                                    </div>  \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div style=\"margin-top: 23px\" class=\"col-sm-2\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <input type=\"submit\" value=\"enviar\">\r\n");
      out.write("                                    </div>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("conexion");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/sowad1?useTimezone=true&serverTimezone=UTC");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("database");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("sqlprov");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conexion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("    select idDepartamento, departamento from departamento\r\n");
          out.write("    \r\n");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("fila");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sqlprov.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fila.idDepartamento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fila.departamento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
