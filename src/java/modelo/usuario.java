/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author johan07
 */
public class usuario {

    public usuario() {
    }

    public usuario(int idUsuario, String Usuario, String Contraseña, int Estado, int idEmpleado) {
        this.idUsuario = idUsuario;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Estado = Estado;
        this.idEmpleado = idEmpleado;
    }
    
     
    private int idUsuario;
    private String Usuario;
    private String Contraseña;
    private int Estado;
    private int idEmpleado;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
    
    
    
    
}
