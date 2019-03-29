/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import controller.LoginStrategyController;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.GUISimulator;
import users.Person;
import users.Admin;
import users.Doctor;
import users.Patient;
import users.Secretary;

/**
 *
 * @author Reece
 */
public class userFactory {
    
    
    /**
     * Method to create one of the users
     * @param userType
     * @param name
     * @param id
     * @param password
     * @param age
     * @param address 
     */
    public void createUser(String userType, String name, String id, String password, int age, String address)
    {
        // Use appropriate method depending on what the string is
        if (userType == "Admin")
        {
            createAdminAccount(name, id, password, age, address);
        }
        else if (userType == "Doctor")
        {
            createDoctorAccount(name, id, password, age, address);
        }
        else if (userType == "Patient")
        {
            createPatientAccount(name, id, password, age, address);
        }
        else if (userType == "Secretary")
        {
            createSecretaryAccount(name, id, password, age, address);
        }
    }
    
    /**
     * Creates Admin Account
     * @param name
     * @param id
     * @param password
     * @param age
     * @param address 
     */
    public void createAdminAccount(String name, String id, String password, int age, String address)
    {
        //Instantiate the account into the list
        LoginStrategyController.adminList.add(new Admin(name, id, password, age, address));
        System.out.println("Admin Created: " + name + ", " + id + ", " + password + ", " + age + ", " + address);
        
        String fileName = "data.bin";
        
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            create.writeObject(LoginStrategyController.adminList);
            
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Read from data.bin to ensure nothing is left out
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
            LoginStrategyController.adminList = (List) read.readObject();
            
            
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Creates Doctor account
     * @param name
     * @param id
     * @param password
     * @param age
     * @param address 
     */
    public void createDoctorAccount(String name, String id, String password, int age, String address)
    {
        //Instantiate the account into the list
        LoginStrategyController.doctorList.add(new Doctor(name, id, password, age, address));
        System.out.println("Doctor Created: " + name + ", " + id + ", " + password + ", " + age + ", " + address);
        
        String fileName = "data.bin";
        
        //Write to file data.bin
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            
            create.writeObject(LoginStrategyController.doctorList);
            
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Read from data.bin to ensure nothing is left out
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
            
            LoginStrategyController.doctorList = (List) read.readObject();
            
            
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Creates Patient account
     * @param name
     * @param id
     * @param password
     * @param age
     * @param address 
     */
    public void createPatientAccount(String name, String id, String password, int age, String address)
    {
        //Instantiate the account into the list
        LoginStrategyController.patientList.add(new Patient(name, id, password, age, address));
        System.out.println("Patient Created: " + name + ", " + id + ", " + password + ", " + age + ", " + address);
        
        String fileName = "data.bin";
        
        //Write to file data.bin
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            create.writeObject(LoginStrategyController.patientList);
            
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Read from data.bin to ensure nothing is left out
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
            
            LoginStrategyController.patientList = (List) read.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Creates Secretary account
     * 
     */
    public void createSecretaryAccount(String name, String id, String password, int age, String address)
    {
        //Instantiate the account into the list
        LoginStrategyController.secretaryList.add(new Secretary(name, id, password, age, address));
        System.out.println("Secretary Created: " + name + ", " + id + ", " + password + ", " + age + ", " + address);
        
        String fileName = "data.bin";
        
        //Write to file data.bin
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            create.writeObject(LoginStrategyController.secretaryList);
            
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Read from data.bin to ensure nothing is left out
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
            
            LoginStrategyController.secretaryList = (List) read.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
   
