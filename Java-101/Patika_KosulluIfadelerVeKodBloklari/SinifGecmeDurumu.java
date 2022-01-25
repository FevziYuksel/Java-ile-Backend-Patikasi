package Patika_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, musik;
        int counter = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();
        if ( mat< 0 || mat > 100) mat = 0;
        else counter++;

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        if ( fizik< 0 || fizik > 100) fizik = 0;
        else counter++;

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        if ( turkce < 0 || turkce > 100) turkce = 0;
        else counter++;

        System.out.println("Kimya notunuz : ");
        kimya  = input.nextInt();
        if ( kimya< 0 || kimya > 100) kimya = 0;
        else counter++;

        System.out.println("Muzik notunuz : ");
        musik = input.nextInt();
        if ( musik < 0 || musik > 100) musik = 0;
        else counter++;

        counter = (counter == 0)? 1 : counter ;





        double average = (mat + fizik + turkce + kimya + musik )/counter;
        if(average <= 55 ){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşürüz");
        }
        else{
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
