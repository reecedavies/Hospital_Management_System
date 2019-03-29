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

/**
 *
 * @author Reece
 */
public class AdminLoginStrategy {
    
    /**
     * Sets specific form relative to user
     * 
     */
    public void login(Admin thisAdmin, LoginForm thisForm) {
        // Sets new specified form
        AdminMainForm AdminInfo = new AdminMainForm(thisAdmin);
        AdminInfo.setVisible(true);
        
        // Closes login form
        thisForm.setDefaultCloseOperation(AdminMainForm.DISPOSE_ON_CLOSE);
        thisForm.dispatchEvent(new WindowEvent(thisForm, WindowEvent.WINDOW_CLOSING));
    }
    
}
