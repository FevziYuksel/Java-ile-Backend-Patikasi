package Patika_TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKutleIndexiHesaplayanProgram {
    public static void main(String[] args) {
        double kilo , boy , index ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        index = kilo / (boy * boy ) ;

        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}
