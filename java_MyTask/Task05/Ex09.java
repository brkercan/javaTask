package java_MyTask.Task05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {


         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */

        Scanner input = new Scanner(System.in);
        System.out.println("yılı giriniz");
        int yıl = input.nextInt();

        if (yıl%100 == 0 && yıl % 400 == 0) {
            System.out.println("leap year");
        }else if (yıl%100 != 0 && yıl % 4 == 0) {
            System.out.println("leap year");
        }else System.out.println("not leap year");







    }
}
