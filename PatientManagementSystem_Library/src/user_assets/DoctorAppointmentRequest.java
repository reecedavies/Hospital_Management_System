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
public class DoctorAppointmentRequest {
    
    private String date;
    private Patient patient;
    private Doctor doctor;
    
    public DoctorAppointmentRequest ()
    {
        date = "UKNOWN";
        patient = null;
        doctor = null;
    }
    
    public DoctorAppointmentRequest (Doctor doctor, String date, Patient patient)
    {
        this.patient = patient;
        this.date = date;
        this.doctor = doctor;
    }
    
    public String getId()
    {
        return doctor.getId();
    }
    
    public String getName() {
        return doctor.getName();
    }
    
    public int getAge() {
        return doctor.getAge();
    }
    
    public String getAddress() {
        return doctor.getAddress();
    }
    
    public String getEmail() {
        return doctor.getEmail();
    }
    
}
