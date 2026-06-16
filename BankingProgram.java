import java.util.Scanner;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("--------------------------");
            System.out.println("     BANKING PROGRAM      ");
            System.out.println("--------------------------");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("--------------------------");
            System.out.println("Enter your choice(1-4):");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance+=Deposit();
                case 3 -> balance-=withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.println("----------------------------");
        System.out.printf("$%.2f", balance);
    }


    static double Deposit() {
        System.out.println("Enter your deposit amount:");
        double amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;

        } else {
            return amount;
        }
    }


    static double withdraw(double balance) {
        System.out.println("how much amount do you want to withdraw?");

        double amt = sc.nextDouble();

        if (amt < 0) {
            System.out.println("amount can't be negative");
            return 0;
        } else if (amt > balance) {
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        } else {
            System.out.println("Amount withdrawn= " + amt);
            System.out.println("Balance left=" + (balance-amt));
            return amt;
        }
    }
}





















