/*
    Author: Krishna Thakar
    Date: 8/30/2022
    Purpose: to make a bank account and a functionality to deposit or withdraw some amount
*/
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterestRate());
        System.out.println("The account was created on " + account.getDateCreated());
    }
}