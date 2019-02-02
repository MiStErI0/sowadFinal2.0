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
public class direccion {
    
    private String direccion;
    private Integer idDistrito;
    private Integer idProvincia;
    private Integer idDepartamento;
    private Integer Persona_idPersona;

    public direccion() {
    }

    public direccion(String direccion, Integer idDistrito, Integer idProvincia, Integer idDepartamento, Integer Persona_idPersona) {
        this.direccion = direccion;
        this.idDistrito = idDistrito;
        this.idProvincia = idProvincia;
        this.idDepartamento = idDepartamento;
        this.Persona_idPersona = Persona_idPersona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getPersona_idPersona() {
        return Persona_idPersona;
    }

    public void setPersona_idPersona(Integer Persona_idPersona) {
        this.Persona_idPersona = Persona_idPersona;
    }
    
    
    
    
}
