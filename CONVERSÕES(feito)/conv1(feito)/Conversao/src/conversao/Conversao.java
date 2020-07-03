/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;

import java.util.Scanner;
public class Conversao {

    public static void main(String[] args) {

        Scanner entrada = null;
        
        double f, c;
        
        for(c = 10; c <= 100; c +=10){
            
            f = (c * 9) / 5 + 32;
            System.out.println(" " + f);
            
        }
    }  
}
    

