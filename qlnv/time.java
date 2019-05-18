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
public class time {
    public  int hour;
    private  int min;
    private  int se;
    
    public  void setTime(int a, int b, int c) {
        try{
    if((a>=0 && a<24) && (b>=0 && b< 60) && (c>=0 && c<60)){
       hour=a;
       min=b;
       se=c;
    }
    else
       throw new Exception();}
       catch(Exception e){
           System.out.println("sai ");
       }
    
    
   
            
}
   public String toU(){
       return hour+":"+min+":"+se;
       
       
   } 
    public String toS(){
       return String.format("%d:%02d:%03d %s",
               ((hour==0 || hour == 12)?12:hour%12),min,se,(hour<12)? "AM": "PM"              );
       
       
       
   } 
}
