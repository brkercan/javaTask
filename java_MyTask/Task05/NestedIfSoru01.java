package java_MyTask.Task05;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("cinsiyetinizi giriniz.. ");
		String cınsıyet = input.nextLine();
		System.out.print("yasınızı giriniz.. ");
		int yas = input.nextInt();

		if (cınsıyet.equalsIgnoreCase("erkek")) {
			if (yas>18){
				System.out.println("adam");
			}else System.out.println("erkek cocuk");
		}else{
			if (yas>18){
				System.out.println("kadın");
			}else System.out.println("kız cocuk");
		}






		
	}
}
