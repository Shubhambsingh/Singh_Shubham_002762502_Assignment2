/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Patient;

import Model.Doctor.*;
import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author UshaSingh
 */
public class PatientDirectory {
    private ArrayList<Patient> PatientDirectory;
    
    public PatientDirectory(){
        
        this.PatientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }
        public Patient addNewPatient(){
        
        int PatientID = PatientDirectory.size();
        int id;
        if(PatientID == 0) {
            id = 1;
        } else {
            id = PatientDirectory.get(PatientID - 1).getPatientID() + 1;
        }
        Patient newPatient = new Patient();
        newPatient.setPatientID(id);
        PatientDirectory.add(newPatient);
        return newPatient;
    }
    public void deleteEmployee(Patient h){
        PatientDirectory.remove(h);
    }
}
