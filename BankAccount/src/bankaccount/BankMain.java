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
public class BankMain {
    public static void main(String[] args) {
       BankAccount bankAccount = new BankAccount();
       Thread student =  new Student(bankAccount);
       Thread manager =  new Manager(bankAccount);
       Thread loanCompany =  new LoanCompany(bankAccount);
       Thread granny =  new Granny(bankAccount);
       
       
      
       manager.start();
       
       student.start();
       granny.start();
       loanCompany.start();

    }
  
}
