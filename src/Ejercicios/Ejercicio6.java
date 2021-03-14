package Ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
	private static Scanner input = new Scanner (System.in);
	public static final double SUELDO_FIJO = 44000;
	public static void main(String[] args) {
		
		double totalVentas;
		double totalCobrado;
		
		
		//Ingreso monto total ventas
		System.out.println("Ingresa el total de las ventas");
		totalVentas = Double.parseDouble(input.nextLine());
		
		//Calculo el 16% del monto a cobrar por ventas + el sueldo fijo
		totalCobrado = (totalVentas*0.16)+ SUELDO_FIJO;
		System.out.println("El total a cobrar es de: $" + totalCobrado+ " pesos.");
		
	
		input.close();	
	}

}
