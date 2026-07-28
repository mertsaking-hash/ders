package giris;
import java.util.Scanner;

public class HesapMakinası {
    static void main() {
        int deger , deger2 , islem , sonuc;

        Scanner sayı = new Scanner(System.in);
        System.out.println("ilk sayıyı girin");
        deger = sayı.nextInt();
        System.out.println("ikinci sayıyı girin");
        deger2 = sayı.nextInt();

        System.out.println("seçiminizi yapın\n 1.toplama \n 2.çıkarma \n 3.bölme \n 4.çarpma\n");

        islem = sayı.nextInt();

        switch (islem){
            case 1:
                sonuc=deger+deger2;
                System.out.println("sonuc : " + sonuc);
                break;
            case 2:
                sonuc=deger-deger2;
                System.out.println("sonuc : " + sonuc);
                break;
            case 3:
                sonuc = deger/deger2;
                System.out.println("sonuc : " + sonuc);
                break;
            case 4:
                sonuc = deger*deger2;
                System.out.println("sonuc : " + sonuc);
                break;
            default:
                System.out.println("yanlıs işlem");
                break;
        }


    }
}
