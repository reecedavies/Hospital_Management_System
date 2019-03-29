/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategies;

import guis.AdminMainForm;
import guis.LoginForm;
import guis.SecretaryMainForm;
import java.awt.event.WindowEvent;
import users.Admin;
import users.Secretary;

/**
 *
 * @author Reece
 */
public class SecretaryLoginStrategy {
    
    /**
     * Sets specific form relative to user
     * 
     */
    public void login(Secretary thisSecretary, LoginForm thisForm) {
        // Sets new specified form
        SecretaryMainForm SecretaryInfo = new SecretaryMainForm(thisSecretary);
        SecretaryInfo.setVisible(true);
        
        // Closes login form
        thisForm.setDefaultCloseOperation(SecretaryMainForm.DISPOSE_ON_CLOSE);
        thisForm.dispatchEvent(new WindowEvent(thisForm, WindowEvent.WINDOW_CLOSING));
    }
    
}
