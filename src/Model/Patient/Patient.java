/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Patient;

/**
 *
 * @author UshaSingh
 */
public class Patient {
    
    private int HospitalID;
    private String HospitalName;
    private int PersonID;
    private int PatientID;
    private String PatientName;
    private int Age;
    private String Address;
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

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String DoctorName) {
        this.PatientName = DoctorName;
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
    @Override
    public String toString(){
        return HospitalName;
    }
    
}
