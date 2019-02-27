package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import funciones.reclamoDB;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Part;

import modelo.area;
import modelo.cargo_area;

import modelo.departamento;
import modelo.detallereclamos;
import modelo.direccion;
import modelo.distrito;
import modelo.empleado;
import modelo.estadoreclamos;
import modelo.funcionario;
import modelo.funcionarioarea;
import modelo.persona;
import modelo.provincia;
import modelo.reclamos;
import modelo.telefono;
import modelo.tipotelefono;
import modelo.usuario;

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
        List<detallereclamos> listaB = null;
        List<empleado> listaC = null;

        if (accion.equals("LISTAR")) {

            listaA = proDB.ListaReclamos();
            if (listaA.size() == 0) {
                System.out.println("no hay datos");

            } else {

                System.out.println(" la lista de automoviles tiene " + listaA.size() + " elementos");

            }
            request.getSession().setAttribute("listaA", listaA);
            response.sendRedirect("ListarReclamos.jsp");

        } else if (accion.equals("LISTAREMP")) {

            listaA = proDB.ListaReclamos();
            if (listaA.size() == 0) {
                System.out.println("no hay datos");

            } else {

                System.out.println(" la lista de automoviles tiene " + listaA.size() + " elementos");

            }
            request.getSession().setAttribute("listaA", listaA);
            response.sendRedirect("ListarEmpleado.jsp");

        } else if (accion.equals("REGISTRAR")) {

            response.sendRedirect("RegistrarReclamo.jsp");

        } else if (accion.equals("REGISTRARBD")) {

            /*reclamos*/
            String fechahecho = request.getParameter("fecha");
            String descripcion = request.getParameter("descripcion");


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

            /*Funcionario*/
            String funcionario = request.getParameter("funcionario");

            funcionario funcionarios = new funcionario();
            funcionarios.setNombresF(funcionario);

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

            direccion direcciones = new direccion();
            direcciones.setDireccion(direccion);
            direcciones.setIdProvincia(idprovincia);
            direcciones.setIdDistrito(iddistrito);
            direcciones.setIdDepartamento(iddepartamento);

            String resultado5 = proDB.RegistrarFuncionario(funcionarios);
            String resultado4 = proDB.RegistroTelefono(telefonos);
            String resultado3 = proDB.RegistroDireccion(direcciones);
            String resultado2 = proDB.RegistrarPersona(personas);
            String resultado = proDB.RegistrarReclamo(reclamo);

            if (resultado == null || resultado2 == null || resultado3 == null || resultado4 == null) {
                System.out.println("lo inserto correctamente");

                /*listaA = proDB.ListaReclamos();*/
                request.getSession().setAttribute("listaA", listaA);

                request.getRequestDispatcher("ListarReclamos.jsp").forward(request, response);


                response.sendRedirect("ListarReclamos.jsp");
      

            } else {

                System.out.println(" no lo inserto :( ");
            }

            System.out.println(" estoy en registrar BD");

        } else if (accion.equals("VER")) {

            reclamos reclamo = proDB.reclamoGET(Integer.valueOf(request.getParameter("id")));
            //automovil.imprime();

            request.getSession().setAttribute("reclamo", reclamo);

            response.sendRedirect("ver.jsp");

        } else if (accion.equals("PRUEBA")) {

            reclamos reclamo = proDB.reclamoGET(Integer.valueOf(request.getParameter("id")));
            //automovil.imprime();

            request.getSession().setAttribute("reclamo", reclamo);

            response.sendRedirect("prueba.jsp");

        } else if (accion.equals("SEGUIR")) {

            reclamos reclamo = proDB.reclamoGET2(Integer.valueOf(request.getParameter("id")));
            int idReclamo = Integer.parseInt(request.getParameter("id"));
            System.out.println("safsdfsadfsafd" + idReclamo);
            listaB = proDB.ListaDetalleReclamos(idReclamo);
            request.getSession().setAttribute("listaB", listaB);
            request.getSession().setAttribute("reclamo", reclamo);

            response.sendRedirect("seguimiento.jsp");

        } else if (accion.equals("MODIFICARFD")) {

            reclamos reclamo = proDB.reclamoGET2(Integer.valueOf(request.getParameter("id")));
            reclamos reclamo2 = proDB.detallerec(Integer.valueOf(request.getParameter("id")));
            //automovil.imprime();

            request.getSession().setAttribute("reclamo", reclamo);
            request.getSession().setAttribute("reclamo2", reclamo2);

            response.sendRedirect("editarFD.jsp");

        } else if (accion.equals("MODIFICARBDFD")) {

            reclamos reclamo = (reclamos) request.getSession().getAttribute("reclamo");

            System.out.println(" el id del reclamo a cambiar es " + reclamo.getIdreclamos());

            reclamo.setRespuesta(request.getParameter("respuesta"));

            System.out.println(" Datos se actulizaron ");

            String resultado = proDB.FinalizarR(reclamo);

            listaA = proDB.ListaReclamos();
            request.getSession().setAttribute("listaA", listaA);

            response.sendRedirect("ListarReclamos.jsp");

        } else if (accion.equals("MODIFICAR")) {

            reclamos reclamo = proDB.reclamoGET(Integer.valueOf(request.getParameter("id")));
            //automovil.imprime();

            request.getSession().setAttribute("reclamo", reclamo);

            response.sendRedirect("editar.jsp");

        } else if (accion.equals("MODIFICARBD")) {

            reclamos reclamo = (reclamos) request.getSession().getAttribute("reclamo");

            System.out.println(" el id del reclamo a cambiar es " + reclamo.getIdreclamos());

            reclamo.setCategoria_idcategoria(Integer.valueOf(request.getParameter("categoria")));
            reclamo.setArea_idarea(Integer.valueOf(request.getParameter("area")));

            Integer idreclamo = Integer.valueOf(request.getParameter("idrec"));
            Integer areadestino = Integer.valueOf(request.getParameter("area"));
            Integer areadestino2 = Integer.valueOf(request.getParameter("area2"));
            Integer areaorigen = Integer.valueOf(request.getParameter("areaOrigen"));
            String detalle = request.getParameter("detalle");
            Integer idfuncion = Integer.valueOf(request.getParameter("idfun"));

            funcionarioarea fa = new funcionarioarea();
            fa.setFuncionario_idfuncionario(idfuncion);
            fa.setArea_idarea(areadestino2);

            estadoreclamos er = new estadoreclamos();
            er.setReclamos_idReclamos(idreclamo);

            detallereclamos dr = new detallereclamos();
            dr.setReclamos_idReclamos(idreclamo);
            dr.setDetalle(detalle);
            dr.setOrigen(areaorigen);
            dr.setDestino(areadestino);

            System.out.println(" Datos se actulizaron ");

            String resultado = proDB.reclamosUDP(reclamo);
            String resultado6 = proDB.RegistrarDetalleReclamo(dr);
            String resultado7 = proDB.RegistrarEstadoR2(er);
            String resultado8 = proDB.funcionarioarea(fa);

            listaA = proDB.ListaReclamos();
            request.getSession().setAttribute("listaA", listaA);

            response.sendRedirect("ListarReclamos.jsp");

        } else if (accion.equals("RECHAZAR")) {

            String resultado = proDB.reclamoDEL(Integer.valueOf(request.getParameter("id")));
            if (resultado == null) {
                System.out.println(" se denego");
                listaA = proDB.ListaReclamos();
                request.getSession().setAttribute("listaA", listaA);
                response.sendRedirect("ListarReclamos.jsp");
            }

        } else if (accion.equals("DEVOLVER")) {

            String resultado = proDB.Devolver(Integer.valueOf(request.getParameter("id")));
            if (resultado == null) {
                System.out.println(" se Devolvio la Denuncia");
                listaA = proDB.ListaReclamos();
                request.getSession().setAttribute("listaA", listaA);
                response.sendRedirect("ListarReclamos.jsp");
            }

        } else if (accion.equals("AREA")) {

            response.sendRedirect("area.jsp");

        } else if (accion.equals("REGISTROAREA")) {

            String areas = request.getParameter("area");

            area a = new area();
            a.setArea(areas);

            String resultado = proDB.RegistroArea(a);

            if (resultado == null) {
                System.out.println("lo inserto correctamente");

                response.sendRedirect("area.jsp");

            } else {

                System.out.println(" no lo inserto :( ");
            }

        } else if (accion.equals("MODIFICARAREA")) {
            
            area area =proDB.areaGET(Integer.valueOf(request.getParameter("id")));
            
            request.getSession().setAttribute("area", area);

            response.sendRedirect("modificararea.jsp");
              
        } else if (accion.equals("MODIFICARAREA2")) {

            area a = (area) request.getSession().getAttribute("area");

            System.out.println(" el id del area a cambiar es " + a.getIdarea());

            a.setArea(request.getParameter("area"));
            a.setIdarea(Integer.valueOf(request.getParameter("idarea")));

            String resultado = proDB.areaUPD(a);

            

                response.sendRedirect("area.jsp");
            

        } else if (accion.equals("ELIMINARAREA")) {

            String resultado = proDB.EliminarArea(Integer.valueOf(request.getParameter("id")));
            if (resultado == null) {
                System.out.println(" se elimino");

                response.sendRedirect("area.jsp");
            }

        } else if (accion.equals("EMPLEADO")) {

            response.sendRedirect("empleado.jsp");

        }else if (accion.equals("LISTAEMPLEADO")) {

            response.sendRedirect("ListaEmpleados.jsp");

        }else if (accion.equals("REGISTRAREMP")) {

            Integer iddoc = Integer.valueOf(request.getParameter("tipodoc"));
            String documento = request.getParameter("documento");
            String nombre = request.getParameter("nombre");
            String paterno = request.getParameter("paterno");
            String materno = request.getParameter("materno");
            Integer iddep = Integer.valueOf(request.getParameter("departamento"));
            Integer idpro = Integer.valueOf(request.getParameter("provincia"));
            Integer iddis = Integer.valueOf(request.getParameter("distrito"));
            String direccion = request.getParameter("direccion");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            Integer tipotelefono = Integer.valueOf(request.getParameter("tipotelefono"));
            String fechainicio = request.getParameter("fechainicio");
            String fechafin = request.getParameter("fechafin");
            String sueldo = request.getParameter("sueldo");
            Integer operador = Integer.valueOf(request.getParameter("operador"));
            Integer area = Integer.valueOf(request.getParameter("area"));
            Integer cargo = Integer.valueOf(request.getParameter("cargo"));
            String uss = request.getParameter("usuario");
            String pass = request.getParameter("contraseña");

            persona p = new persona();
            p.setTipodocumento(tipotelefono);
            p.setNum_documento(documento);
            p.setNombreP(nombre);
            p.setPaternoP(paterno);
            p.setMaternoP(materno);
            p.setCorreo(correo);

            telefono t = new telefono();
            t.setNumero(telefono);
            t.setIdTipo_telefono(tipotelefono);
            t.setIdOperador(operador);

            direccion d = new direccion();
            d.setDireccion(direccion);
            d.setIdProvincia(idpro);
            d.setIdDistrito(iddis);
            d.setIdDepartamento(iddep);

            empleado e = new empleado();
            e.setFechainicio(fechainicio);
            e.setFechafin(fechafin);
            e.setSueldo(sueldo);
            e.setIdearea(area);

            usuario u = new usuario();
            u.setUsuario(uss);
            u.setContraseña(pass);

            cargo_area ca = new cargo_area();
            ca.setCargo_idcargo(cargo);

            String resultado1 = proDB.RegistrarPersona(p);
            String resultado2 = proDB.RegistroTelefonoE(t);
            String resultado3 = proDB.RegistroDireccionE(d);
            String resultado4 = proDB.RegistrarEmpleado(e);
            String resultado5 = proDB.RegistroUsuario(u);
            String resultado6 = proDB.RegistrarCargoUsuario(ca);
            
            
            response.sendRedirect("ListaEmpelados");
            
        }else if (accion.equals("ELIMINAEMP")) {

            String resultado = proDB.EliminarEmpleado(Integer.valueOf(request.getParameter("id")));
            if (resultado == null) {
                System.out.println(" se elimino");

                response.sendRedirect("ListaEmpleados.jsp");
            }

        }else if (accion.equals("AJUSTES")) {

            response.sendRedirect("ajustes.jsp");

        }else if(accion.equals("CATEGORIA")){
        
           response.sendRedirect("categoria.jsp");
           
        }else if(accion.equals("CATEGORIA")){
        
           response.sendRedirect("categoria.jsp");
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
