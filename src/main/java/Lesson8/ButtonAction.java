package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
   private JButton button;
    public ButtonAction(JButton button) {
        this.button = button;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Я нажата");

    }
}
