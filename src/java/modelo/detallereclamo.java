package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class detallereclamo {
    
    private String detalle;
    private String respuesta;  
    private String fecha_asignacion; 
    private Integer codigoareaorigen;  
    private Integer codigoareadestino;

    public detallereclamo() {
    }

    public detallereclamo(String detalle, String respuesta, String fecha_asignacion, Integer codigoareaorigen, Integer codigoareadestino) {
        this.detalle = detalle;
        this.respuesta = respuesta;
        this.fecha_asignacion = fecha_asignacion;
        this.codigoareaorigen = codigoareaorigen;
        this.codigoareadestino = codigoareadestino;
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

    public Integer getCodigoareaorigen() {
        return codigoareaorigen;
    }

    public void setCodigoareaorigen(Integer codigoareaorigen) {
        this.codigoareaorigen = codigoareaorigen;
    }

    public Integer getCodigoareadestino() {
        return codigoareadestino;
    }

    public void setCodigoareadestino(Integer codigoareadestino) {
        this.codigoareadestino = codigoareadestino;
    }
    
    
    
}
