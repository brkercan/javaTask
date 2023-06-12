package java_MyTask.Task05;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */

        int num1 = 18;
        int num2 = 25;
        int num3 = 30;

        if (num1<num2 && num1<num3) {
            System.out.println(num1);
        }else if (num2<num3 && num2<num3) {
            System.out.println(num2);
        }else System.out.println(num3);






    }
}
