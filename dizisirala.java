package Sınav_Denemeleri;

import java.util.Arrays;
import java.util.Random;
//50 Elemanlı ve Elemanları Rastgele Atanan Bir Diziyi Sıralama
public class dizisirala {
    public static void main(String[] argss){
        diziyiSirala();

    }
    public static void diziyiSirala(){
        int dizi[]=new int[50];
        Random rnd=new Random();
        for(int i=0;i<50;i++){
            dizi[i]=rnd.nextInt(101);
        }
        Arrays.sort(dizi);
        for(int i=0;i<50;i++)
            System.out.println(dizi[i]);


        

    }
}
