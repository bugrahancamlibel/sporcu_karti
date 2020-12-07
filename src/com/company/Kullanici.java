package com.company;

public class Kullanici extends Oyuncu {

    public Kullanici(String oyuncuID,String oyuncuAdi,int skor){
        super(oyuncuID,oyuncuAdi,skor);


    }
    @Override
    public int kartSec(int cardNumber){
        return cardNumber;
    }
}
