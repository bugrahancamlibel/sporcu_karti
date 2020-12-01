package com.company;

public class Sporcu  {

    private String sporcuIsim;
    private String sporcuTakim;
    private int ozellik1;
    private int ozellik2;
    private int ozellik3;

    //getter setter.
    public int getOzellik1(){
        return ozellik1;
    }

    public void setOzellik1(int ozellik1){
        this.ozellik1 = ozellik1;
    }

    public int getOzellik2(){
        return ozellik2;
    }

    public void setOzellik2(int ozellik2){
        this.ozellik2 = ozellik2;
    }

    public int getOzellik3(){
        return ozellik3;
    }

    public void setOzellik3(int ozellik3){
        this.ozellik1 = ozellik3;
    }
    public String getSporcuIsim() {

        return sporcuIsim;
    }


    public void setSporcuIsim(String sporcuIsim) {

        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {

        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {

        this.sporcuTakim = sporcuTakim;
    }
    //getter setter son.

    public void sporcuPuaniGoster(){



    }

    //Constructor
    public Sporcu(String sporcuIsim, String sporcuTakim,int ozellik1,int ozellik2,int ozellik3) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.ozellik1 = ozellik1;
        this.ozellik2 = ozellik2;
        this.ozellik3 = ozellik3;
    }

    //projede bizden istenilen parametresiz constructor.(ne ise yaradigini henuz bilmiyorum)
    public Sporcu(){

        System.out.println("Parametresiz constructor");
    }

    // Sporcuların kart puanını göstermek için sporcuPuaniGoster() metotu yazılmalıdır.


}