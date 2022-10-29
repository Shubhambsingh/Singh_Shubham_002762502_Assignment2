/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Doctor;

import java.util.ArrayList;

/**
 *
 * @author sohamdeshpande
 */
public class DoctorDirectory {
    private ArrayList<Doctor> DoctorDirectory;
    
    public DoctorDirectory(){
        
        this.DoctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return DoctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
    }
        public Doctor addNewDoctor(){
        
        int DoctorID = DoctorDirectory.size();
        int id;
        if(DoctorID == 0) {
            id = 1;
        } else {
            id = DoctorDirectory.get(DoctorID - 1).getDoctorID() + 1;
        }
        Doctor newDoctor = new Doctor();
        newDoctor.setDoctorID(id);
        System.out.println(newDoctor);
        DoctorDirectory.add(newDoctor);
        return newDoctor;
    }
    public void deleteEmployee(Doctor h){
        DoctorDirectory.remove(h);
    }
}
