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
public class Student extends Thread{

    BankAccount account;
   Student(BankAccount account) {
        super("Student");
        this.account = account;
    }

   
    
    public void run() {
        account.withdraw(600);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(getName()+"withdrows 600.Balance is "+account.getBalance());
    }
}
