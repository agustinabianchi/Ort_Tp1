package Ejercicios;
import java.util.Scanner;
public class Ejercicio13 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int num1, num2, num3, numMayor;
		
		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());
		num2 = Integer.parseInt(input.nextLine());
		num3 = Integer.parseInt(input.nextLine());
		
		numMayor = num2;
		
		if (num1>num2) {
			numMayor = num1;
	
		}	else if(numMayor<num3){
			numMayor =num3;
			
		}
		
		System.out.println(numMayor+" es mayor");
	
		}
}