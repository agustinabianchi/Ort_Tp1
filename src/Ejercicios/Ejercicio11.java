package Ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		String salida = "impar";
		int numero;
		
		System.out.println("Ingrese un n�mero");
		numero = Integer.parseInt(input.nextLine());
		
		if (numero%2==0){
			salida = "par";
		}
		System.out.println("El n�mero es " + salida);
		
	input.hashCode();
	}

}
