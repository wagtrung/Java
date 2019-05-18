/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author WagTrung
 */


public  class MyRetangle extends MyBoundedShape {
    
    private int h,w;
    
    public MyRetangle(int x,int y){
    h=y;
    w=x;
    }

   
    public double getArea() {
        
        return  h*w;
    }

    
    public void draw() {
        
        for (int i = 1; i <= w; i++) {
           
            for (int j = 1; j <= h; j++) {
                if ((j == 1) || (j == h) || (i == 1) || (i == w)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }

  

    }



