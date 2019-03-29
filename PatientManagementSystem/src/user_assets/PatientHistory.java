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
public class PatientHistory {
    
    private String date;
    private String comment;
    
    public PatientHistory ()
    {
        date = "UKNOWN";
        comment = "UKNOWN";
    }
    
    public PatientHistory (String date, String comment)
    {
        this.date = date;
        this.comment = comment;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getComment() {
        return comment;
    }
    
}
