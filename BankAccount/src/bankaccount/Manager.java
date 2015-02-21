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
public class Manager extends Thread{
    BankAccount account;
     Manager(BankAccount account) {
        super("Manager");
        this.account = account;
    }
    
    public void run() {
        if(account.getBalance()<0){
            account.setBalance(account.getBalance()-50);
            System.out.println(getName()+" deduct 50 .Balance is "+account.getBalance());
            try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             ex.printStackTrace();
         }
        }
        System.out.println(getName()+"Check Balance .Balance is "+account.getBalance());
        try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             ex.printStackTrace();
         }
    } 
}
