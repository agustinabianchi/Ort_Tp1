package Ejercicios;
import java.util.Scanner;
public class Ejercicio9 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
	int angulo1;
	int angulo2;
	int anguloRest;
	
		//Pido n�meros al usuario
		
		System.out.println("Ingrese la medida del primer �ngulo");
		angulo1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la medida del segundo �ngulo");
		angulo2 = Integer.parseInt(input.nextLine());
		
		//PROCESO
		anguloRest = 180-(angulo1+angulo2);
		
		//MUESTRO RESULTADO
		System.out.println("La medida del �ngulo restante es: "+anguloRest+"�");
		
		input.close();
	}

}
