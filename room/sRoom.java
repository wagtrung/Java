/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

import java.util.Date;

/**
 *
 * @author WagTrung
 */
public class sRoom extends Room{
    
    private int nRide;
    
    public sRoom(int a, double b) {
        super(a, b);
        
    }
    
    @Override
    public void lSer(int a){
        nRide=a;
    }
    
    
    
    @Override
 public double getProom(){
        return proom+getnRide()*50;
    }
    @Override
 public void Check_out(Date checkoutDate)
    {
       
        System.out.println("All price is:" +getProom());
    }
    
    @Override
    public String toString(){
        return String.format("num of Special Room is: %s \nPrice of room(including %s limoussine service) is: %s USD ", getNroom(),getnRide(),getProom());
    }

    public int getnRide() {
        return nRide;
    }
    
}
