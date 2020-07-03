/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao2;

import java.util.Scanner;
public class Conversao2 {


    public static void main(String[] args) {
      
       double c, f;
       c = 10;
       
       
       while(c <= 100){
           
        f = (c * 9) / 5 + 32;
       System.out.println(f);
       c = c + 10;
       
        }
    }
}
