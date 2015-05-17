/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.impl;

import bancotec.ConfiguracionInicial;
import bancotec.ventanas.Estadisticas;
import bancotec.impl.Ventanilla;
import static bancotec.ventanas.Estadisticas.ComboUsuario;
import static bancotec.ventanas.Estadisticas.ComboVentanillaEspecifica;
import static bancotec.ventanas.Estadisticas.NumeroVentanilla;
import java.util.ArrayList;

/**
 *
 * @author ANDRES MS
 */
public class EstadisticasJava {

    public void Agregar() {
        ArrayList<Object> modelo = new ArrayList<Object>();
        int i = 0;
        while (i < ConfiguracionInicial.ArregloVentanillas.size()) {
            Ventanilla temp = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            modelo.add(temp.Nombre);
            i++;
        }

        int i2 = 0;
        while (i2 < modelo.size()) {
            Estadisticas.ComboHora.addItem(modelo.get(i2));
            Estadisticas.ComboVentanilla.addItem(modelo.get(i2));
            Estadisticas.ComboVentanillaEspecifica.addItem(modelo.get(i2));
            i2++;
        }
    }
}
