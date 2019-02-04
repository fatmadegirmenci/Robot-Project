
package robotprojesi;

//kaldiracagi yuk miktarinda sinir yok, cok agir yukleri kaldirabilir

import java.util.ArrayList;


//import java.util.ArrayList;


//bu robotlar ozelliklerine gore gidecekleri yolun uzerindeki engelden
//gecer ya da gecemezler. Spider olanlar engelden gecemezler. 
//engelden gecme suresi tekerlekli<paletli

public abstract class GezginRobotlar implements Robot {
    int motorSayisi, yukMiktari;
    String robotTipi,yon;

    float gezinmeHizi,gezinmeSuresi;
    int  z, t, i, j=0, j1=0, j2=0,j3=0,k,sayac1=0,sayac2=0,c=0;
    float a=0;
    public abstract float EngelGecmeSuresiBul();
    public abstract void hedefeUlasildiMi();
     //ArrayList <String> yonAdlari = new ArrayList <String> ();
    IzgaraCizimi nesne = new IzgaraCizimi();
    int b,d,b1,d1,b2,d2,engelSayisi;
    void robotunBaslangicNoktası(int x,int y,int z){
        b=x;
        b1=x;
        d=y;
        d1=y;
        engelSayisi=z;
    }
    int [] engeller = new int [engelSayisi];
    
    void engelKoordinatları(int [] dizi){
        engeller = dizi;
    }
    
}
