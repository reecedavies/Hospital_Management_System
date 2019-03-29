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
public class DoctorAppointment {
    
    private String date;
    private Patient patient;
    
    public DoctorAppointment ()
    {
        date = "UKNOWN";
        patient = null;
    }
    
    public DoctorAppointment (Patient patient, String date)
    {
        this.patient = patient;
        this.date = date;
    }
    
    public Patient getPatient()
    {
        return patient;
    }
    
    public String getDate()
    {
        return date;
    }
    
}
