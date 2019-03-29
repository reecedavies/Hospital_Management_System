/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import factory.userFactory;
import java.util.ArrayList;
import java.util.List;
import users.Admin;
import users.Doctor;
import users.Patient;
import users.Secretary;
import users.Person;

/**
 *
 * @author Reece
 */
public class LoginStrategyController {
    
    // Declaring the lists for all the users
    public static List<Admin> adminList = new ArrayList<Admin>();
    public static List<Patient> patientList = new ArrayList<Patient>();
    public static List<Secretary> secretaryList = new ArrayList<Secretary>();
    public static List<Doctor> doctorList = new ArrayList<Doctor>();
    
    // Create each user to ensure there are accounts on startup
    // Instantiation Admins within controller
    public static void createAdmins()
    {
        userFactory adminFactory = new userFactory();
        
        adminFactory.createUser("Admin","Reece", "A1000", "Password", 19, "Classified");
    }
    
    // Instantiation Patients within controller
    public static void createPatients()
    {
        userFactory patientFactory = new userFactory();
        
        patientFactory.createUser("Patient", "Billy", "P1000", "Password", 32, "New Street, UK");
        patientFactory.createUser("Patient", "Ryan", "P1001", "Password", 50, "Yellow, UK");
    }
    
    // Instantiation Secretaries within controller
    public static void createSecretaries()
    {
        userFactory secretaryFactory = new userFactory();
        
        secretaryFactory.createUser("Secretary", "Jimmy", "S1000", "Password", 49, "Old Street, UK");
        secretaryFactory.createUser("Secretary", "Amy", "S1001", "Password", 28, "Blue Street, UK");
    }
    
    // Instantiation Doctors within controller
    public static void createDoctors()
    {
        userFactory doctorFactory = new userFactory();
        
        doctorFactory.createUser("Doctor", "Johnny", "D1000", "Password", 23, "Red Street, UK");
        doctorFactory.createUser("Doctor","Ben", "D1001", "Password", 52, "Purple Street, UK");
        doctorFactory.createUser("Doctor","Dylan", "D1002", "Password", 26, "Orange Steer, UK");
    }
    
}
