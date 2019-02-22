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
public class reclamos extends persona {

    private Integer idreclamos;
    private String condigoR;
    private String fechahecho;
    private String descripcion;
    private Integer Persona_idPersona;
    private Integer categoria_idcategoria;
    private Integer Estado_idEstado;
    private Integer area_idarea;
    private String funcionario;
    
    private String nombreestado;
    private String nombrecategoria;
    private String telefono;
    private String ubigeo;
    private String direccion;
    private String detalle;
    private Integer area_funcionario;
    

    public reclamos() {
    }

    public reclamos(Integer idreclamos, String condigoR, String fechahecho,
            String descripcion, Integer Persona_idPersona, Integer categoria_idcategoria,
            Integer Estado_idEstado, Integer area_idarea, String funcionario, String nombreestado,String nombrecategoria,
            String ubigeo,String direccion, String detalle, Integer area_funcionario,String telefono,String nombreP,String paternoP,String maternoP,
            Integer tipodocumento,String num_documento,String correo) {
        
        super(nombreP,paternoP,maternoP,tipodocumento,num_documento,correo);

        this.idreclamos = idreclamos;
        this.condigoR = condigoR;
        this.fechahecho = fechahecho;
        this.descripcion = descripcion;
        this.Persona_idPersona = Persona_idPersona;
        this.categoria_idcategoria = categoria_idcategoria;
        this.Estado_idEstado = Estado_idEstado;
        this.area_idarea = area_idarea;
        this.funcionario = funcionario;
        this.nombreestado = nombreestado;
        this.nombrecategoria = nombrecategoria;
        this.telefono = telefono;
        this.ubigeo = ubigeo;
        this.direccion = direccion;
        this.detalle = detalle;
        this.area_funcionario = area_funcionario;
    }

    public Integer getArea_funcionario() {
        return area_funcionario;
    }

    public void setArea_funcionario(Integer area_funcionario) {
        this.area_funcionario = area_funcionario;
    }
 
    
    
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    
    
    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    
    public String getNombreestado() {
        return nombreestado;
    }

    public void setNombreestado(String nombreestado) {
        this.nombreestado = nombreestado;
    }

    public Integer getIdreclamos() {
        return idreclamos;
    }

    public void setIdreclamos(Integer idreclamos) {
        this.idreclamos = idreclamos;
    }

    public String getCondigoR() {
        return condigoR;
    }

    public void setCondigoR(String condigoR) {
        this.condigoR = condigoR;
    }

    public String getFechahecho() {
        return fechahecho;
    }

    public void setFechahecho(String fechahecho) {
        this.fechahecho = fechahecho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPersona_idPersona() {
        return Persona_idPersona;
    }

    public void setPersona_idPersona(Integer Persona_idPersona) {
        this.Persona_idPersona = Persona_idPersona;
    }

    public Integer getCategoria_idcategoria() {
        return categoria_idcategoria;
    }

    public void setCategoria_idcategoria(Integer categoria_idcategoria) {
        this.categoria_idcategoria = categoria_idcategoria;
    }

    public Integer getEstado_idEstado() {
        return Estado_idEstado;
    }

    public void setEstado_idEstado(Integer Estado_idEstado) {
        this.Estado_idEstado = Estado_idEstado;
    }

    public Integer getArea_idarea() {
        return area_idarea;
    }

    public void setArea_idarea(Integer area_idarea) {
        this.area_idarea = area_idarea;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

}
