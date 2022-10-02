import java.util.Date;

public class Account {
       private static double rate;
       private static double newRate;
       private final double annualInterestRate = 0;
       private final Date dateCreated = new Date();
       private int id;
       private double balance;

       public Account(int id, double balance) {
              this.id = id;
              this.balance = balance;
       }

       public static double getMonthlyInterestRate() {   //it divides annual intrest rate by 12 to get the monthly rate.
              newRate = rate / 12;
              return newRate;
       }

       public int getId() {
              return id;
       }
       public void setId(int n) {
              id = n;
       }
       public Date getDateCreated() {   //getter for date
              return dateCreated;
       }

       public double getBalance() {
              return balance;
       } //getter for balance
       public void setBalance(double finalBalance) {  //setter for balance
       }
       public double getAnnualInterestRate() {
              return rate;
       } //getter for annual interest rate.

       public static void setAnnualInterestRate(double interest) {
              rate = interest;
       } //setter for annual intrest rate.

       /*
        Brief statement of Purpose: to withdraw amount from the account
        Preconditions: withAmount - the required amount to subtract from account
        Postconditions: it updates the account with new balance after withdrawal
       */
       public void withdraw(double withAmount) {
              this.balance = this.balance - withAmount;
       }

       /*
        Brief statement of Purpose: to deposit some amount in the account
        Preconditions: depAmount - the required amount to add to the account
        Postconditions: it updates the account with new balance after withdrawal
       */
       public void deposit(double depAmount) {
              this.balance = this.balance + depAmount;
       }
}

