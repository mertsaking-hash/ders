package giris;
import java.util.Scanner;

public class UcakBileti {
    static void main() {
        int yas;
        int mesafe;
        int gidis ;
        double mesafeBasiÜcret = 0.1;
        double tutar = 0;

        int adanaMesafe =10;
        int hatayMesafe = 20;
        int ankaraMesafe =30;

        Scanner veri = new Scanner(System.in);
        System.out.println("Yasinizi giriniz : ");
        yas = veri.nextInt();
        System.out.println("adana 1 \n hatay 2 \n ankara \n nereye gitmek istiyorsunuz giriniz : ");
        mesafe = veri.nextInt();
        System.out.println("gidis 1 , gidiş dönüş 2, giriniz : ");
        gidis = veri.nextInt();

        if(mesafe==1){
            mesafe = adanaMesafe;
            tutar = mesafe * mesafeBasiÜcret;
        }
        else if(mesafe==2){
            mesafe = hatayMesafe;
            tutar = mesafe * mesafeBasiÜcret;
        }
        else if(mesafe==3){
            mesafe = ankaraMesafe;
            tutar = mesafe * mesafeBasiÜcret;
        }else{
            System.out.println("Yanlis Bilgi");
        }

        if(gidis==2){
            if(yas<=12 && yas > 0){
                tutar= (tutar/100)*50;
            } else if (yas<=24 && yas >12) {
                tutar= (tutar/100)*90;
            } else if (yas>65) {
                tutar= (tutar/100)*70;
            }else {
                System.out.println("Yanlis Bilgi");
            }
            tutar=(tutar/100)*80;
            tutar = tutar*2;
        } else if (gidis==1) {
                if(yas<=12 && yas > 0){
                    tutar= (tutar/100)*50;
                } else if (yas<=24 && yas >12) {
                    tutar= (tutar/100)*90;
                } else if (yas>65) {
                    tutar= (tutar/100)*70;
                }else {
                    System.out.println("Yanlis Bilgi");
                }
        }

        System.out.println("Ücret Tutarınız : "+tutar);
    }
}
