/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import model.BloodPressureStatusHelper;
import model.City;
import model.Community;
import model.House;
import model.Person;
import model.System;
/**
 *
 * @author sirip
 */
public class AbnormalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AbnormalJPanel
     */
    private JPanel displayJpanel;
    private System system;
    private City city;
    private Community community;
    
    
    public AbnormalJPanel(JPanel displayJpanel, System system) {
        this.displayJpanel = displayJpanel;
        this.system = system;
        initComponents();
        initializeCities();
        initializeCommunities();
//        initializeHouses();
    }
    
    private void initializeCities() {
        
        ArrayList<City> cities = system.getCities();
        for(City city:cities){
            cmbCity.addItem(city.getCityName());
        }
    }
    
    private void initializeCommunities() {
        cmbCommunity.removeAllItems();
        String selectedCityName = (String) cmbCity.getSelectedItem();
        for(City city : system.getCities()) {
            if(city.getCityName().equalsIgnoreCase(selectedCityName)){
                this.city = city;                
                for(Community community : city.getCommunities()){
                    cmbCommunity.addItem(community.getCommunityName());
                }
            }
        }
        initializeHouses();
    }
    
    private void initializeHouses() {
        cmbHouse.removeAllItems();
        String selectedCommunityName = (String) cmbCommunity.getSelectedItem();
        for(Community community : this.city.getCommunities()) {
            if(community.getCommunityName().equalsIgnoreCase(selectedCommunityName)){
                this.community = community;
                
                for(House house : community.getCommunityHouses()){
                    cmbHouse.addItem(house.getHouseName());
                }
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

        cityjLabel = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        communityjLabel = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox<>();
        searchjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAbnormal = new javax.swing.JTable();
        headerjLabel = new javax.swing.JLabel();
        houseJlabel = new javax.swing.JLabel();
        cmbHouse = new javax.swing.JComboBox<>();

        cityjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityjLabel.setText("City :");

        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });

        communityjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        communityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        communityjLabel.setText("Community :");

        cmbCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCommunityActionPerformed(evt);
            }
        });

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        tblAbnormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person Name", "Age", "SBP", "DBP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAbnormal);

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Persons with Abnormal Vitals ");

        houseJlabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        houseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        houseJlabel.setText("House:");

        cmbHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(communityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(houseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchjButton)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityjLabel)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityjLabel)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchjButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(houseJlabel)
                        .addComponent(cmbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        // TODO add your handling code here:
        String cityName = (String) cmbCity.getSelectedItem();
        String communityName = (String) cmbCommunity.getSelectedItem();
        String selectedHouseName = (String) cmbHouse.getSelectedItem();
        
        City selectedCity = null;
        Community selectedCommunity = null;
        House selectedHouse = null;
        
        for (City city : system.getCities()){
            if (city.getCityName().equalsIgnoreCase(cityName)){
                java.lang.System.out.print(city);
                selectedCity = city;
            }
        }      
        for (Community community : selectedCity.getCommunities()){
            if (community.getCommunityName().equalsIgnoreCase(communityName)){
                java.lang.System.out.print(community);
                selectedCommunity = community;
            }
        }
        
        for (House house : selectedCommunity.getCommunityHouses()){
            if (house.getHouseName().equalsIgnoreCase(selectedHouseName)){
                java.lang.System.out.print(house);
                selectedHouse = house;
            }
        }
        double sbp=0;
        double dbp=0;
        
        DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
        model.setRowCount(0);
        
        

        for (Person person: selectedHouse.getPersons()){
            for(int i=0; i<person.getPatient().getEncounterHistory().getEncounterHistory().size(); i++){
                sbp = person.getPatient().getEncounterHistory().getEncounterHistory().get(i).getVitalSigns().getSbp();
                dbp = person.getPatient().getEncounterHistory().getEncounterHistory().get(i).getVitalSigns().getDbp();
                java.lang.System.out.println(sbp);
                java.lang.System.out.println(dbp);
                if (isAbnormal(person, sbp, dbp)){
                    Object[] row = new Object[7];
                    row[0] = person.getName();
                    row[1] = person.getAge();
                    row[2] = sbp;
                    row[3] = dbp;
                    java.lang.System.out.print("check");
                    model.addRow(row);
                }
            }
        }  
    } 
    private boolean isAbnormal(Person person, double syst, double diab){

        if(Double.compare(person.getAge(),21) < 0 || Double.compare(person.getAge(),65) > 0){
            return false;
        }
        if(Double.compare(person.getAge(),21) > 0 && Double.compare(person.getAge(),25) < 0){
            if(Double.compare(syst,122.5) < 0 && Double.compare(syst,118.5) > 0 && Double.compare(diab,80.5) < 0 && Double.compare(diab,76.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),26) > 0 && Double.compare(person.getAge(),30) < 0){
            if(Double.compare(syst,121.5) < 0 && Double.compare(syst,117.5) > 0 && Double.compare(diab,78.5) < 0 && Double.compare(diab,74.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),31) > 0 && Double.compare(person.getAge(),35) < 0){
            if(Double.compare(syst,116.5) < 0 && Double.compare(syst,112.5) > 0 && Double.compare(diab,77.5) < 0 && Double.compare(diab,73.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),36) > 0 && Double.compare(person.getAge(),40) < 0){
            if(Double.compare(syst,122.5) < 0 && Double.compare(syst,118.5) > 0 && Double.compare(diab,77.5) < 0 && Double.compare(diab,73.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),41) > 0 && Double.compare(person.getAge(),45) < 0){
            if(Double.compare(syst,117.5) < 0 && Double.compare(syst,113.5) > 0 && Double.compare(diab,80.5) < 0 && Double.compare(diab,76.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),46) > 0 && Double.compare(person.getAge(),50) < 0){
            if(Double.compare(syst,121.5) < 0 && Double.compare(syst,117.5) > 0 && Double.compare(diab,82.5) < 0 && Double.compare(diab,78.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),51) > 0 && Double.compare(person.getAge(),55) < 0){
            if(Double.compare(syst,127.5) < 0 && Double.compare(syst,123.5) > 0 && Double.compare(diab,82.5) < 0 && Double.compare(diab,78.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),56) > 0 && Double.compare(person.getAge(),60) < 0){
            if(Double.compare(syst,131.5) < 0 && Double.compare(syst,127.5) > 0 && Double.compare(diab,81.5) < 0 && Double.compare(diab,77.5) > 0){
                return false;
            }else{
                return true;
            }
        }

        if(Double.compare(person.getAge(),61) > 0 && Double.compare(person.getAge(),65) < 0){
            if(Double.compare(syst,145.5) < 0 && Double.compare(syst,141.5) > 0 && Double.compare(diab,78.5) < 0 && Double.compare(diab,74.5) > 0){
                return false;
            }else{
                return true;
            }
        }return false;

    }//GEN-LAST:event_searchjButtonActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
        initializeCommunities();
    }//GEN-LAST:event_cmbCityActionPerformed

    private void cmbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCommunityActionPerformed
        // TODO add your handling code here:
        initializeHouses();
    }//GEN-LAST:event_cmbCommunityActionPerformed

    private void cmbHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbCommunity;
    private javax.swing.JComboBox<String> cmbHouse;
    private javax.swing.JLabel communityjLabel;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel houseJlabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchjButton;
    private javax.swing.JTable tblAbnormal;
    // End of variables declaration//GEN-END:variables
}
