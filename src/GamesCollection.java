import simplegames.GuessingGame2;

import java.util.Scanner;

public class GamesCollection {

    public static void main(String[] args) {


        System.out.println("Welcome to the Java Games Collection\nChoose a game you want to play:");

        var selection = getGameSelection();
        System.out.println("selection = " + selection);

        switch (selection) {
            case 1:
                System.out.println("Game not implemented yet!");
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
