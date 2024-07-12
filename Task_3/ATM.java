import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 10000.0; 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance + " Rs.");
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                balance += amount;
                System.out.println("Deposit successful. Your new balance is: " + balance + " Rs.");
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful. Your new balance is: " + balance + " Rs.");
                } else {
                    System.out.println("Withdrawal failed. Insufficient funds.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
