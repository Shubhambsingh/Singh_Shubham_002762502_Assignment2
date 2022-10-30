/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Vitals;

import java.util.ArrayList;

/**
 *
 * @author UshaSingh
 */
public class VitalsDirectory {
    private ArrayList<Vitals> VitalsDirectory;
    
    public VitalsDirectory(){
        
        this.VitalsDirectory = new ArrayList<Vitals>();
    }

    public ArrayList<Vitals> getVitalsDirectory() {
        return VitalsDirectory;
    }

    public void setEncounterDirectory(ArrayList<Vitals> VitalsDirectory) {
        this.VitalsDirectory = VitalsDirectory;
    }
        public Vitals addNewVitals(){
        
        int VitalID = VitalsDirectory.size();
        int id;
        if(VitalID == 0) {
            id = 1;
        } else {
            id = VitalsDirectory.get(VitalID - 1).getVitalID() + 1;
        }
        Vitals newVitals = new Vitals();
        newVitals.setVitalID(id);
        VitalsDirectory.add(newVitals);
        return newVitals;
    }
    public void deleteEmployee(Vitals h){
        VitalsDirectory.remove(h);
    }
}
