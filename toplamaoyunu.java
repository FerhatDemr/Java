package Ödev;
import java.util.Random;
import java.util.Scanner;
//TOPLAMA ISLEMI OYUNU

public class ödev2 {
    public static void main(String[] args) {
        
        int sayi1,sayi2,cevap;
        Scanner giris=new Scanner(System.in);
        int puan=0,dogru=0,yanlıs=0;
        char karar;


        do {
            Random rnd = new Random();
            sayi1=rnd.nextInt(101);
            sayi2=rnd.nextInt(101);
            System.out.println(sayi1+"+"+sayi2+"=?");
            System.out.println("Cevap:");
            cevap=giris.nextInt();
            if(cevap==sayi1+sayi2) {
                System.out.println("Tebrikler bildiniz.") ;
                puan+=3;
                dogru++;
            }
            else {
                System.out.println("Üzgünüm bilemedeiniz.");
                puan-=2;
                yanlıs++;
            }
            System.out.println("Tekrar oynamak istiyor musunuz(e/E)?");
            karar=giris.next().charAt(0);

            
        } while (karar=='e'||karar=='E');
        System.out.println(dogru+" tane doğru "+yanlıs+" tane yanlış cevap verdiniz.Puan="+puan);
    }
}
