package com.company;

public class Sporcu {

    private String sporcuIsim;
    private String sporcuTakim;
    //getter setter.
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
    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    //projede bizden istenilen parametresiz constructor.(ne ise yaradigini henuz bilmiyorum)
    public Sporcu(){

        System.out.println("Parametresiz constructor");
    }

    // Sporcuların kart puanını göstermek için sporcuPuaniGoster() metotu yazılmalıdır.


}