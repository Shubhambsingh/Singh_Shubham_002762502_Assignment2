/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Hospital;

/**
 *
 * @author sohamdeshpande
 */
public class Hospital {
    private int HospitalID;
    private String HospitalName;
    private String Community;
    private String City;
    private String State;
    private int PinCode;
    private String CreatePassword;
    private String ConfirmPassword;

    public int getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }
    
    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
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
    
    @Override
    public String toString(){
        return HospitalName;
    }
    
    
}
