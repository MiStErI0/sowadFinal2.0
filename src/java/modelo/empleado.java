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
public class empleado {
    

private Integer idPersona;
private String fechainicio;
private String sueldo; 
private String fechafin;
private Integer idearea;
private Integer idcargo;
private Integer idempelado;
private String nombreP;
private String paternoP;
private String maternoP;
private String correo;
private String numero;
private String cargo;
private Integer estadoEmp;
private String departamento;
private String provincia;
private String distrito;
private Integer idDepartamento;
private Integer idProvincia;
private Integer idDistrito;
private Integer idtipo_documento;
private Integer idOperador;
private String tipodoc;
private String num_documento;
private String direccion;
private String area;
private String nombreO;
private String tipotelefono;
private Integer idtipotelefono;

    public empleado() {
    }

    public empleado(Integer idPersona, String fechainicio, String sueldo, String fechafin, Integer idearea, Integer idcargo, Integer idempelado, String nombreP, String paternoP, String maternoP, String correo, String numero, String cargo, Integer estadoEmp, String departamento, String provincia, String distrito, Integer idDepartamento, Integer idProvincia, Integer idDistrito, Integer idtipo_documento, Integer idOperador, String tipodoc, String num_documento, String direccion, String area, String nombreO, String tipotelefono, Integer idtipotelefono) {
        this.idPersona = idPersona;
        this.fechainicio = fechainicio;
        this.sueldo = sueldo;
        this.fechafin = fechafin;
        this.idearea = idearea;
        this.idcargo = idcargo;
        this.idempelado = idempelado;
        this.nombreP = nombreP;
        this.paternoP = paternoP;
        this.maternoP = maternoP;
        this.correo = correo;
        this.numero = numero;
        this.cargo = cargo;
        this.estadoEmp = estadoEmp;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.idDepartamento = idDepartamento;
        this.idProvincia = idProvincia;
        this.idDistrito = idDistrito;
        this.idtipo_documento = idtipo_documento;
        this.idOperador = idOperador;
        this.tipodoc = tipodoc;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.area = area;
        this.nombreO = nombreO;
        this.tipotelefono = tipotelefono;
        this.idtipotelefono = idtipotelefono;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public Integer getIdearea() {
        return idearea;
    }

    public void setIdearea(Integer idearea) {
        this.idearea = idearea;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Integer getIdempelado() {
        return idempelado;
    }

    public void setIdempelado(Integer idempelado) {
        this.idempelado = idempelado;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getEstadoEmp() {
        return estadoEmp;
    }

    public void setEstadoEmp(Integer estadoEmp) {
        this.estadoEmp = estadoEmp;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Integer getIdtipo_documento() {
        return idtipo_documento;
    }

    public void setIdtipo_documento(Integer idtipo_documento) {
        this.idtipo_documento = idtipo_documento;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNombreO() {
        return nombreO;
    }

    public void setNombreO(String nombreO) {
        this.nombreO = nombreO;
    }

    public String getTipotelefono() {
        return tipotelefono;
    }

    public void setTipotelefono(String tipotelefono) {
        this.tipotelefono = tipotelefono;
    }

    public Integer getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }




    
}
