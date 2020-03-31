package chapter3;

import java.util.Scanner;

/*
If Statement
Salespeople
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //bonus
        if (sales > quota) {
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee's salary is $" + salary);
    }
}
