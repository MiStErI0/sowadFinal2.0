package funciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.area;
import modelo.cargo_area;
import modelo.categoria;
import modelo.conexion;
import modelo.conexion;
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
import modelo.reclamos;
import modelo.telefono;
import modelo.tipotelefono;
import modelo.usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class reclamoDB {

   /*---------------------------------------------------------------Clientes----------------------------------------------------------------*/ 

    public String RegistrarPersona(persona f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into persona(nombreP,paternoP,maternoP,tipo_documento_idtipo_documento,num_documento,correo)"
                + "values(?,?,?,?,?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, f.getNombreP());
            ps.setString(2, f.getPaternoP());
            ps.setString(3, f.getMaternoP());
            ps.setInt(4, f.getTipodocumento());
            ps.setString(5, f.getNum_documento());
            ps.setString(6, f.getCorreo());

            int contador = ps.executeUpdate();

            RegistrarCliente(cn);

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }

    private int Idpersona(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idPersona),0) codigo from persona";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

    public String RegistrarCliente(Connection cn) {

        String resultado = null;
        String sql = "insert into cliente(idpersona) values (?)";

        try {

            PreparedStatement ps = cn.prepareStatement(sql);

            int id = Idpersona(cn);

            ps.setInt(1, id);

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }

    private int Idcliente(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idcliente),0) codigo from cliente";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

     /*---------------------------------------------------------------Funcionario----------------------------------------------------------------*/
    
    private int IdFuncionaario(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idfuncionario),0)+1 codigo from funcionario";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

    private int IdNuevoFuncionario(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idfuncionario),0) codigo from funcionario";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

    public String funcionarioarea(funcionarioarea f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into funcionario_area(funcionario_idfuncionario,area_idarea,fechafunc)values(?,?,now())";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, f.getFuncionario_idfuncionario());
            ps.setInt(2, f.getArea_idarea());

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    public String RegistrarFuncionario(funcionario f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into funcionario(idfuncionario,nombresF)values(?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            int id = IdFuncionaario(cn);

            ps.setInt(1, id);
            ps.setString(2, f.getNombresF());

            int contador = ps.executeUpdate();

            RegistrarCliente(cn);

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    /*---------------------------------------------------------------Direcciones----------------------------------------------------------------*/

    public String RegistroDireccion(direccion f) {
        String resultado = null;
        Connection cn = null;
        String sql = "insert into direccion(direccion,Distrito_idDistrito,Distrito_Provincia_idProvincia,Distrito_Provincia_Departamento_idDepartamento,idcliente)"
                + "values(?,?,?,?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id2 = Idcliente(cn);

            ps.setString(1, f.getDireccion());
            ps.setInt(2, f.getIdDistrito());
            ps.setInt(3, f.getIdProvincia());
            ps.setInt(4, f.getIdDepartamento());
            ps.setInt(5, id2);

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    public String RegistroDireccionE(direccion f) {
        String resultado = null;
        Connection cn = null;
        String sql = "insert into direccione(direccion,Distrito_idDistrito,Distrito_Provincia_idProvincia,Distrito_Provincia_Departamento_idDepartamento,idempleado)"
                + "values(?,?,?,?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id2 = Idempelado(cn);

            ps.setString(1, f.getDireccion());
            ps.setInt(2, f.getIdDistrito());
            ps.setInt(3, f.getIdProvincia());
            ps.setInt(4, f.getIdDepartamento());
            ps.setInt(5, id2);

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    /*-----------------------------------------------------------------Telefonos----------------------------------------------------------------*/

    public String RegistroTelefono(telefono f) {
        String resultado = null;
        Connection cn = null;
        String sql = "insert into telefono(numero,estadoT,idcliente,Operador_idOperador,Tipo_telefono_idTipo_telefono)"
                + "values(?,1,?,?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id2 = Idcliente(cn);

            ps.setString(1, f.getNumero());
            ps.setInt(2, id2);
            ps.setInt(3, f.getIdOperador());
            ps.setInt(4, f.getIdTipo_telefono());

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    public String RegistroTelefonoE(telefono f) {
        String resultado = null;
        Connection cn = null;
        String sql = "insert into telefonoe(numero,estadoT,idempleado,Operador_idOperador,Tipo_telefono_idTipo_telefono)"
                + "values(?,1,?,?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id2 = Idempelado(cn);

            ps.setString(1, f.getNumero());
            ps.setInt(2, id2);
            ps.setInt(3, f.getIdOperador());
            ps.setInt(4, f.getIdTipo_telefono());

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    /*------------------------------------------------------------------------Reclamos----------------------------------------------------------------*/

    public List<reclamos> ListaReclamos() {
        List<reclamos> lista = null;
        Connection cn = null;
        reclamos f = null;
        String sql = "select r.idReclamos,r.fechahecho,r.descripcion,p.nombreP,p.paternoP,p.maternoP,e.nombreEs,ca.categoria from reclamos as r \n"
                + "inner join cliente as c on r.idcliente=c.idcliente\n"
                + "inner join persona as p on c.idpersona=p.idPersona\n"
                + "inner join estado as e on e.idEstado=r.Estado_idEstado\n"
                + "inner join categoria as ca on ca.idcategoria=r.categoria_idcategoria";

        try {
            cn = new conexion().getConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList<reclamos>();

            while (rs.next()) {

                reclamos e = new reclamos();
                e.setIdreclamos(rs.getInt(1));
                e.setFechahecho(rs.getString(2));
                e.setDescripcion(rs.getString(3));
                e.setNombreP(rs.getString(4));
                e.setPaternoP(rs.getString(5));
                e.setMaternoP(rs.getString(6));
                e.setNombreestado(rs.getString(7));
                e.setNombrecategoria(rs.getString(8));

                lista.add(e);
            }
            conexion.CierraConexion(cn);
        } catch (Exception e) {
            System.out.println(" error al ingreso de reclamos" + e.getMessage());
            conexion.CierraConexion(cn);
        }
        return lista;
    }
    
    public String RegistrarReclamo(reclamos f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into reclamos(idReclamos,fechahecho,descripcion,idcliente,"
                + "categoria_idcategoria,Estado_idEstado,area_idarea,idfuncion)"
                + "values(?,?,?,?,1,1,1,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id = nuevoId(cn);
            int id2 = Idcliente(cn);
            int id3 = IdNuevoFuncionario(cn);

            ps.setInt(1, id);
            ps.setString(2, f.getFechahecho());
            ps.setString(3, f.getDescripcion());
            ps.setInt(4, id2);
            ps.setInt(5, id3);

            int contador = ps.executeUpdate();

            RegistrarEstadoR(cn);

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }

    public String RegistrarDetalleReclamo(detallereclamos f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into detalle_reclamos(Reclamos_idReclamos,detalle,fecha_asignacion,codigoareaorigen,"
                + "codigoareadestino)"
                + "values(?,?,now(),?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, f.getReclamos_idReclamos());
            ps.setString(2, f.getDetalle());
            ps.setInt(3, f.getOrigen());
            ps.setInt(4, f.getDestino());

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }
    
    private int nuevoId(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idReclamos),0)+1 codigo from reclamos";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

    public reclamos reclamoGET(int id) {
        reclamos f = new reclamos();
        Connection cn = null;
        String sql = "select r.idReclamos,r.fechahecho,r.descripcion,fun.nombresF,p.nombreP,p.paternoP,\n"
                + "p.maternoP,p.num_documento,p.correo,e.nombreEs,ca.categoria,t.numero,d.direccion,\n"
                + "concat(de.departamento,' / ',pro.provincia,' / ',dis.distrito) as ubi,e.nombreEs,"
                + "r.idfuncion,r.area_idarea from reclamos as r \n"
                + "inner join funcionario as fun on fun.idfuncionario=r.idfuncion\n"
                + "inner join cliente as c on r.idcliente=c.idcliente\n"
                + "inner join persona as p on c.idpersona=p.idPersona\n"
                + "inner join estado as e on e.idEstado=r.Estado_idEstado\n"
                + "inner join categoria as ca on ca.idcategoria=r.categoria_idcategoria\n"
                + "inner join telefono as t on c.idcliente = t.idcliente\n"
                + "inner join direccion as d on d.idcliente = c.idcliente\n"
                + "inner join departamento as de on de.idDepartamento = d.Distrito_Provincia_Departamento_idDepartamento\n"
                + "inner join provincia as pro on pro.idProvincia = d.Distrito_Provincia_idProvincia\n"
                + "inner join distrito as dis on dis.idDistrito = d.Distrito_idDistrito where idReclamos=? ";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f.setIdreclamos(rs.getInt(1));
                f.setFechahecho(rs.getString(2));
                f.setDescripcion(rs.getString(3));
                f.setFuncionario(rs.getString(4));
                f.setNombreP(rs.getString(5));
                f.setPaternoP(rs.getString(6));
                f.setMaternoP(rs.getString(7));
                f.setNum_documento(rs.getString(8));
                f.setCorreo(rs.getString(9));
                f.setCategoria(rs.getString(11));
                f.setTelefono(rs.getString(12));
                f.setDireccion(rs.getString(13));
                f.setUbigeo(rs.getString(14));
                f.setNombreestado(rs.getString(15));
                f.setId_fun(rs.getInt(16));
                f.setArea_idarea(rs.getInt(17));
                f.setDetalle(rs.getString(18));
                f.setFecha_asignacion(rs.getString(19));

            }
            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error la conseguir el automovil " + e.getMessage());
        }

        return f;
    }

    public reclamos reclamoGET2(int id) {
        reclamos f = new reclamos();
        Connection cn = null;
        String sql = "select r.idReclamos,r.fechahecho,r.descripcion,fun.nombresF,p.nombreP,p.paternoP,\n"
                + "p.maternoP,p.num_documento,p.correo,e.nombreEs,ca.categoria,t.numero,d.direccion,\n"
                + "concat(de.departamento,' / ',pro.provincia,' / ',dis.distrito) as ubi,e.nombreEs,"
                + "r.idfuncion,r.area_idarea,der.detalle,der.fecha_asignacion from reclamos as r \n"
                + "inner join detalle_reclamos as der on der.Reclamos_idReclamos=r.idReclamos\n"
                + "inner join funcionario as fun on fun.idfuncionario=r.idfuncion\n"
                + "inner join cliente as c on r.idcliente=c.idcliente\n"
                + "inner join persona as p on c.idpersona=p.idPersona\n"
                + "inner join estado as e on e.idEstado=r.Estado_idEstado\n"
                + "inner join categoria as ca on ca.idcategoria=r.categoria_idcategoria\n"
                + "inner join telefono as t on c.idcliente = t.idcliente\n"
                + "inner join direccion as d on d.idcliente = c.idcliente\n"
                + "inner join departamento as de on de.idDepartamento = d.Distrito_Provincia_Departamento_idDepartamento\n"
                + "inner join provincia as pro on pro.idProvincia = d.Distrito_Provincia_idProvincia\n"
                + "inner join distrito as dis on dis.idDistrito = d.Distrito_idDistrito where idReclamos=? ";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f.setIdreclamos(rs.getInt(1));
                f.setFechahecho(rs.getString(2));
                f.setDescripcion(rs.getString(3));
                f.setFuncionario(rs.getString(4));
                f.setNombreP(rs.getString(5));
                f.setPaternoP(rs.getString(6));
                f.setMaternoP(rs.getString(7));
                f.setNum_documento(rs.getString(8));
                f.setCorreo(rs.getString(9));
                f.setCategoria(rs.getString(11));
                f.setTelefono(rs.getString(12));
                f.setDireccion(rs.getString(13));
                f.setUbigeo(rs.getString(14));
                f.setNombreestado(rs.getString(15));
                f.setId_fun(rs.getInt(16));
                f.setArea_idarea(rs.getInt(17));
                f.setDetalle(rs.getString(18));
                f.setFecha_asignacion(rs.getString(19));

            }
            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error la conseguir el automovil " + e.getMessage());
        }

        return f;
    }

    public String reclamosUDP(reclamos f) {
        String resultado = null;
        Connection cn = null;
        String sql = "UPDATE reclamos as r set r.categoria_idcategoria=?, "
                + "Estado_idEstado=3, r.area_idarea=? where r.idReclamos=?";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            System.out.println("aaaaaaaaaaaaaaaaa" + f.getCategoria_idcategoria());
            System.out.println("aaaaaaaaaaaaaaaaa" + f.getArea_idarea());
            System.out.println("aaaaaaaaaaaaaaaaa" + f.getIdreclamos());

            ps.setInt(1, f.getCategoria_idcategoria());
            ps.setInt(2, f.getArea_idarea());
            ps.setInt(3, f.getIdreclamos());

            int contador = ps.executeUpdate();

            if (contador == 0) {
                System.out.println(" NO SE ACTUALIZO NINGUNA FILA REVISAR ....");
                resultado = " NO SE ACTUALIZO NINGUNA FILA REVISAR ....";
            }

            conexion.CierraConexion(cn);
        } catch (Exception e) {
            conexion.getConexion();
            System.out.println(" error en la actualizacion " + e.getMessage());
            resultado = e.getMessage();
        }

        return resultado;

    }

    public String reclamoDEL(int id) {
        String resultado = null;
        Connection cn = null;
        String sql = "UPDATE reclamos set Estado_idEstado=5 where idReclamos=?";
        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);

            int contador = ps.executeUpdate();
            if (contador == 0) {
                resultado = "NO LOGRO ELIMINAR REVISELO ...";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error al eliminar " + e.getMessage());
            resultado = e.getMessage();
        }
        return resultado;
    }

    public String Devolver(int id) {
        String resultado = null;
        Connection cn = null;
        String sql = "UPDATE reclamos set Estado_idEstado=2 where idReclamos=?";
        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);

            int contador = ps.executeUpdate();
            if (contador == 0) {
                resultado = "NO LOGRO ELIMINAR REVISELO ...";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error al eliminar " + e.getMessage());
            resultado = e.getMessage();
        }
        return resultado;
    }

    public String FinalizarR(reclamos f) {
        String resultado = null;
        Connection cn = null;
        String sql = "update reclamos set respuesta=? ,Estado_idEstado=4 where idReclamos=?";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            System.out.println("aaaaaaaaaaaaaaaaa" + f.getRespuesta());
            System.out.println("aaaaaaaaaaaaaaaaa" + f.getIdreclamos());

            ps.setString(1, f.getRespuesta());
            ps.setInt(2, f.getIdreclamos());

            int contador = ps.executeUpdate();

            if (contador == 0) {
                System.out.println(" NO SE ACTUALIZO NINGUNA FILA REVISAR ....");
                resultado = " NO SE ACTUALIZO NINGUNA FILA REVISAR ....";
            }

            conexion.CierraConexion(cn);
        } catch (Exception e) {
            conexion.getConexion();
            System.out.println(" error en la actualizacion " + e.getMessage());
            resultado = e.getMessage();
        }

        return resultado;

    }

    public List<detallereclamos> ListaDetalleReclamos(int reclamo) {
        List<detallereclamos> lista = null;
        Connection cn = null;
        reclamos f = null;
        String sql = "select dr.fecha_asignacion,a.area, a2.area,dr.detalle from detalle_reclamos as dr\n"
                + "inner join area as a on a.idarea=dr.codigoareaorigen\n"
                + "inner join area as a2 on a2.idarea=dr.codigoareadestino where dr.Reclamos_idReclamos = ?";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, reclamo);

            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<detallereclamos>();

            while (rs.next()) {

                detallereclamos e = new detallereclamos();
                e.setFecha_asignacion(rs.getString(1));
                e.setOrigennombre(rs.getString(2));
                e.setDestinonombre(rs.getString(3));
                e.setDetalle(rs.getString(4));

                lista.add(e);
            }
            conexion.CierraConexion(cn);
        } catch (Exception e) {
            System.out.println(" error al ingreso de reclamos" + e.getMessage());
            conexion.CierraConexion(cn);
        }
        return lista;
    }

    public reclamos detallerec(int id) {
        reclamos f = new reclamos();
        Connection cn = null;
        String sql = "SELECT dr.fecha_asignacion,dr.detalle from detalle_reclamos as dr\n"
                + "                WHERE idDetalle_Reclamos = (SELECT MAX(idDetalle_Reclamos) \n"
                + "                FROM detalle_reclamos where Reclamos_idReclamos=?)\n"
                + "                and Reclamos_idReclamos=?";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f.setFecha_asignacion(rs.getString(1));
                f.setDetalle(rs.getString(2));

            }
            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error la conseguir el automovil " + e.getMessage());
        }

        return f;
    }
    
     private int IdReclamos(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idReclamos),0) codigo from reclamos";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                r = rs.getInt("codigo");
            }

            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

    public String RegistrarEstadoR(Connection cn) {

        String resultado = null;
        String sql = "insert into reclamoestado(Reclamos_idReclamos,fecharegistro,Usuario_idUsuario,Estado_idEstado)"
                + "values (?,now(),1,1)";

        try {

            PreparedStatement ps = cn.prepareStatement(sql);

            int id = IdReclamos(cn);

            ps.setInt(1, id);

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion " + e.getMessage());
        }
        return resultado;

    }

    public String RegistrarEstadoR2(estadoreclamos f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into reclamoestado(Reclamos_idReclamos,fecharegistro,Usuario_idUsuario,Estado_idEstado) values (?,now(),1,3)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, f.getReclamos_idReclamos());

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise 2";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion 2 " + e.getMessage());
        }
        return resultado;

    }
    
    /*------------------------------------------------------------------------Empleado----------------------------------------------------------------*/

    public String RegistrarEmpleado(empleado e) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into empelado(idPersona,fechainicio,sueldo,fechafin,idearea,estadoEmp)values(?,?,?,?,?,1)";

        try {
            cn = conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement(sql);

            int id = Idpersona(cn);

            pst.setInt(1, id);
            pst.setString(2, e.getFechainicio());
            pst.setString(3, e.getSueldo());
            pst.setString(4, e.getFechafin());
            pst.setInt(5, e.getIdearea());

            int contador = pst.executeUpdate();

            if (contador == 0) {
                resultado = "no inserto nada";

            }

            conexion.CierraConexion(cn);

        } catch (SQLException ex) {

            conexion.CierraConexion(cn);
            Logger.getLogger(reclamoDB.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println(" se produjo error en la insercion " + ex.getMessage());
        }

        return resultado;
    }

    private int Idempelado(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idempelado),0) codigo from empelado";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }
    
    public String EliminarEmpleado(int id) {
        String resultado = null;
        Connection cn = null;
        String sql = "UPDATE empelado set estadoEmp=0 where idempelado=?";
        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);

            int contador = ps.executeUpdate();
            if (contador == 0) {
                resultado = "NO LOGRO ELIMINAR REVISELO ...";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error al eliminar " + e.getMessage());
            resultado = e.getMessage();
        }
        return resultado;
    }
    
    /*---------------------------------------------------------------------Usuario----------------------------------------------------------------*/
    
    public String RegistroUsuario(usuario u) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into usuario(user,clave,estado,empelado_idempelado)values(?,?,1,?)";
        try {

            cn = conexion.getConexion();

            PreparedStatement ps = cn.prepareStatement(sql);

            int id = Idempelado(cn);

            System.out.println("aaaaaaaaaaaaaaaaaaa" + u.getUsuario());
            System.out.println("aaaaaaaaaaaaaaaaaaa" + u.getContraseña());
            System.out.println("aaaaaaaaaaaaaaaaaaa" + id);

            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getContraseña());
            ps.setInt(3, id);

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {

            conexion.CierraConexion(cn);
            Logger.getLogger(reclamoDB.class.getName()).log(Level.SEVERE, null, e);

            System.out.println(" se produjo error en la insercion usuario" + e.getMessage());
        }

        return resultado;

    }

    private int Idusuario(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idUsuario),0) codigo from usuario";

        try {
            PreparedStatement pst = cn.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getInt("codigo");
            }
            rs.close();
            rs = null;

            pst.close();
            pst = null;

            //c.close();
            //c=null;
        } catch (SQLException e) {
            System.out.println(" error al obtener id" + e.getMessage());
            conexion.CierraConexion(cn);
        }

        return r;
    }

    public String RegistrarCargoUsuario(cargo_area ca) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into cargo_has_usuario(cargo_idcargo,Usuario_idUsuario) values (?,?)";

        try {

            cn = conexion.getConexion();

            PreparedStatement ps = cn.prepareStatement(sql);

            int id = Idusuario(cn);

            ps.setInt(1, ca.getCargo_idcargo());
            ps.setInt(2, id);

            int contador = ps.executeUpdate();

            if (contador == 0) {

                resultado = "CERO filas insertadas... revise";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" se produjo error en la insercion Cargo Usuario" + e.getMessage());
        }
        return resultado;

    }
    

    
    /*------------------------------------------------------------------------Area----------------------------------------------------------------*/
    
    public String RegistroArea(area a) {

        String resultado = null;
        Connection cn = null;

        String sql = "insert into area (area,estadoA)values(?,1)";

        try {

            cn = conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, a.getArea());

            int contador = pst.executeUpdate();

            if (contador == 0) {

                resultado = "no se inserto nada revisar";
            }

            conexion.CierraConexion(cn);

        } catch (SQLException ex) {

            conexion.CierraConexion(cn);
            Logger.getLogger(reclamoDB.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println(" se produjo error en la insercion " + ex.getMessage());
        }

        return resultado;
    }

    public String EliminarArea(int id) {
        String resultado = null;
        Connection cn = null;
        String sql = "UPDATE area set estadoA=0 where idarea=?";
        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);

            int contador = ps.executeUpdate();
            if (contador == 0) {
                resultado = "NO LOGRO ELIMINAR REVISELO ...";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error al eliminar " + e.getMessage());
            resultado = e.getMessage();
        }
        return resultado;
    }

    public String areaUPD(area a) {
        String resultado = null;
        Connection cn = null;
        String sql = "Update area set area=? where idarea=?";

        try {

            cn = conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, a.getArea());
            pst.setInt(2, a.getIdarea());
            
            int contador = pst.executeUpdate();

            if (contador == 0) {
                System.out.println(" NO SE ACTUALIZO NINGUNA FILA REVISAR ....");
                resultado = " NO SE ACTUALIZO NINGUNA FILA REVISAR ....";
            }
            
            
            conexion.CierraConexion(cn);
        } catch (SQLException ex) {
            conexion.CierraConexion(cn);
            Logger.getLogger(reclamoDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" error en la actualizacion " + ex.getMessage());
            resultado = ex.getMessage();
        }
        return resultado;
    }
    
    public area areaGET(int id){
        area f = new area();
        Connection cn =null;
        String sql = "select idarea,area from area where idarea=? ";
        
        try {
            cn =conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs =ps.executeQuery();
            
            if(rs.next()){
                f.setIdarea(rs.getInt(1));
                f.setArea(rs.getString(2));
                
            }
            conexion.CierraConexion(cn);
                    
            
        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error la conseguir el area "+ e.getMessage());
        }
        
        return f;
    }
     
     /*---------------------------------------------------------------------categoria-------------------------------------------------------------*/
     
     public String RegistroCategoria(categoria c) {

        String resultado = null;
        Connection cn = null;

        String sql = "insert into categoria (categoria,estadoCat)values(?,1)";

        try {

            cn = conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, c.getCategoria());

            int contador = pst.executeUpdate();

            if (contador == 0) {

                resultado = "no se inserto nada revisar";
            }

            conexion.CierraConexion(cn);

        } catch (SQLException ex) {

            conexion.CierraConexion(cn);
            Logger.getLogger(reclamoDB.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println(" se produjo error en la insercion " + ex.getMessage());
        }

        return resultado;
    }
     
     public String EliminarCategoria(int id) {
        String resultado = null;
        Connection cn = null;
        String sql = "UPDATE categoria set estadoCat=0 where idcategoria=?";
        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);

            int contador = ps.executeUpdate();
            if (contador == 0) {
                resultado = "NO LOGRO ELIMINAR REVISELO ...";
            }

            conexion.CierraConexion(cn);

        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error al eliminar " + e.getMessage());
            resultado = e.getMessage();
        }
        return resultado;
    }
     
     public String categoriaUPD(categoria c) {
        String resultado = null;
        Connection cn = null;
        String sql = "Update categoria set categoria=? where idcategoria=?";

        try {

            cn = conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, c.getCategoria());
            pst.setInt(2, c.getIdcategoria());
            
            int contador = pst.executeUpdate();

            if (contador == 0) {
                System.out.println(" NO SE ACTUALIZO NINGUNA FILA REVISAR ....");
                resultado = " NO SE ACTUALIZO NINGUNA FILA REVISAR ....";
            }
            
            
            conexion.CierraConexion(cn);
        } catch (SQLException ex) {
            conexion.CierraConexion(cn);
            Logger.getLogger(reclamoDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" error en la actualizacion " + ex.getMessage());
            resultado = ex.getMessage();
        }
        return resultado;
    }
     
     public categoria categoriaGET(int id){
        categoria f = new categoria();
        Connection cn =null;
        String sql = "select idcategoria,categoria from categoria where idcategoria=? ";
        
        try {
            cn =conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs =ps.executeQuery();
            
            if(rs.next()){
                f.setIdcategoria(rs.getInt(1));
                f.setCategoria(rs.getString(2));
                
            }
            conexion.CierraConexion(cn);
                    
            
        } catch (Exception e) {
            conexion.CierraConexion(cn);
            System.out.println(" error la conseguir el categoria "+ e.getMessage());
        }
        
        return f;
    }

}
