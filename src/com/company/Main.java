package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Main {

    public static void main(String[] args) {


        //Sporcu classından inheritance olarak aldigimiz sporcu isim ve sporcu takim ozelliklerini Futbolcu classı altında superle alarak olusturdugumuz objemiz.
        //Basarili bir geceydi.
        //Futbolcu oyuncu = new Futbolcu("messi","barca","cagatay","Bornova belediye",45,66,99);
        Futbolcu futbolcu = new Futbolcu("meksi","barca",12,23,34);
        Basketbolcu basketbolcu = new Basketbolcu("catoski","bornova sports",45,77,99);
        System.out.println("adi: "+futbolcu.getFutbolcuAdi()+" penalti "+ futbolcu.getPenalti());
        System.out.println("adi: "+basketbolcu.getBasketbolcuAdi()+" ucluk degeri: "+basketbolcu.getUcluk());
        System.out.println("abi ben cok yoruldum ");

    }
}
