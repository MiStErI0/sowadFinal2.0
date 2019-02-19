/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import funciones.usuarioBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author johan07
 */
@WebServlet(name = "usuarioServlet", urlPatterns = {"/usuario"})
public class usuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String usuario=request.getParameter("usuario");
            String pass=request.getParameter("pass");
            
            String resp;
            
            usuarioBD usu= new usuarioBD();
            
            if(usuario.equals("") && pass.equals(""))
            {
               request.setAttribute("respuesta","Campos Usuario y Contraseña estan vacios");
               
               request.getRequestDispatcher("login.jsp").forward(request, response);
            }else if(usuario.equals(""))
            {
               request.setAttribute("respuesta","Campo Usuario esta vacio");
               request.getRequestDispatcher("login.jsp").forward(request, response);
            }if(pass.equals(""))
            {
               request.setAttribute("respuesta","Campo Contraseña esta vacio");
               request.getRequestDispatcher("login.jsp").forward(request, response);
            }else
            {
               resp=usu.existeUsuario(usuario, pass);
               request.setAttribute("respuesta",resp);
                if (resp.equals("Bienvenido")) {
                    request.setAttribute("respuesta",usuario);
                    request.getRequestDispatcher("Principal.jsp").forward(request, response);
                }else
                    
                    request.getRequestDispatcher("login.jsp").forward(request, response);
            
            }
            
            
            
            /* TODO output your page here. You may use following sample code.
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet usuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet usuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
