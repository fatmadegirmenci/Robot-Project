
package robotprojesi;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class IzgaraCizimi extends JFrame{
    int sayacSag = 0, sayacSol = 0, sayacYukari = 0, sayacAsagi = 0;
       int sayacSag2 = 0, sayacSol2 = 0, sayacYukari2 = 0, sayacAsagi2 = 0;
    int flag = 1;
    int robotX, robotY;
    public int [] engeller = new int [10];
    int engelSayisi = 0;
    int i, h, f;

    int nSag, nSol, nYukari, nAsagi;
    String robotTipi = "";

    int yonSayisi;
    int yonSayisi2;
    void sayaclariSifirla() {
        sayacSag = 0;
        sayacSol = 0;
        sayacYukari = 0;
        sayacAsagi = 0;
    }
    
    void sayaclariSifirla2() {
        sayacSag2 = 0;
        sayacSol2 = 0;
        sayacYukari2 = 0;
        sayacAsagi2 = 0;
    }

    void yonSayisiniAl(int yonSayisi) {
        this.yonSayisi = yonSayisi;
    }
    void yonSayisiniAl2(int yonSayisi) {
        this.yonSayisi2 = yonSayisi;
    }
    
    String [] yonSiralamasi = new String[yonSayisi];
    String [] yonSiralamasi2 = new String[yonSayisi2];
    void robotTipiniAl(String robotTipi) {
        this.robotTipi = robotTipi;
    }
    
    
    void yonSiralamalariniAl(String[] yonSiralamasi) {
        this.yonSiralamasi = yonSiralamasi;
    }
    
    void yonSiralamalariniAl2(String[] yonSiralamasi) {
        this.yonSiralamasi2 = yonSiralamasi;
    }
    
    void robotunBaslangicNoktasi(int x,int y) {
        robotX = 50 + (x-1)*30;
        robotY = 50 + (y-1)*30;
    }
    
    void robotunSonNoktası(int x,int y){
        h=x;
        f=y;
    }
    
    void dizilerinElemanSayisi(int nSag,int nSol,int nYukari,int nAsagi){
        this.nSag = nSag;
        this.nSol = nSol;
        this.nYukari = nYukari;
        this.nAsagi = nAsagi;
    }
    
    int nSag2, nSol2, nAsagi2, nYukari2;
    
    void dizilerinElemanSayisi2(int nSag,int nSol,int nYukari,int nAsagi){
        this.nSag2 = nSag;
        this.nSol2 = nSol;
        this.nYukari2 = nYukari;
        this.nAsagi2 = nAsagi;
    }
    
     public int [] sag = new int [nSag];
     public int [] sol = new int [nSol];
     public int [] yukari = new int [nYukari];
     public int [] asagi = new int [nAsagi];
    
     public int [] sag2 = new int [nSag2];
     public int [] sol2 = new int [nSol2];
     public int [] yukari2 = new int [nYukari2];
     public int [] asagi2 = new int [nAsagi2];
     
    void ilerleyisYonBirimleri(int [] dizi1,int [] dizi2,int [] dizi3,int [] dizi4){
        sag = dizi1;
        sol = dizi2;
        yukari = dizi3;
        asagi = dizi4;
    }
    
    void ilerleyisYonBirimleri2(int [] dizi1,int [] dizi2,int [] dizi3,int [] dizi4){
        sag2 = dizi1;
        sol2 = dizi2;
        yukari2 = dizi3;
        asagi2 = dizi4;
    }
    
    void engelYerlestir(int engelSayisi, int[] engelKoordinatlari, int n) {
        if(engelSayisi!=0) {
            for(int i=0; i<engelSayisi*2-1; i+=2) {
                engeller[i] = 50 + 30*(engelKoordinatlari[i]-1);
                engeller[i+1] = 50 + 30*(engelKoordinatlari[i+1]-1);
            }
        }
        
        this.engelSayisi = engelSayisi;
    }
    
    
    @Override
    public void paint(Graphics g) {
        flag = 1;

        super.paint(g);

        g.setColor(Color.black);
        g.drawRect(50, 50, 600, 600);

        for(int i=1; i<20; i++) {
            g.drawLine(50+i*30, 50, 50+i*30, 650);        
            g.drawLine(50, 50+i*30, 650, 50+i*30); 
        }
        
        while(flag != 0) {
        //gezgin Robot
            if(robotTipi.equals("Gezgin ")|| robotTipi.equals("Spider")
            || robotTipi.equals("Paletli") || robotTipi.equals("Tekerlekli") ) {
                g.setColor(Color.blue);

                g.drawRect(robotX, robotY, 20, 20); //govde
                g.fillRect(robotX, robotY, 20, 20);

                g.setColor(Color.green);
                g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                g.fillRect(robotX+20, robotY, 7, 15);

                g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                g.fillRect(robotX-7, robotY, 7, 15);

                g.setColor(Color.MAGENTA);
                g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                g.setColor(Color.yellow);

                g.drawOval(robotX, robotY-15, 20, 15); //bas
                g.fillOval(robotX, robotY-15, 20, 15);

                g.setColor(Color.black);
                g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz

                g.drawString("Robotun ilk konumu", robotX-30, robotY+15);
        //gezgin sonu
            }
            else if(robotTipi.equals("Hibrit")) {
                g.setColor(Color.blue);

                g.drawRect(robotX, robotY, 20, 20); //govde
                g.fillRect(robotX, robotY, 20, 20);

                g.setColor(Color.green);
                g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                g.fillRect(robotX+20, robotY, 7, 15);

                g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                g.fillRect(robotX-7, robotY, 7, 15);

                g.setColor(Color.MAGENTA);
                g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                g.setColor(Color.yellow);

                g.drawOval(robotX, robotY-15, 20, 15); //bas
                g.fillOval(robotX, robotY-15, 20, 15);

                g.setColor(Color.black);
                g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz

                g.drawString("Robotun ilk konumu", robotX-30, robotY+15);
            }
            else {
                g.setColor(Color.blue);
                g.drawRect(robotX, robotY, 20, 30); //govde
                g.fillRect(robotX, robotY, 20, 30);

                g.setColor(Color.green);
                g.drawRect(robotX+20, robotY+11, 15, 7); //sag kol
                g.fillRect(robotX+20, robotY+11, 15, 7);

                g.drawRect(robotX-15, robotY+11, 15, 7); //sol kol
                g.fillRect(robotX-15, robotY+11, 15, 7);

                g.setColor(Color.yellow);

                g.drawOval(robotX, robotY-15, 20, 15); //bas
                g.fillOval(robotX, robotY-15, 20, 15);

                g.setColor(Color.black);
                g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz

                g.drawString("Robotun ilk konumu", robotX-30, robotY+15);
            }
    
            if(engelSayisi != 0) {

                for(int i=0; i<engelSayisi*2-1; i+=2) {

                    g.setColor(Color.red);
                    g.drawArc(engeller[i]+5, engeller[i+1]+5, 20, 20, 0, 360);
                    g.fillArc(engeller[i]+5, engeller[i+1]+5, 20, 20, 0, 360);

                    g.setColor(Color.black);
                    g.drawString("engel", engeller[i], engeller[i+1]+15);
                    g.setColor(Color.black);
                }

            }
            

            if(robotTipi.equals("Gezgin ")|| robotTipi.equals("Spider")
            || robotTipi.equals("Paletli") || robotTipi.equals("Tekerlekli") ) {
                

                for(int i=0; i<yonSayisi; i++) {
                    if(yonSiralamasi[i].equals("sag")) {
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.red);
                        g.drawLine(robotX, robotY, robotX + sag[sayacSag]*30, robotY);
                        robotX += sag[sayacSag]*30;
                        sayacSag++;
                        robotX -= 15;
                        robotY -= 15;

                           /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    else if(yonSiralamasi[i].equals("asagi")) {
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.ORANGE);
                        g.drawLine(robotX, robotY, robotX, robotY + asagi[sayacAsagi]*30);
                        robotY += asagi[sayacAsagi]*30;
                        sayacAsagi++;
                        robotX -= 15;
                        robotY -= 15;

                                               /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    else if(yonSiralamasi[i].equals("sol")){
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.CYAN);
                        g.drawLine(robotX, robotY, robotX - sol[sayacSol]*30, robotY);
                        robotX -= sol[sayacSol]*30;
                        sayacSol++;
                        robotX -= 15;
                        robotY -= 15;

                                               /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    else if(yonSiralamasi[i].equals("yukari")){
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.GREEN);
                        g.drawLine(robotX, robotY, robotX, robotY - yukari[sayacYukari]*30);
                        robotY -= yukari[sayacYukari]*30;
                        sayacYukari++;
                        robotX -= 15;
                        robotY -= 15;

                                               /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    
                    if(i==yonSayisi-1) {
                        g.drawString("Robotun son konumu", robotX-30, robotY+15);
                    }
                }
                g.setColor(Color.black);

               
            }
            else if(robotTipi.equals("Hibrit")) {
                for(int i=0; i<yonSayisi; i++) {
                    if(yonSiralamasi[i].equals("sag")) {
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.red);
                        g.drawLine(robotX, robotY, robotX + sag[sayacSag]*30, robotY);
                        robotX += sag[sayacSag]*30;
                        sayacSag++;
                        robotX -= 15;
                        robotY -= 15;

                           /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                           
                    }
                    else if(yonSiralamasi[i].equals("asagi")) {
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.ORANGE);
                        g.drawLine(robotX, robotY, robotX, robotY + asagi[sayacAsagi]*30);
                        robotY += asagi[sayacAsagi]*30;
                        sayacAsagi++;
                        robotX -= 15;
                        robotY -= 15;

                                               /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    else if(yonSiralamasi[i].equals("sol")){
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.CYAN);
                        g.drawLine(robotX, robotY, robotX - sol[sayacSol]*30, robotY);
                        robotX -= sol[sayacSol]*30;
                        sayacSol++;
                        robotX -= 15;
                        robotY -= 15;

                                               /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    else if(yonSiralamasi[i].equals("yukari")){
                        robotX += 15;
                        robotY += 15;
                        g.setColor(Color.GREEN);
                        g.drawLine(robotX, robotY, robotX, robotY - yukari[sayacYukari]*30);
                        robotY -= yukari[sayacYukari]*30;
                        sayacYukari++;
                        robotX -= 15;
                        robotY -= 15;

                                               /*cizim*/
                            g.setColor(Color.blue);

                             g.drawRect(robotX, robotY, 20, 20); //govde
                             g.fillRect(robotX, robotY, 20, 20);

                             g.setColor(Color.green);
                             g.drawRect(robotX+20, robotY, 7, 15); //sag kol
                             g.fillRect(robotX+20, robotY, 7, 15);

                             g.drawRect(robotX-7, robotY, 7, 15); //sol kol
                             g.fillRect(robotX-7, robotY, 7, 15);

                             g.setColor(Color.MAGENTA);
                             g.drawRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.fillRect(robotX, robotY+20, 8, 15); //sol bacak
                             g.drawRect(robotX+12, robotY+20, 8, 15); //sag bacak
                             g.fillRect(robotX+12, robotY+20, 8, 15); //sag bacak


                             g.setColor(Color.yellow);

                             g.drawOval(robotX, robotY-15, 20, 15); //bas
                             g.fillOval(robotX, robotY-15, 20, 15);

                             g.setColor(Color.black);
                             g.drawArc(robotX+5, robotY-12, 3, 3, 0, 360); //sol goz
                             g.fillArc(robotX+5, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+10, robotY-12, 3, 3, 0, 360); //sag goz
                             g.fillArc(robotX+10, robotY-12, 3, 3, 0, 360);

                             g.drawArc(robotX+8, robotY-7, 3, 3, 180, 360); //agiz
                           /*cizimson*/
                    }
                    
                    if(i==yonSayisi-1) {
                        g.drawString("Robotun son konumu", robotX-30, robotY+15);
                    }
                 
                }
                g.setColor(Color.black);
                
                ////gezgin kisim bitti, manipulator kismi basladi
                //****************************************************************
                
                robotX +=15;
                robotY += 11;
                if(sag2.length>sol2.length) {
                    //use sag kol
                   
                    
                    g.setColor(Color.green);

                    for(int i=0; i<yonSayisi2; i++) {
                    if(yonSiralamasi2[i].equals("sag")) {
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX+20, robotY, sag2[sayacSag2]*30-20, 7);
                        g.fillRect(robotX+20, robotY, sag2[sayacSag2]*30-20, 7);
                        robotX += sag2[sayacSag2]*30;
                        sayacSag2++;
                    }
                    else if(yonSiralamasi2[i].equals("asagi")) {
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX, robotY, 7, asagi2[sayacAsagi2]*30);
                        g.fillRect(robotX, robotY, 7, asagi2[sayacAsagi2]*30);
                        robotY += asagi2[sayacAsagi2]*30;
                        sayacAsagi2++;
                       
                    }
                    else if(yonSiralamasi2[i].equals("sol")){
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX-sol2[sayacSol2]*30, robotY, sol2[sayacSol2]*30+20, 7);
                        g.fillRect(robotX-sol2[sayacSol2]*30, robotY, sol2[sayacSol2]*30+20, 7);
                        robotX -= sol2[sayacSol2]*30;
                        sayacSol2++;
                        
                    }
                    else if(yonSiralamasi2[i].equals("yukari")){
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX, robotY-yukari2[sayacYukari2]*30, 7, yukari2[sayacYukari2]*30);
                        g.fillRect(robotX, robotY-yukari2[sayacYukari2]*30, 7, yukari2[sayacYukari2]*30);
                        robotY -= yukari2[sayacYukari2]*30; 
                        sayacYukari2++;
                        
                    }
                    if(i==yonSayisi2-1) {
                        
                        
                        g.setColor(Color.pink);
                        g.drawArc(robotX-10, robotY-5, 20, 20, 0, 360);
                        g.fillArc(robotX-10, robotY-5, 20, 20, 0, 360);
                        g.setColor(Color.black);
                        g.drawString("Yukun son konumu", robotX-30, robotY+15);
                    }
                }

                    g.setColor(Color.black);
                    
                    
                }
                else{

                     //use sol kol 
                     g.setColor(Color.green);


                     for(int i=0; i<yonSayisi2; i++) {

                        if(yonSiralamasi2[i].equals("sag")) {
                            g.setColor(Color.green);
                            
                            g.drawRect(robotX, robotY, sag2[sayacSag2]*30, 7);
                            g.fillRect(robotX, robotY, sag2[sayacSag2]*30, 7);
                            robotX += sag2[sayacSag2]*30;
                            sayacSag2++;
                            
                            
                        }
                        else if(yonSiralamasi2[i].equals("asagi")) {
                            g.setColor(Color.green);
                            
                            g.drawRect(robotX, robotY, 7, asagi2[sayacAsagi2]*30);
                            g.fillRect(robotX, robotY, 7, asagi2[sayacAsagi2]*30);
                            robotY += asagi2[sayacAsagi2]*30;
                            sayacAsagi2++;
                            
                            
                        }
                        else if(yonSiralamasi2[i].equals("sol")){
                            g.setColor(Color.green);
                            
                            g.drawRect(robotX-sol2[sayacSol2]*30, robotY, sol2[sayacSol2]*30, 7);
                            g.fillRect(robotX-sol2[sayacSol2]*30, robotY, sol2[sayacSol2]*30, 7);
                            robotX -= sol2[sayacSol2]*30;
                            sayacSol2++;
                            
                        }
                        else if(yonSiralamasi2[i].equals("yukari")){
                            g.setColor(Color.green);
                           
                            g.drawRect(robotX, robotY-yukari2[sayacYukari2]*30, 7, yukari2[sayacYukari2]*30);
                            g.fillRect(robotX, robotY-yukari2[sayacYukari2]*30, 7, yukari2[sayacYukari2]*30);
                            robotY -= yukari2[sayacYukari2]*30; 
                            sayacYukari2++;
                            
                        }
                        if(i==yonSayisi2-1) {
                            
                            g.setColor(Color.pink);
                            g.drawArc(robotX-10, robotY-5, 20, 20, 0, 360);
                            g.fillArc(robotX-10, robotY-5, 20, 20, 0, 360);
                            g.setColor(Color.black);
                            g.drawString("Yukun son konumu", robotX-30, robotY+15);
                        }
                    }
  
                    g.setColor(Color.black);

                }
                
                /****/

            }
            
            else {
                robotX +=15;
                robotY += 11;
                if(sag.length>sol.length) {
                    //use sag kol
                   
                    
                    g.setColor(Color.green);

                    for(int i=0; i<yonSayisi; i++) {
                    if(yonSiralamasi[i].equals("sag")) {
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX+20, robotY, sag[sayacSag]*30-20, 7);
                        g.fillRect(robotX+20, robotY, sag[sayacSag]*30-20, 7);
                        robotX += sag[sayacSag]*30;
                        sayacSag++;
                    }
                    else if(yonSiralamasi[i].equals("asagi")) {
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX, robotY, 7, asagi[sayacAsagi]*30);
                        g.fillRect(robotX, robotY, 7, asagi[sayacAsagi]*30);
                        robotY += asagi[sayacAsagi]*30;
                        sayacAsagi++;
                       
                    }
                    else if(yonSiralamasi[i].equals("sol")){
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX-sol[sayacSol]*30, robotY, sol[sayacSol]*30+20, 7);
                        g.fillRect(robotX-sol[sayacSol]*30, robotY, sol[sayacSol]*30+20, 7);
                        robotX -= sol[sayacSol]*30;
                        sayacSol++;
                        
                    }
                    else if(yonSiralamasi[i].equals("yukari")){
                        g.setColor(Color.green);
                        
                        g.drawRect(robotX, robotY-yukari[sayacYukari]*30, 7, yukari[sayacYukari]*30);
                        g.fillRect(robotX, robotY-yukari[sayacYukari]*30, 7, yukari[sayacYukari]*30);
                        robotY -= yukari[sayacYukari]*30; 
                        sayacYukari++;
                        
                    }
                    if(i==yonSayisi-1) {
                        
                        
                        g.setColor(Color.pink);
                        g.drawArc(robotX-10, robotY-5, 20, 20, 0, 360);
                        g.fillArc(robotX-10, robotY-5, 20, 20, 0, 360);
                        g.setColor(Color.black);
                        g.drawString("Yukun son konumu", robotX-30, robotY+15);
                    }
                }

                    g.setColor(Color.black);
                    
                    
                }
                else{

                    
                     //use sol kol 
                     g.setColor(Color.green);


                     for(int i=0; i<yonSayisi; i++) {

                        if(yonSiralamasi[i].equals("sag")) {
                            g.setColor(Color.green);
                            
                            g.drawRect(robotX, robotY, sag[sayacSag]*30, 7);
                            g.fillRect(robotX, robotY, sag[sayacSag]*30, 7);
                            robotX += sag[sayacSag]*30;
                            sayacSag++;
                            
                            
                        }
                        else if(yonSiralamasi[i].equals("asagi")) {
                            g.setColor(Color.green);
                            
                            g.drawRect(robotX, robotY, 7, asagi[sayacAsagi]*30);
                            g.fillRect(robotX, robotY, 7, asagi[sayacAsagi]*30);
                            robotY += asagi[sayacAsagi]*30;
                            sayacAsagi++;
                            
                            
                        }
                        else if(yonSiralamasi[i].equals("sol")){
                            g.setColor(Color.green);
                            
                            g.drawRect(robotX-sol[sayacSol]*30, robotY, sol[sayacSol]*30, 7);
                            g.fillRect(robotX-sol[sayacSol]*30, robotY, sol[sayacSol]*30, 7);
                            robotX -= sol[sayacSol]*30;
                            sayacSol++;
                            
                        }
                        else if(yonSiralamasi[i].equals("yukari")){
                            g.setColor(Color.green);
                           
                            g.drawRect(robotX, robotY-yukari[sayacYukari]*30, 7, yukari[sayacYukari]*30);
                            g.fillRect(robotX, robotY-yukari[sayacYukari]*30, 7, yukari[sayacYukari]*30);
                            robotY -= yukari[sayacYukari]*30; 
                            sayacYukari++;
                            
                        }
                        if(i==yonSayisi-1) {
                            
                            g.setColor(Color.pink);
                            g.drawArc(robotX-10, robotY-5, 20, 20, 0, 360);
                            g.fillArc(robotX-10, robotY-5, 20, 20, 0, 360);
                            g.setColor(Color.black);
                            g.drawString("Yukun son konumu", robotX-30, robotY+15);
                        }
                    }
  
                    g.setColor(Color.black);
                    
                    
                    
                }
            }
            flag = 0;
        }
    }
    
}