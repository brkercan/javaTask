package java_MyTask.Tasks08_forLoop;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.println("1'den büyük bir tam sayı giriniz...");
        int sayı = input.nextInt();

        int kareToplam = 0;

        if (sayı<=1){
            System.out.println("yanlış giriş yaptınız...");
        }else{
            for (int i = 1; i <= sayı ; i++) {
                kareToplam = kareToplam + (i * i);
            }
                System.out.println("Girilen sayı = " + sayı + "\n" +
                                    "Kareler toplamı = " + kareToplam);

        }

    }
}
