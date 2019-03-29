/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import controller.LoginStrategyController;
import guis.DoctorMainForm;
import java.util.ArrayList;
import java.util.List;
import user_assets.DoctorRating;
import user_assets.DoctorAppointment;
import user_assets.Medicine;

/**
 *
 * @author Reece
 */
public class Doctor extends Person {
    
    public List<DoctorRating> doctorRatingsList = new ArrayList<DoctorRating>();
    public List<DoctorAppointment> doctorAppointmentList = new ArrayList<DoctorAppointment>();
    public List<String> feedbackList = new ArrayList<String>();
    
    public Doctor ()
    {
        name = "UKNOWN";
        id = "UKNOWN";
        password = "UKNOWN";
        age = 0;
        address = "UKNOWN";
    }
    
    public Doctor (String name, String id, String password, int age, String address)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
        this.address = address;
    }
    
    /**
     * Propose an appointment to all secretaries for a specific patient
     * 
     */
    public void proposeAppointment(Doctor doctor, String date, Patient patient)
    {
        for (int i = 0; i < LoginStrategyController.secretaryList.size(); i++)
        {
            LoginStrategyController.secretaryList.get(i).receiveAppointmentRequestFromDoctor(doctor, date, patient);
        }
    }
    
    /**
     * Make notes during consolidation with a specific patient
     * 
     */
    public void makeNotes(Patient patient, String note)
    {
        patient.patientNotesList.add(note);
    }
    
    /**
     * Prescribe specific medicines to a specific patient, alongside with quantity
     * 
     */
    public void perscribeMedicines(Patient patient, String name, String quantity)
    {
        patient.medicineList.add(new Medicine(name, quantity));
    }
    
    /**
     * Request specific medicines to secretaries
     * 
     */
    public void requestMedicines(String nameOfMedicine)
    {
        for (int i = 0; i < LoginStrategyController.secretaryList.size(); i++)
        {
            LoginStrategyController.secretaryList.get(i).requestedMedicineList.add(nameOfMedicine);
        }
    }
    
}
