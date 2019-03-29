/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_assets;

import users.Patient;

/**
 *
 * @author Reece
 */
public class DoctorRating {
    
    private int rating;
    private String comment;
    private Patient patient;
    
    public DoctorRating ()
    {
        rating = 0;
        comment = "NO COMMENT";
        patient = null;
    }
    
    public DoctorRating (int rating, String comment, Patient patient)
    {
        this.rating = rating;
        this.comment = comment;
        this.patient = patient;
    }
    
    public Integer getRating ()
    {
        return rating;
    }
    
    public String getComment ()
    {
        return comment;
    }
    
    public String getPatient()
    {
        return patient.getId();
    }
    
}
