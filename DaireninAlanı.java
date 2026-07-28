package giris;
import java.util.Scanner;

public class DaireninAlanı {
    static void main() {
        int merkezAci;
        int yarıCapi;
        float pi = 3.14f;

        Scanner deger = new Scanner(System.in);
        System.out.println("yarı çap degeri : ");
        yarıCapi = deger.nextInt();
        float daireninAlani = pi * yarıCapi * yarıCapi;
        float daireninCevresi = 2*pi*yarıCapi;
        System.out.println("Darenin cevresi : " + daireninCevresi%2.f + "\t\tdairenin alanı : " + daireninAlani);

        System.out.println("Belirli bir açı gir : ");
        merkezAci = deger.nextInt();
        float belirlibiralan = (merkezAci*pi*(yarıCapi*yarıCapi))/360;
        System.out.println("Belirli açının ölçüsü : "+ belirlibiralan);
    }
}
