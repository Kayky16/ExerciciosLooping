/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao3;
import java.util.Scanner;
public class Conversao3 {

    public static void main(String[] args) {
        
        int c;
        c = 10;
        int f;
        
        do{
        f = (c * 9) / 5 + 32;
        System.out.println(f);
        c = c + 10;
        }while(c <=100);
   
    }   
}
