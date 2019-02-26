/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Computer
 */
public class cargo_area {
    
    private Integer cargo_idcargo;
    private Integer Usuario_idUsuario;

    public cargo_area() {
    }

    public cargo_area(Integer cargo_idcargo, Integer Usuario_idUsuario) {
        this.cargo_idcargo = cargo_idcargo;
        this.Usuario_idUsuario = Usuario_idUsuario;
    }

    public Integer getCargo_idcargo() {
        return cargo_idcargo;
    }

    public void setCargo_idcargo(Integer cargo_idcargo) {
        this.cargo_idcargo = cargo_idcargo;
    }

    public Integer getUsuario_idUsuario() {
        return Usuario_idUsuario;
    }

    public void setUsuario_idUsuario(Integer Usuario_idUsuario) {
        this.Usuario_idUsuario = Usuario_idUsuario;
    }
    
    
    
}
