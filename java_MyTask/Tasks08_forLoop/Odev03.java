package java_MyTask.Tasks08_forLoop;

public class Odev03 {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */

        int toplam = 0;

        for (int i = 0; i < 10 ; i++){
            toplam = i + toplam;
        }
        System.out.println(toplam);




    }
}
