/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import guis.AdminMainForm;
import java.awt.event.WindowEvent;

import controller.LoginStrategyController;
import factory.userFactory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import main.GUISimulator;

/**
 *
 * @author Reece
 */
public class Admin extends Person {
    
    
    public Admin ()
    {
        name = "UKNOWN";
        id = "UKNOWN";
        password = "UKNOWN";
        age = 0;
        address = "UKNOWN";
    }
    
    public Admin (String name, String id, String password, int age, String address)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
        this.address = address;
    }
    
    
    /**
     * Removes doctor from list, and updates data.bin
     * 
     */
    public void removeDoctor(String id)
    {
        for (int i = 0; i < LoginStrategyController.doctorList.size(); i++)
        {
            if (LoginStrategyController.doctorList.get(i).getId() == id)
            {
                LoginStrategyController.doctorList.remove(i);
            }
        }
        
        String fileName = "data.bin";
        
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            
            create.writeObject(LoginStrategyController.doctorList);
            
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
     * Removes secretary from list, and updates data.bin
     * 
     */
    public void removeSecretary(String id)
    {
        for (int i = 0; i < LoginStrategyController.secretaryList.size(); i++)
        {
            if (LoginStrategyController.secretaryList.get(i).getId() == id)
            {
                LoginStrategyController.secretaryList.remove(i);
            }
        }
        
        String fileName = "data.bin";
        
        try {
            ObjectOutputStream create = new ObjectOutputStream(new FileOutputStream(fileName));
            
            create.writeObject(LoginStrategyController.secretaryList);
            
            System.out.println("File written.");
            create.close();
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
            
            LoginStrategyController.secretaryList = (List) read.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(GUISimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Provide feedback to specific doctor
     * 
     */
    public void provideFeedback(Doctor doctor, String comment)
    {
        doctor.feedbackList.add(comment);
    }
    
}
