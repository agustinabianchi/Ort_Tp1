package Ejercicios;
import java.util.Scanner;
public class Ejercicio91 {
	private static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		
		String socio1;
		String socio2;
		String socio3;
		float aporte1;
		float aporte2;
		float aporte3;
		float totalAportado;
		float porcent1;
		float porcent2;
		float porcent3;
		
		
		//Solicito información al usuario
		System.out.println("Ingrese el nombre del socio1");
		socio1 = input.nextLine();
		System.out.println("Ingrese el aporte de" + socio1);
		aporte1 = Float.parseFloat(input.nextLine());
				
		System.out.println("Ingrese el nombre del socio2");
		socio2 = input.nextLine();
		System.out.println("Ingrese el aporte de" + socio2);
		aporte2 = Float.parseFloat(input.nextLine());
		
		System.out.println("Ingrese el nombre del socio3");
		socio3 = input.nextLine();
		System.out.println("Ingrese el aporte de" + socio3);
		aporte3 = Float.parseFloat(input.nextLine());
		
		//Proceso y muestro resultados
		totalAportado = aporte1+aporte2+aporte3;
		porcent1 = (aporte1 * 100)/totalAportado;
		porcent2 = (aporte2 *100)/totalAportado;
		porcent3 = (aporte3*100)/totalAportado;
		
		System.out.println("El total aportado es: "+ totalAportado);
		
		System.out.println(socio1 + " aportó " + porcent1+"%");
		
		System.out.println(socio2 + " aportó " + porcent2+"%");

		System.out.println(socio3 + " aportó " + porcent3+"%");
		
		input.close();
	}

}
