package simplegames;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuessingGame extends Frame {
    private Label text;

    private GuessingGame() {
        setTitle("Guessing Game");
        setSize(400, 100);
        addWindowListener(new GuessingGameWindowListener());
        text = new Label("Philip Daxi");
        text.setAlignment(Label.CENTER);
        add(text);
        setVisible(true);
    }


    class GuessingGameWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            e.getWindow().dispose();
            System.exit(0);
        }
    }

    public static void run() throws InterruptedException {
        GuessingGame guessingFrame = new GuessingGame();
        Thread.sleep(5000);
//        int count = 0;
        double x;
        double y;
        //noinspection InfiniteLoopStatement
        while (true) {
            x = MouseInfo.getPointerInfo().getLocation().getX();
            y = MouseInfo.getPointerInfo().getLocation().getY();
            guessingFrame.text.setText("X: " + x + "   Y: " + y);
        }
    }
}

