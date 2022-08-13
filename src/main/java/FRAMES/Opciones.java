/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FRAMES;

import ClasesMetodos.Metodos;
import ClasesMetodos.manejo.newpackage.manejo;
import com.mysql.cj.protocol.a.NativeConstants;

/**
 *
 * @author PCSISTEMAS01
 */
public class Opciones extends javax.swing.JFrame {

    private String id;
    private String contrasena;
    public Opciones(String id,String contrasena) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.id=id;
        this.contrasena=contrasena;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboHacer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboHacer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboHacer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALDO", "CONSIGNAR", "RETIRAR", "VOLVER" }));
        getContentPane().add(ComboHacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("bienvenido  que deseas hacer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 270, 20));

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCSISTEMAS01\\Desktop\\fondo5.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Metodos mj = new Metodos();
        String opcion=ComboHacer.getSelectedItem().toString();
        int i=mj.hacer(opcion, id, contrasena);
        if (i==1){
            Menu mn = new Menu();
            mn.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHacer;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
