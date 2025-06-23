package exceptionhandling;

//Custom Exception
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//BankAccount class
class BankAccount {
 private String accountHolder;
 private String accountNumber;
 private double balance;

 public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
     this.accountHolder = accountHolder;
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited ₹" + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance!");
     } else {
         balance -= amount;
         System.out.println("Withdrew ₹" + amount);
     }
 }

 public void displayAccountInfo() {
     System.out.println("\nAccount Holder: " + accountHolder);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: ₹" + balance);
 }
}

//Main class
public class BankDemo {
 public static void main(String[] args) {
     BankAccount account = new BankAccount("Nivedha", "ACC12345", 5000.00);

     account.displayAccountInfo();
     account.deposit(2000);

     try {
         account.withdraw(8000);  // trying to withdraw more than balance
     } catch (InsufficientBalanceException e) {
         System.out.println("Exception Caught: " + e.getMessage());
     }

     account.displayAccountInfo();
 }
}
