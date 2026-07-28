package giris;
import java.util.Scanner;

public class kdv {
    static void main() {
        int fiyat;

        Scanner deger = new Scanner(System.in);
        System.out.println("deger gir");
        fiyat = deger.nextInt();
        if(fiyat>=1000){
            fiyat = (fiyat/100)*118;
        }else {
            fiyat = (fiyat/100)*108;
        }
        System.out.println("Etiket fiyatı : " + fiyat);
    }
}
