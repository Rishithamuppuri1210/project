import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.println("\nAccount details stored successfully!");

        while (true) {
            System.out.println("\n===== BANK ACCOUNT MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();
                balance = balance + amt;
                System.out.println("Amount deposited successfully.");
                System.out.println("Deposited Amount: " + amt);
                System.out.println("Current Balance: " + balance);

            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();
                if (amt <= balance) {
                    balance = balance - amt;
                    System.out.println("Amount withdrawn successfully.");
                    System.out.println("Withdrawn Amount: " + amt);
                    System.out.println("Current Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                    System.out.println("Current Balance: " + balance);
                }

            } else if (choice == 3) {
                System.out.println("\n--- ACCOUNT DETAILS ---");
                System.out.println("Account Number: " + accNo);
                System.out.println("Customer Name: " + name);
                System.out.println("Current Balance: " + balance);

            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}