/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.impl;
/**
 *
 * @author ANDRES MS
 */
public class Ventanilla {
    public String Nombre;
    public String Codigo;
    public String Descripcion;
    public int CantidadVentanillas;
    
    public Ventanilla(){
    }
    
    public Ventanilla(String nombre,String codigo, String descripcion,int cantidad){
        this.Nombre=nombre;
        this.Codigo=codigo;
        this.Descripcion=descripcion;
        this.CantidadVentanillas=cantidad;
    }
    public String Nombre(){
        return this.Nombre;
    }
    public String Codigo(){
        return this.Codigo;
    }
    public String Descripcion(){
        return this.Descripcion;
    }
    public int CantidadVentanillas(){
        return this.CantidadVentanillas;
    
    }   
}
