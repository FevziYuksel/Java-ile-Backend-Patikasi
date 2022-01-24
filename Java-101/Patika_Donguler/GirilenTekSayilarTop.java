package Patika_Donguler;

import java.util.Scanner;

public class GirilenTekSayilarTop {
    public static void main(String[] args) {
        int sum = 0;
        int number ;
        Scanner inp = new Scanner(System.in);

/*
        System.out.println("Sayı giriniz : ");
        int number = inp.nextInt();
        while((number % 2) == 0){
            if (number % 4 == 0){
                sum += number;
            }
            number = inp.nextInt();
        }
 */
        // with do while, I don't need to
        do{
            System.out.println("Sayı giriniz");
            number = inp.nextInt();
            if (number % 4 == 0){
            sum += number;
            }
        }while((number % 2) == 0);

        System.out.println(sum);
    }
}
