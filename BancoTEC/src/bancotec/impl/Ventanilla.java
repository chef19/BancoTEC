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
    public String Tipo;
    public Object VentanillasDisponibles[];
    public static int ClientesAtendidos[];
    public static Cola ColaR;
    public static Cola ColaC;
    public static Cola ColaE;
    public static Cola ColaM;
    public static Cola ColaD;
    
    public Ventanilla(){
    }
    
    public Ventanilla(String nombre,String codigo, String descripcion,int cantidad,String tipo){
        this.Nombre=nombre;
        this.Codigo=codigo;
        this.Descripcion=descripcion;
        this.VentanillasDisponibles=new Object[cantidad];
        this.ClientesAtendidos=new int[cantidad];
        /**
        int i = 0;
        while(i<VentanillasDisponibles.length){
            VentanillasDisponibles[i]=0;
            i++;
        }
        */
        this.Tipo=tipo;
        ColaD = new Cola();
        ColaM = new Cola();
        ColaE = new Cola();
        ColaC = new Cola();
        ColaR = new Cola();
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
        return this.VentanillasDisponibles.length;
    }   
    public String Tipo(){
        return this.Tipo;
    }
    
}
