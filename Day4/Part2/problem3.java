import java.util.Scanner;

class BankAccount {
    private static int accountCounter = 1000;
    private String name;
    private String address;
    private String typeOfAccount;
    private double balance;
    private int numberOfTransactions;

    public BankAccount(String n, String addr, String type, double bal) {
        name = n;
        address = addr;
        typeOfAccount = type;
        balance = bal;
        numberOfTransactions = 0;
    }

    public void generateAccountNumber() {
        System.out.println("Account Number: BA" + accountCounter++);
    }

    public void displayInfoAndBalance() {
        System.out.println("Name: " + name + "\tAddress: " + address + "\tType of Account: " + typeOfAccount);
        System.out.println("Balance: $" + balance + "\tNumber of Transactions: " + numberOfTransactions);
    }

    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numberOfDepositors = scanner.nextInt();

        BankAccount[] accounts = new BankAccount[numberOfDepositors];

        for (int i = 0; i < numberOfDepositors; i++) {
            scanner.nextLine(); // consume the newline character
            System.out.print("Enter name for depositor " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter address for depositor " + (i + 1) + ": ");
            String address = scanner.nextLine();
            System.out.print("Enter type of account for depositor " + (i + 1) + ": ");
            String typeOfAccount = scanner.nextLine();
            System.out.print("Enter balance for depositor " + (i + 1) + ": ");
            double balance = scanner.nextDouble();

            accounts[i] = new BankAccount(name, address, typeOfAccount, balance);
        }

        System.out.println("\nOperations on Bank Accounts:");

        // Operation 1: Display information of any depositor
        System.out.println("\n1. Display Information of Depositor");
        System.out.print("Enter the depositor number to display information: ");
        int depositorNumber = scanner.nextInt();
        accounts[depositorNumber - 1].generateAccountNumber();
        accounts[depositorNumber - 1].displayInfoAndBalance();

        // Operation 2: Deposit some amount to the account of any depositor and then display final information
        System.out.println("\n2. Deposit Amount to Account");
        System.out.print("Enter the depositor number to deposit amount: ");
        depositorNumber = scanner.nextInt();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        accounts[depositorNumber - 1].deposit(depositAmount);
        accounts[depositorNumber - 1].displayInfoAndBalance();

        // Operation 3: Withdraw some amount from the account of any depositor and then display final information
        System.out.println("\n3. Withdraw Amount from Account");
        System.out.print("Enter the depositor number to withdraw amount: ");
        depositorNumber = scanner.nextInt();
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        accounts[depositorNumber - 1].withdraw(withdrawAmount);
        accounts[depositorNumber - 1].displayInfoAndBalance();

        // Operation 4: Change the address of any depositor and then display final information
        System.out.println("\n4. Change Address of Depositor");
        System.out.print("Enter the depositor number to change address: ");
        depositorNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter the new address: ");
        String newAddress = scanner.nextLine();
        accounts[depositorNumber - 1].changeAddress(newAddress);
        accounts[depositorNumber - 1].displayInfoAndBalance();

        // Operation 5: Randomly repeat these processes for some other bank accounts and print the total number of transactions
        System.out.println("\n5. Random Operations on Bank Accounts");
        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            int randomOperation = (int) (Math.random() * 3) + 1;
            double randomAmount = Math.random() * 1000;

            switch (randomOperation) {
                case 1:
                    account.deposit(randomAmount);
                    break;
                case 2:
                    account.withdraw(randomAmount);
                    break;
                case 3:
                    account.changeAddress("New Address");
                    break;
            }
            totalTransactions += account.numberOfTransactions;
        }

        System.out.println("\nTotal Number of Transactions are: " + totalTransactions);
    }
}
