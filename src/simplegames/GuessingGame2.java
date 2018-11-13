package simplegames;

import libs.NoPossibleNumberException;

import javax.swing.*;

public class GuessingGame2 {
    public static void run() {

        int min = Integer.parseInt(JOptionPane.showInputDialog("Enter a minimum"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Enter a maximum"));
        int guess;
        int attempts = 0;
        boolean finished = false;

        JOptionPane.showMessageDialog(null, "Think of a number between " + min + " and " + max);

        try {
            do {
                System.out.println("min = " + min);
                System.out.println("max = " + max);

                guess = (int) (min + Math.floor(((float) (max - min) / 2.0)));
                attempts++;

                switch (JOptionPane.showConfirmDialog(null, "Is the number " + guess + " correct?\nPress Cancel if the guess is too big or No if it is too small.")) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "I guessed the number correctly with " + attempts + " attempts!");
                        finished = true;
                        break;
                    case 1:
                        min = guess + 1;
                        break;
                    case 2:
                        max = guess;
                        break;
                }

                if(max<min) throw new NoPossibleNumberException();

            } while (!finished);
        } catch (NoPossibleNumberException e) {
            JOptionPane.showMessageDialog(null,"Error! The range "+min+"-"+max+" is not possible!");
            e.printStackTrace();
        }
    }
}
