Robot Projesi

Fatma Deðirmenci  -	170201008
Berfin Kösemen	  -	170201058

Bu readme.txt dosyasý, Robot Projesi projesine aittir.
Bu paket, kaynak kodu ile ayný dizin içerisinde bulunacaktýr.


1-PAKETÝN ÝÇERÝÐÝ:
-------------------
RobotProjesi.zip - Projenin kaynak kodunun ve yardýmcý dosyalarýn ziplenmiþ hali.
170201008-170201058.txt - Projenin tek dosyaya indirgenmiþ salt kaynak kodu.
rapor.doc - Proje raporu.
readme.txt - Bu dosya.
-------------------


2-SÝSTEM GEREKSÝNÝMLERÝ:
-------------------
java - Oracle Java™ - http://java.com/
-------------------


3-KURULUM:
-------------------
Paket içeriðini, yukarýda görebilirsiniz.

Bu kod, iki adet Windows kurulu makinede çalýþtýrýldý.

Bu iki durumda da, kod, herhangi bir hata vermeksizin, daha önceden
belirlenen kriterlere uygun çalýþtý.

Projeyi çalýþtýrmak için proje dizinine girip;
----------------------------
java -cp classes RobotProjesi.main
----------------------------
yazmanýz yeterli. 


-------------------


4-KODU DERLEMEK:
------------------
Artýk bilgisayarýmýzda kurulu olan Java ile kodu kolayca derleyebiliriz.

Projeyi derlemek için proje dizinine girip;
----------------------------
javac -sourcepath ./src/RobotProjesi ./src/RobotProjesi/*.java -d ./classes/ -encoding UTF8
----------------------------
yazmanýz yeterli. 
------------------


5- PARAMETRELER
-------------------
Kodun çalýþmasý için baþlangýçta herhangi bir parametre gerekmiyor.
------------------


6- PROGRAMIN KULLANIMI
-----------------------------
Robot Projesi, kullanýcýdan robot koordinatlarý, robot tipi, kaç robot
girileceði, robotun hangi yönlere gideceði gibi bilgileri alarak, 20x20lik
bir ýzgara üzerinde robotu hareket ettirir. Gerekli bilgileri konsolda 
yazdýrýr ve robotun konumlarýný bir pencerede gösterir.

Program ilk çalýþtýrýldýðýnda robot için baþlangýç noktasý girilir. Ardýndan
ýzgara için engel yerleþtirilip yerleþtirilmeyeceði sorulur. Engel yerleþecekse
engel sayýsý ve koordinatlarý alýnýr.

Kaç robot girileceðini ve robotun tipini sorar. Buna baðlý olarak ilgili robot 
tipine iliþkin bilgileri kullanýcýdan alýr.

Robotun hangi yöne ilerleyeceði ve kaç birim ilerleyeceði sorulur. Bu bilgilere 
göre robot hareket ettirilir ve her adýmdan sonra robot ýzgarada tekrar çizdirilir.

Hesaplanan bazý deðerler(süre gibi) konsolda ekrana yazdýrýlýr. Robotun son konumu
ýzgara üzerinde gösterilir. Kaç robot var ise bu iþlem tekrarlanýr ve program 
sonlanýr.

Girilen koordinatlar sonucu robot ýzgaradan çýkarsa, ýzgara üzerindeki son konumu
gösterilir ve ýzgaradan çýkýldýðý bilgisi kullanýcýya verildikten sonra program
sonlanýr.

Spider robotlar için engelle karþýlaþma durumunda robot engelden geçemeyeceðinden
son konumu gösterilir ve program sonlanýr.