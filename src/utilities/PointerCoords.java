package utilities;

import libs.CustomFrame;

import java.awt.*;

public class PointerCoords extends CustomFrame {
    private Label text;

    private PointerCoords(String title, int width, int height) {
        super(title, width, height);
        text = new Label("Initializing");
        text.setAlignment(Label.CENTER);
        add(text);
    }


    public static void run() throws InterruptedException {
        PointerCoords guessingFrame = new PointerCoords("Mouse Coordinates", 300, 100);
        Thread.sleep(5000);
//        int count = 0;
        double x;
        double y;
        //noinspection InfiniteLoopStatement
        while (true) {
            x = MouseInfo.getPointerInfo().getLocation().getX();
            y = MouseInfo.getPointerInfo().getLocation().getY();
            guessingFrame.text.setText("X: " + x + "   Y: " + y);
            Thread.sleep(17);
        }
    }
}

