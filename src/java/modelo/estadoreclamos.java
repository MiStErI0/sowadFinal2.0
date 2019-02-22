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
public class estadoreclamos {
    
    private Integer Reclamos_idReclamos;  
    private String fecharegistro;
    private String sumilla; 
    private Integer Usuario_idUsuario; 
    private Integer Estado_idEstado;

    public estadoreclamos() {
    }

    public estadoreclamos(Integer Reclamos_idReclamos, String fecharegistro, String sumilla, Integer Usuario_idUsuario, Integer Estado_idEstado) {
        this.Reclamos_idReclamos = Reclamos_idReclamos;
        this.fecharegistro = fecharegistro;
        this.sumilla = sumilla;
        this.Usuario_idUsuario = Usuario_idUsuario;
        this.Estado_idEstado = Estado_idEstado;
    }

    public Integer getReclamos_idReclamos() {
        return Reclamos_idReclamos;
    }

    public void setReclamos_idReclamos(Integer Reclamos_idReclamos) {
        this.Reclamos_idReclamos = Reclamos_idReclamos;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getSumilla() {
        return sumilla;
    }

    public void setSumilla(String sumilla) {
        this.sumilla = sumilla;
    }

    public Integer getUsuario_idUsuario() {
        return Usuario_idUsuario;
    }

    public void setUsuario_idUsuario(Integer Usuario_idUsuario) {
        this.Usuario_idUsuario = Usuario_idUsuario;
    }

    public Integer getEstado_idEstado() {
        return Estado_idEstado;
    }

    public void setEstado_idEstado(Integer Estado_idEstado) {
        this.Estado_idEstado = Estado_idEstado;
    }
    
    
    

    
}
