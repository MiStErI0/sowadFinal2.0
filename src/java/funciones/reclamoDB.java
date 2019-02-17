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
import modelo.conexion;
import modelo.conexion;
import modelo.departamento;
import modelo.direccion;
import modelo.distrito;
import modelo.persona;
import modelo.provincia;
import modelo.reclamos;
import modelo.reclamos;
import modelo.telefono;
import modelo.tipotelefono;

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

    public String RegistrarReclamo(reclamos f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into reclamos(idReclamos,fechahecho,descripcion,funcionario,idcliente,categoria_idcategoria,Estado_idEstado,area_idarea)"
                + "values(?,?,?,?,?,1,1,1)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id = nuevoId(cn);
            int id2 = Idcliente(cn);

            ps.setInt(1, id);
            ps.setString(2, f.getFechahecho());
            ps.setString(3, f.getDescripcion());
            ps.setString(4, f.getFuncionario());
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

}
