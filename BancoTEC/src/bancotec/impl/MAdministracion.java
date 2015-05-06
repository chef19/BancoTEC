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
public class MAdministracion {
    public static int Estadisticas;
    
    public MAdministracion(){
        Estadisticas = 0;
    }
    public void EnciendeEstaditicas(){
        Estadisticas=1;
    }
    public void ApagaEstaditicas(){
        Estadisticas=0;
    }
    public int ObtenerEstadisticas(){
        return Estadisticas;
    }
    
}
