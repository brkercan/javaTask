package java_MyTask.Task05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
           kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);


        System.out.println("ehliyetiniz var ise \'true\', yok ise \'false\' yazınız...");
        Boolean ehliyet = input.nextBoolean();

        if (ehliyet == true) {
            System.out.println("kac yıldır ehliyetiniz var...");
            int sure = input.nextInt();
            System.out.println("aldıgınız mesafe nedir...");
            int mesafe = input.nextInt();
            if (sure>=7 && mesafe>=100000){
                System.out.println("kontak anahatrını alabilirsiniz...");
            }else if (sure<7 && mesafe>=100000) {
                int eksikSure;
                eksikSure = 7-sure;
                System.out.println("eksikSure = " + eksikSure);
            }else if (sure>7 && mesafe<100000){
                int eksikMesafe;
                eksikMesafe = 100000 - mesafe;
                System.out.println("eksikMesafe = " + eksikMesafe);
            }else{
                int eksikSure;
                eksikSure = 7-sure;
                System.out.println("eksikSure = " + eksikSure);

                int eksikMesafe;
                eksikMesafe = 100000 - mesafe;
                System.out.println("eksikMesafe = " + eksikMesafe);
            }
        }else {
            System.out.println("kontak anahtarını alamazsınız...");
        }



    }
}
