/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.ventanas;

import bancotec.VentanaPrincipal;
import bancotec.impl.MAdministracion;
import javax.swing.JComboBox;

/**
 *
 * @author ANDRES MS
 */
public class Administracion extends javax.swing.JInternalFrame {
    MAdministracion ModificaA = new MAdministracion();
    /**
     * Creates new form Administracion
     */
    public Administracion() {
        initComponents();
        
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        NuevaVentanilla = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DESCRIPCION = new javax.swing.JTextArea();
        CODIGO = new javax.swing.JComboBox();
        EliminarVEntanilla = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        Combo_EliminarVentanillas = new javax.swing.JComboBox();
        TodasVentanillas = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        EDICIONVENTANILLAS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Spin_Nuevo = new javax.swing.JSpinner();
        Combo_EdicionVentanillas = new javax.swing.JComboBox();
        Spin_Edicion = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        Radio_activa = new javax.swing.JRadioButton();
        Radio_Inactiva = new javax.swing.JRadioButton();
        Estadisticas_boton = new javax.swing.JButton();

        NuevaVentanilla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NuevaVentanilla.setText("NUEVA VENTANILLA");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        DESCRIPCION.setColumns(20);
        DESCRIPCION.setRows(5);
        jScrollPane1.setViewportView(DESCRIPCION);

        CODIGO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CODIGO, org.jdesktop.beansbinding.ObjectProperty.create(), CODIGO, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        CODIGO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CODIGOItemStateChanged(evt);
            }
        });
        CODIGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CODIGOMouseClicked(evt);
            }
        });
        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
            }
        });

        EliminarVEntanilla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EliminarVEntanilla.setText("ELIMINAR VENTANILLA");

        OK.setText("OK");

        Combo_EliminarVentanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_EliminarVentanillasActionPerformed(evt);
            }
        });

        TodasVentanillas.setText("TODAS LAS VENTANILLAS");

        jLabel1.setText("Nombre");

        codigo.setText("Codigo");

        descripcion.setText("Descripcion");

        EDICIONVENTANILLAS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EDICIONVENTANILLAS.setText("EDICION DE VENTANILLAS");

        jLabel2.setText("Ventanillas");

        Spin_Nuevo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        Spin_Nuevo.setToolTipText("");
        Spin_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Combo_EdicionVentanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_EdicionVentanillasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("#");

        Radio_activa.setText("Activa");

        Radio_Inactiva.setText("Inactiva");

        Estadisticas_boton.setText("Estadisticas");
        Estadisticas_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estadisticas_botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NuevaVentanilla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Combo_EliminarVentanillas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TodasVentanillas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OK))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(codigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(descripcion))
                                    .addComponent(nombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Spin_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EliminarVEntanilla)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EDICIONVENTANILLAS)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Combo_EdicionVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Spin_Edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Estadisticas_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Radio_activa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Radio_Inactiva)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(NuevaVentanilla)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo)
                            .addComponent(descripcion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Spin_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(EliminarVEntanilla))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EDICIONVENTANILLAS, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_EdicionVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Spin_Edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radio_activa)
                            .addComponent(Radio_Inactiva)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(Combo_EliminarVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TodasVentanillas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OK)
                            .addComponent(Estadisticas_boton))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        nombre.getAccessibleContext().setAccessibleName("");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGOActionPerformed

    private void CODIGOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CODIGOItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_CODIGOItemStateChanged

    private void CODIGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CODIGOMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CODIGOMouseClicked

    private void Combo_EliminarVentanillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_EliminarVentanillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_EliminarVentanillasActionPerformed

    private void Combo_EdicionVentanillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_EdicionVentanillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_EdicionVentanillasActionPerformed

    private void Estadisticas_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estadisticas_botonActionPerformed
        // TODO add your handling code here:
        if(ModificaA.ObtenerEstadisticas()==0){
            ModificaA.EnciendeEstaditicas();
            //VPrincipal.actualizaPrincipal();
            System.out.println(ModificaA.ObtenerEstadisticas());
        }
        else{
            ModificaA.ApagaEstaditicas();
            //VPrincipal.actualizaPrincipal();
        }
        
    }//GEN-LAST:event_Estadisticas_botonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CODIGO;
    private javax.swing.JComboBox Combo_EdicionVentanillas;
    private javax.swing.JComboBox Combo_EliminarVentanillas;
    private javax.swing.JTextArea DESCRIPCION;
    private javax.swing.JLabel EDICIONVENTANILLAS;
    private javax.swing.JLabel EliminarVEntanilla;
    private javax.swing.JButton Estadisticas_boton;
    private javax.swing.JLabel NuevaVentanilla;
    private javax.swing.JButton OK;
    private javax.swing.JRadioButton Radio_Inactiva;
    private javax.swing.JRadioButton Radio_activa;
    private javax.swing.JSpinner Spin_Edicion;
    private javax.swing.JSpinner Spin_Nuevo;
    private javax.swing.JCheckBox TodasVentanillas;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
