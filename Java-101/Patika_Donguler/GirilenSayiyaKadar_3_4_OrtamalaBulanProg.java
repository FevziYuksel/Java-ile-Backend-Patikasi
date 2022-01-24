package Patika_Donguler;

import java.util.Scanner;

public class GirilenSayiyaKadar_3_4_OrtamalaBulanProg {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double start = 0;
        double sum = 0;
        int num = 0;
        System.out.println("Hangi sayıya kadar girmek istersiniz : ");
        double end = inp.nextDouble();

        while(start <= end ){
            if ((start%3 == 0) && (start%4 == 0)){
                sum += start;
                num++;
            }
            start++;
        }

        System.out.println(num);
        double result = sum/num;
        System.out.println("Ortalama = " + result);

    }
}
