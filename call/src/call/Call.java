/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call;

/**
 *
 * @author WagTrung
 */
public class Call {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node u= new Node();
       
       u.x=2;
        Node uu=new Node();
    uu=u;
    uu.x=3;
       
        
      
          System.out.println(u.x);
        

    }
    
   
    
}

class Node{
int x=0;
Node y;

}
