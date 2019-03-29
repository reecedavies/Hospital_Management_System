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
public class Medicine {
    
    private String name;
    private String quantity;
    
    public Medicine()
    {
        name = "UKNOWN";
        quantity = "UKNOWN";
    }
    
    public Medicine(String name, String quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getQuantity()
    {
        return quantity;
    }
    
}
