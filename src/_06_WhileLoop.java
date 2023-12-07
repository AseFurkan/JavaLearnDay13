package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        int toplam =0;
        int sayac=1;

        while (sayac<=6){
            System.out.print(sayac+". Sayıyı giriniz =");
            int sayi= read.nextInt();
            sayac++;
            if (sayi>0)
                toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
