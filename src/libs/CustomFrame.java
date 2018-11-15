package libs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class CustomFrame extends Frame {

    public CustomFrame(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        addWindowListener(new CustomFrameWindowListener());
        setVisible(true);
    }

    public CustomFrame(String title) {
        this(title, 600, 400);
    }

    public CustomFrame() {
        this("Custom Frame");
    }


    private class CustomFrameWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            e.getWindow().dispose();
            System.exit(0);
        }
    }
}