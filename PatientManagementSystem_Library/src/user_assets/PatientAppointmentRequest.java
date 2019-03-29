/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_assets;

import users.Doctor;
import users.Patient;

/**
 *
 * @author Reece
 */
public class PatientAppointmentRequest {
    
    private String date;
    private Patient patient;
    private Doctor doctor;
    
    public PatientAppointmentRequest ()
    {
        date = "UKNOWN";
        patient = null;
        doctor = null;
    }
    
    public PatientAppointmentRequest (Patient patient, String date, Doctor doctor)
    {
        this.patient = patient;
        this.date = date;
        this.doctor = doctor;
    }
    
    public String getId()
    {
        return patient.getId();
    }
    
    public String getName() {
        return patient.getName();
    }
    
    public int getAge() {
        return patient.getAge();
    }
    
    public String getAddress() {
        return patient.getAddress();
    }
    
    public String getEmail() {
        return patient.getEmail();
    }
    
}
