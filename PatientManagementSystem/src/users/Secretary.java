/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import controller.LoginStrategyController;
import factory.userFactory;
import guis.SecretaryMainForm;
import java.util.ArrayList;
import java.util.List;
import user_assets.Medicine;
import user_assets.DoctorAppointment;
import user_assets.DoctorAppointmentRequest;
import user_assets.PatientAppointmentRequest;

import user_assets.RequestedPatient;

/**
 *
 * @author Reece
 */
public class Secretary extends Person {
    
    public List<RequestedPatient> requestedPatientList = new ArrayList<RequestedPatient>();
    public List<String> requestedTerminationList = new ArrayList<String>();
    public List<PatientAppointmentRequest> patientAppointmentRequestList = new ArrayList<PatientAppointmentRequest>();
    public List<DoctorAppointmentRequest> doctorAppointmentRequestList = new ArrayList<DoctorAppointmentRequest>();
    public List<String> requestedMedicineList = new ArrayList<String>();
    
    public Secretary ()
    {
        name = "UKNOWN";
        id = "UKNOWN";
        password = "UKNOWN";
        age = 0;
        address = "UKNOWN";
    }
    
    public Secretary (String name, String id, String password, int age, String address)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
        this.address = address;
    }
    
    /**
     * Receive a request for patient account creation
     * 
     */
    public void receivePatientAccountRequest(String name, String email, int age, String address) {
        //Add item to Secretary static requestedPatientList
        requestedPatientList.add(new RequestedPatient(name, email, age, address));
    }  
    
    /**
     * Receive a request from a patient for account termination
     * 
     */
    public void receiveAccountTerminationRequest(Patient patient) {
        //Add item to Secretary static requestedTerminationList
        requestedTerminationList.add(patient.getId());
    } 
    
    /**
     * Approve the patient account creation (from request)
     * 
     */
    public void approvePatientAccount(RequestedPatient requestedPatient)
    {
        //LoginStrategyController.patientList.add(new Patient(requestedPatient.getName(), "P" + Integer.toString(1000 + (LoginStrategyController.patientList.size())), "Password", requestedPatient.getAge(), requestedPatient.getAddress()));
        
        userFactory patientFactory = new userFactory();
        patientFactory.createUser("Patient", requestedPatient.getName(), "P" + Integer.toString(1000 + (LoginStrategyController.patientList.size())), "Password", requestedPatient.getAge(), requestedPatient.getAddress());
        
        for (int i = 0; i < requestedPatientList.size(); i++)
        {
            
            if (requestedPatientList.get(i).getEmail() == requestedPatient.getEmail())
            {
                requestedPatientList.remove(i);
                System.out.println("RequestedPatient deleted");
            }
        }
    }
    
    /**
     * Receive an appointment request from a patient
     * 
     */
    public void receiveAppointmentRequestFromPatient(Patient patient, String date, Doctor doctor)
    {
        patientAppointmentRequestList.add(new PatientAppointmentRequest(patient, date, doctor));
    }
    
    /**
     * Receive an appointment proposition from a doctor
     * 
     */
    public void receiveAppointmentRequestFromDoctor(Doctor doctor, String date, Patient patient)
    {
        doctorAppointmentRequestList.add(new DoctorAppointmentRequest(doctor, date, patient));
    }
    
    /**
     * Create an appointment between specific doctor and patient
     * 
     */
    public void createAppointment(Doctor doctor, Patient patient, String date)
    {
        doctor.doctorAppointmentList.add(new DoctorAppointment(patient, date));
                
        // Email customer appointment confirmation
    }
    
    /**
     * Give patient the medicine
     * 
     */
    public void givePatientMedicines(Patient patient)
    {
        // Done with observer pattern as it will track stock inventory
    }
    
    /**
     * Order more medicine to stock up
     *  
     */
    public void orderMedicines(String medicine, int quantity)
    {
        // Order the specified medicines requested, using the Observer pattern
        // When it has arrived, update the secretary of the new stock quantity
    }
    
    /**
     * Remove the patient account, as they requested for termination
     * 
     */
    public void approvePatientAccountRemoval(String id)
    {
        for (int i = 0; i < LoginStrategyController.patientList.size(); i++)
        {
            
            if (LoginStrategyController.patientList.get(i).getId() == id)
            {
                for (int q = 0; q < requestedTerminationList.size(); q++)
                {

                    if (requestedTerminationList.get(q) == LoginStrategyController.patientList.get(i).getId())
                    {
                        requestedTerminationList.remove(i);
                        System.out.println("Reference deleted");
                    }
                }
                
                LoginStrategyController.patientList.remove(i);
                System.out.println("Patient deleted");
            }
        }
    }
    
}
