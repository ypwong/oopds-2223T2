import java.time.LocalDate;
import java.util.Scanner;

class Account {
  // data fields
  private int id;
  private double balance = 100;
  private LocalDate dateCreated = LocalDate.now();
  private static int numberOfAccount;
  // constructors
  public Account() { 
    numberOfAccount++;
  }
  public Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
    numberOfAccount++;
  }
  // accessors
  public int getId() {
    return id;
  }
  public double getBalance() {
    return balance;
  }
  public LocalDate getDateCreated() {
    return dateCreated;
  }
  public static int getNnumberOfAccount() {
    return numberOfAccount;
  }   
  // mutators
  public void withdraw(double amount) {
    if (amount < 0)
      System.out.println ("Error: Cannot withdraw negative amount");
    else if (amount > balance)
      System.out.println ("Error: Insufficient balance");
    else 
      balance -= amount;
  }
  public void deposit(double amount) {
    if (amount < 0)
      System.out.println ("Error: Cannot deposit negative amount");
    else
      balance += amount;
  }
}


class Q1 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);    

    Account[] accounts = new Account[3];
    accounts[0] = new Account();
    accounts[1] = new Account(102, 2000);

    System.out.println ("Create the 3rd account");
    System.out.print ("Enter account id: ");
    int accountId = input.nextInt();
    System.out.print ("Enter balance   : RM");
    double balance = input.nextDouble();
    accounts[2] = new Account(accountId, balance);
    
    for (int i = 0; i < accounts.length; i++) {
      System.out.println ();
      System.out.println ("Account #" + (i+1));
      System.out.println ("Account id = " + accounts[i].getId());
      System.out.println ("Created    = " + accounts[i].getDateCreated());
      System.out.printf  ("Balance    = RM%.2f%n", accounts[i].getBalance());
    }
    
    System.out.printf ("%nDepost and Withdraw%n");
    System.out.print ("Enter account id: ");
    accountId = input.nextInt();

    Account selectedAccount = search (accounts, accountId);

    if (selectedAccount == null)
      System.out.print ("Account not found.");
    else {
      System.out.print  ("Enter amount to deposit: RM");
      double amount = input.nextDouble();
      selectedAccount.deposit (amount);
      System.out.printf ("Balance                = RM%.2f%n", selectedAccount.getBalance());

      System.out.print  ("Enter amount to withdraw: RM");
      amount = input.nextDouble();
      selectedAccount.withdraw (amount);
      System.out.printf ("Balance                 = RM%.2f%n", selectedAccount.getBalance());
    }
  }

  public static Account search (Account[] accounts, int accountId) {
    for (Account a: accounts) 
      if (a.getId() == accountId)
        return a;
    return null;
  }
}
