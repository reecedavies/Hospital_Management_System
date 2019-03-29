/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategies;

import users.Admin;

/**
 *
 * @author Reece
 */
public interface LoginStrategy {
    
    // Method to be overridden by subclasses
    void login(Admin thisAdmin);
    
}
