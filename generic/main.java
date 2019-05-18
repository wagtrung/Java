/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypair;

/**
 *
 * @author WagTrung
 */
public class main {

    public static void main(String[] args) {
        MyPair< String, Integer> entry1 = new MyPair< String, Integer>("Anders", 13);
        
  

        MyPair< String, Double> entry2 = new MyPair< String, Double>("Phoenix", 39.7);
        System.out.println(entry1);
        System.out.println(entry2);
///////
        MyPair<String, Double>[] grade = new MyPair[5];
        grade[0] = new MyPair<String, Double>("ghgj", 4.9);
        grade[1] = new MyPair<String, Double>("MMMjhkjMM", 8.2);
        grade[2] = new MyPair<String, Double>("ghhik", 9.2);
        
        for (MyPair<String, Double> grades : grade) {
            System.out.println(grades);
        }
///////

  MyPair<Integer, Integer> first = new MyPair<Integer, Integer>(1000, 2000);

        MyPair<MyPair<Integer, Integer>, String> appointment = 
                     new MyPair<MyPair<Integer, Integer>, String>(
                                first , "Mian");
        System.out.println(appointment);
        System.out.println(appointment.Fst.Snd.getClass());

        
        
       
        }
        
        
        
    }
    
    

