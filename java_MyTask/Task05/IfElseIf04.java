package java_MyTask.Task05;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum�? yazdırın.
Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl�? yazdırın.
Eğer yıl 10’a bulunuyorsa ekrana “Onyıl�? yazdırın
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("yıl giriniz");
		int yıl = input.nextInt();

		if (yıl % 10 == 0){
			System.out.println("on yıl");
			if(yıl % 100 == 0) {
				System.out.println("yüzyıl");
				if (yıl % 1000 == 0) {
					System.out.println("milenyum");
				}
			}
		}else System.out.println("normal yıl");




}
}

	

