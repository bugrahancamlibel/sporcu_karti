package com.company;


public class Futbolcu extends Sporcu {
    //sporcu sınıfından kalıtım alacak.
    private String futbolcuAdi;
    private String futbolcuTakim;

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
    public Futbolcu(String sporcuIsim,String sporcuTakim,int penalti,int serbestAtis,int kaleciKarsiKarsiya){
        super(sporcuIsim,sporcuTakim);
        this.futbolcuTakim = sporcuTakim;
        this.futbolcuAdi   = sporcuIsim;
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }



    //projede bizden istenilen parametresiz constructor.(ne ise yaradigini henuz bilmiyorum)
    public Futbolcu(){
        System.out.println("Parametresiz constructor");
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("Futbolcunun penaltisi : "+penalti);
        System.out.println("Futbolcunun serbest arisi : "+serbestAtis);
        System.out.println("Futbolcunun kaleciyle karsi karsiyasi : " + kaleciKarsiKarsiya);
    }
    /*public String toString(){

        return "isim : " +futbolcuAdi+" takim : "+futbolcuTakim +" penalti : "+penalti +" serbest atis : " +serbestAtis+" kaleci karsi karsiya : " +kaleciKarsiKarsiya;
    }*/
}
