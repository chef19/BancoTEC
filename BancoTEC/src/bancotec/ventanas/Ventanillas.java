/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.ventanas;

import bancotec.ConfiguracionInicial;
import static bancotec.ConfiguracionInicial.ArregloVentanillas;
import bancotec.VentanaPrincipal;
import bancotec.impl.Cliente;
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

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

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

        NumeroVentanillaCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroVentanillaCBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumeroVentanillaCBMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NumeroVentanillaCBMouseEntered(evt);
            }
        });
        NumeroVentanillaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroVentanillaCBActionPerformed(evt);
            }
        });

        OcupadoCheck.setText("Ocupado");
        OcupadoCheck.setEnabled(false);

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
        Object Disponibles[] = new Object[2];
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
        if (Disponibles[NumeroVentanillaCB.getSelectedIndex()]==null){
            OcupadoCheck.setSelected(false);
            DisponibleCheck.setSelected(true);
        }
        else{
            OcupadoCheck.setSelected(true);
            DisponibleCheck.setSelected(false);
        }
    }//GEN-LAST:event_NumeroVentanillaCBActionPerformed

    private void BotonAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtenderActionPerformed
        int NumeroVentana = (int) NumeroVentanillaCB.getSelectedItem()-1;
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        int i = 0;
        int NumeroVentanillas=0;
        Ventanilla Ventana;
        Cliente Cliente;
        while(i < ConfiguracionInicial.ArregloVentanillas.size()){
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)){
                if(Ventana.VentanillasDisponibles[NumeroVentana]==null){
                    if (Ventana.ColaD.first()!=null){
                        Cliente = (Cliente) Ventana.ColaD.first();
                        Ventana.VentanillasDisponibles[NumeroVentana]=Cliente.Codigo;
                        Ventana.ClientesAtendidos[NumeroVentana]++;
                        OcupadoCheck.setSelected(true);
                        DisponibleCheck.setSelected(false);
                        Ventana.ColaD.dequeue();
                        ConfiguracionInicial.ArregloVentanillas.set(i, Ventana);
                        AtendiendoaTA.setText(Cliente.Codigo);
                    }
                    else if(Ventana.ColaM.first()!=null){
                        Cliente = (Cliente) Ventana.ColaD.first();
                        Ventana.VentanillasDisponibles[NumeroVentana]=Cliente.Codigo;
                        Ventana.ClientesAtendidos[NumeroVentana]++;
                        OcupadoCheck.setSelected(true);
                        DisponibleCheck.setSelected(false);
                        Ventana.ColaM.dequeue();
                        ConfiguracionInicial.ArregloVentanillas.set(i, Ventana);
                        AtendiendoaTA.setText(Cliente.Codigo);
                    }
                    else if(Ventana.ColaE.first()!=null){
                        Cliente = (Cliente) Ventana.ColaD.first();
                        Ventana.VentanillasDisponibles[NumeroVentana]=Cliente.Codigo;
                        Ventana.ClientesAtendidos[NumeroVentana]++;
                        OcupadoCheck.setSelected(true);
                        DisponibleCheck.setSelected(false);
                        Ventana.ColaE.dequeue();
                        ConfiguracionInicial.ArregloVentanillas.set(i, Ventana);
                        AtendiendoaTA.setText(Cliente.Codigo);
                    }
                    else if(Ventana.ColaC.first()!=null){
                        Cliente = (Cliente) Ventana.ColaD.first();
                        Ventana.VentanillasDisponibles[NumeroVentana]=Cliente.Codigo;
                        Ventana.ClientesAtendidos[NumeroVentana]++;
                        OcupadoCheck.setSelected(true);
                        DisponibleCheck.setSelected(false);
                        Ventana.ColaC.dequeue();
                        ConfiguracionInicial.ArregloVentanillas.set(i, Ventana);
                        AtendiendoaTA.setText(Cliente.Codigo);
                    }
                    else if(Ventana.ColaR.first()!=null){
                        Cliente = (Cliente) Ventana.ColaD.first();
                        Ventana.VentanillasDisponibles[NumeroVentana]=Cliente.Codigo;
                        Ventana.ClientesAtendidos[NumeroVentana]++;
                        OcupadoCheck.setSelected(true);
                        DisponibleCheck.setSelected(false);
                        Ventana.ColaR.dequeue();
                        ConfiguracionInicial.ArregloVentanillas.set(i, Ventana);
                        AtendiendoaTA.setText(Cliente.Codigo);
                    }
                    else{
                        JOptionPane.showOptionDialog(this, "No hay ningun Cliente que atender", "Error", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Ok"},"OK");
                    }
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
                if(Ventana.VentanillasDisponibles[NumeroVentana]==null){
                    Ventana.VentanillasDisponibles[NumeroVentana]=1;
                    Ventana.ClientesAtendidos[NumeroVentana]++;
                    OcupadoCheck.setSelected(true);
                    DisponibleCheck.setSelected(false);
                    ConfiguracionInicial.ArregloVentanillas.set(i, Ventana);
                }
                i=ConfiguracionInicial.ArregloVentanillas.size(); 
            }
            else{
                i++;
            }
        }
    }//GEN-LAST:event_BotonLiberaryAtenderActionPerformed

    private void TipoVentanillaCBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoVentanillaCBMouseEntered
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

    private void NumeroVentanillaCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroVentanillaCBMouseClicked
        
    }//GEN-LAST:event_NumeroVentanillaCBMouseClicked

    private void NumeroVentanillaCBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroVentanillaCBMouseEntered
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        Object Disponibles[] = new Object[2];
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
        if (Disponibles[NumeroVentanillaCB.getSelectedIndex()]==null){
            OcupadoCheck.setSelected(false);
            DisponibleCheck.setSelected(true);
        }
        else{
            OcupadoCheck.setSelected(true);
            DisponibleCheck.setSelected(false);
        }
    }//GEN-LAST:event_NumeroVentanillaCBMouseEntered

    private void NumeroVentanillaCBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroVentanillaCBMouseExited
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        Object Disponibles[] = new Object[2];
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
        if (Disponibles[NumeroVentanillaCB.getSelectedIndex()]==null){
            OcupadoCheck.setSelected(false);
            DisponibleCheck.setSelected(true);
        }
        else{
            OcupadoCheck.setSelected(true);
            DisponibleCheck.setSelected(false);
        }
    }//GEN-LAST:event_NumeroVentanillaCBMouseExited

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        String NombreVentanilla=(String) TipoVentanillaCB.getSelectedItem();
        Object Disponibles[] = new Object[2];
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
        if (Disponibles[NumeroVentanillaCB.getSelectedIndex()]==null){
            OcupadoCheck.setSelected(false);
            DisponibleCheck.setSelected(true);
        }
        else{
            OcupadoCheck.setSelected(true);
            DisponibleCheck.setSelected(false);
        }
        AtendiendoaTA.setText((String) Disponibles[NumeroVentanillaCB.getSelectedIndex()]);
    }//GEN-LAST:event_formMouseMoved


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
