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
    private String barrio;
    
    private Bloque bloque;


    
    public Parqueadero(int codigo, int codUsuario, int precioMinuto, String localizacion, String tipo, String barrio,Bloque b) {
        this.codigo = codigo;
        this.codUsuario = codUsuario;
        this.precioMinuto = precioMinuto;
        this.localizacion = localizacion;
        this.tipo = tipo;
        this.barrio=barrio;
        this.bloque=b;
    }    
    
    public Parqueadero(int codigo, int precioMinuto, String localizacion, String tipo, String barrio){
        this.codigo = codigo;
        this.precioMinuto = precioMinuto;
        this.localizacion = localizacion;
        this.tipo = tipo;
        this.barrio=barrio;
   
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

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Bloque getBloque() {
        return bloque;
    }
    
}
