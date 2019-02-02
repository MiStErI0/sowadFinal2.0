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
public class distrito {
    
    private Integer iddist;
    private String distrito;
    private Integer Provincia_idProvincia;
    private Integer Provincia_Departamento_idDepartamento;

    public distrito() {
    }

    public distrito(Integer iddist, String distrito, Integer Provincia_idProvincia, Integer Provincia_Departamento_idDepartamento) {
        this.iddist = iddist;
        this.distrito = distrito;
        this.Provincia_idProvincia = Provincia_idProvincia;
        this.Provincia_Departamento_idDepartamento = Provincia_Departamento_idDepartamento;
    }

    public Integer getIddist() {
        return iddist;
    }

    public void setIddist(Integer iddist) {
        this.iddist = iddist;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getProvincia_idProvincia() {
        return Provincia_idProvincia;
    }

    public void setProvincia_idProvincia(Integer Provincia_idProvincia) {
        this.Provincia_idProvincia = Provincia_idProvincia;
    }

    public Integer getProvincia_Departamento_idDepartamento() {
        return Provincia_Departamento_idDepartamento;
    }

    public void setProvincia_Departamento_idDepartamento(Integer Provincia_Departamento_idDepartamento) {
        this.Provincia_Departamento_idDepartamento = Provincia_Departamento_idDepartamento;
    }
    
    
    
}
