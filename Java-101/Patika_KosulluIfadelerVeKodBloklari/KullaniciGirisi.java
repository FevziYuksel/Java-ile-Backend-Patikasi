package Patika_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password, new_password;
        int choise;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriz Yanlış ! ");
            // asking for new password
            System.out.println("Yeni Şifre oluşturmak isterseniz yeni şifreyi giriniz , yoksa boş bırakınız");
            new_password = inp.nextLine();
            if (new_password.equals(password)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
            else if(new_password.equals("")) {
            }
            else{
                password = new_password ;
                System.out.println("Şifre oluşturuldu");
                // System.out.println(password);   // debugging purpose
            }
        }
    }
}