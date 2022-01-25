package Patika_KosulluIfadelerVeKodBloklari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c ;
        double average ;
        String str = "";
        System.out.println("a adet sayıları giriniz : ");
        a = input.nextInt();
        System.out.println("b adet sayıları giriniz : ");
        b = input.nextInt();
        System.out.println("c adet sayıları giriniz : ");
        c = input.nextInt();

        if ( a < b){
            if ( a < c){
                str = str + "a < ";
            }
        }


    }
}
