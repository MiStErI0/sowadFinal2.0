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
import modelo.direccion;
import modelo.distrito;
import modelo.persona;
import modelo.provincia;
import modelo.reclamos;
import modelo.telefono;
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

        } else if (accion.equals("REGISTRARBD")) {

            /*reclamos*/
            String fechahecho = request.getParameter("fecha");
            String descripcion = request.getParameter("descripcion");
            String funcionario = request.getParameter("funcionario");

            /*persona*/
            String nombre = request.getParameter("nombre");
            String paterno = request.getParameter("paterno");
            String materno = request.getParameter("materno");
            Integer tipodoc = Integer.valueOf(request.getParameter("tipodoc"));
            String documento = request.getParameter("documento");
            String correo = request.getParameter("correo");

            /*Direccion*/
            String direccion = request.getParameter("direccion");
            Integer iddistrito = Integer.valueOf(request.getParameter("distrito"));
            Integer idprovincia = Integer.valueOf(request.getParameter("provincia"));
            Integer iddepartamento = Integer.valueOf(request.getParameter("departamento"));
            
            /*Telefono*/
            String fono = request.getParameter("telefono");
            Integer idtipotelefono = Integer.valueOf(request.getParameter("tipotelefono"));
            Integer idoperador = Integer.valueOf(request.getParameter("operador"));
            
            telefono telefonos = new telefono();
            telefonos.setNumero(fono);
            telefonos.setIdTipo_telefono(idtipotelefono);
            telefonos.setIdOperador(idoperador);

            persona personas = new persona();
            personas.setNombreP(nombre);
            personas.setPaternoP(paterno);
            personas.setMaternoP(materno);
            personas.setTipodocumento(tipodoc);
            personas.setNum_documento(documento);
            personas.setCorreo(correo);

            reclamos reclamo = new reclamos();
            reclamo.setFechahecho(fechahecho);
            reclamo.setDescripcion(descripcion);
            reclamo.setFuncionario(funcionario);
                       
            direccion direcciones = new direccion();
            direcciones.setDireccion(direccion);
            direcciones.setIdProvincia(idprovincia);
            direcciones.setIdDistrito(iddistrito);
            direcciones.setIdDepartamento(iddepartamento);

            String resultado4 = proDB.RegistroTelefono(telefonos);
            String resultado3 = proDB.RegistroDireccion(direcciones);
            String resultado2 = proDB.RegistrarPersona(personas);
            String resultado = proDB.RegistrarReclamo(reclamo);

            if (resultado == null || resultado2 == null || resultado3 == null || resultado4 == null) {
                System.out.println("lo inserto correctamente");

                /*listaA = proDB.ListaReclamos();*/
                request.getSession().setAttribute("listaA", listaA);
                response.sendRedirect("ListarReclamos.jsp");

            } else {

                System.out.println(" no lo inserto :( ");
            }

            System.out.println(" estoy en registrar BD");

        }else if(accion.equals("MODIFICAR")){
            
        reclamos reclamo =proDB.reclamoGET(Integer.valueOf(request.getParameter("id")));
            //automovil.imprime();
            
            request.getSession().setAttribute("reclamo",reclamo);
            
            response.sendRedirect("modal.jsp");
            
        }/*else if(accion.equals("MODIFICARBD")){
            
            producto producto =(producto)request.getSession().getAttribute("producto");
            System.out.println(" el id del producto a cambiar es "+ producto.getIdProducto());
            producto.setNombre(request.getParameter("nombre"));
            producto.setCategoria(request.getParameter("categoria"));
            producto.setPrecio(Double.valueOf(request.getParameter("precio")));
            producto.setMarca(request.getParameter("marca"));
            producto.setDescripcion(request.getParameter("descripcion"));
            producto.setDescuento(Integer.valueOf(request.getParameter("descuento")));
            producto.setStock(Integer.valueOf(request.getParameter("stock")));
            producto.setFoto(request.getParameter("foto"));
            
            
            System.out.println(" Datos del producto actualizo ");
            
            //automovil.imprime();
            
            String resultado = proBD.productoUPD(producto);
            listaA = proBD.listarProducto();
            request.getSession().setAttribute("listaA", listaA);
            
            response.sendRedirect("listarproducto.jsp");
            
        }*/

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
