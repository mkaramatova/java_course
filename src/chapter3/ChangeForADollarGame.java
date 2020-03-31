package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of pennies:");
        int pennies = scanner.nextInt();
        System.out.println("Enter number of nickels:");
        int nickels = scanner.nextInt();
        System.out.println("Enter number of dimes:");
        int dimes = scanner.nextInt();
        System.out.println("Enter number of quarters:");
        int quarters = scanner.nextInt();

        scanner.close();

        int change = pennies * 1 + nickels * 5 + dimes * 10 + quarters * 25;

        if (change == 100) {
            System.out.println("You win!");
        }
        else if (change > 100) {
            System.out.println("You went over by " + (change - 100));
        }
        else {
            System.out.println("You went under by " + (100 - change));
        }


    }
}
