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
public class detallereclamos {
    
   private Integer Reclamos_idReclamos; 
    
   private String categoria; 
   private String deriva_area; 
   private String detalle; 
   private String respuesta; 
   private String fecha_asignacion; 
   private Integer origen; 
   private Integer destino;

   
   private String origennombre; 
   private String destinonombre;

    public detallereclamos() {
    }

    public detallereclamos(Integer Reclamos_idReclamos, String categoria, String deriva_area, String detalle, String respuesta, String fecha_asignacion,Integer origen,Integer destino,String origennombre,String destinonombre) {
        this.Reclamos_idReclamos = Reclamos_idReclamos;
        this.categoria = categoria;
        this.deriva_area = deriva_area;
        this.detalle = detalle;
        this.respuesta = respuesta;
        this.fecha_asignacion = fecha_asignacion;
        this.origen = origen;
        this.destino = destino;
        this.origennombre = origennombre;
        this.destinonombre = destinonombre;
    }

    public String getOrigennombre() {
        return origennombre;
    }

    public void setOrigennombre(String origennombre) {
        this.origennombre = origennombre;
    }

    public String getDestinonombre() {
        return destinonombre;
    }

    public void setDestinonombre(String destinonombre) {
        this.destinonombre = destinonombre;
    }

    
    
    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    
    
    public Integer getReclamos_idReclamos() {
        return Reclamos_idReclamos;
    }

    public void setReclamos_idReclamos(Integer Reclamos_idReclamos) {
        this.Reclamos_idReclamos = Reclamos_idReclamos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDeriva_area() {
        return deriva_area;
    }

    public void setDeriva_area(String deriva_area) {
        this.deriva_area = deriva_area;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }
   
   
    
}
