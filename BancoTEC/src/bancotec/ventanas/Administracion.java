/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec.ventanas;

import bancotec.ConfiguracionInicial;
import static bancotec.ConfiguracionInicial.ArregloVentanillas;
import bancotec.VentanaPrincipal;
import bancotec.impl.MAdministracion;
import bancotec.impl.Ventanilla;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
        jLabel3 = new javax.swing.JLabel();
        Radio_activa = new javax.swing.JRadioButton();
        Radio_Inactiva = new javax.swing.JRadioButton();
        Estadisticas_boton = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Estructura = new javax.swing.JComboBox();
        NumeroVentanilla = new javax.swing.JComboBox();
        OK2 = new javax.swing.JButton();

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
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Combo_EliminarVentanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_EliminarVentanillasActionPerformed(evt);
            }
        });

        TodasVentanillas.setText("Todas las ventanillas");

        jLabel1.setText("Nombre");

        codigo.setText("Codigo");

        descripcion.setText("Descripcion");

        EDICIONVENTANILLAS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EDICIONVENTANILLAS.setText("EDICION DE VENTANILLAS");

        jLabel2.setText("Ventanillas");

        Spin_Nuevo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        Spin_Nuevo.setToolTipText("");
        Spin_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Combo_EdicionVentanillas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Combo_EdicionVentanillasMouseEntered(evt);
            }
        });
        Combo_EdicionVentanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_EdicionVentanillasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("#");

        Radio_activa.setText("Activa");
        Radio_activa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_activaActionPerformed(evt);
            }
        });

        Radio_Inactiva.setText("Inactiva");
        Radio_Inactiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_InactivaActionPerformed(evt);
            }
        });

        Estadisticas_boton.setText("Estadisticas");
        Estadisticas_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estadisticas_botonActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo Estructura");

        Estructura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cola de Prioridad", "Heap" }));

        NumeroVentanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NumeroVentanillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumeroVentanillaMouseExited(evt);
            }
        });
        NumeroVentanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroVentanillaActionPerformed(evt);
            }
        });

        OK2.setText("OK");
        OK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK2ActionPerformed(evt);
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
                            .addComponent(jLabel1)
                            .addComponent(codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Spin_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Agregar)
                                .addGap(208, 208, 208)
                                .addComponent(Estadisticas_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EliminarVEntanilla)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(TodasVentanillas)
                                        .addGap(18, 18, 18)
                                        .addComponent(OK))
                                    .addComponent(EDICIONVENTANILLAS)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Combo_EliminarVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(OK2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Combo_EdicionVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumeroVentanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(Radio_activa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Radio_Inactiva))))
                    .addComponent(NuevaVentanilla)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Estructura, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaVentanilla)
                    .addComponent(EliminarVEntanilla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_EliminarVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TodasVentanillas)
                            .addComponent(OK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(Spin_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(Estadisticas_boton)
                            .addComponent(jLabel4)
                            .addComponent(Estructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(EDICIONVENTANILLAS, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_EdicionVentanillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(NumeroVentanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radio_activa)
                            .addComponent(Radio_Inactiva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OK2)))
                .addContainerGap(49, Short.MAX_VALUE))
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
        String NombreVentanilla = (String) Combo_EdicionVentanillas.getSelectedItem();
        int i = 0;
        int NumeroVentanillas = 0;
        Ventanilla Ventana;
        while (i < ConfiguracionInicial.ArregloVentanillas.size()) {
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)) {
                NumeroVentanilla.removeAllItems();
                NumeroVentanillas = Ventana.VentanillasDisponibles.length;
                i = ConfiguracionInicial.ArregloVentanillas.size();
            } else {
                i++;
            }
        }
        int var = 1;
        while (var <= NumeroVentanillas) {
            NumeroVentanilla.addItem(var);
            var++;
        }


    }//GEN-LAST:event_Combo_EdicionVentanillasActionPerformed

    private void Estadisticas_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estadisticas_botonActionPerformed
        // TODO add your handling code here:
        Toolkit t = Toolkit.getDefaultToolkit();

        Dimension d = t.getScreenSize();

        int ScreenWidth = d.width;

        int ScreenHeight = d.height;

        Estadisticas Estadis = new Estadisticas();
        VentanaPrincipal.Escritorio.add(Estadis);

        Estadis.show();

        Estadis.setLocation(ScreenWidth / 2, ScreenHeight / 2);

    }//GEN-LAST:event_Estadisticas_botonActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // TODO add your handling code here:
        if (ConfiguracionInicial.ArregloVentanillas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha creado ninguna Ventana");
        } else {
            if (TodasVentanillas.isSelected()) {
                //VACIAR COMBOS
                Combo_EliminarVentanillas.removeAllItems();
                Combo_EdicionVentanillas.removeAllItems();
                Quiosco.TipoVentanillaComboBox.removeAllItems();
                Ventanillas.TipoVentanillaCB.removeAllItems();

                ConfiguracionInicial.ArregloVentanillas = new ArrayList();
                System.out.println("Eliminado todo " + ConfiguracionInicial.ArregloVentanillas.size());
            } else {
                int posicion;
                String temp = String.valueOf(Combo_EliminarVentanillas.getSelectedItem());

                for (posicion = 0; posicion < ConfiguracionInicial.ArregloVentanillas.size(); posicion++) {
                    Ventanilla Ventanilla = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(posicion);
                    if (Ventanilla.Nombre() == temp) {
                        ConfiguracionInicial.ArregloVentanillas.remove(posicion);
                    }
                }

                int elemento = Combo_EliminarVentanillas.getSelectedIndex();

                //ELIMINAR ELEMENTO DE JCOMBOBOX
                Combo_EliminarVentanillas.removeItemAt(elemento);
                Combo_EdicionVentanillas.removeItemAt(elemento);
                Quiosco.TipoVentanillaComboBox.removeItemAt(elemento);
                Ventanillas.TipoVentanillaCB.removeItemAt(elemento);

            }
        }
    }//GEN-LAST:event_OKActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        /**
         * if (nombre.getText().isEmpty()) { JOptionPane.showMessageDialog(null,
         * "Ingrese el nombre de la caja"); } else if
         * (Spin_Nuevo.getValue().equals(0)) {
         * JOptionPane.showMessageDialog(null, "Indique la cantidad de cajas");
         * } else if (DESCRIPCION.getText().isEmpty()) {
         * JOptionPane.showMessageDialog(null, "Ingrese la descripción"); } else
         * {
         */
        String Cajas = String.valueOf(Spin_Nuevo.getValue());
        int CajasE = Integer.valueOf(Cajas);

        Ventanilla AdmiVentanilla = new Ventanilla(nombre.getText(), String.valueOf(CODIGO.getSelectedItem()), DESCRIPCION.getText(), CajasE, String.valueOf(Estructura.getSelectedItem()));

        //SE AGREGAN LAS NUEVAS VENTANILLAS AL ARRAY
        ArregloVentanillas.add(AdmiVentanilla);

        //AGREGANDO A LOS JCOMBOBOX LAS NUEVAS VENTANILLAS
        Combo_EdicionVentanillas.addItem(nombre.getText());
        Combo_EliminarVentanillas.addItem(nombre.getText());
        Quiosco.TipoVentanillaComboBox.addItem(nombre.getText());
        Ventanillas.TipoVentanillaCB.addItem(nombre.getText());

        //}

    }//GEN-LAST:event_AgregarActionPerformed

    private void NumeroVentanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroVentanillaActionPerformed
        // TODO add your handling code here
        String NombreVentanilla = (String) Combo_EdicionVentanillas.getSelectedItem();
        int i = 0;
        Ventanilla Ventana;
        while (i < ConfiguracionInicial.ArregloVentanillas.size()) {
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)) {
                i = ConfiguracionInicial.ArregloVentanillas.size();
            } else {
                i++;
            }
        }
    }//GEN-LAST:event_NumeroVentanillaActionPerformed

    private void NumeroVentanillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroVentanillaMouseEntered

    }//GEN-LAST:event_NumeroVentanillaMouseEntered

    private void Combo_EdicionVentanillasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo_EdicionVentanillasMouseEntered
        // TODO add your handling code here:
        String NombreVentanilla = (String) Combo_EdicionVentanillas.getSelectedItem();
        int i = 0;
        int NumeroVentanillas = 0;
        Ventanilla Ventana;
        while (i < ConfiguracionInicial.ArregloVentanillas.size()) {
            Ventana = (Ventanilla) ConfiguracionInicial.ArregloVentanillas.get(i);
            if (Ventana.Nombre().equals(NombreVentanilla)) {
                NumeroVentanilla.removeAllItems();
                NumeroVentanillas = Ventana.VentanillasDisponibles.length;
                i = ConfiguracionInicial.ArregloVentanillas.size();
            } else {
                i++;
            }
        }
        int var = 1;
        while (var <= NumeroVentanillas) {
            NumeroVentanilla.addItem(var);
            var++;
        }
    }//GEN-LAST:event_Combo_EdicionVentanillasMouseEntered

    private void Radio_activaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_activaActionPerformed
        // TODO add your handling code here:
        Radio_Inactiva.setSelected(false);
    }//GEN-LAST:event_Radio_activaActionPerformed

    private void Radio_InactivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_InactivaActionPerformed
        Radio_activa.setSelected(false);
    }//GEN-LAST:event_Radio_InactivaActionPerformed

    private void NumeroVentanillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroVentanillaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroVentanillaMouseExited

    private void OK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK2ActionPerformed
        // TODO add your handling code here:
        ArrayList Combo = new ArrayList();
        int limite = Ventanillas.NumeroVentanillaCB.getItemCount();
        int comprobar =limite;
        boolean flag = false;

        int i2 = 0;
        int i3=0;
        while (i2 != limite) {

            String Ele = String.valueOf(Ventanillas.NumeroVentanillaCB.getItemAt(i2));

            Combo.add(Ele);
            System.out.println(Combo.toString());
            i2++;
        }
        
        while(comprobar!=0){
            if(NumeroVentanilla.getSelectedItem()==Combo.get(i3)){
                flag=true;
            }
            i3++;
        
        }

            //Se saca la cantidad de elementos
            // Se extrae cada elemento para agregarse a un ArrayList por medio de cada posicion 
        //obtenida con el limite
        if (flag == true) {
            if (Radio_activa.isSelected() == true) {
                String Element = String.valueOf(NumeroVentanilla.getSelectedItem());
                Ventanillas.NumeroVentanillaCB.addItem(Element);

                //Se ordena los elementos y vacia la ventanilla
                Collections.sort(Combo);
                System.out.println(Combo.toString());
                Ventanillas.NumeroVentanillaCB.removeAllItems();

                //Inicia agregar los elementos ya ordenados
                int vaciarArray = Combo.size();
                int i = 0;
                System.out.println("Entra fuera");

                System.out.println(vaciarArray);
                while (i != vaciarArray) {
                    Ventanillas.NumeroVentanillaCB.addItem(Combo.get(i));
                    i++;
                }

                System.out.println(limite);
                //Radio_activa.isSelected(false);
            }
            if (Radio_Inactiva.isSelected() == true) {
            }

        }
    }//GEN-LAST:event_OK2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox CODIGO;
    public static javax.swing.JComboBox Combo_EdicionVentanillas;
    public static javax.swing.JComboBox Combo_EliminarVentanillas;
    private javax.swing.JTextArea DESCRIPCION;
    private javax.swing.JLabel EDICIONVENTANILLAS;
    private javax.swing.JLabel EliminarVEntanilla;
    private javax.swing.JButton Estadisticas_boton;
    private javax.swing.JComboBox Estructura;
    private javax.swing.JLabel NuevaVentanilla;
    public javax.swing.JComboBox NumeroVentanilla;
    private javax.swing.JButton OK;
    private javax.swing.JButton OK2;
    private javax.swing.JRadioButton Radio_Inactiva;
    private javax.swing.JRadioButton Radio_activa;
    private javax.swing.JSpinner Spin_Nuevo;
    private javax.swing.JCheckBox TodasVentanillas;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
