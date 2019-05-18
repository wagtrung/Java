/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltooctal;

//import java.util.LinkedList;

import java.util.Stack;


/**
 *
 * @author WagTrung
 */
public class undomain {

    public static void main(String[] args) {

        SpecialArray a = new SpecialArray(4); // create the array
        a.randomInit(4);

        System.out.println(" origin  ");
        a.display();

     
        System.out.println(" after update  ");
        a.update(0,99);
        a.display();
          System.out.println(" after update  ");
        a.update(1,99);
        a.display();
        
        
       
        a.undo();
        System.out.println("undo");
        a.display();
     
        
        
          
      

        
     
        
        
      
        }
    
 
    
        
        
        
        
        
        
        

//        LinkedList<String> linkedlist = new LinkedList<>();
//
//       /*add(String Element) is used for adding 
//        * the elements to the linked list*/
//       linkedlist.add("Item1");
//       linkedlist.add("Item5");
//       linkedlist.add("Item3");
//       linkedlist.add("Item6");
//       linkedlist.add("Item2");
//
//       
//        for (String all: linkedlist) {
//            System.out.print(all+" ");
//            
//        }
//        
    }

