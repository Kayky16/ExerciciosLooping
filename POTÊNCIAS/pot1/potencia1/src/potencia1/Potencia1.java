/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia1;

import java.util.Scanner;
public class Potencia1 {

    public static void main(String[] args) {
        
        Scanner entrada = null;
        
        int p;
        int po=3;
        
        for(p = 1; p<=15 ; p += 1)
        {
            po = po*3;
            System.out.println(" " + po);   
        }
        
    }
    
}
