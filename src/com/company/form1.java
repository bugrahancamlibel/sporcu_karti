package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel panel1;
    private JLabel adLabel;
    private JButton card1;
    private JButton card2;
    private JButton card3;
    private JButton card4;
    private JButton card5;
    private JButton card6;
    private JButton card7;
    private JButton card8;
    private JLabel isimGir;
    Kullanici kullanici = new Kullanici("19A82B1C"," ",0);

    public form1(){
        add(panel1);
        setSize(1600,1000);
        setTitle("Giriş Ekranı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        card1.setVisible(false);
        card2.setVisible(false);
        card3.setVisible(false);
        card4.setVisible(false);
        card5.setVisible(false);
        card6.setVisible(false);
        card7.setVisible(false);
        card8.setVisible(false);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                kullanici.setOyuncuAdi(textField1.getText());
                button1.setVisible(false);
                isimGir.setVisible(false);
                textField1.setVisible(false);
                //adLabel.setVisible(false);

                card1.setVisible(true);
                card2.setVisible(true);
                card3.setVisible(true);
                card4.setVisible(true);
                card5.setVisible(true);
                card6.setVisible(true);
                card7.setVisible(true);
                card8.setVisible(true);

                System.out.println("Kullanici adi:"+kullanici.getOyuncuAdi());

            }
        });
        card1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            card1.setVisible(false);
            }
        });
        card2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card2.setVisible(false);
            }
        });
    }
}
