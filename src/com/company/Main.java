package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Sporcu> futbolcuList = new ArrayList<Sporcu>();
        // Futbolcu kartlari.
        Futbolcu messi = new Futbolcu("Messi","Barcelona",95,90,99);
        Futbolcu ronaldo = new Futbolcu("Ronaldo","Juventus",95,90,99);
        Futbolcu de_bruyne = new Futbolcu("De Bruyne","Manchester Cıty",85,95,85);
        Futbolcu neymar  = new Futbolcu("Neymar","Psg",96,90,90);
        Futbolcu ibrahimovic = new Futbolcu("Ibrahimovic","Milan Ac",85,80,85);
        Futbolcu e_haaland = new Futbolcu("E.Haaland","Borussia Dortmund",94,75,95);
        Futbolcu lewandowski = new Futbolcu("Lewandowski","Bayern Munchen",95,80,98);
        Futbolcu mbappe = new Futbolcu("Mbappe","Psg",95,85,97);

        futbolcuList.add(messi);
        futbolcuList.add(ronaldo);
        futbolcuList.add(de_bruyne);
        futbolcuList.add(neymar);
        futbolcuList.add(ibrahimovic);
        futbolcuList.add(e_haaland);
        futbolcuList.add(lewandowski);
        futbolcuList.add(mbappe);

        System.out.println(futbolcuList.get(1).getSporcuIsim());

        // Objeleri arrayList e atama başarılı. bunu sout la görmüs olduk
        /*for (Futbolcu a_futbolcu: futbolcuList) {

            System.out.println(a_futbolcu.toString());
        }*/

        int secim_1;
        int secim_2;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        ArrayList<Sporcu> basketbolcuList = new ArrayList<Sporcu>();

       //Basketbolcu kartlari.
        Basketbolcu lebronjames = new Basketbolcu("Lebron James"," Los Angeles Lakers",89,84,70);
        Basketbolcu giannisantetokounmpo = new Basketbolcu("Giannis Antetokounmpo"," Milwaukee Bucks",89,84,70);
        Basketbolcu kawhileonard = new Basketbolcu("Kawhi Leonard"," Los Angeles Clippers",79,92,89);
        Basketbolcu jamesharden = new Basketbolcu("James Harden","Houston Rockets",79,91,86);
        Basketbolcu anthonydavis = new Basketbolcu("Anthony Davis","Los Angeles Lakers",90,87,85);
        Basketbolcu kevindurant = new Basketbolcu("Kevin Durant","Brooklyn Nets",80,94,89);
        Basketbolcu damianlillard = new Basketbolcu("Damian Lillard"," Portland Trail Blazers",63,92,89);
        Basketbolcu stephencurry = new Basketbolcu("Stephen Curry","Golden State Warriors",58,95,92);

        basketbolcuList.add(lebronjames);
        basketbolcuList.add(giannisantetokounmpo);
        basketbolcuList.add(kawhileonard);
        basketbolcuList.add(jamesharden);
        basketbolcuList.add(anthonydavis);
        basketbolcuList.add(kevindurant);
        basketbolcuList.add(damianlillard);
        basketbolcuList.add(stephencurry);

        System.out.println(basketbolcuList.get(3).getSporcuIsim());


    }
}
