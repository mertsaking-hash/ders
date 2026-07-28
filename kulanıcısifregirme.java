package giris;
import java.util.Scanner;

public class kulanıcısifregirme {
    static void main() {
        String kullanıcı = "mert" , sifre = "1111";

        Scanner girdi = new Scanner(System.in);

        System.out.println("adınızı girin");
        kullanıcı = girdi.nextLine();
        System.out.println("şifre girin");
        sifre = girdi.nextLine();

        if(kullanıcı.equals("mert") && sifre.equals("1111")){
            System.out.println("giriş başarılı");
        }else {
            System.out.println("başarısız");
        }
    }
}
