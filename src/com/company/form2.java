package com.company;


 import javax.swing.*;
 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
 import java.util.ArrayList;

public class form2 extends Main {

    protected JPanel panel1;
    protected JTextField textField1;
    protected JButton button1;
    protected JButton button2;
    protected JButton button3;
    protected JButton button4;
    protected JButton button5;
    protected JButton button6;
    protected JButton button7;
    protected JButton button8;
    protected JButton button9;
    protected JPanel panel2;
    protected JPanel panel_a;
    protected JPanel panel_b;
    protected JPanel panel_c;
    protected JPanel panel_d;
    protected JPanel panel_e;
    protected JPanel panel_f;
    protected JPanel panel_g;
    protected JButton button10;
    protected JButton button11;
    protected JButton button12;
    protected JButton button13;
    protected JButton button14;
    protected JButton button15;
    protected JButton button16;
    protected JButton button17;
    protected JButton button18;
    protected JButton button19;


    public form2(ArrayList sorted_photos) {


        add(panel1);
        setSize(1920,1080);
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
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button13.setVisible(false);
        button14.setVisible(false);
        button15.setVisible(false);
        button16.setVisible(false);
        button17.setVisible(false);
        button18.setVisible(false);
        button19.setVisible(false);



        button2.setPreferredSize(new Dimension(200,300));
        button3.setPreferredSize(new Dimension(200,300));
        button4.setPreferredSize(new Dimension(200,300));
        button5.setPreferredSize(new Dimension(200,300));
        button6.setPreferredSize(new Dimension(200,300));
        button7.setPreferredSize(new Dimension(200,300));
        button8.setPreferredSize(new Dimension(200, 300));
        button9.setPreferredSize(new Dimension(200,300));
        button10.setPreferredSize(new Dimension(200,300));
        button11.setPreferredSize(new Dimension(200,300));
        button12.setPreferredSize(new Dimension(200,300));
        button13.setPreferredSize(new Dimension(200,300));
        button14.setPreferredSize(new Dimension(200,300));
        button15.setPreferredSize(new Dimension(200,300));
        button16.setPreferredSize(new Dimension(200,300));
        button17.setPreferredSize(new Dimension(200,300));
        button18.setPreferredSize(new Dimension(200,300));
        button19.setPreferredSize(new Dimension(200,300));



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
                button10.setVisible(true);
                button11.setVisible(true);
                button12.setVisible(true);
                button13.setVisible(true);

                button14.setVisible(true);
                button15.setVisible(true);
                button16.setVisible(true);
                button17.setVisible(true);

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
                button18.setVisible(true);
                button19.setVisible(true);

                button10.setVisible(false);

                Image img1 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(0)))).getImage();
                button18.setIcon(new ImageIcon(img1));


            }
        });

        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button18.setVisible(false);
                button19.setVisible(false);
            }
        });



        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button11.setVisible(false);
            }
        });


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button12.setVisible(false);

                Image img1 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(1)))).getImage();
                button18.setIcon(new ImageIcon(img1));
            }
        });


        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button13.setVisible(false);
            }
        });


        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button14.setVisible(false);

                Image img1 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(2)))).getImage();
                button18.setIcon(new ImageIcon(img1));
            }
        });


        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button15.setVisible(false);
            }
        });


        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button16.setVisible(false);

                Image img1 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(3)))).getImage();
                button18.setIcon(new ImageIcon(img1));
            }
        });


        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9.setVisible(false);
                panel_b.setVisible(true);
                button18.setVisible(true);
                button19.setVisible(true);

                button17.setVisible(false);
            }
        });

    }

}