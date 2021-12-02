package examenegit;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números:");
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("¿Qué quieres realizar?");
		System.out.println("1.Suma\n2.Resta\n3.División\n4.Multiplicación");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("La suma es "+(num1+num2));
			break;
		case 2:
			System.out.println("La resta es "+(num1-num2));
			break;
		case 3:
			System.out.println("La división es "+(num1/num2));
			break;
		case 4:
			System.out.println("La multiplicación es "+(num1*num2));
			break;
		}
		sc.close();

	}

}
