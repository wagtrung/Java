/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author WagTrung
 */
public class Items {
    
    private String serialNumber;
    private double price;
    ItemSpec c;
    
    public Items(String serialNumber, double price, String description, String manufactures, String material,String origin) {
        
        this.serialNumber = serialNumber;
        this.price = price;
        this.c = new ItemSpec(description, manufactures, material,origin);
        
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

@Override
    public String toString() {
        return "serial number " +serialNumber + "\nprice " + price + c.toString();

    }
    
   


}
