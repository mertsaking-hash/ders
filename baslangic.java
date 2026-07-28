package giris;
import java.util.Scanner;

public class baslangic {
    static void main() {

        int Tarih = 0;
        int Mat = 0;
        int turkce = 0;
        int muzik = 0;
        int beden = 0;


        for (int i = 0; i <= 5; i++) {

            Scanner sınavNotuVize = new Scanner(System.in);
            Scanner sınavNotuFinal = new Scanner(System.in);
            //Sınav notu
            System.out.println("Vize notunu giriniz : ");
            int V = sınavNotuVize.nextInt();
            System.out.println("Final notunu giriniz : ");
            int F = sınavNotuFinal.nextInt();
            int sınavSonucu = (V + F) / 2;
            if (Tarih == 0) {
                Tarih = sınavSonucu;
                System.out.println(" Tarih Dönem Sonu Notu ; " + sınavSonucu);
            } else if (Mat == 0) {
                System.out.println(" Matematik Dönem Sonu Notu ; " + sınavSonucu);
                Mat = sınavSonucu;
            } else if (turkce == 0) {
                System.out.println(" Türkçe Dönem Sonu Notu ; " + sınavSonucu);
            } else if (muzik == 0) {
                System.out.println(" Müzik Dönem Sonu Notu ; " + sınavSonucu);
            } else if (beden == 0) {
                System.out.println(" beden Dönem Sonu Notu ; " + sınavSonucu);

            }
        }
    }
}