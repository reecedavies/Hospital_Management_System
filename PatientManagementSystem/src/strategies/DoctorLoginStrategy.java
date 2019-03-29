/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategies;

import guis.DoctorMainForm;
import guis.LoginForm;
import java.awt.event.WindowEvent;
import users.Doctor;


/**
 *
 * @author Reece
 */
public class DoctorLoginStrategy {
    
    /**
     * Sets specific form relative to user
     * 
     */
    public void login(Doctor thisDoctor, LoginForm thisForm) {
        // Sets new specified form
        DoctorMainForm DoctorInfo = new DoctorMainForm(thisDoctor);
        DoctorInfo.setVisible(true);
        
        // Closes login form
        thisForm.setDefaultCloseOperation(DoctorMainForm.DISPOSE_ON_CLOSE);
        thisForm.dispatchEvent(new WindowEvent(thisForm, WindowEvent.WINDOW_CLOSING));
    }
    
}
