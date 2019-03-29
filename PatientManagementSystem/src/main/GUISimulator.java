/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import users.Admin;
import users.Doctor;
import users.Patient;
import users.Secretary;
import users.Person;

import guis.LoginForm;
import controller.LoginStrategyController;
import factory.userFactory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import user_assets.DoctorRating;
import user_assets.PatientHistory;
import user_assets.DoctorAppointment;
import user_assets.Medicine;

/**
 *
 * @author Reece
 */
public class GUISimulator {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Set new LoginForm to run
        LoginForm LoginInfo = new LoginForm();
        LoginInfo.setVisible(true);
        
        // Create the core accounts
        LoginStrategyController.createAdmins();
        LoginStrategyController.createPatients();
        LoginStrategyController.createSecretaries();
        LoginStrategyController.createDoctors();
        
        String fileName = "data.bin";
        
        /*********************************************
           Used to instantiate lists within data.bin
        *********************************************/
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            create.writeObject(LoginStrategyController.adminList);
            create.writeObject(LoginStrategyController.patientList);
            create.writeObject(LoginStrategyController.secretaryList);
            create.writeObject(LoginStrategyController.doctorList);
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*********************************************
             Used to read lists within data.bin
        *********************************************/
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
            LoginStrategyController.adminList = (List) read.readObject();
            System.out.println("File read: " + LoginStrategyController.adminList.get(0).getName() + ", " + LoginStrategyController.adminList.get(0).getId());
            
            LoginStrategyController.patientList = (List) read.readObject();
            System.out.println("File read: " + LoginStrategyController.patientList.get(0).getName() + ", " + LoginStrategyController.patientList.get(0).getId());
            
            LoginStrategyController.secretaryList = (List) read.readObject();
            System.out.println("File read: " + LoginStrategyController.secretaryList.get(0).getName() + ", " + LoginStrategyController.secretaryList.get(0).getId());
            
            LoginStrategyController.doctorList = (List) read.readObject();
            System.out.println("File read: " + LoginStrategyController.doctorList.get(0).getName() + ", " + LoginStrategyController.doctorList.get(0).getId());
            
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        // These add to user_asset lists for specific users
        // To show that they work
        //___________________________________________
        
        // Doctor ratings
        LoginStrategyController.doctorList.get(0).doctorRatingsList.add(new DoctorRating(10, "I loved how he was. I like him!", LoginStrategyController.patientList.get(0)));
        LoginStrategyController.doctorList.get(0).doctorRatingsList.add(new DoctorRating(5, "Meh, seen better doctors at primary schools.", LoginStrategyController.patientList.get(0)));
        LoginStrategyController.doctorList.get(1).doctorRatingsList.add(new DoctorRating(8, "Good", LoginStrategyController.patientList.get(1)));
        //System.out.println(LoginStrategyController.doctorList.get(0).doctorRatingsList.get(0).getRating()); //WORKS BUT DOESN'T WORK ON VIEWDOCTORRATINGS ATM (LOGIC ERROR)
        
        // Patient History (currently no way of doing it from within the system
        LoginStrategyController.patientList.get(0).patientHistoryList.add(new PatientHistory("01/01/2019", "Added to system"));
        LoginStrategyController.patientList.get(0).patientHistoryList.add(new PatientHistory("02/01/2019", "Had an appointment"));
        LoginStrategyController.patientList.get(1).patientHistoryList.add(new PatientHistory("01/01/2019", "Added to system"));
        LoginStrategyController.patientList.get(1).patientHistoryList.add(new PatientHistory("02/01/2019", "Had an appointment"));
        LoginStrategyController.patientList.get(1).patientHistoryList.add(new PatientHistory("03/01/2019", "Got results from appointment"));
        
        // Doctor appointments
        LoginStrategyController.doctorList.get(0).doctorAppointmentList.add(new DoctorAppointment(LoginStrategyController.patientList.get(0), "09/01/2019"));
        
        // Doctor notes on specific patient
        LoginStrategyController.doctorList.get(0).makeNotes(LoginStrategyController.patientList.get(0), "This is a note for Billy");
        LoginStrategyController.doctorList.get(0).makeNotes(LoginStrategyController.patientList.get(0), "This is another note for Billy");
        
        // Requests for account termination
        LoginStrategyController.secretaryList.get(0).requestedTerminationList.add("P1000");
        LoginStrategyController.secretaryList.get(0).requestedTerminationList.add("P1001");
        
        // Requests for appointments, made by patient
       LoginStrategyController.patientList.get(0).requestAppointment(LoginStrategyController.patientList.get(0), "30/01/2019", LoginStrategyController.doctorList.get(0), LoginStrategyController.secretaryList.get(0));
       LoginStrategyController.patientList.get(0).requestAppointment(LoginStrategyController.patientList.get(0), "30/01/2019", LoginStrategyController.doctorList.get(0), LoginStrategyController.secretaryList.get(1));
       
       // Propositions for appointments, made by doctor
       LoginStrategyController.doctorList.get(0).proposeAppointment(LoginStrategyController.doctorList.get(0), "01/02/2019", LoginStrategyController.patientList.get(0));
       
       // Assigned medicines to a patient
       LoginStrategyController.patientList.get(0).medicineList.add(new Medicine("Paracetamol", "2/day"));
       LoginStrategyController.patientList.get(0).medicineList.add(new Medicine("Iburprofen", "2/day"));
        
        
    }
}
