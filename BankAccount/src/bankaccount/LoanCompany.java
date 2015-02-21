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
public class LoanCompany extends Thread{
     BankAccount account;
    public LoanCompany(BankAccount account) {
        super("LoanCompany");
        this.account = account;
    }
    
    public void run() {
        account.diposit(500);
        
         try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             ex.printStackTrace();
         }
         System.out.println(getName()+" deposits 500.Balance is "+account.getBalance());
    }
    
}
