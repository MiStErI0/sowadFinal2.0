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
public class telefono {
    private String numero;
    private Integer estadoT;
    private Integer Persona_idPersona;
    private Integer idTipo_telefono;
    private Integer idOperador;

    public telefono() {
    }

    public telefono(String numero, Integer estadoT, Integer Persona_idPersona, Integer idTipo_telefono, Integer idOperador) {
        this.numero = numero;
        this.estadoT = estadoT;
        this.Persona_idPersona = Persona_idPersona;
        this.idTipo_telefono = idTipo_telefono;
        this.idOperador = idOperador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getEstadoT() {
        return estadoT;
    }

    public void setEstadoT(Integer estadoT) {
        this.estadoT = estadoT;
    }

    public Integer getPersona_idPersona() {
        return Persona_idPersona;
    }

    public void setPersona_idPersona(Integer Persona_idPersona) {
        this.Persona_idPersona = Persona_idPersona;
    }

    public Integer getIdTipo_telefono() {
        return idTipo_telefono;
    }

    public void setIdTipo_telefono(Integer idTipo_telefono) {
        this.idTipo_telefono = idTipo_telefono;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }
    
    
    
    
}
