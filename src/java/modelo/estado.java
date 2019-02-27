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
public class estado {
    
    private Integer idEstado;
    private String nombreEs;
    private Integer tipoestado;

    public estado() {
    }

    public estado(Integer idEstado, String nombreEs, Integer tipoestado) {
        this.idEstado = idEstado;
        this.nombreEs = nombreEs;
        this.tipoestado = tipoestado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEs() {
        return nombreEs;
    }

    public void setNombreEs(String nombreEs) {
        this.nombreEs = nombreEs;
    }

    public Integer getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(Integer tipoestado) {
        this.tipoestado = tipoestado;
    }
    
    
    
}
