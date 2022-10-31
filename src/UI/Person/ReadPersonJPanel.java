/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Person;

import Model.Doctor.Doctor;
import Model.Doctor.DoctorDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUp;
import Model.SignUp.SignUpDirectory;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author UshaSingh
 */
public class ReadPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadPersonJPanel
     */
    
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    
    
    public ReadPersonJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory) {
        initComponents();
        
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
   
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonDirectory = new javax.swing.JTable();
        btnPersonView = new javax.swing.JButton();
        btnPersonDelete = new javax.swing.JButton();
        txtNameSignUp = new javax.swing.JTextField();
        lblDoB = new javax.swing.JLabel();
        btnUpdateSignUp = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        txtDoBSignUp = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtAgeSignUp = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtAddressSignUp = new javax.swing.JTextField();
        lblPinCode = new javax.swing.JLabel();
        txtCitySignUp = new javax.swing.JTextField();
        txtStateSignUp = new javax.swing.JTextField();
        txtPinCodeSignUp = new javax.swing.JTextField();
        lblCreatePassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCreatePasswordSignUp = new javax.swing.JTextField();
        txtConfirmPasswordSignUp = new javax.swing.JTextField();
        txtSearchPerson = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        tblPersonDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "PersonID", "DoB", "Age", "Address", "City", "State", "Pin Code", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonDirectory);

        btnPersonView.setText("View");
        btnPersonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonViewActionPerformed(evt);
            }
        });

        btnPersonDelete.setText("Delete");
        btnPersonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDeleteActionPerformed(evt);
            }
        });

        txtNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSignUpActionPerformed(evt);
            }
        });
        txtNameSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameSignUpKeyPressed(evt);
            }
        });

        lblDoB.setText("DoB:");

        btnUpdateSignUp.setText("Update");
        btnUpdateSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSignUpActionPerformed(evt);
            }
        });
        btnUpdateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateSignUpKeyPressed(evt);
            }
        });

        lblAge.setText("Age:");

        txtDoBSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoBSignUpActionPerformed(evt);
            }
        });
        txtDoBSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDoBSignUpKeyPressed(evt);
            }
        });

        lblAddress.setText("Address:");

        lblCity.setText("City:");

        txtAgeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeSignUpKeyPressed(evt);
            }
        });

        lblState.setText("State:");

        txtAddressSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressSignUpKeyPressed(evt);
            }
        });

        lblPinCode.setText("Pin Code:");

        txtCitySignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCitySignUpKeyPressed(evt);
            }
        });

        txtStateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateSignUpKeyPressed(evt);
            }
        });

        txtPinCodeSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeSignUpActionPerformed(evt);
            }
        });
        txtPinCodeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPinCodeSignUpKeyPressed(evt);
            }
        });

        lblCreatePassword.setText("Update Password:");

        lblConfirmPassword.setText("Confirm Password:");

        lblName.setText("Name:");

        jLabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel1.setText("Person Records");

        txtCreatePasswordSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatePasswordSignUpActionPerformed(evt);
            }
        });
        txtCreatePasswordSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreatePasswordSignUpKeyPressed(evt);
            }
        });

        txtConfirmPasswordSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordSignUpActionPerformed(evt);
            }
        });
        txtConfirmPasswordSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordSignUpKeyPressed(evt);
            }
        });

        txtSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonActionPerformed(evt);
            }
        });
        txtSearchPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchPersonKeyPressed(evt);
            }
        });

        jLabel2.setText("Search Person:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchPerson))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPersonView)
                        .addGap(18, 18, 18)
                        .addComponent(btnPersonDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdateSignUp)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCreatePassword)
                                .addComponent(lblConfirmPassword)
                                .addComponent(lblAge)
                                .addComponent(lblCity)
                                .addComponent(lblAddress)
                                .addComponent(lblName)
                                .addComponent(lblState)
                                .addComponent(lblPinCode)
                                .addComponent(lblDoB))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAgeSignUp)
                                .addComponent(txtAddressSignUp)
                                .addComponent(txtCitySignUp)
                                .addComponent(txtStateSignUp)
                                .addComponent(txtDoBSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtPinCodeSignUp)
                                .addComponent(txtNameSignUp)
                                .addComponent(txtCreatePasswordSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtConfirmPasswordSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersonView)
                    .addComponent(btnPersonDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoBSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAgeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddressSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCitySignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtStateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPinCode)
                    .addComponent(txtPinCodeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePassword)
                    .addComponent(txtCreatePasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateSignUp)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSignUpActionPerformed

    private void btnUpdateSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSignUpActionPerformed

        if(tblPersonDirectory.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(this , "Please select a row to update.");
            return; 
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPersonDirectory.getModel();
        SignUp su = (SignUp) model.getValueAt(tblPersonDirectory.getSelectedRow(), 0);
        
        if (tblPersonDirectory.getSelectedRowCount()==1) {
            
        String Name = txtNameSignUp.getText();
        String DoB = txtDoBSignUp.getText();
        int Age = Integer.parseInt(txtAgeSignUp.getText());
        String Address = txtAddressSignUp.getText();
        String City = txtCitySignUp.getText();
        String State = txtStateSignUp.getText();
        int PinCode = Integer.parseInt(txtPinCodeSignUp.getText());
        String CreatePassword = txtCreatePasswordSignUp.getText();
        String ConfirmPassword = txtConfirmPasswordSignUp.getText();
        
        if (!Pattern.matches("^\\d+$", txtAgeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age cannot be Negative!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (!Pattern.matches("^(1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9])$", txtAgeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age should be between 1 to 99!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        
        else if (!(Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$", txtDoBSignUp.getText())))
        {
          JOptionPane.showMessageDialog(null, "Please enter date in mm/dd/yyyy format!", "Error", JOptionPane.ERROR_MESSAGE);
          btnUpdateSignUp.setEnabled(false);
        }
        else if (!(Pattern.matches("^([0-9]{5})$", txtPinCodeSignUp.getText())))
        {
          JOptionPane.showMessageDialog(null, "Pin Code should be 5 digits only!", "Error", JOptionPane.ERROR_MESSAGE);
          btnUpdateSignUp.setEnabled(false);
        }
        else if (!Pattern.matches("^(([a-z]|[0-9]){5})$", txtCreatePasswordSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "The password should be a combination of characters and digits of length 5!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (!txtCreatePasswordSignUp.getText().equals(txtConfirmPasswordSignUp.getText()))
        {
                    
             JOptionPane.showMessageDialog(null, "Your Password should match!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
        }
        else if (Pattern.matches("^$", txtNameSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtDoBSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtAgeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtAddressSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Address cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtCitySignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "City cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtStateSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "State cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtPinCodeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Pin Code cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtCreatePasswordSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnUpdateSignUp.setEnabled(false);
         }
        else {
            
        su.setName(Name);
        su.setDoB(DoB);
        su.setAge(Age);
        su.setAddress(Address);
        su.setCity(City);
        su.setState(State);
        su.setPinCode(PinCode);
        su.setCreatePassword(CreatePassword);
        su.setConfirmPassword(ConfirmPassword);

        
        model.setValueAt(Name, tblPersonDirectory.getSelectedRow(), 0);
        model.setValueAt(DoB, tblPersonDirectory.getSelectedRow(), 2);
        model.setValueAt(Age, tblPersonDirectory.getSelectedRow(), 3);
        model.setValueAt(Address, tblPersonDirectory.getSelectedRow(), 4);
        model.setValueAt(City, tblPersonDirectory.getSelectedRow(), 5);
        model.setValueAt(State, tblPersonDirectory.getSelectedRow(), 6);
        model.setValueAt(PinCode, tblPersonDirectory.getSelectedRow(), 7);
        model.setValueAt(CreatePassword, tblPersonDirectory.getSelectedRow(), 8);
        //model.setValueAt(ConfirmPassword, tblPersonDirectory.getSelectedRow(), 8);
        
        populateTable();
        JOptionPane.showMessageDialog(this, "Person Details Updated");

        txtNameSignUp.setText("");
        txtDoBSignUp.setText("");
        txtAgeSignUp.setText("");
        txtAddressSignUp.setText("");
        txtCitySignUp.setText("");
        txtStateSignUp.setText("");
        txtPinCodeSignUp.setText("");
        txtCreatePasswordSignUp.setText("");
        txtConfirmPasswordSignUp.setText("");
        
        for (Doctor d : DoctorDirectory.getDoctorDirectory()){
                if (String.valueOf(d.getDoctorName()).equals(txtNameSignUp.getText())){
                    d.setDoctorName(Name);
                    d.setAge(Age);
                    d.setAddress(Address);
                    d.setCity(City);
                    d.setState(State);
                    d.setPinCode(PinCode);
                }
        
    }//GEN-LAST:event_btnUpdateSignUpActionPerformed
    }
    }
    }
    
    private void btnUpdateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateSignUpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSignUpKeyPressed

    private void txtDoBSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoBSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoBSignUpActionPerformed

    private void txtPinCodeSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeSignUpActionPerformed

    private void btnPersonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonDirectory.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPersonDirectory.getModel();
        SignUp selectedSignUp = (SignUp) model.getValueAt(selectedRowIndex,0);
        
        txtNameSignUp.setText(String.valueOf(selectedSignUp.getName()));
        txtDoBSignUp.setText(String.valueOf(selectedSignUp.getDoB()));
        txtAgeSignUp.setText(String.valueOf(selectedSignUp.getAge()));
        txtAddressSignUp.setText(String.valueOf(selectedSignUp.getAddress()));
        txtCitySignUp.setText(String.valueOf(selectedSignUp.getCity()));
        txtStateSignUp.setText(String.valueOf(selectedSignUp.getState()));
        txtPinCodeSignUp.setText(String.valueOf(selectedSignUp.getPinCode()));
        txtCreatePasswordSignUp.setText(String.valueOf(selectedSignUp.getCreatePassword()));
        txtConfirmPasswordSignUp.setText(String.valueOf(selectedSignUp.getConfirmPassword()));
        
    }//GEN-LAST:event_btnPersonViewActionPerformed

    private void btnPersonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDeleteActionPerformed
        // TODO add your handling code here:
        
        
        
        int selectedRowIndex = tblPersonDirectory.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPersonDirectory.getModel();
        SignUp selectedSignUp = (SignUp) model.getValueAt(selectedRowIndex,0);     
        SignUpDirectory.deleteEmployee(selectedSignUp);
        
        populateTable();
        
        JOptionPane.showMessageDialog(this, "Person Details deleted.");
        
        txtNameSignUp.setText("");
        txtDoBSignUp.setText("");
        txtAgeSignUp.setText("");
        txtAddressSignUp.setText("");
        txtCitySignUp.setText("");
        txtStateSignUp.setText("");
        txtPinCodeSignUp.setText("");
        txtCreatePasswordSignUp.setText("");
        txtConfirmPasswordSignUp.setText("");
        
        for (Doctor d : DoctorDirectory.getDoctorDirectory()){
                if (String.valueOf(d.getDoctorName()).equals(txtNameSignUp.getText())){
                   DoctorDirectory.deleteEmployee(d);
                }  
                           
    }//GEN-LAST:event_btnPersonDeleteActionPerformed
    }
    private void txtCreatePasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatePasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatePasswordSignUpActionPerformed

    private void txtConfirmPasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordSignUpActionPerformed

    private void txtNameSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtNameSignUpKeyPressed

    private void txtDoBSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoBSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtDoBSignUpKeyPressed

    private void txtAgeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAgeSignUpKeyPressed

    private void txtAddressSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAddressSignUpKeyPressed

    private void txtCitySignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCitySignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCitySignUpKeyPressed

    private void txtStateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtStateSignUpKeyPressed

    private void txtPinCodeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtPinCodeSignUpKeyPressed

    private void txtCreatePasswordSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatePasswordSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCreatePasswordSignUpKeyPressed

    private void txtConfirmPasswordSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordSignUpKeyPressed
        // TODO add your handling code here:
        btnUpdateSignUp.setEnabled(true);
    }//GEN-LAST:event_txtConfirmPasswordSignUpKeyPressed

    private void txtSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPersonActionPerformed

    private void txtSearchPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPersonKeyPressed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblPersonDirectory.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tblPersonDirectory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchPerson.getText().trim()));
    }//GEN-LAST:event_txtSearchPersonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonDelete;
    private javax.swing.JButton btnPersonView;
    private javax.swing.JButton btnUpdateSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JTable tblPersonDirectory;
    private javax.swing.JTextField txtAddressSignUp;
    private javax.swing.JTextField txtAgeSignUp;
    private javax.swing.JTextField txtCitySignUp;
    private javax.swing.JTextField txtConfirmPasswordSignUp;
    private javax.swing.JTextField txtCreatePasswordSignUp;
    private javax.swing.JTextField txtDoBSignUp;
    private javax.swing.JTextField txtNameSignUp;
    private javax.swing.JTextField txtPinCodeSignUp;
    private javax.swing.JTextField txtSearchPerson;
    private javax.swing.JTextField txtStateSignUp;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblPersonDirectory.getModel();
        model.setRowCount(0);
        
        for (SignUp su : SignUpDirectory.getSignUpDirectory()){
            
            Object[] row = new Object[9];
            row[0] = su;
            row[1] = su.getPersonID();
            row[2] = su.getDoB();
            row[3] = su.getAge();
            row[4] = su.getAddress();
            row[5] = su.getCity();
            row[6] = su.getState();
            row[7] = su.getPinCode();
            row[8] = su.getCreatePassword();
            //row[8] = su.getConfirmPassword();
            
            model.addRow(row);
            
        }
    }

    private void populateTable2() {    
    }
}
