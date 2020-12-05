package com.company;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main extends JFrame{
    //kapısma yapılırken fubolcu icin ozellik secimi.
    public static int futbolcuOzellik(JLabel buton) {


        String yazi = "we can do this.";

        Random rastgele_1 = new Random();
        int sayi_1 = rastgele_1.nextInt(3);
        if (sayi_1 == 0) {
            yazi = "Penaltı";
            buton.setText(yazi);
        } else if (sayi_1 == 1) {
            yazi = "Serbest Atış";
            buton.setText(yazi);
        } else if (sayi_1 == 2) {
            yazi = "Kaleciyle karşı karşıya";
            buton.setText(yazi);
        }

        return sayi_1;
    }


    //kapisma yapilirken basketbolcu ozellik secimi.
    public static int basketbolcuOzellik(JLabel butonn) {

        String yazii = "we can do this.";

        Random rastgele_2 = new Random();
        int sayi_2 = rastgele_2.nextInt(3);
        if (sayi_2 == 0) {
            yazii = "İkilik";
            butonn.setText(yazii);
        } else if (sayi_2 == 1) {
            yazii = "Üçlük";
            butonn.setText(yazii);
        } else if (sayi_2 == 2) {
            yazii = "Serbest Atış";
            butonn.setText(yazii);
        }
        return sayi_2;
    }

    public static void main(String[] args) {
        
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


        ArrayList<Futbolcu> futbolcuList = new ArrayList<Futbolcu>();
        ArrayList<Futbolcu> futbolcuList_kopya = new ArrayList<Futbolcu>();
        ArrayList<Sporcu> basketbolcuList = new ArrayList<Sporcu>();

        ArrayList<String> photos = new ArrayList<String>();
        ArrayList<String> sorted_photos = new ArrayList<String>();
        ArrayList<String> photos_basketbol = new ArrayList<String>();
        ArrayList<String> basketbol_sorted_photos = new ArrayList<String>();



        photos.add("Messi.png");
        photos.add("Ronaldo.png");
        photos.add("De Bruyne.png");
        photos.add("Neymar.png");
        photos.add("Ibrahimovic.png");
        photos.add("Haaland.png");
        photos.add("Lewandowski.png");
        photos.add("Mbappé.png");

        photos_basketbol.add("lebron.png");
        photos_basketbol.add("antetokounmpo.png");
        photos_basketbol.add("kawhi.png");
        photos_basketbol.add("harden.png");
        photos_basketbol.add("davis.png");
        photos_basketbol.add("durant.png");
        photos_basketbol.add("lillard.png");
        photos_basketbol.add("curry.png");


        // Futbolcu kartlari.

        Kullanici kullanici = new Kullanici("19020120","",0);
        Bilgisayar bilgisayar = new Bilgisayar("cmptr","BILGISAYAR",0);

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



        Basketbolcu lebronjames = new Basketbolcu("Lebron James", " Los Angeles Lakers", 89, 94, 90);
        Basketbolcu giannisantetokounmpo = new Basketbolcu("Giannis Antetokounmpo", " Milwaukee Bucks", 89, 94, 90);
        Basketbolcu kawhileonard = new Basketbolcu("Kawhi Leonard", " Los Angeles Clippers", 79, 92, 89);
        Basketbolcu jamesharden = new Basketbolcu("James Harden", "Houston Rockets", 88, 94, 86);
        Basketbolcu anthonydavis = new Basketbolcu("Anthony Davis", "Los Angeles Lakers", 90, 84, 85);
        Basketbolcu kevindurant = new Basketbolcu("Kevin Durant", "Brooklyn Nets", 79, 94, 89);
        Basketbolcu damianlillard = new Basketbolcu("Damian Lillard", " Portland Trail Blazers", 79, 92, 89);
        Basketbolcu stephencurry = new Basketbolcu("Stephen Curry", "Golden State Warriors", 89, 95, 92);


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

        for (int i = 0; i < 4; i++) {//kullanicinin kartlarini random atama yapıyoruz (bir futbol bir basket)
            r = random.nextInt(n);
            userCardList.add(futbolcuList.get(r));
            sorted_photos.add(photos.get(r));
            photos.remove(r);
            futbolcuList.remove(r);
            r = random.nextInt(n);
            userCardList.add(basketbolcuList.get(r));
            basketbol_sorted_photos.add(photos_basketbol.get(r));
            photos_basketbol.remove(r);
            System.out.println("r:" + r);
            basketbolcuList.remove(r);
            n--;

        }

        n=4;

        for (int i = 0; i < 4; i++) {//bilgisayarin kartlarini random atama yapıyoruz (bir futbol bir basket)
            r = random.nextInt(n);
            pcCardList.add(futbolcuList.get(r));
            sorted_photos.add(photos.get(r));
            photos.remove(r);
            futbolcuList.remove(r);
            r = random.nextInt(n);
            pcCardList.add(basketbolcuList.get(r));
            basketbol_sorted_photos.add(photos_basketbol.get(r));
            photos_basketbol.remove(r);
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
        System.out.println("sortedphotos: "+sorted_photos);
        System.out.println("basketcilerin sorted photos: "+basketbol_sorted_photos);

        System.out.println("futbolcu list kopya: "+futbolcuList_kopya);



                /*Image img18 = new ImageIcon(this.getClass().getResource(sorted_photos.get(3))).getImage();
                f.button18.setIcon(new ImageIcon(img18));*/


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form2 f = new form2(sorted_photos,basketbol_sorted_photos,userCardList,pcCardList,kullanici,bilgisayar);
                f.setVisible(true);


                Image img1 = new ImageIcon(this.getClass().getResource(sorted_photos.get(0))).getImage();
                f.button2.setIcon(new ImageIcon(img1));

                Image img2 = new ImageIcon(this.getClass().getResource(basketbol_sorted_photos.get(0))).getImage();
                f.button3.setIcon(new ImageIcon(img2));

                Image img3 = new ImageIcon(this.getClass().getResource(sorted_photos.get(1))).getImage();
                f.button4.setIcon(new ImageIcon(img3));

                Image img4 = new ImageIcon(this.getClass().getResource(basketbol_sorted_photos.get(1))).getImage();
                f.button5.setIcon(new ImageIcon(img4));

                Image img5 = new ImageIcon(this.getClass().getResource(sorted_photos.get(2))).getImage();
                f.button6.setIcon(new ImageIcon(img5));

                Image img6 = new ImageIcon(this.getClass().getResource(basketbol_sorted_photos.get(2))).getImage();
                f.button7.setIcon(new ImageIcon(img6));

                Image img7 = new ImageIcon(this.getClass().getResource(sorted_photos.get(3))).getImage();
                f.button8.setIcon(new ImageIcon(img7));

                Image img8 = new ImageIcon(this.getClass().getResource(basketbol_sorted_photos.get(3))).getImage();
                f.button9.setIcon(new ImageIcon(img8));

                /*Image img2 = new ImageIcon(this.getClass().getResource("harden.png")).getImage();
                f.button3.setIcon(new ImageIcon(img2));

                Image img4 = new ImageIcon(this.getClass().getResource("lebron.png")).getImage();
                f.button5 .setIcon(new ImageIcon(img4));*/




                //bilgisayar kartlarının arka yüzünü ekler

                Image img_background = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button10.setIcon(new ImageIcon(img_background));
                Image img_background1 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button11.setIcon(new ImageIcon(img_background1));
                Image img_background2 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button12.setIcon(new ImageIcon(img_background2));
                Image img_background3 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button13.setIcon(new ImageIcon(img_background3));
                Image img_background4 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button14.setIcon(new ImageIcon(img_background4));
                Image img_background5 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button15.setIcon(new ImageIcon(img_background5));
                Image img_background6 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button16.setIcon(new ImageIcon(img_background6));
                Image img_background7 = new ImageIcon(this.getClass().getResource("back_resized.png")).getImage();
                f.button17.setIcon(new ImageIcon(img_background7));




            }

        });







    }
}
