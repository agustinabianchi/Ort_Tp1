package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
	private static Scanner input=new Scanner (System.in);
	public static void main(String[] args) {
		
		int num1, num2;
		
		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());
		
		if (num1>num2) {
			System.out.println(num1+" es mayor");
		} else {
			System.out.println(num2+ " es mayor");
		}
	}

}
