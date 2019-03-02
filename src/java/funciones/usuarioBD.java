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
        String sql = "select * from usuario";
        Connection c = null;
        try {
            c = conexion.getConexion();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuario e = new usuario(rs.getInt("idUsuario"), rs.getString("user"), rs.getString("clave"), rs.getInt("estado"), rs.getInt("empelado_idempelado"));
                System.out.println(e.getIdUsuario() + " " + e.getUsuario() + " " + e.getContraseña() + " " + e.getEstado() + " " + e.getIdEmpleado());
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

    public usuario usuActivo() {
        usuario e = new usuario();
        String sql = "select * from usuario where estado=?";
        Connection c = null;
        try {
            c = conexion.getConexion();
            PreparedStatement pst = c.prepareCall(sql);
            pst.setInt(1, 2);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                //e = new usuario(rs.getInt("idUsuario"), rs.getString("user"), rs.getString("clave"), rs.getInt("estado"), rs.getInt("empelado_idempelado"));
                e.setIdUsuario(rs.getInt("idUsuario"));
                e.setUsuario(rs.getString("user"));
                e.setContraseña(rs.getString("clave"));
                e.setEstado(rs.getInt("estado"));
                e.setIdEmpleado(rs.getInt("empelado_idempelado"));
            } else {
                e = new usuario();
                e.setEstado(1);
                return e;
            }

            System.out.println(rs.getString("user") + "fdcsfasdfdsfsdsdafsdfsdaf");
            rs.close();

            rs = null;
            conexion.CierraConexion(c);
            c = null;

            System.out.println("funciono  dsadasdfasdfsdfsdafas");
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                System.out.println("noooooooooooooo funciono  dsadasdfasdfsdfsdafas");
                return e = null;
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("asdfdsfsadfasdfsnoooooooooooooo funciono  dsadasdfasdfsdfsdafas");
                return e = null;
            }
        }

    }

    public String nomUsuAc() {
        String sql = "SELECT concat(p.nombreP ,' ',p.paternoP) nombre from persona as p \n"
                + "INNER JOIN empelado as e on p.idPersona = e.idPersona\n"
                + "INNER JOIN usuario as u on e.idempelado = u.empelado_idempelado\n"
                + "where u.estado=?";
        Connection c = null;
        String r = null;
        try {
            c = conexion.getConexion();

            PreparedStatement pst = c.prepareCall(sql);
            pst.setInt(1, 2);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = rs.getString(1);
            }

            System.out.println(rs.getString(1) + "fdcsfasdfdsfsdsdafsdfsdaf");
            rs.close();

            rs = null;
            conexion.CierraConexion(c);
            c = null;

            System.out.println("funciono nombre dsadasdfasdfsdfsdafas");
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                System.out.println("noooooooooooooo funciono nombre dsadasdfasdfsdfsdafas");
                return r;
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("asdfdsfsadfasdfsnoooooooooooooo funciono nommdsa dsadasdfasdfsdfsdafas");
                return r;
            }
        }
    }

    public String existeUsuario(String usuario, String pass) {
        usuario e = new usuario();
        String sql = "select * from usuario where user=?", r;
        Connection c = null;
        try {
            c = conexion.getConexion();
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, usuario);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                if (rs.getString("clave").equals(pass)) {
                    r = "Bienvenido";
                } else {
                    r = "Contraseña incorrecta";
                }
            } else {
                r = "El usuario " + usuario + " no esta registrado";
            }
            System.out.println(r + "                            ddddddd");
            rs.close();
            rs = null;
            conexion.CierraConexion(c);
            c = null;
            System.out.println("funciono  dsadasdfasdfsdfsdafas");
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                System.out.println("noooooooooooooo funciono  dsadasdfasdfsdfsdafas");
                return r = null;
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("asdfdsfsadfasdfsnoooooooooooooo funciono  dsadasdfasdfsdfsdafas");
                return r = null;
            }
        }
    }

    public int obtenerUsuario(String usuario, String pass) {
        List<usuario> l = getUsuario();
        int x = 0;
        String nombre, contraseña;
        for (usuario en : l) {
            nombre = en.getUsuario();
            contraseña = en.getContraseña();
            System.out.println(nombre + "          " + contraseña);
            if (nombre.equals(usuario) && contraseña.equals(pass)) {
                System.out.println(nombre + "     =     " + contraseña);
                x = en.getIdUsuario();
                break;
            } else {
                System.out.println(nombre + "     !=     " + contraseña);
                x = -1;
            }
        }
        return x;
    }

    public void Sesion(usuario e, String activo) {
        String sql = "UPDATE usuario set estado=? where idUsuario=? and user=?", r;
        r = null;
        Connection c = null;

        try {
            c = conexion.getConexion();

            PreparedStatement pst = c.prepareCall(sql);
            if (activo.equals("Iniciar")) {
                pst.setInt(1, 2);
                pst.setInt(2, e.getIdUsuario());
                pst.setString(3, e.getUsuario());
                System.out.println("sesion                     funciona ");
            } else {
                pst.setInt(1, 1);
                pst.setInt(2, e.getIdUsuario());
                pst.setString(3, e.getUsuario());
                System.out.println("sesion         Cerrar            funciona ");
            }
            int rs = pst.executeUpdate();
            c.close();
            c = null;
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                System.out.println("sesion           no          funciona ");
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("sesion           no          funciona ");

            }
        }
    }

    public String updateContra(String user, String oldpass, String newpass) {
        String sql = "UPDATE usuario set clave=? where idUsuario=? and user=? and clave=?", r;
        r = null;
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
                } else if (e.getUsuario().equals(user) && !e.getContraseña().equals(oldpass)) {
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

    public int idCargo(int i) {
        String sql = "SELECT cargo_idcargo FROM cargo_has_usuario where Usuario_idUsuario =?";
        Connection c = null;
        try {
            c = conexion.getConexion();

            PreparedStatement pst = c.prepareCall(sql);
            pst.setInt(1, i);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                i=rs.getInt(1);
            }
            else{
                i=0;
            }
            c.close();
            c = null;
            System.out.println(i+" idCargo                     funciona ");
        } catch (SQLException ex) {
            Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                System.out.println("idCargo           no          funciona ");
            } catch (SQLException ex1) {
                Logger.getLogger(usuarioBD.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("idCargo           no          funciona 2.0 ");

            }
        }
        return i;
    }

}
