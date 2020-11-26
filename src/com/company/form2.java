package com.company;

import javax.swing.*;
import java.awt.*;
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
    private JPanel panel_a;
    private JPanel panel_b;
    private JPanel panel_c;
    private JPanel panel_d;
    private JPanel panel_e;
    private JPanel panel_f;
    private JPanel panel_g;

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
                button2.setPreferredSize(new Dimension(200,500));
                button3.setVisible(true);
                button3.setPreferredSize(new Dimension(200,500));
                button4.setVisible(true);
                button4.setPreferredSize(new Dimension(200,500));
                button5.setVisible(true);
                button5.setPreferredSize(new Dimension(200,500));
                button6.setVisible(true);
                button6.setPreferredSize(new Dimension(200,500));
                button7.setVisible(true);
                button7.setPreferredSize(new Dimension(200,500));
                button8.setVisible(true);
                button8.setPreferredSize(new Dimension(200,500));
                button9.setVisible(true);
                button9.setPreferredSize(new Dimension(200,500));
                panel_a.setVisible(false);
                panel_b.setVisible(false);
                panel_c.setVisible(false);
                panel_d.setVisible(false);
                panel_e.setVisible(false);
                panel_f.setVisible(false);
                panel_g.setVisible(false);


            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setVisible(false);
                panel_a.setVisible(true);



            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setVisible(false);
                panel_b.setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setVisible(false);
                panel_b.setVisible(true);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setVisible(false);
                panel_b.setVisible(true);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setVisible(false);
                panel_b.setVisible(true);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setVisible(false);
                panel_b.setVisible(true);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setVisible(false);
                panel_b.setVisible(true);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9.setVisible(false);
                panel_b.setVisible(true);
            }
        });
    }
}
