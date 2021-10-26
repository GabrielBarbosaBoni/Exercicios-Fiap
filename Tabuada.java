package twenty;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		
		int numero, tabuada, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número para realizar a tabuada:  ");
		numero = sc.nextInt();
		
		for(tabuada = 1; tabuada <13; tabuada++) {
		
			resultado = numero * tabuada;
			System.out.println(numero + " * " + tabuada + " = " + resultado);
		}
	}
}
