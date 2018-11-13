package libs;

import javax.swing.*;

public class NoPossibleNumberException extends Exception {
    public NoPossibleNumberException() {
        super();
    }

    public NoPossibleNumberException(String s) {
        super();
        JOptionPane.showMessageDialog(null, s);
    }

}
