package Ejercicios;
import java.util.Scanner;
	
public class Ejercicio5 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int intercambio;
		
		//Ingreso el primer número
		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());
		
		//Ingreso el segundo número
		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());	
		
		//Muestro valores
		System.out.println("El valor de num1 es: "+num1+ " y el num2 es: "+num2);
		
		//Intercambio valores y muestro
		intercambio = num1;
		num1 = num2;
		num2 = intercambio;
		System.out.println("El valor actualizado de num1 es: "+num1+ " y el num2 es: "+num2);
	
		input.close();		
	}

}
