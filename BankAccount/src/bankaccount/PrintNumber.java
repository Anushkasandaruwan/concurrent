/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anushkas
 */
public class PrintNumber extends Thread{

  
    public PrintNumber(String name) {
    super(name); 
    }
   
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+ "   "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }
    
}
