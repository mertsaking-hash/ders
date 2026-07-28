package giris;
import java.util.Scanner;

public class ücgeninAlanı {
    static void main() {
        double ucgeninAlanı , ucgeninCevresi;
        int a;
        int b;
        int c;

        Scanner deger = new Scanner(System.in);
        System.out.println("a uzunluğunu girin : ");
        a = deger.nextInt();
        System.out.println("b uzunluğunu girin : ");
        b = deger.nextInt();
        System.out.println("c uzunluğunu girin : ");
        c = deger.nextInt();

        ucgeninCevresi = a+b+c;

        double u = ucgeninCevresi/2;

        ucgeninAlanı = u*(u-a)*(u-b)*(u-c);
        ucgeninAlanı = Math.sqrt(ucgeninAlanı);

        System.out.println("ucgenin Alanı : " + ucgeninAlanı);


    }
}
