Robot Projesi

Fatma De�irmenci  -	170201008
Berfin K�semen	  -	170201058

Bu readme.txt dosyas�, Robot Projesi projesine aittir.
Bu paket, kaynak kodu ile ayn� dizin i�erisinde bulunacakt�r.


1-PAKET�N ��ER���:
-------------------
RobotProjesi.zip - Projenin kaynak kodunun ve yard�mc� dosyalar�n ziplenmi� hali.
170201008-170201058.txt - Projenin tek dosyaya indirgenmi� salt kaynak kodu.
rapor.doc - Proje raporu.
readme.txt - Bu dosya.
-------------------


2-S�STEM GEREKS�N�MLER�:
-------------------
java - Oracle Java� - http://java.com/
-------------------


3-KURULUM:
-------------------
Paket i�eri�ini, yukar�da g�rebilirsiniz.

Bu kod, iki adet Windows kurulu makinede �al��t�r�ld�.

Bu iki durumda da, kod, herhangi bir hata vermeksizin, daha �nceden
belirlenen kriterlere uygun �al��t�.

Projeyi �al��t�rmak i�in proje dizinine girip;
----------------------------
java -cp classes RobotProjesi.main
----------------------------
yazman�z yeterli. 


-------------------


4-KODU DERLEMEK:
------------------
Art�k bilgisayar�m�zda kurulu olan Java ile kodu kolayca derleyebiliriz.

Projeyi derlemek i�in proje dizinine girip;
----------------------------
javac -sourcepath ./src/RobotProjesi ./src/RobotProjesi/*.java -d ./classes/ -encoding UTF8
----------------------------
yazman�z yeterli. 
------------------


5- PARAMETRELER
-------------------
Kodun �al��mas� i�in ba�lang��ta herhangi bir parametre gerekmiyor.
------------------


6- PROGRAMIN KULLANIMI
-----------------------------
Robot Projesi, kullan�c�dan robot koordinatlar�, robot tipi, ka� robot
girilece�i, robotun hangi y�nlere gidece�i gibi bilgileri alarak, 20x20lik
bir �zgara �zerinde robotu hareket ettirir. Gerekli bilgileri konsolda 
yazd�r�r ve robotun konumlar�n� bir pencerede g�sterir.

Program ilk �al��t�r�ld���nda robot i�in ba�lang�� noktas� girilir. Ard�ndan
�zgara i�in engel yerle�tirilip yerle�tirilmeyece�i sorulur. Engel yerle�ecekse
engel say�s� ve koordinatlar� al�n�r.

Ka� robot girilece�ini ve robotun tipini sorar. Buna ba�l� olarak ilgili robot 
tipine ili�kin bilgileri kullan�c�dan al�r.

Robotun hangi y�ne ilerleyece�i ve ka� birim ilerleyece�i sorulur. Bu bilgilere 
g�re robot hareket ettirilir ve her ad�mdan sonra robot �zgarada tekrar �izdirilir.

Hesaplanan baz� de�erler(s�re gibi) konsolda ekrana yazd�r�l�r. Robotun son konumu
�zgara �zerinde g�sterilir. Ka� robot var ise bu i�lem tekrarlan�r ve program 
sonlan�r.

Girilen koordinatlar sonucu robot �zgaradan ��karsa, �zgara �zerindeki son konumu
g�sterilir ve �zgaradan ��k�ld��� bilgisi kullan�c�ya verildikten sonra program
sonlan�r.

Spider robotlar i�in engelle kar��la�ma durumunda robot engelden ge�emeyece�inden
son konumu g�sterilir ve program sonlan�r.