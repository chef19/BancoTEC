/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.ventanas;

import bancotec.impl.Cliente;
import bancotec.VentanaPrincipal;

/**
 *
 * @author ANDRES MS
 */
public class Quiosco extends javax.swing.JInternalFrame {

    /**
     * Creates new form Quiosco
     */
    public Quiosco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextNombre = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RegularCheck = new javax.swing.JRadioButton();
        CorporativoCheck = new javax.swing.JRadioButton();
        EmbarazadaCheck = new javax.swing.JRadioButton();
        MayorCheck = new javax.swing.JRadioButton();
        DiscapacitadoCheck = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        TipoVentanillaComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        AceptarQuiosco = new javax.swing.JButton();

        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(478, 284));

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Correo Electronico");

        RegularCheck.setText("Regular");
        RegularCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegularCheckActionPerformed(evt);
            }
        });

        CorporativoCheck.setText("Corporativo");
        CorporativoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorporativoCheckActionPerformed(evt);
            }
        });

        EmbarazadaCheck.setText("Mujer Embarazada");
        EmbarazadaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmbarazadaCheckActionPerformed(evt);
            }
        });

        MayorCheck.setText("Adulto Mayor");
        MayorCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MayorCheckActionPerformed(evt);
            }
        });

        DiscapacitadoCheck.setText("Discapacitado");
        DiscapacitadoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscapacitadoCheckActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de Ventanilla");

        jLabel4.setText("Tipo de Cliente");

        AceptarQuiosco.setText("Aceptar");
        AceptarQuiosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarQuioscoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(TextNombre)
                            .addComponent(TipoVentanillaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MayorCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CorporativoCheck)
                                .addGap(18, 18, 18)
                                .addComponent(EmbarazadaCheck))
                            .addComponent(DiscapacitadoCheck)))
                    .addComponent(RegularCheck)
                    .addComponent(jLabel4))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AceptarQuiosco)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TipoVentanillaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegularCheck)
                    .addComponent(CorporativoCheck)
                    .addComponent(EmbarazadaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MayorCheck)
                    .addComponent(DiscapacitadoCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AceptarQuiosco)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoActionPerformed

    private void RegularCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegularCheckActionPerformed
        CorporativoCheck.setSelected(false);
        EmbarazadaCheck.setSelected(false);
        MayorCheck.setSelected(false);
        DiscapacitadoCheck.setSelected(false);
    }//GEN-LAST:event_RegularCheckActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void CorporativoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorporativoCheckActionPerformed
        RegularCheck.setSelected(false);
        EmbarazadaCheck.setSelected(false);
        MayorCheck.setSelected(false);
        DiscapacitadoCheck.setSelected(false);
    }//GEN-LAST:event_CorporativoCheckActionPerformed

    private void EmbarazadaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmbarazadaCheckActionPerformed
        RegularCheck.setSelected(false);
        CorporativoCheck.setSelected(false);
        MayorCheck.setSelected(false);
        DiscapacitadoCheck.setSelected(false);
    }//GEN-LAST:event_EmbarazadaCheckActionPerformed

    private void MayorCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MayorCheckActionPerformed
        RegularCheck.setSelected(false);
        EmbarazadaCheck.setSelected(false);
        CorporativoCheck.setSelected(false);
        DiscapacitadoCheck.setSelected(false);
    }//GEN-LAST:event_MayorCheckActionPerformed

    private void DiscapacitadoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscapacitadoCheckActionPerformed
        RegularCheck.setSelected(false);
        EmbarazadaCheck.setSelected(false);
        MayorCheck.setSelected(false);
        CorporativoCheck.setSelected(false);
    }//GEN-LAST:event_DiscapacitadoCheckActionPerformed

    private void AceptarQuioscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarQuioscoActionPerformed
        String Tipo;
        String Nombre = TextNombre.getText();
        String Correo = TextCorreo.getText();
        String Ventanilla = (String) TipoVentanillaComboBox.getSelectedItem();
        if (RegularCheck.isSelected()==true){
            Tipo = "Regular";
            Cliente Cliente = new Cliente(Nombre, Correo, Tipo, Ventanilla, NumeroDeCliente);
            VentanaPrincipal.ColaR.enqueue(Cliente);
            if (NumeroDeCliente == 99){
                NumeroDeCliente = 0;
            }
            else{
                NumeroDeCliente ++;
            }
        }
        else if (CorporativoCheck.isSelected()==true){
            Tipo = "Corporativo";
            Cliente Cliente = new Cliente(Nombre, Correo, Tipo, Ventanilla, NumeroDeCliente);
            VentanaPrincipal.ColaC.enqueue(Cliente);
            if (NumeroDeCliente == 99){
                NumeroDeCliente = 0;
            }
            else{
                NumeroDeCliente ++;
            }
        }
        else if (EmbarazadaCheck.isSelected()==true){
            Tipo = "Embarazada";
            Cliente Cliente = new Cliente(Nombre, Correo, Tipo, Ventanilla, NumeroDeCliente);
            VentanaPrincipal.ColaE.enqueue(Cliente);
            if (NumeroDeCliente == 99){
                NumeroDeCliente = 0;
            }
            else{
                NumeroDeCliente ++;
            }
        }
        else if (MayorCheck.isSelected()==true){
            Tipo = "Mayor";
            Cliente Cliente = new Cliente(Nombre, Correo, Tipo, Ventanilla, NumeroDeCliente);
            VentanaPrincipal.ColaM.enqueue(Cliente);
            if (NumeroDeCliente == 99){
                NumeroDeCliente = 0;
            }
            else{
                NumeroDeCliente ++;
            }
        }
        else if (DiscapacitadoCheck.isSelected()==true){
            Tipo = "Discapacitados";
            Cliente Cliente = new Cliente(Nombre, Correo, Tipo, Ventanilla, NumeroDeCliente);
            VentanaPrincipal.ColaD.enqueue(Cliente);
            if (NumeroDeCliente == 99){
                NumeroDeCliente = 0;
            }
            else{
                NumeroDeCliente ++;
            }
        }
        
    }//GEN-LAST:event_AceptarQuioscoActionPerformed

    public static int NumeroDeCliente = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarQuiosco;
    private javax.swing.JRadioButton CorporativoCheck;
    private javax.swing.JRadioButton DiscapacitadoCheck;
    private javax.swing.JRadioButton EmbarazadaCheck;
    private javax.swing.JRadioButton MayorCheck;
    private javax.swing.JRadioButton RegularCheck;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JComboBox TipoVentanillaComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
