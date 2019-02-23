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
public class funcionarioarea {
    
    private Integer funcionario_idfuncionario;
    private Integer area_idarea;

    public funcionarioarea() {
    }

    public funcionarioarea(Integer funcionario_idfuncionario, Integer area_idarea) {
        this.funcionario_idfuncionario = funcionario_idfuncionario;
        this.area_idarea = area_idarea;
    }

    public Integer getFuncionario_idfuncionario() {
        return funcionario_idfuncionario;
    }

    public void setFuncionario_idfuncionario(Integer funcionario_idfuncionario) {
        this.funcionario_idfuncionario = funcionario_idfuncionario;
    }

    public Integer getArea_idarea() {
        return area_idarea;
    }

    public void setArea_idarea(Integer area_idarea) {
        this.area_idarea = area_idarea;
    }
    
    
}
