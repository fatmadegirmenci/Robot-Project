
package robotprojesi;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RobotProjesi {
    
    public static void main(String[] args) {
        int paralelMinHiz = 20;
        int seriMinHiZ = 10;
        int paralelTasimaHizi = 0;
        int seriTasimaHizi = 0;
        int paralelTasimaKapasitesiMin = 20;
        int seriTasimaKapasitesiMin = 10;
        int paralelTasimaKapasitesi = 0;
        int seriTasimaKapasitesi = 0;
        int paralelMotorSayisi = 0;
        int seriMotorSayisi = 0;
        int paralelYukMiktari = 0;
        int seriYukMiktari = 0;
        int paralelRobotKolu = 0;
        int seriRobotKolu = 0;

        int tekerlekliMinHiz = 20;
        int paletliMinHiz = 10;
        int spiderMinHiz = 5;
        int tekerlekliMotorSayisi = 0;
        int paletliMotorSayisi = 0;
        int spiderMotorSayisi = 0;
        int tekerlekliYukMiktari = 0;
        int paletliYukMiktari = 0;
        int spiderYukMiktari = 0;
        int tekerlekliGezinmeHizi = 0;
        int paletliGezinmeHizi = 0;
        int spiderGezinmeHizi = 0;
        int tekerlekSayisi = 0;
        int paletSayisi = 0;
        int bacakSayisi = 0;

        int hibritGezinmeHizi = 0;
        int hibritMotorSayisi = 0;
        int hibritYukMiktari = 0;
        int hibrittekerlekSayisi = 0;
        int hibritpaletSayisi = 0;
        int hibritbacakSayisi = 0;
        int hibritTasimaHizi = 0;
        int hibritTasimaKapasitesi = 0;
        int hibritRobotKolu = 0;
        int hibritgecisSuresi = 0;
        int hibritSabitlenmeSuresi = 0;

        String hibritli = null;
        String hibritsiz = null;
        
        Scanner keyboard = new Scanner(System.in);
        
        IzgaraCizimi frame = new IzgaraCizimi(); 
        frame.setTitle("RobotProjesi");
        frame.setSize(700,700);

        System.out.println("Kac robot girmek istiyorsunuz : ");
        int robotSayisi = keyboard.nextInt();

        int robotX,robotY;

        for(int o=0; o<robotSayisi; o++) {
            do {
                System.out.println("Robotun baslangic noktasini girin (x,y) max 20 20 olabilir: ");
                robotX = keyboard.nextInt();
                robotY = keyboard.nextInt();
            }while(robotX>20 || robotY>20);

            frame.robotunBaslangicNoktasi(robotX, robotY);

            System.out.println("Izgara uzerine engel yerlestirilecek mi? True or False");
            boolean engelYerlesecekMi = keyboard.nextBoolean();
            
            int engelSayisi;

            if(engelYerlesecekMi) {
                System.out.print("Kac engel yerlesecek? : ");
                engelSayisi = keyboard.nextInt(); 
            }
            else {
                engelSayisi = 0;
            }

           int [] koordinatlar = new int[engelSayisi*2];

            if(engelYerlesecekMi) {
                int j = 0;
                for(int i=0; i<engelSayisi; i++) {
                    int x,y;

                    System.out.println(i + ". engel " + "hangi koordinatlara yerlesecek? max 20 20 olabilir");
                    System.out.print("x : ");
                    x = keyboard.nextInt();
                    koordinatlar[j] = x;

                    while(x>20) {
                        System.out.println("x 20den buyuk olamaz. Lutfen tekrar girin.");
                        System.out.print("x : ");
                        x = keyboard.nextInt();
                        koordinatlar[j] = x;
                    }
                    j++;

                    System.out.print("y : ");
                    y = keyboard.nextInt();
                    koordinatlar[j] = y;

                    while(y>20) {
                        System.out.println("y 20den buyuk olamaz. Lutfen tekrar girin.");
                        System.out.print("y : ");
                        y = keyboard.nextInt();
                        koordinatlar[j] = y;
                    }
                    j++; 
                }

                frame.engelYerlestir(engelSayisi, koordinatlar, j);
            }
            else {
                engelSayisi = 0;

                frame.engelYerlestir(engelSayisi, koordinatlar, engelSayisi);
            }

            System.out.println("Tanimlanacak robot tipini giriniz : ");
            String robotTipi = keyboard.next();

            frame.robotTipiniAl(robotTipi);
          
            if(robotTipi.equals("Spider") || robotTipi.equals("Paletli") || robotTipi.equals("Tekerlekli")) {
                tekerlekliGezinmeHizi = 5;
                while(tekerlekliGezinmeHizi <= tekerlekliMinHiz){
                    System.out.println("Tekerlekli robot icin gezinme hizini giriniz :" );
                    tekerlekliGezinmeHizi = keyboard.nextInt();
                }
                paletliGezinmeHizi = 5;
                while(paletliGezinmeHizi <= paletliMinHiz){
                    System.out.println("Paletli robot icin gezinme kapasitesi giriniz :" );
                    paletliGezinmeHizi = keyboard.nextInt();
                }
                spiderGezinmeHizi = 3;
                while(spiderGezinmeHizi <= spiderMinHiz){
                    System.out.println("Spider robot icin gezinme kapasitesi giriniz :" );
                    spiderGezinmeHizi = keyboard.nextInt();
                }
                
                System.out.println("Tekerlekli robot icin motor sayisini giriniz : ");
                tekerlekliMotorSayisi = keyboard.nextInt();
                System.out.println("Paletli robot icin motor sayisini giriniz : ");
                paletliMotorSayisi = keyboard.nextInt();
                System.out.println("Spider robot icin motor sayisini giriniz : ");
                spiderMotorSayisi = keyboard.nextInt();
                System.out.println("Tekerlekli robot icin yuk miktari giriniz : ");
                tekerlekliYukMiktari = keyboard.nextInt();
                System.out.println("Paletli robot icin yuk miktari giriniz : ");
                paletliYukMiktari = keyboard.nextInt();
                System.out.println("Spider robot icin yuk miktari giriniz : ");
                spiderYukMiktari = keyboard.nextInt();
                System.out.println("Tekerlekli robot icin tekerlek sayisini giriniz : ");
                tekerlekSayisi = keyboard.nextInt();
                System.out.println("Paletli robot icin palet sayisini giriniz : ");
                paletSayisi = keyboard.nextInt();
                System.out.println("Spider robot icin bacak sayisini giriniz : ");
                bacakSayisi = keyboard.nextInt();
            }

            else if(robotTipi.equals("Paralel") || robotTipi.equals("Seri")){
                
                paralelTasimaHizi = 5;
                while (paralelTasimaHizi <= paralelMinHiz) {
                    System.out.println("Paralel robot icin tasima hizini giriniz :");
                    paralelTasimaHizi = keyboard.nextInt();
                }
                
                seriTasimaHizi = 5;
                while (seriTasimaHizi <= seriMinHiZ) {
                    System.out.println("Seri robot icin tasima hizini giriniz :");
                    seriTasimaHizi = keyboard.nextInt();
                }
                
                paralelTasimaKapasitesi = 5;
                while (paralelTasimaKapasitesi <= paralelTasimaKapasitesiMin) {
                    System.out.println("Paralel robot icin tasima kapasitesi giriniz :");
                    paralelTasimaKapasitesi = keyboard.nextInt();
                }
                
                seriTasimaKapasitesi = 5;
                while (seriTasimaKapasitesi <= seriTasimaKapasitesiMin) {
                    System.out.println("Seri robot icin tasima kapasitesi giriniz :");
                    seriTasimaKapasitesi = keyboard.nextInt();
                }
                
                System.out.println("Paralel robot icin motor sayisini giriniz : ");
                paralelMotorSayisi = keyboard.nextInt();
                System.out.println("Seri robot icin motor sayisini giriniz : ");
                seriMotorSayisi = keyboard.nextInt();
                System.out.println("Paralel robot icin yuk miktari giriniz : ");
                paralelYukMiktari = keyboard.nextInt();
                System.out.println("Seri robot icin yuk miktari giriniz : ");
                seriYukMiktari = keyboard.nextInt();
                System.out.println("Paralel robot icin robot kolu uzunlugunu giriniz : ");
                paralelRobotKolu = keyboard.nextInt();
                System.out.println("Seri robot icin robot kolu uzunlugunu giriniz : ");
                seriRobotKolu = keyboard.nextInt();

            }
            else if(robotTipi.equals("Hibrit")){
                System.out.println("Hibrit robot icin hareketli kisimi giriniz : ");
                hibritli = keyboard.next();
                System.out.println("Hibrit robot icin hareketsiz kisimi giriniz : ");
                hibritsiz = keyboard.next();
                System.out.println("Hibrit robot icin gezinme hizini giriniz :");
                hibritGezinmeHizi = keyboard.nextInt();
                System.out.println("Hibrit robot icin tasima hizini giriniz :");
                hibritTasimaHizi = keyboard.nextInt();
                System.out.println("Hibrit robot icin motor sayisini giriniz : ");
                hibritMotorSayisi = keyboard.nextInt();
                System.out.println("Hibrit robot icin yuk miktari giriniz : ");
                hibritYukMiktari = keyboard.nextInt();
                System.out.println("Hibrit robot icin tekerlek sayisini giriniz : ");
                hibrittekerlekSayisi = keyboard.nextInt();
                System.out.println("Hibrit robot icin palet sayisini giriniz : ");
                hibritpaletSayisi = keyboard.nextInt();
                System.out.println("Hibrit robot icin bacak sayisini giriniz : ");
                hibritbacakSayisi = keyboard.nextInt();
                System.out.println("Hibrit robot icin tasima kapasitesi giriniz :");
                hibritTasimaKapasitesi = keyboard.nextInt();
                System.out.println("Hibrit robot icin robot kolu uzunlugunu giriniz : ");
                hibritRobotKolu = keyboard.nextInt();
                System.out.println("Hibrit robot icin gecis suresi giriniz :");
                hibritgecisSuresi = keyboard.nextInt();
                System.out.println("Hibrit robot icin sabitlenme suresi giriniz : ");
                hibritSabitlenmeSuresi = keyboard.nextInt();
            }

            Tekerlekli r11 = new Tekerlekli("Tekerlekli", tekerlekliMotorSayisi,tekerlekliYukMiktari, tekerlekliGezinmeHizi, tekerlekSayisi);
            Paletli r12 = new Paletli("Paletli",paletliMotorSayisi, paletliYukMiktari, paletliGezinmeHizi, paletSayisi);
            Spider r13 = new Spider("Spider",spiderMotorSayisi, spiderYukMiktari, spiderGezinmeHizi, bacakSayisi);
            Paralel r14 = new Paralel("Paralel", paralelMotorSayisi, paralelYukMiktari, paralelTasimaKapasitesi ,paralelRobotKolu/10, paralelTasimaHizi);
            Seri r15 = new Seri("Seri", seriMotorSayisi, seriYukMiktari, seriTasimaKapasitesi, seriTasimaHizi,seriRobotKolu/10);
            GezginManipulatorRobotlar r16 = new GezginManipulatorRobotlar("GezginManipulatorRobotlar",hibritli,hibritsiz,hibritMotorSayisi,hibritYukMiktari,hibritGezinmeHizi,hibrittekerlekSayisi,hibritbacakSayisi, hibritpaletSayisi,hibritRobotKolu/10 ,hibritTasimaKapasitesi,hibritTasimaHizi);
            
            if ("Hibrit".equals(robotTipi)) {
                frame.sayaclariSifirla();
                frame.sayaclariSifirla2();
                r16.robotunBaslangicNoktası(robotX, robotY,engelSayisi);
                r16.engelKoordinatları(koordinatlar);
                r16.yukKapasitesiHesaaplama();
                r16.hedefeUlasildiMi();
                r16.yukTasınımı();
                
                int x1,x2,x3,x4;
                x1 = r16.j;
                x2 = r16.j1;
                x3 = r16.j2;
                x4 = r16.j3;

                int x11,x12,x13,x14;
                x11 = r16.j11;
                x12 = r16.j12;
                x13 = r16.j13;
                x14 = r16.j14;
                
                int [] dizi1 = new int [x1];
                int [] dizi2 = new int [x2];
                int [] dizi3 = new int [x3];
                int [] dizi4 = new int [x4]; 
                
                int [] dizi11 = new int [x11];
                int [] dizi12 = new int [x12];
                int [] dizi13 = new int [x13];
                int [] dizi14 = new int [x14]; 

                r16.sabitlemeSuresiniBul(hibritSabitlenmeSuresi);
                r16.gecisSuresi(hibritgecisSuresi);
                r16.EngelGecmeSuresiBul();
                r16.toplamSureHesaplama();
                dizi1 =  r16.dizisag;
                dizi2 = r16.dizisol;
                dizi3 = r16.diziyukari;
                dizi4 = r16.diziasagi;
                
                dizi11 =  r16.dizisag1;
                dizi12 = r16.dizisol1;
                dizi13 = r16.diziyukari1;
                dizi14 = r16.diziasagi1;
                
                
                int yonSayisi = r16.yonSayisi;
                String [] yonSiralamalari = new String[yonSayisi];

                for(int j=0; j<yonSayisi; j++) {
                    yonSiralamalari[j] = r16.yonSir(j);
                }
                
                int yonSayisi2 = r16.yonSayisi2;
                String [] yonSiralamalari2 = new String[yonSayisi2];

                for(int j=0; j<yonSayisi2; j++) {
                    yonSiralamalari2[j] = r16.yonSir2(j);
                }
                
                frame.dizilerinElemanSayisi(x1, x2, x3, x4);
                frame.ilerleyisYonBirimleri(dizi1, dizi2, dizi3, dizi4);

                frame.yonSayisiniAl(yonSayisi);
                frame.yonSiralamalariniAl(yonSiralamalari);
                
                frame.dizilerinElemanSayisi2(x11, x12, x13, x14);
                frame.ilerleyisYonBirimleri2(dizi11, dizi12, dizi13, dizi14);

                frame.yonSayisiniAl2(yonSayisi2);
                frame.yonSiralamalariniAl2(yonSiralamalari2);
                
                for(int p=0; p<r16.yonAdlari.size(); p++) {
                    r16.yonAdlari.remove(p);
                    r16.yonSiralamasi[p] = "";
                }
                r16.yonSayisi = 0;
                
                for(int p=0; p<r16.yonAdlari2.size(); p++) {
                    r16.yonAdlari2.remove(p);
                    r16.yonSiralamasi2[p] = "";
                }
                r16.yonSayisi2 = 0;
            } 
            else if ("Tekerlekli".equals(robotTipi)) {
                frame.sayaclariSifirla();
                r11.robotunBaslangicNoktası(robotX, robotY, engelSayisi);
                r11.engelKoordinatları(koordinatlar);
                r11.hedefeUlasildiMi();
                
                int x1, x2, x3, x4;
                x1 = r11.j;
                x2 = r11.j1;
                x3 = r11.j2;
                x4 = r11.j3;

                int yonSayisi = r11.yonSayisi;
                String[] yonSiralamalari = new String[yonSayisi];

                for (int j = 0; j < yonSayisi; j++) {
                    yonSiralamalari[j] = r11.yonSir(j);
                }

                int[] dizi1 = new int[x1];
                int[] dizi2 = new int[x2];
                int[] dizi3 = new int[x3];
                int[] dizi4 = new int[x4];

                r11.EngelGecmeSuresiBul();
                r11.toplamSureHesaplama();
                dizi1 = r11.dizisag;
                dizi2 = r11.dizisol;
                dizi3 = r11.diziyukari;
                dizi4 = r11.diziasagi;
                
                frame.dizilerinElemanSayisi(x1, x2, x3, x4);
                frame.ilerleyisYonBirimleri(dizi1, dizi2, dizi3, dizi4);

                frame.yonSayisiniAl(yonSayisi);
                frame.yonSiralamalariniAl(yonSiralamalari);
                
                for(int p=0; p<r11.yonAdlari.size(); p++) {
                    r11.yonAdlari.remove(p);
                    r11.yonSiralamasi[p] = "";
                }
                r11.yonSayisi = 0;
            } 
            else if ("Paletli".equals(robotTipi)) {
                frame.sayaclariSifirla();
                r12.robotunBaslangicNoktası(robotX, robotY, engelSayisi);
                r12.engelKoordinatları(koordinatlar);
                r12.hedefeUlasildiMi();
                
                int x1, x2, x3, x4;
                x1 = r12.j;
                x2 = r12.j1;
                x3 = r12.j2;
                x4 = r12.j3;

                int yonSayisi = r12.yonSayisi;
                String[] yonSiralamalari = new String[yonSayisi];

                for (int j = 0; j < yonSayisi; j++) {
                    yonSiralamalari[j] = r12.yonSir(j);
                }

                int[] dizi1 = new int[x1];
                int[] dizi2 = new int[x2];
                int[] dizi3 = new int[x3];
                int[] dizi4 = new int[x4];

                r12.EngelGecmeSuresiBul();
                r12.toplamSureHesaplama();
                dizi1 = r12.dizisag;
                dizi2 = r12.dizisol;
                dizi3 = r12.diziyukari;
                dizi4 = r12.diziasagi;
                
                frame.dizilerinElemanSayisi(x1, x2, x3, x4);
                frame.ilerleyisYonBirimleri(dizi1, dizi2, dizi3, dizi4);

                frame.yonSayisiniAl(yonSayisi);
                frame.yonSiralamalariniAl(yonSiralamalari);
                
                for(int p=0; p<r12.yonAdlari.size(); p++) {
                    r12.yonAdlari.remove(p);
                    r12.yonSiralamasi[p] = "";
                }
                r12.yonSayisi = 0;
                
            }
            else if("Spider".equals(robotTipi)){
                frame.sayaclariSifirla();
                r13.robotunBaslangicNoktası(robotX, robotY, engelSayisi);
                r13.engelKoordinatları(koordinatlar);
                r13.hedefeUlasildiMi();
                
                int x1, x2, x3, x4;
                x1 = r13.j;
                x2 = r13.j1;
                x3 = r13.j2;
                x4 = r13.j3;

                int yonSayisi = r13.yonSayisi;
                String[] yonSiralamalari = new String[yonSayisi];

                for (int j = 0; j < yonSayisi; j++) {
                    yonSiralamalari[j] = r13.yonSir(j);
                }

                int[] dizi1 = new int[x1];
                int[] dizi2 = new int[x2];
                int[] dizi3 = new int[x3];
                int[] dizi4 = new int[x4];

                r13.EngelGecmeSuresiBul();
                r13.toplamSureHesaplama();
                dizi1 = r13.dizisag;
                dizi2 = r13.dizisol;
                dizi3 = r13.diziyukari;
                dizi4 = r13.diziasagi;
                
                frame.dizilerinElemanSayisi(x1, x2, x3, x4);
                frame.ilerleyisYonBirimleri(dizi1, dizi2, dizi3, dizi4);

                frame.yonSayisiniAl(yonSayisi);
                frame.yonSiralamalariniAl(yonSiralamalari);
                
                r13.yonSayisi = 0;
                for(int p=0; p<r13.yonAdlari.size(); p++) {
                    r13.yonAdlari.remove(p);
                    r13.yonSiralamasi[p] = "";
                }
               
            }
            else if ("Paralel".equals(robotTipi)) {
                frame.sayaclariSifirla();
                r14.robotunBaslangicNoktası(robotX, robotY);
                r14.yukKapasitesiHesaaplama();
                r14.yukTasınımı();
                
                int x1, x2, x3, x4;
                x1 = r14.j;
                x2 = r14.j1;
                x3 = r14.j2;
                x4 = r14.j3;

                int yonSayisi = r14.yonSayisi;
                String[] yonSiralamalari = new String[yonSayisi];

                for (int j = 0; j < yonSayisi; j++) {
                    yonSiralamalari[j] = r14.yonSir(j);
                }

                int[] dizi1 = new int[x1];
                int[] dizi2 = new int[x2];
                int[] dizi3 = new int[x3];
                int[] dizi4 = new int[x4];

                r14.toplamSureHesaplama();
                dizi1 = r14.dizisag;
                dizi2 = r14.dizisol;
                dizi3 = r14.diziyukari;
                dizi4 = r14.diziasagi;
                
                frame.dizilerinElemanSayisi(x1, x2, x3, x4);
                frame.ilerleyisYonBirimleri(dizi1, dizi2, dizi3, dizi4);
                
                frame.yonSayisiniAl(yonSayisi);
                frame.yonSiralamalariniAl(yonSiralamalari);
                
                for(int p=0; p<r14.yonAdlari.size(); p++) {
                    r14.yonAdlari.remove(p);
                    r14.yonSiralamasi[p] = "";
                }
                r14.yonSayisi = 0;
            } 
            else if ("Seri".equals(robotTipi)) {
                frame.sayaclariSifirla();
                r15.robotunBaslangicNoktası(robotX, robotY);
                r15.yukKapasitesiHesaaplama();
                r15.yukTasınımı();
                
                int x1, x2, x3, x4;
                x1 = r15.j;
                x2 = r15.j1;
                x3 = r15.j2;
                x4 = r15.j3;

                int yonSayisi = r15.yonSayisi;
                String[] yonSiralamalari = new String[yonSayisi];

                for (int j = 0; j < yonSayisi; j++) {
                    yonSiralamalari[j] = r15.yonSir(j);
                }

                int[] dizi1 = new int[x1];
                int[] dizi2 = new int[x2];
                int[] dizi3 = new int[x3];
                int[] dizi4 = new int[x4];

                r15.toplamSureHesaplama();
                dizi1 = r15.dizisag;
                dizi2 = r15.dizisol;
                dizi3 = r15.diziyukari;
                dizi4 = r15.diziasagi;
                
                frame.dizilerinElemanSayisi(x1, x2, x3, x4);
                frame.ilerleyisYonBirimleri(dizi1, dizi2, dizi3, dizi4);
                
                frame.yonSayisiniAl(yonSayisi);
                frame.yonSiralamalariniAl(yonSiralamalari);
                
                for(int p=0; p<r15.yonAdlari.size(); p++) {
                    r15.yonAdlari.remove(p);
                    r15.yonSiralamasi[p] = "";
                }
                r15.yonSayisi = 0;
            }

            frame.setVisible(true);
            try {
                Thread.sleep(4500);
            } catch (InterruptedException ex) {
                Logger.getLogger(IzgaraCizimi.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(false);
        }
        System.exit(0);
    }
}
