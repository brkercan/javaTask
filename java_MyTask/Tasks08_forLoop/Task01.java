package java_MyTask.Tasks08_forLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz...");
        int sayı1 = input.nextInt();

        System.out.println("farklı bir tam sayı daha giriniz...");
        int sayı2 = input.nextInt();

        if (sayı2 > sayı1) {
            for (int i = sayı1; i < sayı2; i++) {
                if (i%2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else if (sayı1 > sayı2) {
            for (int i = sayı2; i < sayı1; i++) {
                if (i%2 == 0){
                    System.out.print(i + " ");
                }
            }
        }else System.out.println("yanlış giriş yaptınız...");



        }

    }






















