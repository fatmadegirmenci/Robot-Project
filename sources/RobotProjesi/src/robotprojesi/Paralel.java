
package robotprojesi;

import java.util.ArrayList;
import java.util.Scanner;

public class Paralel implements ManipulatorRobotlar{
    int motorSayisi, yukMiktari,yukTasKapasite,robotKoluUzunlugu;
    float tasimaHizi,tasimaSuresi;
    String robotTipi,yon;
    Scanner keyboard = new Scanner(System.in);
    IzgaraCizimi nesne = new IzgaraCizimi();
    
    String [] yonSiralamasi;
    int yonSayisi = 0;
    ArrayList <String> yonAdlari = new ArrayList <String> ();
    int  z, t, i, j=0, j1=0, j2=0, j3=0, k=0,sayac2=0,c=0;
    float a=0;
    int b,d,b1,d1,b2;
    void robotunBaslangicNoktası(int x,int y){
        b=x;
        b1=x;
        d=y;
        d1=y;
    }

    public Paralel(String robotTipi, int motorSayisi, int yukMiktari, int yukTasKapasite,int robotKoluUzunlugu,float tasimaHizi) { // tum ozelliklerin bulundugu constructor
        //super( robotTipi, motorSayisi, yukMiktari, gezinmeHizi, tekerlekSayisi);
        this.robotTipi = robotTipi;
        this.motorSayisi = motorSayisi;
        this.yukMiktari = yukMiktari;
        this.yukTasKapasite = yukTasKapasite;
        this.robotKoluUzunlugu = robotKoluUzunlugu;
        this.tasimaHizi = tasimaHizi;
    }
    
    @Override
    public void yukKapasitesiHesaaplama() {
        if(yukMiktari > yukTasKapasite){
            System.out.println(" yuk miktarı yuk kapasitesinden fazla. Tasiyamaz !. Yuk miktarini yeniden giriniz :");
            this.yukMiktari = keyboard.nextInt();
        }
    }
    
    @Override
    public void yukTasınımı() {
        j=0;
        j1=0;
        j2=0;
        j3=0;
        sayac2 = 0;
        c=0;
        while(c != -1){
            System.out.println("kolu hangi yone uzatacaksiniz : ");
            yon = keyboard.next();
            
            yonSayisi++;
            yonAdlari.add(yon);
            
            
            if("sag".equals(yon)){
                System.out.println("saga kac birim uzatacaksiniz : ");
                dizisag[j] = keyboard.nextInt();
                b += dizisag[j];
                b2 += dizisag[j];
            
                if(b > 20){
                    b -= dizisag[j];
                    dizisag[j] = 20-b;
                    b += dizisag[j];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += b-b1;
                    b1 = b;
                    j++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= dizisag[j];
                    dizisag[j] = robotKoluUzunlugu-b2;
                    b2 += dizisag[j];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac2 += dizisag[j];
                    j++;
                    break;
                }
               
                sayac2 += b-b1;
                b1 = b;
                j++;
            }
            if("sol".equals(yon)){
                System.out.println("sola kac birim uzatacaksiniz : ");
                dizisol[j1] = keyboard.nextInt();
                b -= dizisol[j1];
                b2 += dizisol[j1];
                
                if(b <= 0){
                    b += dizisol[j1];
                    dizisol[j1] = b-1;
                    b -= dizisol[j1];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += b1-b;
                    b1 = b;
                    j1++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= dizisol[j1];
                    dizisol[j1] = robotKoluUzunlugu-b2;
                    b2 += dizisol[j1];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac2 += dizisol[j1];
                    j1++;
                    break;
                }
                
                sayac2 += b1-b;
                b1 = b;
                j1++;
            }
            if("yukari".equals(yon)){
                System.out.println("yukari kac birim uzatacaksiniz : ");
                diziyukari[j2] = keyboard.nextInt();
                d -= diziyukari[j2];
                b2 += diziyukari[j2];
                
                if(d <= 0){
                    d += diziyukari[j2];
                    diziyukari[j2] = d-1;
                    d -= diziyukari[j2];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += d1-d;
                    d1 = d;
                    j2++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= diziyukari[j2];
                    diziyukari[j2] = robotKoluUzunlugu-b2;
                    b2 += diziyukari[j2];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac2 += diziyukari[j2];
                    j2++;
                    break;
                }
                sayac2 += d1-d;
                d1 = d;   
                j2++;
            }  
            if("asagi".equals(yon)){
                System.out.println("asagi kac birim uzatacaksiniz : ");
                diziasagi[j3] = keyboard.nextInt();
                d += diziasagi[j3];
                b2 += diziasagi[j3];
                
                if(d > 20){
                    d -= diziasagi[j3];
                    diziasagi[j3] = 20-d;
                    d += diziasagi[j3];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += d-d1;
                    d1 = d;
                    j3++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= diziasagi[j3];
                    diziasagi[j3] = robotKoluUzunlugu-b2;
                    b2 += diziasagi[j3];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac2 += diziasagi[j3];
                    j3++;
                    break;
                }
                
                sayac2 += d-d1;
                d1 = d;
                j3++;
            }
            System.out.println("hedefe ulasildi ise -1 giriniz : ");
            c = keyboard.nextInt();
            
        }
                
        yonSiralamasi = new String[yonSayisi];
        for(int t=0; t<yonAdlari.size(); t++) {
            yonSiralamasi[t] = yonAdlari.get(t);
        }     
    
    }
     
    public String yonSir(int i) {
        return yonSiralamasi[i];
    }

    @Override
    public void toplamSureHesaplama() {
        tasimaSuresi = 10*sayac2/tasimaHizi;
        a += tasimaSuresi;
        System.out.println("sure :  " +a);
    }
    
}
