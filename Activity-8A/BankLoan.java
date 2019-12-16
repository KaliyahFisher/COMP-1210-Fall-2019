/**
 * This file manages bank loan transactions.
 *@author Kaffeein Bellamy
 *@version 10/21/2019
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private static int loansCreated = 0;
   private double balance, interestRate;
   
   /**
    *@return loansCreated counts loans
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    *This method resets the loan counter.
    */   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   /**
    *@param amount is checked
    *@return checks if loan is valid
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /**
    *@param loan is checked
    *@return checks if customer is in Debt
    */   
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**
    *@param customerNameIn feeds customer name
    *@param interestRateIn feeds interest rate
    */   
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    *@param amount is checked
    *@return wasLoanMade checks if customer borrowed
    */   
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    *@param amountPaid is the payment in dollars
    *@return balance is the new balance
    */   
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    *@return balance is the amount left to pay
    */      
   public double getBalance() {
      return balance;
   }
   /**
    *@param interestRateIn feeds interestRate
    *@return checks if interest rate is valid
    */      
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    *@return interestRate fetches interest rate
    */         
   public double getInterestRate() {
      return interestRate;
   }
   /**
    *Gives the interest charged.
    */         
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    *@return output formats the numbers with text
    */         
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
