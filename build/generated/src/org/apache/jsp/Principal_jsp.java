package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        function usuario(){\r\n");
      out.write("        var fsfd=document.getElementById(\"peru\").innerHTML;\r\n");
      out.write("        alert(fsfd);\r\n");
      out.write("        document.getElementById(\"hola\").innerHTML=fsfd;\r\n");
      out.write("        }       \r\n");
      out.write("    </script>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "body.html", out, false);
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
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("    <div class=\"modal fade\" id=\"mostrarmodal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"basicModal\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("           <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"modal-body\">\r\n");
      out.write("               <h3 class=\"text\" style=\"text-align: center\" id=\"peru\">Bienvenido ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"modal-footer\">\r\n");
      out.write("          <a href=\"#\" data-dismiss=\"modal\" class=\"btn btn-danger\">Cerrar</a>\r\n");
      out.write("           </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
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
