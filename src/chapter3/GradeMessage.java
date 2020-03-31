package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade) {
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Great";
                break;
            case "C":
                message = "Good";
                break;
            case "D":
                message = "Try harder";
                break;
            case "F":
                message = "Uh oh";
                break;
            default:
                message = "Error";
                break;
        }

        System.out.println(message);
    }
}
