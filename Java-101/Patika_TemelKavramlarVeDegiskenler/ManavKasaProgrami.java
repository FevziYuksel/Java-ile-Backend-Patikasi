package Patika_TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican,fiyat;
        Scanner scan = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        armut = scan.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        elma = scan.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        domates = scan.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        muz = scan.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        patlican = scan.nextDouble();

        fiyat = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.println("Toplam Tutar : " + fiyat );
    }
}
