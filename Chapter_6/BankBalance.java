import java.util.Scanner;

class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        int choice = 1;
        int year = 1;
        final double INTEREST_RATE = 0.03;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();
        input.nextLine();

        while(choice == 1) {
            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                balance += (balance * INTEREST_RATE);
                System.out.println("After " + year + " year at 0.03 interest rate, balance is $" + balance + "\n");
                year++;
            }
        }
        input.close();
        System.exit(0);
    }
}