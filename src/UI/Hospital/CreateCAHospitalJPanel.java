/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import Model.Community.Community;
import Model.Community.CommunityDirectory;
import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.Hospital;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUpDirectory;
import Model.Vitals.VitalsDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author UshaSingh
 */
public class CreateCAHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCAHospitalJPanel
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    CommunityDirectory CommunityDirectory;
    public CreateCAHospitalJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory, CommunityDirectory CommunityDirectory, String CID) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        this.VitalsDirectory = VitalsDirectory;
        this.CommunityDirectory = CommunityDirectory;
        for(Community selectedSignUp : CommunityDirectory.getCommunityDirectory()){
            if (String.valueOf(selectedSignUp.getCommunityID()).equals(CID)){
            txtCommunityID.setText(String.valueOf(selectedSignUp.getCommunityID()));
            txtCommunityName.setText(String.valueOf(selectedSignUp.getCommunityName())); 
            txtCity.setText(String.valueOf(selectedSignUp.getCity()));
            txtState.setText(String.valueOf(selectedSignUp.getAddress()));
            txtPinCode.setText(String.valueOf(selectedSignUp.getPinCode()));
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        txtHospitalName = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblPinCode = new javax.swing.JLabel();
        txtPinCode = new javax.swing.JTextField();
        txtCommunityName = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtCreatePassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblCreatePassword = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        txtCommunityID = new javax.swing.JTextField();

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        jLabel7.setText("State:");

        lblHospitalName.setText("Name of the Hospital:");

        lblPinCode.setText("Pin Code:");

        txtPinCode.setEditable(false);

        txtCommunityName.setEditable(false);

        lblCommunity.setText("Community:");

        txtCity.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel1.setText("Create Records for a new Hospital and its Hospital Admin ");

        lblCreatePassword.setText("Create Password:");

        txtState.setEditable(false);

        jLabel2.setText("Community ID:");

        lblConfirmPassword.setText("Confirm Password:");

        txtCommunityID.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHospitalName)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblCreatePassword)
                                    .addComponent(lblConfirmPassword)
                                    .addComponent(lblCity)
                                    .addComponent(jLabel7)
                                    .addComponent(lblPinCode)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtState)
                                    .addComponent(txtPinCode)
                                    .addComponent(txtCreatePassword)
                                    .addComponent(txtConfirmPassword)
                                    .addComponent(txtHospitalName)
                                    .addComponent(txtCommunityName)
                                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(txtCommunityID))))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPinCode)
                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePassword)
                    .addComponent(txtCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(425, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String HospitalName = txtHospitalName.getText();
        String Community = txtCommunityName.getText();
        String City = txtCity.getText();
        String State = txtState.getText();
        int PinCode = Integer.parseInt(txtPinCode.getText());
        String CreatePassword = txtCreatePassword.getText();
        String ConfirmPassword = txtConfirmPassword.getText();

        Hospital h = HospitalDirectory.addNewHospital();

        h.setHospitalName(HospitalName);
        h.setCommunity(Community);
        h.setCity(City);
        h.setState(State);
        h.setPinCode(PinCode);
        h.setCreatePassword(CreatePassword);
        h.setConfirmPassword(ConfirmPassword);

        JOptionPane.showMessageDialog(this, "New Hospital Details Created and your Hospital ID is ");

        txtHospitalName.setText("");
        txtCreatePassword.setText("");
        txtConfirmPassword.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtCreatePassword;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
