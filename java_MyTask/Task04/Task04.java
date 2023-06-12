package java_MyTask.Task04;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

                  /* Verilen 3 tane int (num1,num2,num3),
           Bu üç int'in toplamı yazdırın.   */

        int num1 = 96;
        int num2 = 13;
        int num3 = 21;
        int toplam = num1 + num2 + num3;
        System.out.println("toplam = " + toplam);


         /* Verilen iki int hakkında (num1,  num2),
        İlk int'i ikinci int'e bölün.
        Sonucu yazdırın. */

        System.out.println(num1/num2);


          /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        int sonuc = num1/num2;
        System.out.println("sonuc = " + sonuc);


          /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        double say1 = 23.4;
        double say2 = 3.4;
        double say3 = 4.33;
        double sonuc1 = say1*say2*say3;

        System.out.println("sonuc1 = " + sonuc1);


          /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        double say4 = 2.34;
        double say5 = 2.34;
        double say6 = 2.34;
        double say7 = 2.34;

        double sonuc2 = say4*say5*say6*say7;
        System.out.println("sonuc2 = " + sonuc2);


         /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */
        int num4 = 21;
        int sonuc4 = num1*num2*num3*num4;

        System.out.println("sonuc4 = " + sonuc4);


            /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        int sonuc5 = num1%num2;
        System.out.println("sonuc5 = " + sonuc5);


       /*   Bir integer oluşturun ve değeri 13 olsun.
                Başka bir integer daha oluşturun ve değeri 10 olsun.
                Print kodunun içine Ilk int ,ikinci int'ten büyüktür yazın. (>,< simgeleri ile)
                Console' da 'true' yazısını görmelisiniz.        */

        int sayi1 = 13;
        int sayi2 = 10;
        System.out.println(sayi1>sayi2);




          /*    İki ayrı integer oluşturun.
            İlk integerin değeri 17,
            İkinci integerin değeri 20 olsun.
            Print kodunun içine, ilk int ikinci int'ten küçüktür yazın.(<,> simgeleri ile)
            Console'da true yazısını görmelisiniz. */

        int sayi3 = 17;
        int sayi4 = 20;
        System.out.println(sayi3 < sayi4);


            /* İki integer oluştur.
           İkisinin de değeri 13 olsun.
           Print kodunun içine, ilk int ikinci inte küçük veya eşittir yazın ve yazdırın.
           Console'da true yazısını görmelisiniz.
           Örnek:   15>=15  */

        int sayi5 = 13;
        int sayi6 = 13;
        System.out.println(sayi5 <= sayi6);


        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        System.out.println(sayi5 == sayi6);


        /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        double sayi7 = 34.556;
        double sayi8 = 34.5567;
        System.out.println(sayi7 == sayi8);


          /*    2 tane String oluşturun.
          String 1 "Apple" String 2 "Apple"
          İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.  */

        String name1 = "Apple";
        String name2 = "Apple";

        System.out.println(name1 == name2);


        /*  İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
            Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
            Sonucu yazdırınız. */

        float sayi10 = 14f;
        float sayi11 = 17f;
        System.out.println(sayi10 >= sayi11);
        System.out.println(sayi10 > sayi11);


         /*  2 double oluşturun.
            İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
            Double1'in double2'ye eşit olmadığını doğrulayın.
            Eğer eşit değilse cevap true olmalı.
            Cevabı yazdırınız.  */

        double number = 14.23;
        double number1 = 19.52;
        System.out.println(number == number1);




        /*    2 String oluşturunuz.
          İlk String'in değeri "Techno Study", ikinci String'in değeri de "Techno Study" olsun.
          İlk String'in ikinci String'e eşit olmadığını doğrulayın. örn: (  !=    işareti ile)
          Eğer eşit değilse cevap true, eğer eşitse cevap false olacaktır.
          Cevabı yazdırın.  */

        String word = "Techno Study";
        String word1 = "Techno Study";
        System.out.println(word != word1);

        /*    2 double oluşturun.
          İkisinin de değeri 14.23 olsun.
          Double1'in double2 'den küçük olup olmadığını doğrulayın.(Eğer küçükse konsolda 'true' yazacaktır.)
          Cevabı yazdırın.  */

        double sayi20 = 14.23;
        double sayi21 = 14.23;
        System.out.println(sayi20 < sayi21);


           /*  2 int oluşturun. int 1 'in değeri 120,
        int 2'nin değeri 158 olmalı.
        int 1 'in int 2'den büyük olup olmadığını doğrulayın.
        (Eğer int1, int2'den büyükse konsolda true sonucu vermeli.)
        Cevabı yazdırın.  */

        int int1 = 120;
        int int2 = 158;
        System.out.println(int1>int2);



        /* Soru
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz...");
        int sayi33 = input.nextInt();
        System.out.println(sayi33/100 + sayi33%10);


        /*
         * Girilen saati  saniyeye çeviren program yazınız
         * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */

        System.out.println("saati giriniz...");
        int saat1 = input.nextInt();
        System.out.println("dakikayı giriniz...");
        int saat2 = input.nextInt();
        System.out.println("SaniyeToplam : " + ((saat1*3600)+(saat2*60)));


        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        System.out.println("3 basamaklı bir sayı giriniz...");
        int sayıuc = input.nextInt();
        System.out.println("Gırdıgınız sayının birler basamagı : " + sayıuc%10 + "\n" +
                            "Gırdıgınız sayının onlar basamagı : " + (sayıuc%100)/10 + "\n" +
                            "Gırdıgınız sayının yuzler basamagı : " + (sayıuc/100));


        /* Soru 5:
          120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
         */

        int mat = ((120/60)*10 + 20) - 40;
        System.out.println("mat = " + mat);


        /*
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */

        int sanıye;
        sanıye = 4250;
        System.out.println(sanıye/3600 + " saat " + (sanıye%3600)/60 + " dakıka " + (sanıye%3600)%60 + " sanıye");


         /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

        int ınek = 34;
        int koyun = 21;
        int tavuk = 2;

        int ayakSayısı = ınek*4 + koyun*4 +tavuk*2;





    }
}
