package giris;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class manav {
    static void main() {
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz= 0.95;
        double Patlıcan = 5.00;

        Scanner kacKilo = new Scanner(System.in);
        System.out.println("Armut kaç kilo : ");
        int armut = kacKilo.nextInt();
        System.out.println("Elma kaç kilo : ");
        int elma = kacKilo.nextInt();
        System.out.println("Domates kaç kilo : ");
        int domates = kacKilo.nextInt();
        System.out.println("Muz kaç kilo : ");
        int muz = kacKilo.nextInt();
        System.out.println("Patlıcan kaç kilo : ");
        int patlıcan = kacKilo.nextInt();
        double tutar = Armut*armut + Elma * elma + Domates * domates + muz* Muz + Patlıcan*patlıcan;
        System.out.println("Toplam tutar : " + tutar);

    }
}
