/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import controller.LoginStrategyController;
import guis.PatientMainForm;
import java.util.ArrayList;
import java.util.List;
import user_assets.DoctorRating;
import user_assets.Medicine;
import user_assets.PatientHistory;

/**
 *
 * @author Reece
 */
public class Patient extends Person {
    
    public List<PatientHistory> patientHistoryList = new ArrayList<PatientHistory>();
    public List<String> patientNotesList = new ArrayList<String>();
    public List<Medicine> medicineList = new ArrayList<Medicine>();
    
    public Patient ()
    {
        name = "UKNOWN";
        id = "UKNOWN";
        password = "UKNOWN";
        age = 0;
        address = "UKNOWN";
    }
    
    public Patient (String name, String id, String password, int age, String address)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
        this.address = address;
    }
    
    /**
     *  Rates a doctor out of 10
     * 
     */
    public void rateDoctor(Doctor doctor, int rating, String comment, Patient patient)
    {
        doctor.doctorRatingsList.add(new DoctorRating(rating, comment, patient));
    }
    
    /**
     * Requests an appointment with secretary to see specific doctor
     * 
     */
    public void requestAppointment(Patient patient, String date, Doctor doctor, Secretary secretary)
    {
        secretary.receiveAppointmentRequestFromPatient(patient, date, doctor);
    }
    
}
