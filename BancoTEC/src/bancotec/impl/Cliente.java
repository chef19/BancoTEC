/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.impl;

import bancotec.ConfiguracionInicial;

/**
 *
 * @author danterf4
 */
public class Cliente {
    public String Nombre;
    public String Correo;
    private String Codigo;
    public static String Code;
    public String Tipo;
    public int Numero;
    public String Ventanilla;
    public String Nuevo;
    
    
    
    public Cliente(String Nombre, String Correo, String Tipo, String Ventanilla, int Numero){
        this.Nombre=Nombre;
        this.Correo=Correo;
        this.Tipo=Tipo;
        this.Ventanilla=Ventanilla;
        this.Numero=Numero;
        int i = 0;
        Ventanilla Ventana;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(Ventanilla)){
                this.Codigo = Ventana.Codigo()+"-"+this.Tipo+"-"+this.Numero;
                this.Code = Codigo;
                i = ConfiguracionInicial.ArregloVentanillas.size();
            }
            else{
                i++;
            }
        }
        System.out.println("Codigo de cliente cuando es creado: "+ Codigo);
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
    
    public String getCodigo(){
        return Codigo;
    }
}
