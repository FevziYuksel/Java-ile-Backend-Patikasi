package Patika_TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireninAlaniniVeÇevresiniHesaplayanProgram {
    public static void main(String[] args) {
        int r,cevap;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);

        System.out.println("Daire diliminin Alanını hesaplamak istiyorsanız evet için 1 giriniz");
        cevap = inp.nextInt();
        System.out.println("Yarıçapı giriniz:");
        r = inp.nextInt();

        if (cevap == 1) {
            System.out.println("Daire dilimin açısını giriniz");
            int alpha= inp.nextInt();
            double parcaAlan = (pi * r * r * alpha) / 360;
            System.out.println("Daire diliminin Alanı =" + parcaAlan);
        }

        double alan = pi * r * r ;
        double cevre = 2 * pi * r ;

        System.out.println("Dairenin Alanı =" + alan);
        System.out.println("Dairenin Çevresi =" + cevre);


    }
}