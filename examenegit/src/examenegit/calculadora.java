package examenegit;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos n�meros:");
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("�Qu� quieres realizar?");
		System.out.println("1.Suma\n2.Resta\n3.Divisi�n\n4.Multiplicaci�n");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("La suma es "+(num1+num2));
			break;
		case 2:
			System.out.println("La resta es "+(num1-num2));
			break;
		case 3:
			System.out.println("La divisi�n es "+(num1/num2));
			break;
		case 4:
			System.out.println("La multiplicaci�n es "+(num1*num2));
			break;
		}
		sc.close();

	}

}
