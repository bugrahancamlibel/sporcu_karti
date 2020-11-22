package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Futbolcu> futbolcuList = new ArrayList<Futbolcu>();
        // Futbolcu kartlari.
        Futbolcu futbolcu1 = new Futbolcu("MESSI","BARCELONA",95,90,99);
        Futbolcu futbolcu2 = new Futbolcu("RONALDO","JUVENTUS",95,90,99);
        Futbolcu futbolcu3 = new Futbolcu("DE BRUYNE","MANCHESTER CITY",85,95,85);
        Futbolcu futbolcu4  = new Futbolcu("NEYMAR","PSG",96,90,90);
        Futbolcu futbolcu5 = new Futbolcu("IBRAHIMOVIC","MILAN AC",85,80,85);
        Futbolcu futbolcu6 = new Futbolcu("E.HAALAND","BORUSSIA DORTMUND",94,75,95);
        Futbolcu futbolcu7 = new Futbolcu("LEWANDOWSKI","BAYERN MUNCHEN",95,80,98);
        Futbolcu futbolcu8 = new Futbolcu("MBAPPE","PSG",95,85,97);

        futbolcuList.add(futbolcu1);
        futbolcuList.add(futbolcu2);
        futbolcuList.add(futbolcu3);
        futbolcuList.add(futbolcu4);
        futbolcuList.add(futbolcu5);
        futbolcuList.add(futbolcu6);
        futbolcuList.add(futbolcu7);
        futbolcuList.add(futbolcu8);

        System.out.println(futbolcuList.get(1).getFutbolcuAdi());

        // Objeleri arrayList e atama başarılı. bunu sout la görmüs olduk
        /*for (Futbolcu a_futbolcu: futbolcuList) {

            System.out.println(a_futbolcu.toString());
        }*/

        int secim_1;
        int secim_2;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        ArrayList<Oyuncu> oyuncus = new ArrayList<Oyuncu>();
        ArrayList<Bilgisayar> pc = new ArrayList<Bilgisayar>();

       //Basketbolcu kartlari.
        /*Basketbolcu basketbolcu1 = new Basketbolcu();
        Basketbolcu basketbolcu2 = new Basketbolcu();
        Basketbolcu basketbolcu3 = new Basketbolcu();
        Basketbolcu basketbolcu4 = new Basketbolcu();
        Basketbolcu basketbolcu5 = new Basketbolcu();
        Basketbolcu basketbolcu6 = new Basketbolcu();
        Basketbolcu basketbolcu7 = new Basketbolcu();
        Basketbolcu basketbolcu8 = new Basketbolcu();
        */

    }
}
