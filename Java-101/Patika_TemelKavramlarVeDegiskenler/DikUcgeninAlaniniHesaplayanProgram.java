package Patika_TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DikUcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;

        Scanner k = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a = k.nextInt();
        System.out.println("2. Kenarı Giriniz : ");
        b= k.nextInt();
        System.out.println("3. Kenarı Giriniz : ");
        c = k.nextInt();

        u=(a+b+c)/2;
        alan = u*(u-a)*(u-b)*(u-c);

        System.out.println("Üçgenin alanı = "+  alan);
    }
}
