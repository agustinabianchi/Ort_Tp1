package Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		double ancho;
		double largo;
		double valorM2;
		double valorTotal;
		double cantidadAlambre;
		
		//Ingreso ancho
		System.out.println("Ingrese el ancho en metros");
		ancho = Double.parseDouble(input.nextLine());
		
		//Ingreso largo
		System.out.println("Ingrese el largo en metros");
		largo = Double.parseDouble(input.nextLine());
		
		//Ingreso el valor por metro cuadrado
		System.out.println("Ingrese el valor del metro cuadrado");
		valorM2 = Double.parseDouble(input.nextLine());
		
		//Calculo el valor total del terrerno
		valorTotal = (ancho*largo)*valorM2;
		System.out.println("El valor total del terreno es " + valorTotal + " metros cuadrados");
		
		//Calculo cantidad de metros de alambre
		cantidadAlambre = ((ancho*2)+(largo*2)) *3;
		System.out.println("La cantidad de metros cuadrados de alambre para tener 3 diferentes alturas es: "+cantidadAlambre);
		
		input.close();
	}

}
