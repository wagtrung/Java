/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

import java.text.ParseException;

import java.util.Date;

/**
 *
 * @author WagTrung
 */
public class Room implements Comparable<Room>{

    int nroom;
    double proom;
    
    public Room(int a, double b){
        nroom=a;
        proom=b;
        
     
    }

    public int getNroom() {
        return nroom;
    }

    public void setNroom(int nroom) {
        this.nroom = nroom;
    }

    public double getProom() {
        return proom;
    }

    public void setProom(double proom) {
        this.proom = proom;
    }
    
    
    public void Check_in(Date checkinDate) throws ParseException
    {
        
    }
    
    public void Check_out(Date checkoutDate)
    {
       
        System.out.println("All price is:" +getProom());
    }
    
    @Override
	public int compareTo(Room o) {
		if(this.proom > o.getProom())
			return 1;
		else if (this.proom < o.getProom())
			return -1;
		else return 0;
	}
    
    @Override
    public  String toString(){
        return String.format("number of rooms: %s \nprice of room: %s USD",getNroom(),getProom());
    }

    public void lSer(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
