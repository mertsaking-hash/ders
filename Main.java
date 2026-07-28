import java.util.Scanner;


void main() {
int kullanıcı ;
boolean sifreDogru =false;

Scanner deger = new Scanner(System.in);

while (!sifreDogru) {

    System.out.println("şifreyi giriniz : ");
    kullanıcı = deger.nextInt();

    if(kullanıcı==123){
        System.out.println("şifre Dogru ");
        sifreDogru = true;
}else {
        System.out.println("şifre yanlış tekrar dene");
    }
}
}
