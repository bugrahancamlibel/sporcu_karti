package com.company;


import java.util.ArrayList;

public class Futbolcu extends Sporcu {
    //sporcu sınıfından kalıtım alacak.
    private String futbolcuAdi;
    private String futbolcuTakim;

    private boolean kartKullanildiMi = false;

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public boolean getKartKullanildiMi(){
        return kartKullanildiMi;
    }

    private int penalti ;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    //Ozelliklerin getter setterları
    public String getFutbolcuAdi() {

        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {

        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {

        this.futbolcuTakim = futbolcuTakim;
    }

    public int getPenalti() {

        return penalti;
    }

    public void setPenalti(int penalti) {

        this.penalti = penalti;
    }

    public int getSerbestAtis() {

        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {

        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {

        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {

        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
    //Ozelliklerin getter setterları sonu.




    //Sporcu classından kalıtım alan constructor.
    public Futbolcu(String sporcuIsim,String sporcuTakim,int ozellik1,int ozellik2,int ozellik3){
        super(sporcuIsim,sporcuTakim,ozellik1,ozellik2,ozellik3);
        this.futbolcuTakim = sporcuTakim;
        this.futbolcuAdi   = sporcuIsim;
        this.penalti = ozellik1;
        this.serbestAtis = ozellik2;
        this.kaleciKarsiKarsiya = ozellik3;
    }



    //projede bizden istenilen parametresiz constructor.(ne ise yaradigini henuz bilmiyorum)
    public Futbolcu(){
        System.out.println("Parametresiz constructor");
    }

    @Override
    public int[] sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("Futbolcunun penaltisi : "+penalti);
        System.out.println("Futbolcunun serbest arisi : "+serbestAtis);
        System.out.println("Futbolcunun kaleciyle karsi karsiyasi : " + kaleciKarsiKarsiya);

        return new int [] {penalti,serbestAtis,kaleciKarsiKarsiya};
    }

}


