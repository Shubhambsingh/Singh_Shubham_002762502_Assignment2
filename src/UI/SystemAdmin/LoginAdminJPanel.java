/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import Model.Doctor.DoctorDirectory;
import Model.Hospital.HospitalDirectory;
import Model.SignUp.SignUpDirectory;
import java.awt.Component;
import javax.swing.*;


/**
 *
 * @author sohamdeshpande
 */
import java.awt.Window;
import java.util.ArrayList;
import model.City;
public class LoginAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginAdminJPanel
     */
    
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    ArrayList<City> cities;
    
    public LoginAdminJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        //this.cities = cities;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        lblNote = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        btnLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogInKeyPressed(evt);
            }
        });

        lblNote.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        lblNote.setText("Please enter valid username and password.");

        jLabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Log in");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsername)
                                .addComponent(lblPassword))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNote)
                .addGap(15, 15, 15)
                .addComponent(btnLogIn)
                .addContainerGap(470, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        String Username = txtUsername.getText();
        String Password = txtPassword.getText();

        if(Username.equals("Admin") && Password.equals("Admin")){

            new AdminJFrame(SignUpDirectory, HospitalDirectory, DoctorDirectory, cities).show();
            //To dispose a Frame from Panel
            Component comp = SwingUtilities.getRoot(this);
            ((Window) comp).dispose();
            //this.setVisible(false);
            //AdminJFrame admin = new AdminJFrame();
            //admin.setVisible(true);
            
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid Username or Password");
        }
        
        
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogInKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnLogInKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

 }
