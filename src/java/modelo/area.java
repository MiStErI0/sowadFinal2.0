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
public class area {
    
    
    private String area;
    private Integer estadoA;
    private Integer idarea;

    public area() {
    }

    public area(String area,Integer estadoA,Integer idarea) {
        this.area = area;
        this.estadoA = estadoA;
        this.idarea = idarea;
    }

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }

    
    
    public Integer getEstadoA() {
        return estadoA;
    }

    public void setEstadoA(Integer estadoA) {
        this.estadoA = estadoA;
    }
    
    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    
    
    
    
    
}
