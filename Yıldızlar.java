import java.util.Scanner;

public class Yıldızlar {
    static void main() {
        int k ;
        int n;

        Scanner deger = new Scanner(System.in);
        System.out.println("degeri giriniz : ");
        k=deger.nextInt();
        n=k;

        for(int i = 1 ; i<=k ; i++){
            if(i==1){
                System.out.println(" ".repeat(k)+"*");
                continue;
            }
            if(i%2!=0 && i!=2){
                n--;
                System.out.println(" ".repeat(n)+"*".repeat(i));
            }
        }
    }
}
