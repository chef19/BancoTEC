/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.ventanas;

import bancotec.ConfiguracionInicial;
import static bancotec.ConfiguracionInicial.ArregloVentanillas;
import bancotec.VentanaPrincipal;
import bancotec.impl.Ventanilla;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES MS
 */
public class Ventanillas extends javax.swing.JInternalFrame {



    /**
     * Creates new form Administracion
     */
    public Ventanillas() {
        initComponents();

        setResizable(false);
        System.out.println(ConfiguracionInicial.ArregloVentanillas.size());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoVentanillaCB = new javax.swing.JComboBox();
        NumeroVentanillaCB = new javax.swing.JComboBox();
        OcupadoCheck = new javax.swing.JRadioButton();
        DisponibleCheck = new javax.swing.JRadioButton();
        AtendiendoaL = new javax.swing.JLabel();
        BotonAtender = new javax.swing.JButton();
        BotonLiberaryAtender = new javax.swing.JButton();
        AtendiendoaTA = new javax.swing.JTextField();

        TipoVentanillaCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TipoVentanillaCBMouseEntered(evt);
            }
        });
        TipoVentanillaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoVentanillaCBActionPerformed(evt);
            }
        });

        NumeroVentanillaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroVentanillaCBActionPerformed(evt);
            }
        });

        OcupadoCheck.setText("Ocupado");
        OcupadoCheck.setEnabled(false);
        OcupadoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcupadoCheckActionPerformed(evt);
            }
        });

        DisponibleCheck.setText("Disponible");
        DisponibleCheck.setEnabled(false);

        AtendiendoaL.setText("Atendiendo a:");

        BotonAtender.setText("Atender");
        BotonAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtenderActionPerformed(evt);
            }
        });

        BotonLiberaryAtender.setText("Liberar y Atender");
        BotonLiberaryAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLiberaryAtenderActionPerformed(evt);
            }
        });

        AtendiendoaTA.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoVentanillaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NumeroVentanillaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OcupadoCheck)
                            .addComponent(BotonAtender)
                            .addComponent(AtendiendoaL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonLiberaryAtender)
                            .addComponent(DisponibleCheck)
                            .addComponent(AtendiendoaTA, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoVentanillaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroVentanillaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OcupadoCheck)
                    .addComponent(DisponibleCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtendiendoaL)
                    .addComponent(AtendiendoaTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtender)
                    .addComponent(BotonLiberaryAtender))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoVentanillaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoVentanillaCBActionPerformed
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        int i = 0;
        int NumeroVentanillas=0;
        Ventanilla Ventana;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)){
                NumeroVentanillaCB.removeAllItems();
                NumeroVentanillas=Ventana.VentanillasDisponibles.length;
                i = ConfiguracionInicial.ArregloVentanillas.size();
            }
            else{
                i++;
            }
        }
        int var = 1;
        while(var<=NumeroVentanillas){
            NumeroVentanillaCB.addItem(var);
            var++;
        }
        
    }//GEN-LAST:event_TipoVentanillaCBActionPerformed

    private void NumeroVentanillaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroVentanillaCBActionPerformed
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        int Disponibles[] = new int[2];
        int i = 0;
        Ventanilla Ventana;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)){
                Disponibles=Ventana.VentanillasDisponibles;
                i = ConfiguracionInicial.ArregloVentanillas.size();
            }
            else{
                i++;
            }
        }
    }//GEN-LAST:event_NumeroVentanillaCBActionPerformed

    private void BotonAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtenderActionPerformed
        int NumeroVentana = (int) NumeroVentanillaCB.getSelectedItem()-1;
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        int i = 0;
        int NumeroVentanillas=0;
        Ventanilla Ventana;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)){
                if(Ventana.VentanillasDisponibles[NumeroVentana]==0){
                    Ventana.VentanillasDisponibles[NumeroVentana]=1;
                    Ventana.ClientesAtendidos[NumeroVentana]++;
                    OcupadoCheck.setSelected(true);
                    DisponibleCheck.setSelected(false);
                    
                }
                else{
                    JOptionPane.showOptionDialog(this, "Ventanilla ocupada", "Error", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Ok"},"OK");
                }
                i=ConfiguracionInicial.ArregloVentanillas.size(); 
            }
            else{
                i++;
            }
        }
    }//GEN-LAST:event_BotonAtenderActionPerformed

    private void BotonLiberaryAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLiberaryAtenderActionPerformed
        int NumeroVentana = (int) NumeroVentanillaCB.getSelectedItem()-1;
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        int i = 0;
        int NumeroVentanillas=0;
        Ventanilla Ventana;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)){
                if(Ventana.VentanillasDisponibles[NumeroVentana]==0){
                    Ventana.VentanillasDisponibles[NumeroVentana]=1;
                    Ventana.ClientesAtendidos[NumeroVentana]++;
                    OcupadoCheck.setSelected(true);
                    DisponibleCheck.setSelected(false);   
                }
                i=ConfiguracionInicial.ArregloVentanillas.size(); 
            }
            else{
                i++;
            }
        }
    }//GEN-LAST:event_BotonLiberaryAtenderActionPerformed

    private void TipoVentanillaCBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoVentanillaCBMouseEntered
        // TODO add your handling code here:
                String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        int i = 0;
        int NumeroVentanillas=0;
        Ventanilla Ventana;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)){
                NumeroVentanillaCB.removeAllItems();
                NumeroVentanillas=Ventana.VentanillasDisponibles.length;
                i = ConfiguracionInicial.ArregloVentanillas.size();
            }
            else{
                i++;
            }
        }
        int var = 1;
        while(var<=NumeroVentanillas){
            NumeroVentanillaCB.addItem(var);
            var++;
        }
    }//GEN-LAST:event_TipoVentanillaCBMouseEntered

    private void OcupadoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcupadoCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OcupadoCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtendiendoaL;
    private javax.swing.JTextField AtendiendoaTA;
    private javax.swing.JButton BotonAtender;
    private javax.swing.JButton BotonLiberaryAtender;
    private javax.swing.JRadioButton DisponibleCheck;
    public static javax.swing.JComboBox NumeroVentanillaCB;
    private javax.swing.JRadioButton OcupadoCheck;
    public static javax.swing.JComboBox TipoVentanillaCB;
    // End of variables declaration//GEN-END:variables
}
