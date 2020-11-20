package com.company;

public class Basketbolcu extends Sporcu {
    //sporcu sınıfından kalıtım alacak.
    private String basketbolcuAdi;
    private String basketbolcuTakim;

    private int ikilik;
    private int ucluk;
    private int serbestAtis;

    //Ozelliklerin getter setterları
    public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
    //Ozelliklerin getter setterları sonu.

    //Sporcu classından kalıtım alan constructor.
    public Basketbolcu(String sporcuIsim,String sporcuTakim,int ikilik, int ucluk, int serbestAtis){

        super(sporcuIsim,sporcuTakim);
        this.basketbolcuAdi = sporcuIsim;
        this.basketbolcuTakim = sporcuTakim;
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }
    //projede bizden istenilen parametresiz constructor.(ne ise yaradigini henuz bilmiyorum)
    public Basketbolcu(){
        System.out.println("Parametresiz constructor");
    }

}
