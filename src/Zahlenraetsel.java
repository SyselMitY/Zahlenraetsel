import javax.swing.*;

public class Zahlenraetsel {
    public static void main(String[] args) {

        int min = Integer.parseInt(JOptionPane.showInputDialog("Gib ein Minimum ein"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Gib ein Maximum ein"));
        int guess;
        int attempts = 0;
        boolean finished = false;

        JOptionPane.showMessageDialog(null, "Denk dir eine zufällige Zahl zwischen " + min + " und " + max + " aus.");

        do {
            System.out.println("min = " + min);
            System.out.println("max = " + max);

            guess = (int) (min + Math.floor(((float)(max-min)/2.0)));
            attempts++;

            switch (JOptionPane.showConfirmDialog(null, "Ist die Zahl " + guess + " richtig?\nBei zu großer Zahl auf Cancel, sonst auf No drücken.")) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ich habe die Zahl mit " + attempts + " Versuchen erraten!");
                    finished = true;
                    break;
                case 1:
                    min = guess+1;
                    break;
                case 2:
                    max = guess;
                    break;
            }

        } while (!finished);
    }
}
