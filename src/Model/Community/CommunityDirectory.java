/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Community;

import java.util.ArrayList;

/**
 *
 * @author UshaSingh
 */
public class CommunityDirectory {
    private ArrayList<Community> CommunityDirectory;
    
    public CommunityDirectory(){
        
        this.CommunityDirectory = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return CommunityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> CommunityDirectory) {
        this.CommunityDirectory = CommunityDirectory;
    }
        public Community addNewCommunity(){
        
        int CommunityID = CommunityDirectory.size();
        int id;
        if(CommunityID == 0) {
            id = 1;
        } else {
            id = CommunityDirectory.get(CommunityID - 1).getCommunityID() + 1;
        }
        Community newCommunity = new Community();
        newCommunity.setCommunityID(id);
        CommunityDirectory.add(newCommunity);
        return newCommunity;
    }
    public void deleteEmployee(Community h){
        CommunityDirectory.remove(h);
    }
}
