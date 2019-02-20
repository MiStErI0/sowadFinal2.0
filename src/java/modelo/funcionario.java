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
public class funcionario {
    
    private Integer codigoFu;
    private String nombresF;

    public funcionario() {
    }

    public funcionario(Integer codigoFu, String nombresF) {
        this.codigoFu = codigoFu;
        this.nombresF = nombresF;
    }

    public Integer getCodigoFu() {
        return codigoFu;
    }

    public void setCodigoFu(Integer codigoFu) {
        this.codigoFu = codigoFu;
    }

    public String getNombresF() {
        return nombresF;
    }

    public void setNombresF(String nombresF) {
        this.nombresF = nombresF;
    }
    
    
    
}
