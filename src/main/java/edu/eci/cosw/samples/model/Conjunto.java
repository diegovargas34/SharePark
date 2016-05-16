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
public class Conjunto {
    private int Codigo;
    private String Nombre;
    private String geolacalizacion;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGeolacalizacion() {
        return geolacalizacion;
    }

    public void setGeolacalizacion(String geolacalizacion) {
        this.geolacalizacion = geolacalizacion;
    }
}
