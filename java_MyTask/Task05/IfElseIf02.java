package java_MyTask.Task05;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("ucgenin 1. kenar uzunlugunu giriniz");
		int kenar1 = input.nextInt();
		System.out.println("ucgenin 2. kenar uzunlugunu giriniz");
		int kenar2 = input.nextInt();
		System.out.println("ucgenin 3. kenar uzunlugunu giriniz");
		int kenar3 = input.nextInt();

		if (kenar1 == kenar2 && kenar1 == kenar3){
			System.out.println("eskenar ucgen");
		}else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar3 == kenar1){
			System.out.println("eskenar ucgen");
		}else System.out.println("cesitkenar ucgen");


	}
	

}
