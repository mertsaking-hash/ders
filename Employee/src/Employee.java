public class Employee {
    String adı;
    int maas;
    int calismaSaati;
    int isBaslamaYıl;


    Employee( String adı , int maas, int calismaSaati , int isBaslamaYıl){
        this.adı = adı;
        this.maas = maas;
        this.calismaSaati = calismaSaati;
        this.isBaslamaYıl = isBaslamaYıl;

    }

    int vergi(){
        if(this.maas <=1000){
            System.out.println("Vergiden muaf! ");
            return 0;
        }else {
            return  (this.maas/100)*3;
        }

    }

    double bonus (){
        if(this.calismaSaati> 40){
            return  (this.calismaSaati-40)*30;
        }else {
            return 0;
        }
    }
    int zam(){
        int yıl = 2026-this.isBaslamaYıl;
        if(yıl <10){
            return  ((this.maas /100 )*5);
        }
        else if(yıl >10 && yıl <20){
            return   ((this.maas /100 )*10);
        }else{
            return  ((this.maas /100 )*5);
        }

    }
    String bilgiler (){

      return
        "Adı \t:" +this.adı+"\n"+
        "Maası\t:" + this.maas+"\n"+
        "Calisma Saati\t:"+ this.calismaSaati+"\n"+
        "Baslangıc Yılı \t:"+ this.isBaslamaYıl+"\n"+
        "Vergi\t:"+this.vergi()+"\n"+
        "Bonus \t:" + this.bonus()+"\n"+
        "Maas Artışı \t:" + this.zam()+"\n"+
        "Vergi ve bonuslar ile maas \t : "+(this.maas-this.vergi()+this.bonus())+"\n"+
        "Toplam Maas \t:" + (this.maas - this.vergi()+this.bonus()+this.zam());
    }
}
