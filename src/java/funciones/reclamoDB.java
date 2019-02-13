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
        String sql = "select idReclamos,fechahecho,funcionario,descripcion,estado from reclamos";

        try {
            cn = new conexion().getConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList<reclamos>();
            while (rs.next()) {
                reclamos e = new reclamos();
                e.setIdreclamos(rs.getInt(1));
                e.setFechahecho(rs.getString(2));
                e.setFuncionario(rs.getString(3));
                e.setDescripcion(rs.getString(4));
                e.setEstado(rs.getString(5));

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
        String sql = " insert into reclamos(fechahecho,funcionario,descripcion,estado,Persona_idPersona)"
                + "values(date(now()),?,?,'Registrado',?)";

        try {
            cn = conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, f.getFuncionario());
            ps.setString(2, f.getDescripcion());
            ps.setInt(3, f.getPersona_idPersona());

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

    

}
