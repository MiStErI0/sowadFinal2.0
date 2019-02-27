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
public class cargo {
    
    
    private Integer idcargo;
    private Integer estadoCar;
    private String cargo;
    

    public cargo() {
    }

    public cargo(Integer idcargo,Integer estadoCar,String cargo) {
        this.idcargo = idcargo;
        this.estadoCar = estadoCar;
        this.cargo = cargo;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Integer getEstadoCar() {
        return estadoCar;
    }

    public void setEstadoCar(Integer estadoCar) {
        this.estadoCar = estadoCar;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
