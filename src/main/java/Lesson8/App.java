package Lesson8;

import javax.lang.model.element.Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {
    private int counter = 0;
    public App() {
        setTitle("Мое первое оконное приложение");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300,300);
        setResizable(false);
        Font font = new Font("Arrial", Font.BOLD, 20);
        setLayout( new FlowLayout());

        JButton myButton = new JButton("Сгенерировать номера");
        myButton.setFont(font);
        add(myButton);

        TextField textField = new TextField("+375(29)000000");
        textField.setFont(font);
        add(textField);

        myButton.setText("0");



        //ButtonAction buttonAction = new ButtonAction(jButton);
        //jButton.addActionListener(buttonAction);

        myButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myButton.setText(generateTelephoneNumber());
            }
        }
        );
        myButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(generateTelephoneNumber());
                        System.out.println(textField.getText());
                    }
                }
        );

        setVisible(true);
    }

    public String generateTelephoneNumber (){
        Random random = new Random();

        String telephoneNumber = "";
        telephoneNumber += "+375";
        telephoneNumber += "29";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);

        return telephoneNumber;

    }
}
