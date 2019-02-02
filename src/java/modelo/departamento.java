/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class departamento {
    
    private Integer Iddepa;
    private String departamento;

    public departamento() {
    }

    public departamento(Integer Iddepa, String departamento) {
        this.Iddepa = Iddepa;
        this.departamento = departamento;
    }

    public Integer getIddepa() {
        return Iddepa;
    }

    public void setIddepa(Integer Iddepa) {
        this.Iddepa = Iddepa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
        
    
}
