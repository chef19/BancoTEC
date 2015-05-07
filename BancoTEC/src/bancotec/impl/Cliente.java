/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.impl;

/**
 *
 * @author danterf4
 */
public class Cliente {
    public String Nombre;
    public String Correo;
    public String Tipo;
    public int Numero;
    public String Ventanilla;
    
    
    
    public Cliente(String Nombre, String Correo, String Tipo, String Ventanilla, int Numero){
        this.Nombre=Nombre;
        this.Correo=Correo;
        this.Tipo=Tipo;
        this.Ventanilla=Ventanilla;
        this.Numero=Numero;
    }

    public String getNombre() {
        return Nombre;        
    }

    public String getTipo() {
        return Tipo;
    }
    
    public String getVentanilla() {
        return Ventanilla;
    }
    
    public String getCorreo() {
        return Correo;
    }
    
    public int getNumero() {
        return Numero;
    }
}
