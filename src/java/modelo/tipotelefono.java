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
public class tipotelefono {
    
    private Integer idtipotelefono;
    private String nombreTT;

    public tipotelefono() {
    }

    public tipotelefono(Integer idtipotelefono, String nombreTT) {
        this.idtipotelefono = idtipotelefono;
        this.nombreTT = nombreTT;
    }

    public Integer getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public String getNombreTT() {
        return nombreTT;
    }

    public void setNombreTT(String nombreTT) {
        this.nombreTT = nombreTT;
    }
    
    
    
}
