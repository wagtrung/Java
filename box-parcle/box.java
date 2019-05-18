/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;

/**
 *
 * @author WagTrung
 */
public class box {

    private int width, height, nP;
    private particle[] P;

    public box(int width, int height) //contructor box
    {
        this.width = width;
        this.height = height;

        nP = 0;
        P = new particle[1000];
        addP();
        addP();
        addP();
    }

    public void addP() {///menthod to create random spot for particles
        Random ran = new Random();
        int px = ran.nextInt(width);
        int py = ran.nextInt(height);
        P[nP] = new particle(px, py);
        nP++;
    }

    public void showP() {
        for (int i = 0; i < nP; i++) {
            P[i].getx();

        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public enum direction{
         North ,North_East ,East ,South_East,South ,South_West ,West ,North_West ;}
    public void move(particle A){
         String vi="dung yen";
     switch (vi) {
       case direction.North:
           System.out.println(A.gety--);
           break;
      
       default:
           System.out.println(day);
       }
       
    
    }
    }
    
    
    
    
    
}
 