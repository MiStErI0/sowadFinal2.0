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
public class categoria {
    
    private Integer idcategoria;
    private String categoria;
    private Integer estadoCat;

    public categoria() {
    }

    public categoria(Integer idcategoria, String categoria,Integer estadoCat) {
        this.idcategoria = idcategoria;
        this.categoria = categoria;
        this.estadoCat = estadoCat;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Integer getEstadoCat() {
        return estadoCat;
    }

    public void setEstadoCat(Integer estadoCat) {
        this.estadoCat = estadoCat;
    }
    
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
