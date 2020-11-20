package com.company;

public class Main {

    public static void main(String[] args) {

        Futbolcu futbolcu = new Futbolcu("meksi","barca",12,23,34);
        Basketbolcu basketbolcu = new Basketbolcu("catoski","bornova sports",45,77,99);
        System.out.println("adi: "+futbolcu.getFutbolcuAdi()+" penalti "+ futbolcu.getPenalti());
        System.out.println("adi: "+basketbolcu.getBasketbolcuAdi()+" ucluk degeri: "+basketbolcu.getUcluk());
        futbolcu.sporcuPuaniGoster();
        basketbolcu.sporcuPuaniGoster();
    }
}
