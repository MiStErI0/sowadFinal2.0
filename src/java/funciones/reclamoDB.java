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
import modelo.distrito;
import modelo.persona;
import modelo.provincia;
import modelo.reclamos;
import modelo.reclamos;
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
        String sql = "select idReclamos,fechahecho,descripcion from reclamos";

        try {
            cn = new conexion().getConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList<reclamos>();
            while (rs.next()) {
                reclamos e = new reclamos();
                e.setIdreclamos(rs.getInt(1));
                e.setFechahecho(rs.getString(2));

                e.setDescripcion(rs.getString(4));

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
        String sql = "insert into persona(nombreP,paternoP,maternoP,tipo_documento_idtipo_documento,num_documento)"
                + "values(?,?,?,?,?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, f.getNombreP());
            ps.setString(2, f.getPaternoP());
            ps.setString(3, f.getMaternoP());
            ps.setInt(4, f.getTipodocumento());
            ps.setString(5, f.getNum_documento());

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

    private int Idpersona(Connection cn) {
        int r = 0;
        String sql = "select IFNULL(max(idPersona),0)+1 codigo from persona";

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

    public String RegistrarReclamo(reclamos f) {

        String resultado = null;
        Connection cn = null;
        String sql = "insert into reclamos(idReclamos,fechahecho,descripcion,idcliente,categoria_idcategoria,Estado_idEstado,area_idarea)"
                + "values(?,?,?,1,1,1,1)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            int id = nuevoId(cn);

            ps.setInt(1, id);
            ps.setString(2, f.getFechahecho());
            ps.setString(3, f.getDescripcion());

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
