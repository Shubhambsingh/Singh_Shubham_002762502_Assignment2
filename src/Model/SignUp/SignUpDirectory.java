/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.SignUp;

import java.util.ArrayList;

/**
 *
 * @author sohamdeshpande
 */


public class SignUpDirectory {
    
    private ArrayList<SignUp> SignUpDirectory;
    
    public SignUpDirectory(){
        
        this.SignUpDirectory = new ArrayList<SignUp>();
         
    }

    public ArrayList<SignUp> getSignUpDirectory() {
        return SignUpDirectory;
    }

    public void setSignUpDirectory(ArrayList<SignUp> SignUpDirectory) {
        this.SignUpDirectory = SignUpDirectory;
    }
    
    public SignUp addNewSignUp(){
        
        int PersonID = SignUpDirectory.size();
        int id;
        if(PersonID == 0) {
            id = 1;
        } else {
            id = SignUpDirectory.get(PersonID - 1).getPersonID() + 1;
        }
        SignUp newSignUp = new SignUp();
        newSignUp.setPersonID(id);
        SignUpDirectory.add(newSignUp);
        return newSignUp;
    }
    public void deleteEmployee(SignUp su){
        SignUpDirectory.remove(su);
    }
}
