package java_MyTask.Task05;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        int num1 = 18;
        int num2 = 25;
        int num3 = 30;

        if (num1>num2 && num1>num3) {
            System.out.println(num1);
        }else if (num1<num2 && num3<num2) {
            System.out.println(num2);
        }else System.out.println(num3);





    }
}
