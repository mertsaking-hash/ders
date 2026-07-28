package giris;
import java.util.Scanner;

public class Artıkyıl {
    static void main() {
        float yıl;
        float yıl2;

        Scanner deger = new Scanner(System.in);

        System.out.println("Yılı giriniz : ");

        yıl=deger.nextInt();

        yıl =yıl%4;
        yıl2 =%400;

        if (yıl==0){
            System.out.println("bu bir artık yıldır ");
        }else {
            System.out.println("bu artık yıl DEĞİL");
        }
    }
}
