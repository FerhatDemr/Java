package Metod_deneme;

public class asal {
    public static void main(String[] args) {
        //Girilen iki sayının arasındaki asal sayıları bulan program
        asal(0, 100);
        
    }
    public static void asal(int a,int b){
        int kalan;
        int adet;
        for(int i=a;i<=b;i++){
            adet=0;
            for(int j=1;j<=i;j++){
                kalan=i%j;
                if(kalan==0) adet++;
            }
            if(adet==2) System.out.println(i);
        }
    }
    
}
