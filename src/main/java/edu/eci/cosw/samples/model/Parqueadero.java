/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.samples.model;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Parqueadero {
    
    private int codigo;
    private int codUsuario;
    private int precioMinuto;
    private String localizacion;
    private String tipo;
    private Bloque bloque=new Bloque();
    
    public Parqueadero(int codigo, int codUsuario, int precioMinuto, String localizacion, String tipo) {
        this.codigo = codigo;
        this.codUsuario = codUsuario;
        this.precioMinuto = precioMinuto;
        this.localizacion = localizacion;
        this.tipo = tipo;
    }    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getPrecioMinuto() {
        return precioMinuto;
    }

    public void setPrecioMinuto(int precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
