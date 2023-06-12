package java_MyTask.Task05;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner input = new Scanner(System.in);
        System.out.println("enter your final score");
        int finalScore = input.nextInt();
        System.out.println("enter your midTerm score");
        int midTermScore = input.nextInt();
        System.out.println("enter your quiz score");
        int quizScore = input.nextInt();

        int yourScore = (finalScore + midTermScore + quizScore)/3;

        if (yourScore>=90 && yourScore<=100) {
            System.out.println("your grade is A");
        }else if (yourScore>=70 && yourScore<90) {
            System.out.println("your grade is B");
        }else if (yourScore>=50 && yourScore<70){
            System.out.println("your grade is C");
        }else System.out.println("your grade is F");


    }
}
