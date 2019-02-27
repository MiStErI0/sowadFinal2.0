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
public class tipodocumento {

    private Integer idtipo_documento;
    private String tipodoc;
    private Integer estadoTD;

    public tipodocumento() {
    }

    public tipodocumento(Integer idtipo_documento, String tipodoc, Integer estadoTD) {
        this.idtipo_documento = idtipo_documento;
        this.tipodoc = tipodoc;
        this.estadoTD = estadoTD;
    }

    public Integer getIdtipo_documento() {
        return idtipo_documento;
    }

    public void setIdtipo_documento(Integer idtipo_documento) {
        this.idtipo_documento = idtipo_documento;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Integer getEstadoTD() {
        return estadoTD;
    }

    public void setEstadoTD(Integer estadoTD) {
        this.estadoTD = estadoTD;
    }

    
    

}
