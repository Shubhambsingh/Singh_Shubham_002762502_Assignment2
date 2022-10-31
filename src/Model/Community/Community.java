/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Community;

/**
 *
 * @author UshaSingh
 */
public class Community {

    private String CommunityName;
    private int CommunityID;
    private String City;
    private String Address;
    private String State;
    private int PinCode;
    private String CreatePassword;
    private String ConfirmPassword;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getCommunityID() {
        return CommunityID;
    }

    public void setCommunityID(int CommunityID) {
        this.CommunityID = CommunityID;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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
        return CommunityName;
    }
}

