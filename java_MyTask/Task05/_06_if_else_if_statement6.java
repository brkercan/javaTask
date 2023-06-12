package java_MyTask.Task05;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz...");
        int sayı = input.nextInt();

        if (sayı>0) {
            System.out.println("I m positive");
        }else if (sayı<0) {
            System.out.println("I am negative");
        }else {
            System.out.println("Im neutral");
        }




    }
}
