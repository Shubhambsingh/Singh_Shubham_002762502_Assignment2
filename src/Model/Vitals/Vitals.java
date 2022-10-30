/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Vitals;

/**
 *
 * @author UshaSingh
 */
public class Vitals {
    private int VitalID;
    private int DoctorID;
    private String DoctorName;
    private String PatientName;
    private int EncounterID;
    private int PatientID;
    private String Date;
    private String TimeStamp;
    private Double Temperature;
    private int HeartRate;
    private int BPS;
    private int BPD;

    public int getVitalID() {
        return VitalID;
    }

    public void setVitalID(int VitalID) {
        this.VitalID = VitalID;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getEncounterID() {
        return EncounterID;
    }

    public void setEncounterID(int EncounterID) {
        this.EncounterID = EncounterID;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double Temperature) {
        this.Temperature = Temperature;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getBPS() {
        return BPS;
    }

    public void setBPS(int BPS) {
        this.BPS = BPS;
    }

    public int getBPD() {
        return BPD;
    }

    public void setBPD(int BPD) {
        this.BPD = BPD;
    }
    @Override
    public String toString(){
        return DoctorName;
    }  
    
}
