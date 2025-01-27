
class BankAcc {
    private double balance;

    public BankAcc(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }
}


class ATM {
    private BankAcc account;

    public ATM(BankAcc account) {
        this.account = account;
    }

    public void withdraw(double amt) {
        if (amt > 0) {
            if (account.withdraw(amt)) {
                System.out.println("Withdrawal successful! Amount withdrawn: $" + amt);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void deposit(double amt) {
        if (amt > 0) {
            account.deposit(amt);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    public void start() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int option;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 4);

        scanner.close();
    }
}


public class ATMApp {
    public static void main(String[] args) {
        BankAcc userAccount = new BankAcc(1000); // Initialize account with a balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
