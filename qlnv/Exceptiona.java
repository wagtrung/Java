/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiaiia;

/**
 *
 * @author WagTrung
 */
public class Exceptiona extends Exception{
    String bb;
    public Exceptiona(String aa) {
        bb=aa;
    }
    
    @Override
    public String getMessage() {
        return bb+super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
