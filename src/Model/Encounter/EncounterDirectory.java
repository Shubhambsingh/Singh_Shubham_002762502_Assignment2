/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Encounter;

import java.util.ArrayList;

/**
 *
 * @author UshaSingh
 */
public class EncounterDirectory {
    private ArrayList<Encounter> EncounterDirectory;
    
    public EncounterDirectory(){
        
        this.EncounterDirectory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterDirectory() {
        return EncounterDirectory;
    }

    public void setEncounterDirectory(ArrayList<Encounter> EncounterDirectory) {
        this.EncounterDirectory = EncounterDirectory;
    }
        public Encounter addNewEncounter(){
        
        int EncounterID = EncounterDirectory.size();
        int id;
        if(EncounterID == 0) {
            id = 1;
        } else {
            id = EncounterDirectory.get(EncounterID - 1).getEncounterID() + 1;
        }
        Encounter newEncounter = new Encounter();
        newEncounter.setEncounterID(id);
        EncounterDirectory.add(newEncounter);
        return newEncounter;
    }
    public void deleteEmployee(Encounter h){
        EncounterDirectory.remove(h);
    }
}
