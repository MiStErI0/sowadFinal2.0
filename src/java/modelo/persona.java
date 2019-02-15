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
public class persona {

    private String nombreP;
    private String paternoP;
    private String maternoP;
    private Integer tipodocumento;
    private String num_documento;
    private String correo;
    
    public persona() {
    }


    public persona(String nombreP, String paternoP, String maternoP, Integer tipodocumento, String num_documento, String correo) {
        this.nombreP = nombreP;
        this.paternoP = paternoP;
        this.maternoP = maternoP;
        this.tipodocumento = tipodocumento;
        this.num_documento = num_documento;
        this.correo = correo;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getPaternoP() {
        return paternoP;
    }

    public void setPaternoP(String paternoP) {
        this.paternoP = paternoP;
    }

    public String getMaternoP() {
        return maternoP;
    }

    public void setMaternoP(String maternoP) {
        this.maternoP = maternoP;
    }

    public Integer getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Integer tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    

}
