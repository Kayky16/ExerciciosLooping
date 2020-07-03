/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia2;

import java.util.Scanner;
public class Potencia2 {

    public static void main(String[] args) {
 
        int p;
        p = 1;
        
        do
        {
            double po = Math.pow(3, p);
            System.out.println(" " + po);
            p = p + 1;    
        }while(p <= 15);
                
    }
    
}
