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
		
		//Pido n�meros al usuario
		
		System.out.println("Ingrese el primer n�mero");
		num1 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese el segundo n�mero");
		num2= Float.parseFloat(input.nextLine());
			
		//PROCESO
		
		suma = num1+num2;
		resta = num1-num2;
		multi = num1*num2;
		division = num1/num2;
		
		//MUESTRO EL RESULTADO
		System.out.println("La suma de los n�meros es "+suma);
		System.out.println("La resta de los n�meros es "+resta);
		System.out.println("La multiplicaci�n de los n�meros es "+ multi);
		System.out.println("La divisi�n entre los n�meros es "+division);
	input.close();
	
	}

}
