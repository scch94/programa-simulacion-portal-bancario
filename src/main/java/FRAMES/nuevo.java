/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FRAMES;

import ClasesMetodos.Usuario;
import ClasesMetodos.manejo.newpackage.manejo;
import java.awt.ComponentOrientation;
import javax.swing.JOptionPane;

/**
 *
 * @author PCSISTEMAS01
 */
public class nuevo extends javax.swing.JFrame {

    /**
     * Creates new form nuevo
     */
    public nuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDinero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtcontra2 = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        jLabel3.setText("TIPO CUENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, -1));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pensionada", "normal" }));
        getContentPane().add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 130, -1));

        jLabel4.setText("DIRECCION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel5.setText("DINERO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(txtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, -1));

        jLabel6.setText("CORREO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 130, -1));

        jLabel7.setText("CONTRASEÑA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 120, -1));

        jLabel8.setText("REPETIR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        txtcontra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontra2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 120, -1));

        btnIngresar.setText("ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));
        getContentPane().add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 260, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCSISTEMAS01\\Desktop\\fondo2.png")); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void txtcontra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontra2ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText();
        String id = txtId.getText();
        String correo = txtCorreo.getText();
        String monto = txtDinero.getText();
        String tipo = comboTipo.getSelectedItem().toString();
        String direccion = txtDireccion.getText();
        String contraseña1 = txtContra.getText();
        String contraseña2 = txtcontra2.getText();
        
        if(!id.equals("")){
            if (!nombre.equals("")){
                if(!direccion.equals("")){
                    if(Integer.parseInt(monto)>0){
                        if (txtCorreo.getText().indexOf("@") != -1) {
                            if(!contraseña1.equals("")&&!contraseña2.equals("")){
                                if(contraseña1.equals(contraseña2)){
                                    
                                    //(ID,NOMBRE,TIPO_CUENTA,DIRECCION,CANTIDAD_DINERO,CORREO,CONTRASEÑA)
                                    Usuario nuevo=new Usuario(id,nombre,tipo,direccion,monto,correo,contraseña1);
                                    manejo man = new manejo();
                                    man.agregar(nuevo);
                                    JOptionPane.showMessageDialog(null, nombre+" creaste tu cuenta correctamente");
                                    Menu mn=new Menu();
                                    mn.setVisible(true);
                                    this.dispose();
                                }else{
                                    String texto="las contraseñas son diferentes";
                                    lblTexto.setText(texto);
                                }
                                
                            }else{
                                String texto="las contraseñas no pueden estar vacias";
                                lblTexto.setText(texto);
                            }
                        }else{
                            String texto="el correo debe tener una @";
                            lblTexto.setText(texto);
                        }
                        
                    }else{
                        String texto="el valor inicial de una cuenta debe ser mayor a 0";
                        lblTexto.setText(texto);
                    }
                    
                }else{
                    String texto="la direccion debe estar completa";
                    lblTexto.setText(texto);
                }

            }else{
                String texto="el nombre no puede estar vacio";
                lblTexto.setText(texto);
            }
            
        }else{
            String texto="el id no puede estar vacio";
            lblTexto.setText(texto);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDinero;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtcontra2;
    // End of variables declaration//GEN-END:variables
}