/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategies;

import guis.AdminMainForm;
import guis.LoginForm;
import java.awt.event.WindowEvent;
import users.Admin;
import users.Patient;
import guis.PatientMainForm;

/**
 *
 * @author Reece
 */
public class PatientLoginStrategy {
    
    /**
     * Sets specific form relative to user
     *
     */
    public void login(Patient thisPatient, LoginForm thisForm) {
        // Sets new specified form
        PatientMainForm PatientInfo = new PatientMainForm(thisPatient);
        PatientInfo.setVisible(true);
        
        // Closes login form
        thisForm.setDefaultCloseOperation(PatientMainForm.DISPOSE_ON_CLOSE);
        thisForm.dispatchEvent(new WindowEvent(thisForm, WindowEvent.WINDOW_CLOSING));
    }
    
}
