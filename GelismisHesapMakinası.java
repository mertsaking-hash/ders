package giris;
import java.util.Scanner;

public class GelismisHesapMakinası {

    static void plus(){
        Scanner deger = new Scanner(System.in);
        int  number, result= 0 ;
        while (true){
            System.out.println("Lütfen bir sayı girin1 : ");
            number = deger.nextInt();
            if(number==0)
                break;
            result+=number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void eksi(){
        Scanner deger = new Scanner(System.in);
        int number , result = 0;
        while (true){
            System.out.println("Lütfen sayı girin : ");
            number = deger.nextInt();
            if(result==0){
                result+=number;
                continue;
            }
            if(number==0){
                break;
            }
            System.out.println(result+"aaaaaaa");
            result-=number;
        }
        System.out.println("Sonuç : "+result);

    }

    static void carpma(){

    }
    static void main() {
        Scanner deger = new Scanner(System.in);
        boolean döngü = true;
        int select;
        String menü =
                  "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        do{
            System.out.println(menü);
            System.out.println("Lütfen bir islem seçiniz : ");
            select = deger.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    eksi();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    döngü=false;
                    break;
                default:
                    System.out.println("Yanlış numara girdiniz...");
            }


        }while (!döngü);
    }
}
