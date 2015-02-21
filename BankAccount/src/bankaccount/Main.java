/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author anushkas 
 */
public class Main {
     public static void main(String[] args) {
          System.out.println("Input");
         Scanner sc =new Scanner(System.in);
         String str = sc.nextLine();
         
         
        
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("End of Programme");
    }
}
