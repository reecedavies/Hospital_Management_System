/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_assets;

/**
 *
 * @author Reece
 */
public class RequestedPatient {
    
    private String name;
    private String email;
    private int age;
    private String address;
    
    public RequestedPatient ()
    {
        name = "UKNOWN";
        email = "UKNOWN";
        age = 0;
        address = "UKNOWN";
    }
    
    public RequestedPatient (String name, String email, int age, String address)
    {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getAddress()
    {
        return address;
    }
    
}
