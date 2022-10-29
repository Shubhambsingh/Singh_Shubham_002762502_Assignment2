/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.SignUp;

/**
 *
 * @author sohamdeshpande
 */
public class SignUp {
    private int PersonID;
    private String Name;
    private String DoB;
    private int Age;
    private String Address;
    private String City;
    private String State;
    private int PinCode;
    private String CreatePassword;
    private String ConfirmPassword;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
    

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int PinCode) {
        this.PinCode = PinCode;
    }

    public String getCreatePassword() {
        return CreatePassword;
    }

    public void setCreatePassword(String CreatePassword) {
        this.CreatePassword = CreatePassword;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;  
    }
 
    @Override
    public String toString(){
        return Name;
    }
    
    
}
