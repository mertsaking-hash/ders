import java.util.Scanner;

    public class gelismisHesapMakinası {

        static void plus(){
            Scanner deger = new Scanner(System.in);
            int  number, result= 0 ;
            while (true){
                System.out.println("Lütfen bir sayı girin : ");
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
                result-=number;
            }
            System.out.println("Sonuç : "+result);

        }
        static void carpma(){
            Scanner deger = new Scanner(System.in);
            int number , result = 1;
            while(true){
                System.out.println("Lütfen sayı gir :");
                number = deger.nextInt();
                if(number==0){
                    break;
                }
                result*=number;
            }
            System.out.println("sonuc : " + result);
        }
        static void Bolme(){
            double number , result =0;
            Scanner deger = new Scanner(System.in);

            while(true){
                System.out.println("lütfen sayı girin");
                number = deger.nextDouble();
                if(number==0)
                    break;
                if(result==0){
                    result=number;
                    continue;
                }
                result /=number;
            }
            System.out.println("Sonuç : " + result);
        }
        static void ÜslüSayılar(){
            double number ,number2, result=0;
            Scanner deger = new Scanner(System.in);
            System.out.println("alt Sayı girin : ");
                number = deger.nextDouble();
            System.out.println("üst Sayı girin : ");
                number2 = deger.nextDouble();
                for(int i =1 ; i<number2 ; i++){
                    if(i==1){
                        result = number*number;
                        continue;
                    }
                    result = result*number;
                }
                System.out.println("Sonuc : "+ result);
        }
        static void Faktoriyel(){
            Scanner deger = new Scanner(System.in);
            int number , result=1 ;
            number = deger.nextInt();
            for(int i =number; i <=number ; i-- ){
                if(number==i){
                    result=i;
                    continue;
                }
                if(i==0)
                    break;
                result = i*result;
            }
            System.out.println("Sonuc : " + result);
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
                        carpma();
                        break;
                    case 4:
                        Bolme();
                        break;
                    case 5:
                        ÜslüSayılar();
                        break;
                    case 6:
                        Faktoriyel();
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



        }while (!döngü);
    }
}
