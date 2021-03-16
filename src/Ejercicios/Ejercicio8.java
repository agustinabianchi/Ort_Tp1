package Ejercicios;
import java.util.Scanner;
public class Ejercicio8 {

	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		float num1;
		float num2;
		float suma;
		float resta;
		float multi;
		float division;
		
		//Pido números al usuario
		
		System.out.println("Ingrese el primer número");
		num1 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese el segundo número");
		num2= Float.parseFloat(input.nextLine());
			
		//PROCESO
		
		suma = num1+num2;
		resta = num1-num2;
		multi = num1*num2;
		division = num1/num2;
		
		//MUESTRO EL RESULTADO
		System.out.println("La suma de los números es "+suma);
		System.out.println("La resta de los números es "+resta);
		System.out.println("La multiplicación de los números es "+ multi);
		System.out.println("La división entre los números es "+division);
	input.close();
	
	}

}
