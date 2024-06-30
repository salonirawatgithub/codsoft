import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("AutomaticTellerMachine Menu:");
        System.out.println("1.for Checking Balance");
        System.out.println("2.for  Deposit a amount");
        System.out.println("3.for Withdraw a amount");
        System.out.println("4. Exit");
    }

    public void run() 
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Current balance: $" + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = sc.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = sc.nextDouble();
                    boolean withdrawSuccess = bankAccount.withdraw(withdrawalAmount);
                    if (withdrawSuccess){
                        System.out.println("Withdrawal successful."+bankAccount.getBalance());
                    }else{
                        System.out.println("insufficient balance");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. ");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
    }
}

public class AtmInterface
{
    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(5000.0); // Initial balance is $1000
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}