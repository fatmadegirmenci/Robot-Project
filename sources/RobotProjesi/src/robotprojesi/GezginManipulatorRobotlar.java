
package robotprojesi;


import java.util.ArrayList;
import java.util.Scanner;

public class GezginManipulatorRobotlar extends GezginRobotlar implements ManipulatorRobotlar {
    Scanner keyboard = new Scanner(System.in);
    int motorSayisi, yukMiktari;
    String robotTipi,hareketli,hareketsiz,sabit;
    int sabitlenmeSuresi, gecisSuresi;
    int tekerlekSayisi;
    int yukTasKapasite;
    int robotKoluUzunlugu;
    float tasimaSuresi,tasimaHizi;
    int sayac11=0,sayac3;
    int [] dizisag1 = new int [10];
    int [] dizisol1 = new int [10];
    int [] diziasagi1 = new int [10];
    int [] diziyukari1 = new int [10];
    
    String [] yonSiralamasi;
    int yonSayisi = 0;
    
    ArrayList <String> yonAdlari = new ArrayList <String> ();
    
    int yonSayisi2 = 0;
    String [] yonSiralamasi2;
    ArrayList <String> yonAdlari2 = new ArrayList <String> ();
    
    public GezginManipulatorRobotlar(String robotTipi,String hareketli, String hareketsiz, int motorSayisi, int yukMiktari, int gezinmeHizi, int tekerlekSayisi, int bacakSayisi, int paletSayisi,int robotKoluUzunlugu,int yukTasKapasite,int tasimaHizi) { // tum ozelliklerin bulundugu constructor
        //super( robotTipi, motorSayisi, yukMiktari, gezinmeHizi, tekerlekSayisi);
        this.hareketli = hareketli;
        this.hareketsiz = hareketsiz;
        this.robotTipi = robotTipi;
        this.motorSayisi = motorSayisi;
        this.yukMiktari = yukMiktari;
        this.gezinmeHizi = gezinmeHizi;
        this.tekerlekSayisi = tekerlekSayisi;
        this.gecisSuresi = gecisSuresi;
        this.robotKoluUzunlugu = robotKoluUzunlugu;
        this.yukTasKapasite = yukTasKapasite;
        this.tasimaHizi = tasimaHizi;
    }
     
     @Override
    public void yukKapasitesiHesaaplama() {
        if(yukMiktari > yukTasKapasite){
            System.out.println(" yuk miktari yuk kapasitesinden fazla. Tasiyamaz !. Yuk miktarini yeniden giriniz :");
            this.yukMiktari = keyboard.nextInt();
        }
    }
    
    @Override
    public void hedefeUlasildiMi(){
        if("Tekerlekli".equals(hareketli) || "Paletli".equals(hareketli)){
           j=0;
        j1=0;
        j2=0;
        j3=0;
        sayac1 = 0;
        sayac2 = 0;
        sayac3=0;
        c=0;
        while(c != -1){
            System.out.println("Hangi yone ilerleyeceksiniz : ");
            yon = keyboard.next();
            
            yonSayisi++;
            yonAdlari.add(yon);
            
            if("sag".equals(yon)){
                System.out.println("saga kac birim ilerleyeceksiniz : ");
                dizisag[j] = keyboard.nextInt();
                b += dizisag[j];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=b1+1 ; i<=b ; i++){
                        if(engeller[k] == i && engeller[k+1] == d1)
                            sayac1++;  
                    }
                }
            
                if(b > 20){
                    b -= dizisag[j];
                    dizisag[j] = 20-b;
                    b += dizisag[j];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += b-b1;
                    b1 = b;
                    j++;
                    sayac3++;
                    break;
                }
               
                sayac2 += b-b1;
                b1 = b;
                j++;
            }
            if("sol".equals(yon)){
                System.out.println("sola kac birim ilerleyeceksiniz : ");
                dizisol[j1] = keyboard.nextInt();
                b -= dizisol[j1];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=b ; i<=b1-1 ; i++){
                        if(engeller[k] == i && engeller[k+1] == d1)
                            sayac1++;  
                    }
                }
                
                if(b <= 0){
                    b += dizisol[j1];
                    dizisol[j1] = b-1;
                    b -= dizisol[j1];
                    System.out.println("izzgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += b1-b;
                    b1 = b;
                    j1++;
                    sayac3++;
                    break;
                }
                
                sayac2 += b1-b;
                b1 = b;
                j1++;
            }
            if("yukari".equals(yon)){
                System.out.println("yukari kac birim ilerleyeceksiniz : ");
                diziyukari[j2] = keyboard.nextInt();
                d -= diziyukari[j2];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=d ; i<=d1-1 ; i++){
                        if(engeller[k] == b1 && engeller[k+1] == i)
                            sayac1++;  
                    }
                }
                
                if(d <= 0){
                    d += diziyukari[j2];
                        diziyukari[j2] = d-1;
                        d -= diziyukari[j2];
                        System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                        sayac2 += d1-d;
                        d1 = d;
                        j2++;
                        sayac3++;
                        break;
                }
                
                sayac2 += d1-d;
                d1 = d;
                j2++;
            }  
            if("asagi".equals(yon)){
                System.out.println("asagi kac birim ilerleyeceksiniz : ");
                diziasagi[j3] = keyboard.nextInt();
                d += diziasagi[j3];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=d1+1 ; i<=d ; i++){
                        if(engeller[k] == b1 && engeller[k+1] == i)
                            sayac1++;  
                    }
                }
                
                if(d > 20){
                    d -= diziasagi[j3];
                    diziasagi[j3] = 20-d;
                    d += diziasagi[j3];
                    System.out.println("izggaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += d-d1;
                    d1 = d;
                    j3++;
                    sayac3++;
                    break;
                }
                
                sayac2 += d-d1;
                d1 = d;
                j3++;
            }
            System.out.println("hedefe ulasildi ise -1 giriniz : ");
            c = keyboard.nextInt();
            
        }
        sayac2 -=sayac1;
        
        
        yonSiralamasi = new String[yonSayisi];
        for(int t=0; t<yonAdlari.size(); t++) {
            yonSiralamasi[t] = yonAdlari.get(t);
        } 
        }
        else if("Spider".equals(hareketli)){
            j=0;
            j1=0;
            j2=0;
            j3=0;
            sayac1 = 0;
            sayac2 = 0;
            sayac3=0;
           c=0;
            while(c != -1){
                System.out.println("Hangi yone ilerleyeceksiniz : ");
                yon = keyboard.next();
            
                yonSayisi++;
                yonAdlari.add(yon);
            
                if("sag".equals(yon)){
                    System.out.println("saga kac birim ilerleyeceksiniz : ");
                    dizisag[j] = keyboard.nextInt();
                    b += dizisag[j];
                
                    for(k=0;k<2*engelSayisi;k+=2){
                        for(i=b1+1 ; i<=b ; i++){
                            if(engeller[k] == i && engeller[k+1] == d1){
                                sayac1++;  
                                b -= dizisag[j];
                                dizisag[j] = i-b1-1;
                                b += dizisag[j];
                                sayac3++;
                            }
                        }
                    }
            
                    if(b > 20){
                        b -= dizisag[j];
                        dizisag[j] = 20-b;
                        b += dizisag[j];
                        System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                        sayac2 += b-b1;
                        b1 = b;
                        j++;
                        sayac3++;
                        break;
                    }
               
                    sayac2 += b-b1;
                    b1 = b;
                    j++;
                    if(sayac1 != 0){
                        System.out.println("Spider Robot engelden gecemeyecegi icin program sonlandirildi.");
                        break;
                    }
                }
                if("sol".equals(yon)){
                    System.out.println("sola kac birim ilerleyeceksiniz : ");
                    dizisol[j1] = keyboard.nextInt();
                    b -= dizisol[j1];
                
                    for(k=0;k<2*engelSayisi;k+=2){
                        for(i=b ; i<=b1-1 ; i++){
                            if(engeller[k] == i && engeller[k+1] == d1){
                                sayac1++;  
                                b += dizisol[j1];
                                dizisol[j1] = b1-1-i;
                                b -= dizisol[j1];
                                sayac3++;
                            }
                        }
                    }
                
                    if(b <= 0){
                        b += dizisol[j1];
                        dizisol[j1] = b-1;
                        b -= dizisol[j1];
                        System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                        sayac2 += b1-b;
                        b1 = b;
                        j1++;
                        sayac3++;
                        break;
                    }
                
                    sayac2 += b1-b;
                    b1 = b;
                    j1++;
                    if(sayac1 != 0){
                        System.out.println("Spider Robot engelden gecemeyecegi icin program sonlandirildi.");
                        break;
                    }
                }
                if("yukari".equals(yon)){
                    System.out.println("yukari kac birim ilerleyeceksiniz : ");
                    diziyukari[j2] = keyboard.nextInt();
                    d -= diziyukari[j2];
                
                    for(k=0;k<2*engelSayisi;k+=2){
                        for(i=d ; i<=d1-1 ; i++){
                            if(engeller[k] == b1 && engeller[k+1] == i){
                                sayac1++;  
                                d += diziyukari[j2];
                                diziyukari[j2] = d1-1-i;
                                d -= diziyukari[j2];
                                sayac3++;
                            }
                        }
                    }
                
                    if(d <= 0){
                        d += diziyukari[j2];
                        diziyukari[j2] = d-1;
                        d -= diziyukari[j2];
                        System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                        sayac2 += d1-d;
                        d1 = d;
                        j2++;
                        sayac3++;
                        break;
                    }
                
                    sayac2 += d1-d;
                    d1 = d;
                    j2++;
                    if(sayac1 != 0){
                        System.out.println("Spider Robot engelden gecemeyecegi icin program sonlandirildi.");
                        break;
                    }
                }
                if("asagi".equals(yon)){
                    System.out.println("asagi kac birim ilerleyeceksiniz : ");
                    diziasagi[j3] = keyboard.nextInt();
                    d += diziasagi[j3];
                
                    for(k=0;k<2*engelSayisi;k+=2){
                        for(i=d1+1 ; i<=d ; i++){
                            if(engeller[k] == b1 && engeller[k+1] == i){
                                sayac1++;  
                                d -= diziasagi[j3];
                                diziasagi[j3] = i-d1-1;
                                d += diziasagi[j3];
                                sayac3++;
                            }    
                        }
                    }
                
                    if(d > 20){
                        d -= diziasagi[j3];
                        diziasagi[j3] = 20-d;
                        d += diziasagi[j3];
                        System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                        sayac2 += d-d1;
                        d1 = d;
                        j3++;
                        sayac3++;
                        break;
                    }
              
                    sayac2 += d-d1;
                    d1 = d;
                    j3++;
                    if(sayac1 != 0){
                        System.out.println("Spider Robot engelden gecemeyecegi icin program sonlandirildi.");
                        break;
                    }
                }
                System.out.println("hedefe ulasildi ise -1 giriniz : ");
                c = keyboard.nextInt();
            }
                
            yonSiralamasi = new String[yonSayisi];
            for(int t=0; t<yonAdlari.size(); t++) {
                yonSiralamasi[t] = yonAdlari.get(t);
            }
    }
}
    int j11, j12, j13, j14;
    @Override
    public void yukTasınımı() {
        j11= 0;
        j12=0;
        j13=0;
        j14=0;
        sayac11 = 0;
        c=0;
        while(c != -1 && sayac3 == 0){
            System.out.println("kolu hangi yone uzatacaksiniz  : ");
            yon = keyboard.next();
            
            yonSayisi2++;
            yonAdlari2.add(yon);
            
            
            if("sag".equals(yon)){
                System.out.println("saga kac birim uzatacaksiniz : ");
                dizisag1[j11] = keyboard.nextInt();
                b += dizisag1[j11];
                b2 += dizisag1[j11];
            
                if(b > 20){
                    b -= dizisag1[j11];
                    dizisag1[j11] = 20-b;
                    b += dizisag1[j11];
                    System.out.println("izgaradan ciktiz.Program sonlandirilacak : ");
                    sayac11 += b-b1;
                    b1 = b;
                    j11++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= dizisag1[j11];
                    dizisag1[j11] = robotKoluUzunlugu-b2;
                    b2 += dizisag1[j11];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac11 += dizisag1[j11];
                    j11++;
                    break;
                }
               
                sayac11 += b-b1;
                b1 = b;
                j11++;
            }
            if("sol".equals(yon)){
                System.out.println("sola kac birim uzatacaksiniz : ");
                dizisol1[j12] = keyboard.nextInt();
                b -= dizisol1[j12];
                b2 += dizisol1[j12];
                
                if(b <= 0){
                    b += dizisol1[j12];
                    dizisol1[j1] = b-1;
                    b -= dizisol1[j12];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac11 += b1-b;
                    b1 = b;
                    j12++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= dizisol1[j12];
                    dizisol1[j12] = robotKoluUzunlugu-b2;
                    b2 += dizisol1[j12];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac11 += dizisol1[j12];
                    j12++;
                    break;
                }
                
                sayac11 += b1-b;
                b1 = b;
                j12++;
            }
            if("yukari".equals(yon)){
                System.out.println("yukari kac birim uzatacaksiniz : ");
                diziyukari1[j13] = keyboard.nextInt();
                d -= diziyukari1[j13];
                b2 += diziyukari1[j13];
                
                if(d <= 0){
                    d += diziyukari1[j13];
                    diziyukari1[j13] = d-1;
                    d -= diziyukari1[j13];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac11 += d1-d;
                    d1 = d;
                    j13++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= diziyukari1[j13];
                    diziyukari1[j13] = robotKoluUzunlugu-b2;
                    b2 += diziyukari1[j13];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac11 += diziyukari1[j13];
                    j13++;
                    break;
                }
                sayac11 += d1-d;
                d1 = d;   
                j13++;
            }  
            if("asagi".equals(yon)){
                System.out.println("asagi kac birim uzatacaksiniz : ");
                diziasagi1[j14] = keyboard.nextInt();
                d += diziasagi1[j14];
                b2 += diziasagi1[j14];
                
                if(d > 20){
                    d -= diziasagi1[j14];
                    diziasagi1[j14] = 20-d;
                    d += diziasagi1[j14];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac11 += d-d1;
                    d1 = d;
                    j14++;
                    break;
                }
                if( b2 > robotKoluUzunlugu){
                    b2 -= diziasagi1[j14];
                    diziasagi1[j14] = robotKoluUzunlugu-b2;
                    b2 += diziasagi1[j14];
                    System.out.println("Robot kolu uzunlugunu gectiniz.Program sonlandirilacak : ");
                    sayac11 += diziasagi1[j14];
                    j14++;
                    break;
                }
                
                sayac11 += d-d1;
                d1 = d;
                j14++;
            }
            System.out.println("hedefe ulasildi ise -1 giriniz : ");
            c = keyboard.nextInt();
            
        }
                
        yonSiralamasi2 = new String[yonSayisi2];
        for(int t=0; t<yonAdlari2.size(); t++) {
            yonSiralamasi2[t] = yonAdlari2.get(t);
        }
    }
    
    public float sabitlemeSuresiniBul(int sabitlenmeSuresi){
        return this.sabitlenmeSuresi = sabitlenmeSuresi;
    }
     public float gecisSuresi(int gecisSuresi){
         return this.gecisSuresi = gecisSuresi;
     }

    @Override
    public float EngelGecmeSuresiBul() {
        if("Tekerlekli".equals(hareketli)){
            return (float) (motorSayisi * (0.5));
        }
        else if("Paletli".equals(hareketli)){
            return (motorSayisi * 3);
        }
        else
            return -1;
    }

    @Override
    public void toplamSureHesaplama() {
        if("Tekerlekli".equals(hareketli) || "Paletli".equals(hareketli)){
            a += sayac1*EngelGecmeSuresiBul();
            gezinmeSuresi = 10*sayac2/gezinmeHizi;
            a += gezinmeSuresi;
        }
        else if("Spider".equals(hareketli)){
            gezinmeSuresi = 10*sayac2/gezinmeHizi;
            a += gezinmeSuresi;
        }
        tasimaSuresi = 10*sayac11/tasimaHizi;
        a += tasimaSuresi;
        a += sabitlemeSuresiniBul(sabitlenmeSuresi);
        a += gecisSuresi(gecisSuresi);
        System.out.println(" " +a);
    }

    public String yonSir(int i) {
        return yonSiralamasi[i];
    }
    
    public String yonSir2(int i) {
        return yonSiralamasi2[i];
    }
}
