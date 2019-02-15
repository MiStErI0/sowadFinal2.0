package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import funciones.reclamoDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.departamento;
import modelo.distrito;
import modelo.persona;
import modelo.provincia;
import modelo.reclamos;
import modelo.tipotelefono;

/**
 *
 * @author User
 */
public class ReclamoServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion = request.getParameter("accion");
        System.out.println(" accion " + accion);
        reclamoDB proDB = new reclamoDB();
        List<reclamos> listaA = null;
       
        
        if (accion.equals("LISTAR")) {
            
            listaA = proDB.ListaReclamos();
            if (listaA.size() == 0) {
                System.out.println("no hay datos");
                
            } else {
                
                System.out.println(" la lista de automoviles tiene " + listaA.size() + " elementos");
                
            }
            request.getSession().setAttribute("listaA", listaA);
            response.sendRedirect("ListarReclamos.jsp");
            
        } else if (accion.equals("REGISTRAR")) {
            
            response.sendRedirect("RegistrarReclamo.jsp");
            
        }else if (accion.equals("REGISTRARBD")) {

            /*reclamos*/
            String fechahecho = request.getParameter("fecha");
            String descripcion = request.getParameter("descripcion");
            /*persona*/
            String nombre = request.getParameter("nombre");
            String paterno = request.getParameter("paterno");
            String materno = request.getParameter("materno");
            Integer tipodoc = Integer.valueOf(request.getParameter("tipodoc"));
            String documento = request.getParameter("documento");
            
            
            reclamos reclamo = new reclamos();
            reclamo.setFechahecho(fechahecho);
            reclamo.setDescripcion(descripcion);
            
            persona personas = new persona();
            personas.setNombreP(nombre);
            personas.setPaternoP(paterno);
            personas.setMaternoP(materno);
            personas.setTipodocumento(tipodoc);
            personas.setNum_documento(documento);
            
            
            
            
           String resultado = proDB.RegistrarReclamo(reclamo);
           String resultado2 = proDB.RegistrarPersona(personas);
           
           
           
           
           
            if (resultado==null || resultado2==null ) {
                System.out.println("lo inserto correctamente");
                
                /*listaA = proDB.ListaReclamos();*/
                
                request.getSession().setAttribute("listaA", listaA);
                response.sendRedirect("ListarReclamos.jsp");
                
            } else {
                
              System.out.println(" no lo inserto :( ");
            }
            
            System.out.println(" estoy en registrar BD");
            
            
           
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ReclamoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReclamoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
