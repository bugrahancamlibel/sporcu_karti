package com.company;


 import javax.swing.*;
 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import java.util.ArrayList;

public class form2 extends Main {

    protected JPanel panel1;
    protected JTextField textField1;
    protected JButton button1;
    protected JButton button2;
    protected JButton button3;
    protected JButton button4;
    protected JButton button5;
    protected JButton button6;
    protected JButton button7;
    protected JButton button8;
    protected JButton button9;
    protected JPanel panel2;
    protected JPanel panel_a;
    protected JPanel panel_b;
    protected JPanel panel_c;
    protected JPanel panel_d;
    protected JPanel panel_e;
    protected JPanel panel_f;
    protected JPanel panel_g;
    protected JButton button10;
    protected JButton button11;
    protected JButton button12;
    protected JButton button13;
    protected JButton button14;
    protected JButton button15;
    protected JButton button16;
    protected JButton button17;
    protected JButton button18;
    protected JButton button19;
    private JLabel label1;
    private JLabel winLabel;
    private JButton butonBitir;
    private JLabel oyuncuSkorLabel;
    private JLabel bilgisayarSkorLabel;
    private JLabel kazananLabel;




    public form2(ArrayList sorted_photos, ArrayList basketbol_sorted_photos, ArrayList<Sporcu> userCardList, ArrayList<Sporcu> pcCardList, Kullanici kullanici, Bilgisayar bilgisayar) {




        add(panel1);
        setSize(1920,1080);
        setTitle("Kart Oyunu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int[] raund = {0};
        int[] bot_card_futbol = {4};
        final int[] bot_card_basketbol = {4};
        String kazanan = "";


        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button13.setVisible(false);
        button14.setVisible(false);
        button15.setVisible(false);
        button16.setVisible(false);
        button17.setVisible(false);
        button18.setVisible(false);
        button19.setVisible(false);
        label1.setVisible(false);
        kazananLabel.setVisible(false);
        butonBitir.setVisible(false);
        oyuncuSkorLabel.setVisible(false);
        bilgisayarSkorLabel.setVisible(false);

        winLabel.setVisible(false);


        button2.setPreferredSize(new Dimension(200,300));
        button3.setPreferredSize(new Dimension(200,300));
        button4.setPreferredSize(new Dimension(200,300));
        button5.setPreferredSize(new Dimension(200,300));
        button6.setPreferredSize(new Dimension(200,300));
        button7.setPreferredSize(new Dimension(200,300));
        button8.setPreferredSize(new Dimension(200, 300));
        button9.setPreferredSize(new Dimension(200,300));
        button10.setPreferredSize(new Dimension(200,300));
        button11.setPreferredSize(new Dimension(200,300));
        button12.setPreferredSize(new Dimension(200,300));
        button13.setPreferredSize(new Dimension(200,300));
        button14.setPreferredSize(new Dimension(200,300));
        button15.setPreferredSize(new Dimension(200,300));
        button16.setPreferredSize(new Dimension(200,300));
        button17.setPreferredSize(new Dimension(200,300));
        button18.setPreferredSize(new Dimension(200,300));
        button19.setPreferredSize(new Dimension(200,300));
        label1.setPreferredSize(new Dimension(100,100));









        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);



                kullanici.setOyuncuAdi(textField1.getText());
                System.out.println("Kullanicinin nicki: "+kullanici.getOyuncuAdi());

                textField1.setVisible(false);
                winLabel.setVisible(true);

                button1.setVisible(false);
                button2.setVisible(true);

                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(true);
                button6.setVisible(true);
                button7.setVisible(true);
                button8.setVisible(true);
                button9.setVisible(true);
                button10.setVisible(true);
                button11.setVisible(true);
                button12.setVisible(true);
                button13.setVisible(true);

                button14.setVisible(true);
                button15.setVisible(true);
                button16.setVisible(true);
                button17.setVisible(true);

                panel_a.setVisible(false);
                panel_b.setVisible(false);
                panel_c.setVisible(false);
                panel_d.setVisible(false);
                panel_e.setVisible(false);
                panel_f.setVisible(false);
                panel_g.setVisible(false);



            }
        });

        final int[] kullanici_puan = {0};
        final int[] bilgisayar_puan = {0};
       

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                //bugranin ifinin altinda cagatayin ifleri
                if(raund[0]%2==0) {
                    
                    int rand1 = futbolcuOzellik(label1);
                    if(rand1 == 0){

                        if(userCardList.get(0).getOzellik1() > pcCardList.get(0).getOzellik1()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(0).getOzellik1() < pcCardList.get(0).getOzellik1()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }

                        else {
                            winLabel.setText("BERABERE!");
                        }


                    }

                    else if(rand1 == 1){
                        if(userCardList.get(0).getOzellik2() > pcCardList.get(0).getOzellik2()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(0).getOzellik2() < pcCardList.get(0).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else  {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand1 == 2){
                        if(userCardList.get(0).getOzellik3() > pcCardList.get(0).getOzellik3()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(0).getOzellik3() < pcCardList.get(0).getOzellik3()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else  {
                            winLabel.setText("BERABERE!");
                        }


                    }

                    button2.setVisible(false);
                    panel_a.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button10.setVisible(false);


                    Image img1 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(0)))).getImage();
                    button18.setIcon(new ImageIcon(img1));
                    raund[0]++;



                    Image img2 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(bot_card_futbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img2));
                    bot_card_futbol[0]++;

                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }

                }

            }
        });

        /*button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button18.setVisible(false);
                button19.setVisible(false);
            }
        });*/




        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





                if (raund[0]%2==1) {
                    int rand2 = basketbolcuOzellik(label1);
                   
                    if(rand2 == 0){
                        if(userCardList.get(1).getOzellik1() > pcCardList.get(1).getOzellik1()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(1).getOzellik1() < pcCardList.get(1).getOzellik1()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand2 == 1){
                        if(userCardList.get(1).getOzellik2() > pcCardList.get(1).getOzellik2()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(1).getOzellik2() < pcCardList.get(1).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand2 == 2){
                        if(userCardList.get(1).getOzellik3() > pcCardList.get(1).getOzellik3()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(1).getOzellik3() < pcCardList.get(1).getOzellik3()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    button3.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button11.setVisible(false);

                    Image img3 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(0)))).getImage();
                    button18.setIcon(new ImageIcon(img3));

                    raund[0]++;

                    Image img4 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(bot_card_basketbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img4));
                    bot_card_basketbol[0]++;
                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }
                }
            }
        });


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (raund[0]%2==0) {
                    int rand3 = futbolcuOzellik(label1);
                  
                    if(rand3 == 0){

                        if(userCardList.get(2).getOzellik1() > pcCardList.get(2).getOzellik1()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(2).getOzellik1() < pcCardList.get(2).getOzellik1()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }


                    }

                    else if(rand3 == 1){
                        if(userCardList.get(2).getOzellik2() > pcCardList.get(2).getOzellik2()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(2).getOzellik2() < pcCardList.get(2).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand3 == 2){
                        if(userCardList.get(2).getOzellik3() > pcCardList.get(2).getOzellik3()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(2).getOzellik3() < pcCardList.get(2).getOzellik3()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }


                    }

                    button4.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button12.setVisible(false);

                    Image img5 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(1)))).getImage();
                    button18.setIcon(new ImageIcon(img5));
                    raund[0]++;
                    Image img6 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(bot_card_futbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img6));
                    bot_card_futbol[0]++;
                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }
                }
            }
        });


        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(raund[0]%2==1) {
                    int rand4 = basketbolcuOzellik(label1);
                    
                    if(rand4 == 0){
                        if(userCardList.get(3).getOzellik1() > pcCardList.get(3).getOzellik1()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(3).getOzellik1() < pcCardList.get(3).getOzellik1()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else  {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 1){
                        if(userCardList.get(3).getOzellik2() > pcCardList.get(3).getOzellik2()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(3).getOzellik2() < pcCardList.get(3).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 2){
                        if(userCardList.get(3).getOzellik3() > pcCardList.get(3).getOzellik3()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(3).getOzellik3() < pcCardList.get(3).getOzellik3()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }

                    button5.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button13.setVisible(false);
                    Image img7 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(1)))).getImage();
                    button18.setIcon(new ImageIcon(img7));
                    raund[0]++;
                    Image img8 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(bot_card_basketbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img8));
                    bot_card_basketbol[0]++;
                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }
                }
            }
        });


        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (raund[0]%2==0) {
                    int rand4 = futbolcuOzellik(label1);
                    if(rand4 == 0){

                        if(userCardList.get(4).getOzellik1() > pcCardList.get(4).getOzellik1()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(4).getOzellik1() < pcCardList.get(4).getOzellik1()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }


                    }

                    else if(rand4 == 1){
                        if(userCardList.get(4).getOzellik2() > pcCardList.get(4).getOzellik2()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(4).getOzellik2() < pcCardList.get(4).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 2){
                        if(userCardList.get(4).getOzellik3() > pcCardList.get(4).getOzellik3()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(4).getOzellik3() < pcCardList.get(4).getOzellik3()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else{
                            winLabel.setText("BERABERE!");
                        }

                    }
                    button6.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button14.setVisible(false);

                    Image img9 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(2)))).getImage();

                    button18.setIcon(new ImageIcon(img9));
                    raund[0]++;

                    Image img10 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(bot_card_futbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img10));
                    bot_card_futbol[0]++;
                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }

                }
            }
        });


        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                if (raund[0]%2==1) {
                    int rand4 = basketbolcuOzellik(label1);
                    if(rand4 == 0){
                        if(userCardList.get(5).getOzellik1() > pcCardList.get(5).getOzellik1()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(5).getOzellik1() < pcCardList.get(5).getOzellik1()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");


                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 1){
                        if(userCardList.get(5).getOzellik2() > pcCardList.get(5).getOzellik2()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(5).getOzellik2() < pcCardList.get(5).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else{
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 2){
                        if(userCardList.get(5).getOzellik3() > pcCardList.get(5).getOzellik3()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(5).getOzellik3() < pcCardList.get(5).getOzellik3()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }

                    button7.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button15.setVisible(false);
                    Image img11 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(2)))).getImage();
                    button18.setIcon(new ImageIcon(img11));
                    raund[0]++;

                    Image img12 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(bot_card_basketbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img12));
                    bot_card_basketbol[0]++;

                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }
                }
            }
        });


        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: sayın ceo lar bakın biz iyi programcılarız. bu kodda başarılı şeyler yaptık. bidahaki programlar için de iyi işler çıkarıcaz.


                if (raund[0]%2==0) {
                    int rand5 = futbolcuOzellik(label1);
                    if(rand5 == 0){

                        if(userCardList.get(6).getOzellik1() > pcCardList.get(6).getOzellik1()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");


                        }
                        else if(userCardList.get(6).getOzellik1() < pcCardList.get(6).getOzellik1()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }


                    }

                    else if(rand5 == 1){
                        if(userCardList.get(6).getOzellik2() > pcCardList.get(6).getOzellik2()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(6).getOzellik2() < pcCardList.get(6).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else{
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand5 == 2){
                        if(userCardList.get(6).getOzellik3() > pcCardList.get(6).getOzellik3()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(6).getOzellik3() < pcCardList.get(6).getOzellik3()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }


                    }


                    button8.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button16.setVisible(false);

                    Image img13 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(3)))).getImage();
                    button18.setIcon(new ImageIcon(img13));
                    raund[0]++;

                    Image img14 = new ImageIcon(this.getClass().getResource(String.valueOf(sorted_photos.get(bot_card_futbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img14));
                    bot_card_futbol[0]++;
                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar.getSkor());

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }
                }
            }
        });


        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (raund[0]%2==1) {
                    int rand4 = basketbolcuOzellik(label1);
                    if(rand4 == 0){
                        if(userCardList.get(7).getOzellik1() > pcCardList.get(7).getOzellik1()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(7).getOzellik1() < pcCardList.get(7).getOzellik1()){

                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 1){
                        if(userCardList.get(7).getOzellik2() > pcCardList.get(7).getOzellik2()){

                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");
                        }
                        else if(userCardList.get(7).getOzellik2() < pcCardList.get(7).getOzellik2()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }
                    else if(rand4 == 2){
                        if(userCardList.get(7).getOzellik3() > pcCardList.get(7).getOzellik3()){
                            kullanici_puan[0] += 10;
                            kullanici.setSkor(kullanici_puan[0]);
                            winLabel.setText("Oyuncu Kazandı!");

                        }
                        else if(userCardList.get(7).getOzellik3() < pcCardList.get(7).getOzellik3()){
                            bilgisayar_puan[0] +=10;
                            bilgisayar.setSkor(bilgisayar_puan[0]);
                            winLabel.setText("Bilgisayar Kazandı!");

                        }
                        else {
                            winLabel.setText("BERABERE!");
                        }

                    }


                    button9.setVisible(false);
                    panel_b.setVisible(true);
                    button18.setVisible(true);
                    button19.setVisible(true);

                    button17.setVisible(false);
                    Image img15 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(3)))).getImage();
                    button18.setIcon(new ImageIcon(img15));
                    raund[0]++;

                    Image img16 = new ImageIcon(this.getClass().getResource(String.valueOf(basketbol_sorted_photos.get(bot_card_basketbol[0])))).getImage();
                    button19.setIcon(new ImageIcon(img16));
                    bot_card_basketbol[0]++;
                    System.out.println("kullanicin puaniiiiiiiiiiiiiiiiiiiiiiiiiii"+kullanici.getSkor());
                    System.out.println("pccccccccccccccccccc"+bilgisayar_puan);

                    bilgisayarSkorLabel.setVisible(true);
                    bilgisayarSkorLabel.setText("Bilgisayar Skor: "+bilgisayar.getSkor());
                    oyuncuSkorLabel.setVisible(true);
                    oyuncuSkorLabel.setText("Oyuncu Skor: "+ kullanici.getSkor());

                    if(raund[0]==8){
                        butonBitir.setVisible(true);
                    }
                }

            }
        });
        butonBitir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bilg puan: "+bilgisayar.getSkor()+"\nkullanici puan: "+kullanici.getSkor());
                if(bilgisayar.getSkor()>kullanici.getSkor()){
                    kazananLabel.setText("KAZANAN BİLGİSAYAR!");
                }
                else if(kullanici.getSkor()>bilgisayar.getSkor()){
                    kazananLabel.setText("KAZANAN OYUNCU!");
                }
                kazananLabel.setVisible(true);
                label1.setText("GAME OVER");
                button18.setVisible(false);
                button19.setVisible(false);
                winLabel.setVisible(false);
                butonBitir.setVisible(false);
                oyuncuSkorLabel.setVisible(false);
                bilgisayarSkorLabel.setVisible(false);
            }
        });
    }
}