package com.company;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeNonElement;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main extends JFrame{

    public static void main(String[] args) {



        ArrayList<Futbolcu> futbolcuList = new ArrayList<Futbolcu>();
        ArrayList<Sporcu> basketbolcuList = new ArrayList<Sporcu>();

        // Futbolcu kartlari.
        Futbolcu futbolcu1 = new Futbolcu("MESSI", "BARCELONA", 95, 90, 99);
        Futbolcu futbolcu2 = new Futbolcu("RONALDO", "JUVENTUS", 95, 90, 99);
        Futbolcu futbolcu3 = new Futbolcu("DE BRUYNE", "MANCHESTER CITY", 85, 95, 85);
        Futbolcu futbolcu4 = new Futbolcu("NEYMAR", "PSG", 96, 90, 90);
        Futbolcu futbolcu5 = new Futbolcu("IBRAHIMOVIC", "MILAN AC", 85, 80, 85);
        Futbolcu futbolcu6 = new Futbolcu("E.HAALAND", "BORUSSIA DORTMUND", 94, 75, 95);
        Futbolcu futbolcu7 = new Futbolcu("LEWANDOWSKI", "BAYERN MUNCHEN", 95, 80, 98);
        Futbolcu futbolcu8 = new Futbolcu("MBAPPE", "PSG", 95, 85, 97);

        futbolcuList.add(futbolcu1);
        futbolcuList.add(futbolcu2);
        futbolcuList.add(futbolcu3);
        futbolcuList.add(futbolcu4);
        futbolcuList.add(futbolcu5);
        futbolcuList.add(futbolcu6);
        futbolcuList.add(futbolcu7);
        futbolcuList.add(futbolcu8);

        Basketbolcu lebronjames = new Basketbolcu("Lebron James", " Los Angeles Lakers", 89, 84, 70);
        Basketbolcu giannisantetokounmpo = new Basketbolcu("Giannis Antetokounmpo", " Milwaukee Bucks", 89, 84, 70);
        Basketbolcu kawhileonard = new Basketbolcu("Kawhi Leonard", " Los Angeles Clippers", 79, 92, 89);
        Basketbolcu jamesharden = new Basketbolcu("James Harden", "Houston Rockets", 79, 91, 86);
        Basketbolcu anthonydavis = new Basketbolcu("Anthony Davis", "Los Angeles Lakers", 90, 87, 85);
        Basketbolcu kevindurant = new Basketbolcu("Kevin Durant", "Brooklyn Nets", 80, 94, 89);
        Basketbolcu damianlillard = new Basketbolcu("Damian Lillard", " Portland Trail Blazers", 63, 92, 89);
        Basketbolcu stephencurry = new Basketbolcu("Stephen Curry", "Golden State Warriors", 58, 95, 92);

        basketbolcuList.add(lebronjames);
        basketbolcuList.add(giannisantetokounmpo);
        basketbolcuList.add(kawhileonard);
        basketbolcuList.add(jamesharden);
        basketbolcuList.add(anthonydavis);
        basketbolcuList.add(kevindurant);
        basketbolcuList.add(damianlillard);
        basketbolcuList.add(stephencurry);

        //System.out.println(futbolcuList.get(1).getSporcuIsim());

        // Objeleri arrayList e atama başarılı. bunu sout la görmüs olduk
        /*for (Futbolcu a_futbolcu: futbolcuList) {

            System.out.println(a_futbolcu.toString());
        }*/


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        ArrayList<Sporcu> pcCardList = new ArrayList<Sporcu>();
        ArrayList<Sporcu> userCardList = new ArrayList<Sporcu>();

        int r;
        int n = 8;


        for (int i = 0; i < 4; i++) {//bilgisayarin kartlarini random atama yapıyoruz (bir futbol bir basket)
            r = random.nextInt(n);
            pcCardList.add(futbolcuList.get(r));
            futbolcuList.remove(r);
            r = random.nextInt(n);
            pcCardList.add(basketbolcuList.get(r));
            System.out.println("r:" + r);
            basketbolcuList.remove(r);
            n--;
        }
        n = 4;
        for (int i = 0; i < 4; i++) {//kullanicinin kartlarini random atama yapıyoruz (bir futbol bir basket)
            r = random.nextInt(n);
            userCardList.add(futbolcuList.get(r));

            futbolcuList.remove(r);
            r = random.nextInt(n);
            userCardList.add(basketbolcuList.get(r));
            System.out.println("r:" + r);
            basketbolcuList.remove(r);
            n--;

        }

        for (int i = 0; i < 8; i++) {
            System.out.println("user listten: " + userCardList.get(i).getSporcuIsim());
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("pc listten: " + pcCardList.get(i).getSporcuIsim());
        }






        /*for (int i = 0; i<4; i++){//bilgisayarin FUTBOLCU kartlarini random atama yapıyoruz
            r = random.nextInt(n);
            pcCardList.add(basketbolcuList.get(r));
            System.out.println("r:"+r);
            basketbolcuList.remove(r);
            n--;
        }
        for (int i = 0; i<4; i++){//kullanicinin FUTBOLCU kartlarini random atama yapıyoruz
            r = random.nextInt(n);
            userCardList.add(basketbolcuList.get(r));
            System.out.println("r:"+r);
            basketbolcuList.remove(r);
            n--;
        }*/

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form2 f = new form2();
                f.setVisible(true);

                Image img1 = new ImageIcon(this.getClass().getResource("De Bruyne.png")).getImage();
                f.button2.setIcon(new ImageIcon(img1));

                Image img2 = new ImageIcon(this.getClass().getResource("Haaland.png")).getImage();
                f.button3.setIcon(new ImageIcon(img2));

                Image img3 = new ImageIcon(this.getClass().getResource("Ibrahimovic.png")).getImage();
                f.button4.setIcon(new ImageIcon(img3));

                Image img4 = new ImageIcon(this.getClass().getResource("Lewandowski.png")).getImage();
                f.button5.setIcon(new ImageIcon(img4));

                Image img5 = new ImageIcon(this.getClass().getResource("Mbappé.png")).getImage();
                f.button6.setIcon(new ImageIcon(img5));

                Image img6 = new ImageIcon(this.getClass().getResource("Messi.png")).getImage();
                f.button7.setIcon(new ImageIcon(img6));

                Image img7 = new ImageIcon(this.getClass().getResource("Neymar.png")).getImage();
                f.button8.setIcon(new ImageIcon(img7));

                Image img8 = new ImageIcon(this.getClass().getResource("Ronaldo.png")).getImage();
                f.button9.setIcon(new ImageIcon(img8));



            }
        });







    }
}
