package Ejercicios;
import java.util.Scanner;
public class Ejemplo06 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese un número");
		int numero = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un nombre");
		String nombre = input.nextLine();
		
		System.out.println("El número es "+numero+" y el nombre es "+nombre);
		
		input.close();	
	}

}
