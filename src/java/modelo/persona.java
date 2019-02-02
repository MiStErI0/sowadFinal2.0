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
    private Integer estado;
    private Integer Tipo_persona_idTipo_persona;
    private String tipodocumento;
    private String numerodoc;
    private String correo;

    public persona() {
    }

    public persona(String nombreP, String paternoP, String maternoP, Integer estado, Integer Tipo_persona_idTipo_persona, String tipodocumento, String numerodoc, String correo) {
        this.nombreP = nombreP;
        this.paternoP = paternoP;
        this.maternoP = maternoP;
        this.estado = estado;
        this.Tipo_persona_idTipo_persona = Tipo_persona_idTipo_persona;
        this.tipodocumento = tipodocumento;
        this.numerodoc = numerodoc;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getTipo_persona_idTipo_persona() {
        return Tipo_persona_idTipo_persona;
    }

    public void setTipo_persona_idTipo_persona(Integer Tipo_persona_idTipo_persona) {
        this.Tipo_persona_idTipo_persona = Tipo_persona_idTipo_persona;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumerodoc() {
        return numerodoc;
    }

    public void setNumerodoc(String numerodoc) {
        this.numerodoc = numerodoc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    

}
