/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion;
import modelo.usuario;

/**
 *
 * @author johan07
 */
public class usuarioBD {

    public List<usuario> getUsuario() {
        List<usuario> lista = new ArrayList();
        String sql = "select * from usuario order by idUsuario";
        Connection c = null;
        try {
            c = new conexion().getConexion();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuario e = new usuario(rs.getInt("idUsuario"), rs.getString("user"), rs.getString("clave"), rs.getInt("estado"), rs.getInt("empelado_idempelado"));
                lista.add(e);
            }
            rs.close();

            rs = null;
            c.close();
            c = null;
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return lista;
    }

    public String existeUsuario(String usuario, String pass) {

        List<usuario> l = getUsuario();
        int x = 0;
        for (usuario en : l) {
            if (en.getUsuario().equals(usuario)) {
                if (en.getContraseña().equals(pass)) {
                    x = 1;
                } else {
                    x = 2;
                }
            } else {
                x = 3;
            }
        }
        if (x == 1) {
            return "Bienvenido";
        }
        if (x == 2) {
            return "Contraseña incorrecta";
        } else {
            return "El usuario " + usuario + " no esta registrado";
        }

    }

    public String updateContra( String user, String oldpass, String newpass) {
        String sql = "UPDATE usuario set clave=? where idUsuario=? and user=? and clave=?",r;
        r=null;
        Connection c = null;
        List<usuario> l = getUsuario();
        try {
            c = new conexion().getConexion();

            PreparedStatement pst = c.prepareCall(sql);
            for (usuario e : l) {
                if (e.getUsuario().equals(user) && e.getContraseña().equals(oldpass)) {
                    
                    pst.setString(1, newpass);
                    pst.setInt(2, e.getIdUsuario());
                    pst.setString(3, e.getUsuario());
                    pst.setString(4, oldpass);
                    int rs = pst.executeUpdate();
                }else if(e.getUsuario().equals(user) && !e.getContraseña().equals(oldpass))
                {
                    return "La antigua contraseña es incorrecta"; 
                }
            }
            

            
            c.close();
            c = null;
            return "Exito";
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                return "Error al cambiar la clave";
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
                return "Error al cambiar la clave";
            }
        }
        

        
    }

}
