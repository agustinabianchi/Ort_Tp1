package Ejercicios;

import java.util.Scanner;

public class Ejercicio26 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		/*26.Realiz� un programa que permita al usuario ingresar un n�mero natural n. La computadora
		debe mostrar los primeros n m�ltiplos de 3 excepto aquellos que sean a la vez m�ltiplos de
		5.*/
		
		int num1;
		
		System.out.println("Ingrese un n�mero natural");
		num1 = Integer.parseInt(input.nextLine());
		
		for(int i=1; 1 <= num1; i++) {
			if(i % 5 != 0 ) {
				System.out.println(3*i);
				
			}
		}
		
		input.close();
	}

}
