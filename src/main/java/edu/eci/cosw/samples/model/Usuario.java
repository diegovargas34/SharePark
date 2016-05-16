/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.samples.model;

/**
 *
 * @author diego
 */
public class Usuario {
    private int codigo;
    private String nombre ;
    private int cedula;
    private boolean mensualidad;
    private int calificacion;
    private int codparqueadero;
    private int telefono;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(boolean mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCodparqueadero() {
        return codparqueadero;
    }

    public void setCodparqueadero(int codparqueadero) {
        this.codparqueadero = codparqueadero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
