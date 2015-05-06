/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancotec;

import bancotec.impl.MAdministracion;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import Implementaciones.Cola;
import bancotec.ventanas.Administracion;
import bancotec.ventanas.Estadisticas;
import bancotec.ventanas.Quiosco;
import bancotec.ventanas.Ventanillas;

/**
 *
 * @author ANDRES MS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        //Ventanas
        Administracion Admi = new Administracion();
        Quiosco Quios = new Quiosco();
        Ventanillas Venta = new Ventanillas();
        
        
        
        
        initComponents();
        
        
        this.setExtendedState(MAXIMIZED_BOTH);
        //setResizable(false);
        
        
        this.Escritorio.add(Venta);
        this.Escritorio.add(Quios);
        this.Escritorio.add(Admi);
        
        
        Quios.setTitle("QUIOSCO DE AUTOSERVICIO");
        Quios.setLocation(80,60);
        Quios.setSize(478, 284);
        
        
        Venta.setTitle("VENTANILLAS");
        Venta.setSize(478, 284);
        Venta.setLocation(800,60);
        
        Admi.setTitle("ADMINISRACION");
        Admi.setSize(800, 335);
        Admi.setLocation(300,400);
        
        Quios.show();
        Venta.show();
        Admi.show();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void actualizaPrincipal(){
        MAdministracion ModificaA = new MAdministracion();
        Estadisticas Estadis = new Estadisticas();
        
        if(ModificaA.ObtenerEstadisticas()==1){
            this.Escritorio.add(Estadis);
            Estadis.show();;
        }
        else{
            Estadis.hide();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        HORA = new javax.swing.JLabel();
        separador2 = new javax.swing.JLabel();
        MINUTOS = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        SEGUNDOS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1234, 342));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));
        Escritorio.setDesktopManager(null);
        Escritorio.setRequestFocusEnabled(false);

        HORA.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 24)); // NOI18N
        HORA.setText("00");

        separador2.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 24)); // NOI18N
        separador2.setText(":");

        MINUTOS.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 24)); // NOI18N
        MINUTOS.setText("00");

        separador.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 24)); // NOI18N
        separador.setText(":");

        SEGUNDOS.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 24)); // NOI18N
        SEGUNDOS.setText("00");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(HORA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MINUTOS)
                .addGap(5, 5, 5)
                .addComponent(separador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SEGUNDOS)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(separador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HORA)
                        .addComponent(MINUTOS)
                        .addComponent(separador)
                        .addComponent(SEGUNDOS)))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        Escritorio.setLayer(HORA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(separador2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(MINUTOS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(separador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(SEGUNDOS, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        timer = new Timer(1000,new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened
    public class hora implements ActionListener{
        
        
        
        
        public void actionPerformed(ActionEvent evt){
            GregorianCalendar tiempo = new GregorianCalendar(); 
            int hora,minutos,segundos;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            
            HORA.setText(String.valueOf(hora));
            MINUTOS.setText(String.valueOf(minutos));
            SEGUNDOS.setText(String.valueOf(segundos));
            
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
private Timer timer;
public static Cola ColaR = new Cola();
public static Cola ColaC = new Cola();
public static Cola ColaE = new Cola();
public static Cola ColaM = new Cola();
public static Cola ColaD = new Cola();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel HORA;
    private javax.swing.JLabel MINUTOS;
    private javax.swing.JLabel SEGUNDOS;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador2;
    // End of variables declaration//GEN-END:variables
}
