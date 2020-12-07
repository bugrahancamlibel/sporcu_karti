package com.company;

public class Basketbolcu extends Sporcu {
    //sporcu sınıfından kalıtım alacak.
    private String basketbolcuAdi;
    private String basketbolcuTakim;
    private boolean kartKullanildiMi;
    private int ikilik;

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
    public boolean getKartKullanildiMi(){
        return kartKullanildiMi;
    }

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
    public Basketbolcu(String sporcuIsim,String sporcuTakim,int ozellik1, int ozellik2, int ozellik3){

        super(sporcuIsim,sporcuTakim,ozellik1,ozellik2,ozellik3);
        this.basketbolcuAdi = sporcuIsim;
        this.basketbolcuTakim = sporcuTakim;
        this.ikilik = ozellik1;
        this.ucluk = ozellik2;
        this.serbestAtis = ozellik3;
    }


    @Override
    public int[] sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("Basketcinin adi:"+basketbolcuAdi+" Basketcinin takimi:"+basketbolcuTakim);
        System.out.println("ikiliği:"+ikilik+" ucluk:"+ucluk+" serbesti atisi:"+serbestAtis);
        return new int [] {ikilik,ucluk,serbestAtis};
    }

    //projede bizden istenilen parametresiz constructor.(ne ise yaradigini henuz bilmiyorum)
    public Basketbolcu(){
        System.out.println("Parametresiz constructor");
    }

}
