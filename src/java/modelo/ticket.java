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
public class ticket {
    
    private Integer idpersona;
    private Integer idreclamos;
    private  String codigoR;
    private  String nombre;
    private  String paterno;
    private  String materno;

    public ticket() {
    }

    public ticket(Integer idpersona, Integer idreclamos, String codigoR, String nombre, String paterno, String materno) {
        this.idpersona = idpersona;
        this.idreclamos = idreclamos;
        this.codigoR = codigoR;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getIdreclamos() {
        return idreclamos;
    }

    public void setIdreclamos(Integer idreclamos) {
        this.idreclamos = idreclamos;
    }

    public String getCodigoR() {
        return codigoR;
    }

    public void setCodigoR(String codigoR) {
        this.codigoR = codigoR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    
    
}
