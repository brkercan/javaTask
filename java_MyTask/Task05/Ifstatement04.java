package java_MyTask.Task05;

import java.util.Scanner;

public class Ifstatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz...");
		int sayı = input.nextInt();

		if (sayı/100 >= 1 && sayı/100 < 10){
			System.out.println("3 basamaklı sayı girdiniz...");
		}else if (sayı/10 >= 1 && sayı/10 <10){
			System.out.println("2 basamaklı sayı girdiniz...");
		}else System.out.println("2 basamaklı da 3 basamaklı da değil...");

	}

}
