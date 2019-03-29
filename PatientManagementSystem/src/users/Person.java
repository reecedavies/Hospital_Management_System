/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import controller.LoginStrategyController;
import java.io.Serializable;

/**
 *
 * @author Reece
 */
public abstract class Person implements Serializable {
    
    protected String name;
    protected String id;
    protected String password;
    
    protected String email;
    protected int age;
    protected String address;
    
    
    //protected void login(){};
    
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getEmail() {
        return email;
    }
    
}
