package java_MyTask.Task05;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        /**
         *  int hiz = 56;
         *        int ceza=0;
         *        boolean ehliyet=false;
         *        if (hiz>=55 && hiz<=74) ceza = 100;
         *        if (hiz>=75 && hiz<=84) ceza = 150;
         *        if (hiz>=85 && hiz<=94) ceza = 320;
         *        if (hiz>=95 ) ceza = 500;
         *        if (!ehliyet && ceza>0) ceza +=200;
         *         System.out.println(ceza);
         */

        Scanner input = new Scanner(System.in);
        System.out.println("ehliyet var mi,ehliyet varsa true yoksa false: ");
        boolean ehliyet = input.nextBoolean();
        System.out.println("Hızınız: ");
        int hiz = input.nextInt();
        int ceza = 0;
        if (ehliyet) {
            if (hiz >= 55 && hiz <= 74) {
                ceza = 100;
                System.out.println("Ceza" + ceza + " $'dır.");
            } else if (hiz >= 75 && hiz <= 84) {
                ceza = 150;
                System.out.println("Ceza" + ceza + "  $'dır.");
            } else if (hiz >= 85 && hiz <= 94) {
                ceza = 320;
                System.out.println("Ceza" + ceza + " $'dır.");
                System.out.println("Ceza 320 $'dır.");
            } else if (hiz > 94) {
                ceza = 500;
                System.out.println("Ceza" + ceza + " $'dır.");
                System.out.println("Ceza 500 $'dır.");
            } else {
                System.out.println("hiziniz normaldır.");
            }
        } else {
            if (hiz >= 55 && hiz <= 74) {
                ceza = 100 + 200;
                System.out.println("Ceza" + ceza + " $'dır.");
            } else if (hiz >= 75 && hiz <= 84) {
                ceza = 150 + 200;
                System.out.println("Ceza" + ceza + "  $'dır.");
            } else if (hiz >= 85 && hiz <= 94) {
                ceza = 320 + 200;
                System.out.println("Ceza" + ceza + " $'dır.");
                System.out.println("Ceza 320 $'dır.");
            } else if (hiz > 94) {
                ceza = 500 + 200;
                System.out.println("Ceza" + ceza + " $'dır.");
                System.out.println("Ceza 500 $'dır.");
            } else {
                System.out.println("Ceza 200 $'dır.");
                ;
            }
        }if (!ehliyet)
            ceza=200;
    }
}




