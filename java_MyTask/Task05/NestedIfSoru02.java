package java_MyTask.Task05;

import java.util.Scanner;

public class NestedIfSoru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("bir harf giriniz...");
		String harf = input.nextLine();

		if (harf.equals(harf.toLowerCase())) {
			if (harf.equals("a")) {
				System.out.println("“Ilk küçük harf” ");
			}else System.out.println("“Ilk küçük harf değil”");
		}else {
			if (harf.equals("Z")) {
				System.out.println("Son büyük harf");
			}else System.out.println("Son büyük harf değil");
		}






	}

}
