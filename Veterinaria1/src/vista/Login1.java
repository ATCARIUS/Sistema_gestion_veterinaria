/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.logindb;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import veterinaria.loginc;

/**
 *
 * @author User
 */
public class Login1 extends javax.swing.JFrame {
loginc lg = new loginc();
logindb LoginD = new logindb();
  
    public Login1() {
        initComponents();
    }

     public void validar(){
        String Correo = jtxt_correo.getText();
        String contraseña = String.valueOf(jtxt_Password.getPassword());
        if (!"".equals(Correo) || !"".equals(contraseña)) {
            
            loginc lg = LoginD.log(Correo, contraseña);
            if (lg.getCorreo() != null && lg.getContraseña()!= null) {
               
               Menu1 men= new Menu1();
                men.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "correo o contraseña invalida");
            }
    
    }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorRectangle2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorRectangle2D();
        rSMetroTextPlaceHolderBeanInfo1 = new rojerusan.RSMetroTextPlaceHolderBeanInfo();
        Body = new javax.swing.JPanel();
        jtxt_correo = new javax.swing.JTextField();
        lms_icon = new javax.swing.JLabel();
        padding = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_Password = new rojerusan.RSPasswordTextPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        signIn1 = new rojerusan.RSMaterialButtonRectangle();
        animationLogin = new javax.swing.JLabel();
        signIn = new rojerusan.RSMaterialButtonRectangle();
        signIn2 = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Body.setBackground(new java.awt.Color(251, 251, 251));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt_correo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtxt_correo.setForeground(new java.awt.Color(169, 169, 169));
        jtxt_correo.setText("Usuario");
        jtxt_correo.setToolTipText("Ingrese su correo");
        jtxt_correo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jtxt_correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_correoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_correoFocusLost(evt);
            }
        });
        jtxt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_correoActionPerformed(evt);
            }
        });
        Body.add(jtxt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 221, 200, 30));

        lms_icon.setBackground(new java.awt.Color(255, 255, 255));
        lms_icon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        Body.add(lms_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 221, 10, 30));

        padding.setBackground(new java.awt.Color(255, 255, 255));
        padding.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        Body.add(padding, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 261, 10, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        jLabel4.setText("Pet Comunnity Software");
        Body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 300, 30));

        jtxt_Password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jtxt_Password.setForeground(new java.awt.Color(204, 204, 204));
        jtxt_Password.setText("Password");
        jtxt_Password.setToolTipText("Password");
        jtxt_Password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtxt_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_PasswordFocusLost(evt);
            }
        });
        jtxt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_PasswordActionPerformed(evt);
            }
        });
        Body.add(jtxt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 259, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pass.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel2.setOpaque(true);
        Body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 261, 34, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel3.setOpaque(true);
        Body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 221, 34, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        Body.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        Body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 20, 30));

        signIn1.setBackground(new java.awt.Color(0, 204, 204));
        signIn1.setForeground(new java.awt.Color(0, 0, 0));
        signIn1.setText("Iniciar");
        signIn1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        signIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn1ActionPerformed(evt);
            }
        });
        Body.add(signIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 338, 299, 46));

        animationLogin.setBackground(new java.awt.Color(255, 255, 255));
        animationLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/perro_caminando.gif"))); // NOI18N
        Body.add(animationLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 260, 190));

        signIn.setBackground(new java.awt.Color(0, 204, 204));
        signIn.setForeground(new java.awt.Color(0, 0, 0));
        signIn.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        Body.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 420, 410));

        signIn2.setBackground(new java.awt.Color(0, 204, 204));
        signIn2.setForeground(new java.awt.Color(0, 0, 0));
        signIn2.setText("Iniciar Sesión");
        signIn2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        signIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn2ActionPerformed(evt);
            }
        });
        Body.add(signIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 320, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(837, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_correoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_correoFocusGained
        // TODO add your handling code here:
        if(jtxt_correo.getText().equals("Username")) {
            jtxt_correo.setText("");
        }

        if (jtxt_Password.getText().equals("Password")) {
            jtxt_Password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_jtxt_correoFocusGained

    private void jtxt_correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_correoFocusLost
        // TODO add your handling code here:
        if(jtxt_correo.getText().equals("")) {
            jtxt_correo.setText("Username");
        }

        if (jtxt_Password.getText().equals("Password")) {
            jtxt_Password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_jtxt_correoFocusLost

    private void jtxt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_correoActionPerformed
//
    }//GEN-LAST:event_jtxt_correoActionPerformed

    private void jtxt_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_PasswordFocusGained
        if (jtxt_Password.getText().equals("Password")){
            jtxt_Password.setText("");
            jtxt_Password.setEchoChar('•');
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_PasswordFocusGained

    private void jtxt_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_PasswordFocusLost
        if (jtxt_Password.getText().equals("") ){
            jtxt_Password.setText("Password");
            jtxt_Password.setEchoChar('•');
        }
    }//GEN-LAST:event_jtxt_PasswordFocusLost

    private void jtxt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_PasswordActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
//
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     //exit
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInActionPerformed

    private void signIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn1ActionPerformed
validar();    
    }//GEN-LAST:event_signIn1ActionPerformed

    private void signIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signIn2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel animationLogin;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorRectangle2D evaluatorRectangle2D1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private rojerusan.RSPasswordTextPlaceHolder jtxt_Password;
    public static javax.swing.JTextField jtxt_correo;
    private javax.swing.JLabel lms_icon;
    private javax.swing.JLabel padding;
    private rojerusan.RSMetroTextPlaceHolderBeanInfo rSMetroTextPlaceHolderBeanInfo1;
    private rojerusan.RSMaterialButtonRectangle signIn;
    private rojerusan.RSMaterialButtonRectangle signIn1;
    private rojerusan.RSMaterialButtonRectangle signIn2;
    // End of variables declaration//GEN-END:variables
}
