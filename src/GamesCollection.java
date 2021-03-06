import simplegames.GuessingGame2;
import utilities.PointerCoords;

import java.util.Scanner;

public class GamesCollection {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Welcome to the Java Games Collection\nChoose a game you want to play:");

        var selection = getGameSelection();
        System.out.println("selection = " + selection);

        switch (selection) {
            case 1:
                PointerCoords.run();
                break;
            case 2:
                GuessingGame2.run();
                break;
            default:
                System.out.println("Wrong selection!");
                break;

        }

    }

    private static int getGameSelection() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("1> Guessing Game");
        System.out.println("2> Guessing Game 2");
        selection = sc.nextInt();

        return selection;
    }
}
