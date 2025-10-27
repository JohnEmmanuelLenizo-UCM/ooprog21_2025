import java.util.Scanner;

class BankBalanceByRateAndYear {
    public static void main(String[] a) {
        double initialBalance, balance;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        initialBalance = input.nextInt();
        input.nextLine();

        for (double interestRate = 0.02; interestRate <= 0.05; interestRate += 0.01) {
            balance = initialBalance;
            System.out.println("\nWith an initial balance of $" + initialBalance + " at an interest rate of " + interestRate);
            for (int year = 1; year <= 4; year++) {
                balance += balance * interestRate;
                System.out.println("After year " + year + " balance is $" + balance);
            }
        }
    }
}
