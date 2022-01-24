package Patika_TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtamasiHesaplayanProgram {

    public static void main(String[] args) {
        int mat,fizik,kimya,türkce,tarih,müzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        türkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        müzik = inp.nextInt();

        int toplam = mat + fizik + kimya + türkce + tarih + müzik ;
        double sonuc = toplam/ 6;
        String durum = (sonuc <= 60) ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(durum);











    }
}
