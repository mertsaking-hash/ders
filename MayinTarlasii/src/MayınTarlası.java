import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MayınTarlası {
    Scanner deger = new Scanner(System.in);

    int kolonSayısı ;
    int sutunSatısı ;
    String list [] [];
    String list2 [] [];
    int mayınSayısı = 0;
    int koyulanMayın;
    int randomSutun  ;
    int randomKolon ;
    boolean oyunBitti = true;
    int sayac ;
    boolean sayacBasladi = true;

    void MayınKoyma (){

        System.out.println("Sutun Sayısını girin ");
        sutunSatısı = deger.nextInt();
        System.out.println("Kolon Sayısını girin ");
        kolonSayısı = deger.nextInt();

        list= new String[sutunSatısı][kolonSayısı];
        list2= new String[sutunSatısı][kolonSayısı];


        for (int i = 0 ; i < sutunSatısı ; i++){
            for (int j = 0 ; j < kolonSayısı ; j++){
                list[i][j]= "*";
                list2[i][j]="*";
            }
        }
        mayınSayısı = (kolonSayısı * sutunSatısı )/4;

        while (koyulanMayın < mayınSayısı){

            randomSutun =(int) (Math.random()*sutunSatısı);
            randomKolon = (int) (Math.random()*kolonSayısı);

                list2[randomSutun][randomKolon] = "M";
                koyulanMayın ++;

        }

        yazdırma();
        secmek();
    }
    void yazdırma (){
        System.out.println("============================");
        if(oyunBitti){
            for ( int i = 0 ; i < sutunSatısı ; i ++ ){
                System.out.println(Arrays.deepToString(list[i]));}
        }else{
            for ( int i = 0 ; i < sutunSatısı ; i ++ ){
                System.out.println(Arrays.deepToString(list2[i]));}
        }

        System.out.println("============================");
    }
    void secmek (){
        while(oyunBitti){
            sayacBasladi = true;
            System.out.println("Vurmak istediğiniz degeri girin ");
            int sutunSecenek = deger.nextInt();
            int kolonSecenek = deger.nextInt();
            if(list2[sutunSecenek][kolonSecenek].equals("M")){
                System.out.println("Mayın Patladı!");
                list[sutunSecenek][kolonSecenek] = "-";

                oyunBitti = false;
            }else if (list2[sutunSecenek][kolonSecenek].equals("*")){

                System.out.println("Mayın Yok");

                    for( int i = sutunSecenek-1 ; i<sutunSatısı ; i ++ ){
                        if(i < 0){
                            i=0;
                        }
                        for( int j = kolonSecenek-1 ; j < kolonSayısı ; j ++){
                            if(j < 0){
                                j=0;
                            }
                            if(i == sutunSecenek && j == kolonSecenek
                                    || i> sutunSecenek+1  || j >kolonSecenek+1){
                                continue;
                            }else {
                                if (list2[i][j].equals("M")){
                                    sayac++;
                                    list[sutunSecenek][kolonSecenek]= String.valueOf(sayac);
                                }

                            }
                        }

                    }

                sayac = 0;
//le(sayacBasladi){
// if((kolonSecenek -1)>=0 ){
//     if(list[sutunSecenek][kolonSecenek - 1].equals("M")){
//         sayac++;
//     }
// }
// if( kolonSecenek + 1 < kolonSayısı ){
//     if(list[sutunSecenek][kolonSecenek + 1].equals("M")) {
//         sayac++;
//     }
// }

// if((sutunSecenek -1)>=0 ){
//     if(list[sutunSecenek - 1 ][kolonSecenek].equals("M")){
//         sayac++;
//     }
// }
// if(sutunSecenek +1 < sutunSatısı){
//     if(list[sutunSecenek + 1 ][kolonSecenek].equals("M")){
//         sayac++;
//     }
// }
// list[sutunSecenek][kolonSecenek] = String.valueOf(sayac);
// sayacBasladi = false;
// sayac = 0;
//

            }else {
                System.out.println("Daha önce seçildi başka kordinat girin ");
            }
            yazdırma();

        }

    }

}