package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {

        int totalSpaces = 20;
        int currentSpace = 0;
        int totalDiceRolls = 5;

        Random ran = new Random();


        for (int i = 0; i < totalDiceRolls; i++) {
            int diceRoll = ran.nextInt(6) + 1;

            currentSpace += diceRoll;

            if (currentSpace == 20) {
                System.out.println("You win!");
                break;
            }
            else if (currentSpace < 20) {
                System.out.println("You are on space " + currentSpace);
                System.out.println("You need to advance " + (totalSpaces - currentSpace) + " spaces to win");
            }
            else {
                System.out.println("You lose!");
            }
        }

        if (currentSpace < totalSpaces) {
            System.out.println("You lose!");
        }
    }
}
