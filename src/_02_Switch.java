package Gun13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        int birlerBasamagi= sayi %10;

        switch (birlerBasamagi){
            case 0 : System.out.println("sıfır");break;
            case 1 : System.out.println("bir");break;
            case 2 : System.out.println("iki");break;
            case 3 : System.out.println("üç");break;
            case 4 : System.out.println("dört");break;
            case 5 : System.out.println("beş");break;
            case 6 : System.out.println("altı");break;
            case 7 : System.out.println("yedi");break;
            case 8 : System.out.println("sekiz");break;
            case 9 : System.out.println("dokuz");break;
        }


    }
}
