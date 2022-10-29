/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Hospital;

import java.util.ArrayList;

/**
 *
 * @author sohamdeshpande
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> HospitalDirectory;
    
    public HospitalDirectory(){
        
        this.HospitalDirectory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }
        public Hospital addNewHospital(){
        
        int HospitalID = HospitalDirectory.size();
        int id;
        if(HospitalID == 0) {
            id = 1;
        } else {
            id = HospitalDirectory.get(HospitalID - 1).getHospitalID() + 1;
        }
        Hospital newHospital = new Hospital();
        newHospital.setHospitalID(id);
        System.out.println(newHospital);
        HospitalDirectory.add(newHospital);
        return newHospital;
    }
    public void deleteEmployee(Hospital h){
        HospitalDirectory.remove(h);
    }

}
