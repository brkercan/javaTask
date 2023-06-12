package java_MyTask.Task05;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("bir harf giriniz...");
		String harf = scanner.nextLine();

		if (harf.equals(harf.toUpperCase())) {
			System.out.println("buyuk harf...");
		}else if (harf.equals(harf.toLowerCase())) {
			System.out.println("kucuk harf...");
		}else System.out.println("harf degil...");



		

		


} 

}
