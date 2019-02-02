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
public class provincia {
    
    private Integer idprov;
    private String provincia;
    private Integer Departamento_idDepartamento;

    public provincia() {
    }

    public provincia(Integer idprov, String provincia, Integer Departamento_idDepartamento) {
        this.idprov = idprov;
        this.provincia = provincia;
        this.Departamento_idDepartamento = Departamento_idDepartamento;
    }

    public Integer getIdprov() {
        return idprov;
    }

    public void setIdprov(Integer idprov) {
        this.idprov = idprov;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getDepartamento_idDepartamento() {
        return Departamento_idDepartamento;
    }

    public void setDepartamento_idDepartamento(Integer Departamento_idDepartamento) {
        this.Departamento_idDepartamento = Departamento_idDepartamento;
    }
    
    
    
    
}
