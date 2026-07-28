import java.util.Scanner;

public class HarmonidSayılar {
    static void main() {
        int n ;
        double toplam = 0;

        Scanner deger = new Scanner(System.in);

        System.out.println("n degerini giriniz : ");
        n= deger.nextInt();

        int k=1;
        while(k<=n){
            toplam = toplam+(1.0/k);
            k++;
        }
        System.out.println(toplam);
    }
}
