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
    private String condigoR;
    private String fechahecho;
    private String descripcion;
    private Integer Persona_idPersona;
    private Integer categoria_idcategoria;
    private Integer Estado_idEstado;
    private Integer area_idarea;

    public reclamos() {
    }

    public reclamos(Integer idreclamos, String condigoR, String fechahecho, String descripcion, Integer Persona_idPersona, Integer categoria_idcategoria, Integer Estado_idEstado, Integer area_idarea) {
        this.idreclamos = idreclamos;
        this.condigoR = condigoR;
        this.fechahecho = fechahecho;
        this.descripcion = descripcion;
        this.Persona_idPersona = Persona_idPersona;
        this.categoria_idcategoria = categoria_idcategoria;
        this.Estado_idEstado = Estado_idEstado;
        this.area_idarea = area_idarea;
    }

    public Integer getIdreclamos() {
        return idreclamos;
    }

    public void setIdreclamos(Integer idreclamos) {
        this.idreclamos = idreclamos;
    }

    public String getCondigoR() {
        return condigoR;
    }

    public void setCondigoR(String condigoR) {
        this.condigoR = condigoR;
    }

    public String getFechahecho() {
        return fechahecho;
    }

    public void setFechahecho(String fechahecho) {
        this.fechahecho = fechahecho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPersona_idPersona() {
        return Persona_idPersona;
    }

    public void setPersona_idPersona(Integer Persona_idPersona) {
        this.Persona_idPersona = Persona_idPersona;
    }

    public Integer getCategoria_idcategoria() {
        return categoria_idcategoria;
    }

    public void setCategoria_idcategoria(Integer categoria_idcategoria) {
        this.categoria_idcategoria = categoria_idcategoria;
    }

    public Integer getEstado_idEstado() {
        return Estado_idEstado;
    }

    public void setEstado_idEstado(Integer Estado_idEstado) {
        this.Estado_idEstado = Estado_idEstado;
    }

    public Integer getArea_idarea() {
        return area_idarea;
    }

    public void setArea_idarea(Integer area_idarea) {
        this.area_idarea = area_idarea;
    }   
}
