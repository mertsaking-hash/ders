package giris;
import java.util.Scanner;

public class TaksiMetre {
    static void main() {
        double kmBaşınaÜcret = 2.2;
        int MinimumTutar = 20;
        int TaksimetreAcılısUcreti = 10;
        int gidilenYol ;
        double tutar;

        Scanner yol = new Scanner(System.in);
        System.out.println("kaç km gitti : ");
        gidilenYol = yol.nextInt();

        tutar = (gidilenYol*kmBaşınaÜcret)+TaksimetreAcılısUcreti;

        if(tutar <= MinimumTutar){
            tutar = MinimumTutar;
        }

        System.out.println("Ödenecek tutar : " + tutar);

    }
}
