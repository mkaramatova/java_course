package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //known values
        int quota = 10;

        //get unknown values
        System.out.println("Enter the number of sales this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //decision - output
        if (sales >= quota) {
            System.out.println("Congrats! You met your quota!");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You didn't meet your quota. You were " + salesShort + " sales short.");
        }

    }
}
