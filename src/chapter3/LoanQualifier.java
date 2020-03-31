package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        //known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get unknown values
        System.out.println("Enter salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter years:");
        double years = scanner.nextDouble();
        scanner.close();

        //decision - output
        if (salary >= requiredSalary) {
            if(years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify!");
            }
            else {
                System.out.println("Sorry, you must have worked for " + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least " + requiredSalary + " to qualify.");
        }

    }
}
