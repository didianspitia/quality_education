package org.didian.quality_education;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private int nivelSocioeconomico;
    private String accesoSuperior;
    private String tipoInstitucion;
    private String modalidad;
    private String motivo;

    public Persona(String nombre, String apellido, int edad, String genero, int nivelSocioeconomico, String accesoSuperior, String tipoInstitucion, String modalidad, String motivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.nivelSocioeconomico = nivelSocioeconomico;
        this.accesoSuperior = accesoSuperior;
        this.tipoInstitucion = tipoInstitucion;
        this.modalidad = modalidad;
        this.motivo = motivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setApellido(String apellido) {
        this.apellido = apellido;
    }public void setEdad(int edad) {
        this.edad = edad;
    }public void setGenero(String genero) {
        this.genero = genero;
    }public void setNivelSocioeconomico(int nivelSocioeconomico) {
        this.nivelSocioeconomico = nivelSocioeconomico;
    }public void setAccesoSuperior(String accesoSuperior) {
        this.accesoSuperior = accesoSuperior;
    }public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombre() {
        return nombre;
    }public String getApellido() {
        return apellido;
    }public int getEdad() {
        return edad;
    }public String getGenero() {
        return genero;
    }public int getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }public String getAccesoSuperior() {
        return accesoSuperior;
    }public String getTipoInstitucion() {
        return tipoInstitucion;
    }public String getModalidad() {
        return modalidad;
    }public String getMotivo() {
        return motivo;
    }
}