import java.util.Scanner;

class Account {

    private String name;
    private int id;
    private double balance;

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = input.nextInt();

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.println("Account " + (i + 1));
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Balance: ");
            double balance = input.nextDouble();

            accounts[i] = new Account(name, id, balance);
        }

        int choice;

        do {
            System.out.println("\n1- Show All Accounts");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Search by ID");
            System.out.println("5- Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            if (choice == 1) {
                for (Account a : accounts)
                    a.displayInfo();
            }

            else if (choice == 2) {
                System.out.print("Enter ID: ");
                int searchId = input.nextInt();
                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();

                for (Account a : accounts) {
                    if (a.getId() == searchId) {
                        a.deposit(amount);
                        break;
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter ID: ");
                int searchId = input.nextInt();
                System.out.print("Enter withdraw amount: ");
                double amount = input.nextDouble();

                for (Account a : accounts) {
                    if (a.getId() == searchId) {
                        a.withdraw(amount);
                        break;
                    }
                }
            }

            else if (choice == 4) {
                System.out.print("Enter ID to search: ");
                int searchId = input.nextInt();
                boolean found = false;

                for (Account a : accounts) {
                    if (a.getId() == searchId) {
                        a.displayInfo();
                        found = true;
                        break;
                    }
                }

                if (!found)
                    System.out.println("Account not found.");
            }

        } while (choice != 5);

        input.close();
    }
}
