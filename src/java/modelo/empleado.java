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
public class empleado {
    

private Integer idPersona;
private String fechainicio;
private String sueldo; 
private String fechafin;
private Integer idearea;

    public empleado() {
    }

    public empleado(Integer idPersona, String fechainicio, String sueldo, String fechafin, Integer idearea) {
        this.idPersona = idPersona;
        this.fechainicio = fechainicio;
        this.sueldo = sueldo;
        this.fechafin = fechafin;
        this.idearea = idearea;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public Integer getIdearea() {
        return idearea;
    }

    public void setIdearea(Integer idearea) {
        this.idearea = idearea;
    }
    
    
    

    
}
