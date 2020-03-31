package chapter3;

import java.util.Scanner;

public class LogicalOperatorsLoanQualifier {

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
        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify!");
        }
        else{
            System.out.println("Sorry, you don't qualify.");
        }

    }
}
