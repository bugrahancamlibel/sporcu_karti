package com.company;

import java.util.Random;

public class Bilgisayar extends Oyuncu {


     public Bilgisayar(String oyuncuID,String oyuncuAdi,int Skor){
         super(oyuncuID,oyuncuAdi,Skor);


     }
     public int kartSec(int cardNumber){
         Random random = new Random();
         cardNumber = random.nextInt(8);
         return cardNumber;
     }
}
