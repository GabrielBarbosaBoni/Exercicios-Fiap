package twenty;

import java.util.Scanner;

public class inteiro {
	public static void main(String[]args) {
	
		int valor, x;
		Scanner sc = new Scanner(System.in);
		x = 0;
		System.out.println("Digite os 20 valores: ");
		for (int i = 0; i<20 ; i++ ) {
			valor = sc.nextInt();
			x = valor + x;
		}
		System.out.printf("A soma foi : %d " , x);
	}
}
