package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {

    private JButton button1;
    private JPanel panel1;
    private JTextField isimField;

    public form1(){
        add(panel1);
        setSize(1000,800);
        setTitle("sporcu kartı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yazin: "+ isimField.getText());
            }
        });
    }
}
