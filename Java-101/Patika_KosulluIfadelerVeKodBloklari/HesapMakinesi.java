package Patika_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double a , b ;
        int select ;
        Scanner scan = new Scanner(System.in);

        System.out.println("İşlem yapmak istediğiniz sayıları sırasıyla giriniz");
        a = scan.nextDouble();
        b = scan.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                /*
                Alternative but worse method
                String c , d, e = "";
                d = "Paydada 0 olursa sonuç = ";
                c = (b == 0)? d : e ;
                System.out.println(c + ((a/b));
                 */
                switch ((int) b){
                    case 0 :
                        break;
                    default:
                        System.out.println(a/b);
                }
                break;
            default:
                throw new IllegalStateException("Tanımlanmayan işlem: " + select);
        }
    }
}
