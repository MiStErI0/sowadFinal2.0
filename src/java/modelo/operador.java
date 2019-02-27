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
public class operador {

    private Integer idOperador;
    private String nombreO;
    private Integer estadoOp;

    public operador() {
    }

    public operador(Integer idOperador, String nombreO, Integer estadoOp) {
        this.idOperador = idOperador;
        this.nombreO = nombreO;
        this.estadoOp = estadoOp;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public String getNombreO() {
        return nombreO;
    }

    public void setNombreO(String nombreO) {
        this.nombreO = nombreO;
    }

    public Integer getEstadoOp() {
        return estadoOp;
    }

    public void setEstadoOp(Integer estadoOp) {
        this.estadoOp = estadoOp;
    }
    
    
    
}
