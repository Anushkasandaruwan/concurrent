/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author anushkas
 */
public class Granny extends Thread{
   BankAccount account;
     Granny(BankAccount account) {
        super("Granny");
        this.account = account;
    }
    
    public void run() {
        
        account.diposit(200);
        
        try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             ex.printStackTrace();
         }
        System.out.println("Garnny deposits 200.Balance is "+account.getBalance());
    }  
}
