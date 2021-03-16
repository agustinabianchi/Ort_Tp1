package Ejercicios;
import java.util.Scanner;
public class Ejercicio9 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
	int angulo1;
	int angulo2;
	int anguloRest;
	
		//Pido números al usuario
		
		System.out.println("Ingrese la medida del primer ángulo");
		angulo1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la medida del segundo ángulo");
		angulo2 = Integer.parseInt(input.nextLine());
		
		//PROCESO
		anguloRest = 180-(angulo1+angulo2);
		
		//MUESTRO RESULTADO
		System.out.println("La medida del ángulo restante es: "+anguloRest+"°");
		
		input.close();
	}

}
