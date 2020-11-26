package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame {


    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel panel2;

    public form2(){

        add(panel1);
        setSize(400,200);
        setTitle("Kart Oyunu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String giris;
                giris = textField1.getText();
                textField1.setVisible(false);
                button1.setVisible(false);
                button2.setVisible(true);
                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(true);
                button6.setVisible(true);
                button7.setVisible(true);
                button8.setVisible(true);
                button9.setVisible(true);


            }
        });
    }
}
