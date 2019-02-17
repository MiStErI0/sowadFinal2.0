package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.reclamos;
import java.util.List;

public final class ListarReclamos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        html,body {\r\n");
      out.write("\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("        .title{\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            -webkit-box-shadow: inset 0px 9px 59px -11px rgba(0,0,0,0.77);\r\n");
      out.write("            -moz-box-shadow: inset 0px 9px 59px -11px rgba(0,0,0,0.77);\r\n");
      out.write("            box-shadow: inset 0px 9px 59px -11px rgba(0,0,0,0.77);\r\n");
      out.write("        }\r\n");
      out.write("        .title h3{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            font-family: 'ZCOOL QingKe HuangYou', cursive;\r\n");
      out.write("            font-size: 45px;\r\n");
      out.write("        }\r\n");
      out.write("        .container{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            background-color: yellow;   \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .row{\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            float: left;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("\r\n");
      out.write("            margin-top: 40px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .row h5 a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .color{\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 22px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        #customers {\r\n");
      out.write("            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #customers td, #customers th {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #customers tr:nth-child(even){background-color: #f2f2f2;}\r\n");
      out.write("\r\n");
      out.write("        #customers tr:hover {background-color: #ddd;}\r\n");
      out.write("\r\n");
      out.write("        #customers th {\r\n");
      out.write("            padding-top: 12px;\r\n");
      out.write("            padding-bottom: 12px;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        button{\r\n");
      out.write("            background-color: green;\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border:1px solid white;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .color{\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "body.html", out, false);
      out.write("\r\n");
      out.write("    ");

        List<reclamos> listaA = (ArrayList<reclamos>) request.getSession().getAttribute("listaA");
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("        <h1 style=\"margin-top: 55px; text-align: center\">\r\n");
      out.write("            Lista de Reclamos\r\n");
      out.write("\r\n");
      out.write("        </h1>\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </ol>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("\r\n");
      out.write("    ");
if (listaA.size() != 0) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <table id=\"customers\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Ticket</td>\r\n");
      out.write("            <td>Descripcion</td>\r\n");
      out.write("            <td>Fecha</td>\r\n");
      out.write("            <td>Opciones</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
for (reclamos f : listaA) {
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>0000");
      out.print(f.getIdreclamos());
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(f.getDescripcion() );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(f.getFechahecho() );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("            <td>\r\n");
      out.write("                <a href=\"ProductoServlet?accion=VER&id=");
      out.print(f.getIdreclamos());
      out.write("\">VER</a>\r\n");
      out.write("                <a href=\"ProductoServlet?accion=MODIFICAR&id=");
      out.print(f.getIdreclamos());
      out.write("\">EDITAR</a>\r\n");
      out.write("                <a href=\"ProductoServlet?accion=ELIMINAR&id=");
      out.print(f.getIdreclamos());
      out.write("\">SEGUIMIENTO</a></td>\r\n");
      out.write("\r\n");
      out.write("        </tr>  \r\n");
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    ");
} else {
      out.write("\r\n");
      out.write("    <p style=\"color: red;\">no hay Producto</p>\r\n");
      out.write("    ");
}
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
}
