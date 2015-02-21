/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 *
 * @author anushkas
 */
public class MyThread {
    public static void main(String[] args) {
        Thread t1 = new PrintNumber("t1");
        t1.setDaemon(true);
        t1.start();
        Thread t2 = new PrintNumber("t2");
         t2.setDaemon(true);
        t2.start();
        Thread t3 = new PrintNumber("t3");
        test();
         System.out.println("Input");
         Scanner sc =new Scanner(System.in);
         String str = sc.nextLine();
         t3.setDaemon(true);
         t3.start(); 
         
         
        
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("End of Programme");
    }
    
    public static void test(){
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread() +" "+i);
                }
//To change body of generated methods, choose Tools | Templates.
            }
        },"R1");
        t.start();
    }
}
