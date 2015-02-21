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
public class BankAccount {

    
    private String id;
    private double balance;

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized double getBalance() {
        return balance;
    }
    
    public synchronized void withdraw(double amount){
     
         balance -= amount;
     
    }
    
    public synchronized void diposit(double amount){
         balance += amount;
    }

    public synchronized String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
   
    
    
}
