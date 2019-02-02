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
public class reclamos {
    private Integer idreclamos;
    private String fechahecho;
    private String funcionario;
    private String descripcion;
    private String estado;
    private Integer Persona_idPersona;

    public reclamos() {
    }

    public reclamos(Integer idreclamos, String fechahecho, String funcionario, String descripcion, String estado, Integer Persona_idPersona) {
        this.idreclamos = idreclamos;
        this.fechahecho = fechahecho;
        this.funcionario = funcionario;
        this.descripcion = descripcion;
        this.estado = estado;
        this.Persona_idPersona = Persona_idPersona;
    }

    public Integer getIdreclamos() {
        return idreclamos;
    }

    public void setIdreclamos(Integer idreclamos) {
        this.idreclamos = idreclamos;
    }

    public String getFechahecho() {
        return fechahecho;
    }

    public void setFechahecho(String fechahecho) {
        this.fechahecho = fechahecho;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPersona_idPersona() {
        return Persona_idPersona;
    }

    public void setPersona_idPersona(Integer Persona_idPersona) {
        this.Persona_idPersona = Persona_idPersona;
    }

   
}
