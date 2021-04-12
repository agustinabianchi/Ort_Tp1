package Ejercicios;

import java.util.Scanner;

public class EJERCICIOPARCIAL {
	private static Scanner input = new Scanner(System.in);

	public static final int NRO_PAQUETE_1 = 1;
	public static final int NRO_PAQUETE_2 = 2;
	public static final int NRO_PAQUETE_3 = 3;
	public static final int NRO_PAQUETE_4 = 4;
	public static final int NRO_EXIT = 0;

	public static final String DEST_PAQUETE_1 = " Brasil ";
	public static final String DEST_PAQUETE_2 = " Caribe ";
	public static final String DEST_PAQUETE_3 = " Disney ";
	public static final String DEST_PAQUETE_4 = " Europa ";
	public static final String EXIT = " - TERMINAR CARGA ";

	public static final double PRECIO_PAQUETE_1 = 6000.00;
	public static final double PRECIO_PAQUETE_2 = 15000.00;
	public static final double PRECIO_PAQUETE_3 = 35000.00;
	public static final double PRECIO_PAQUETE_4 = 70000.00;

	public static void main(String[] args) {
		int paqElegido = 0;
		String nombPax;
		int cantPax;
		double precioTotal;
		double precioPaq = 0;

		System.out.println("*** Destinos y precios ***");
		System.out.println(NRO_PAQUETE_1 + DEST_PAQUETE_1 + PRECIO_PAQUETE_1);
		System.out.println(NRO_PAQUETE_2 + DEST_PAQUETE_2 + PRECIO_PAQUETE_2);
		System.out.println(NRO_PAQUETE_3 + DEST_PAQUETE_3 + PRECIO_PAQUETE_3);
		System.out.println(NRO_PAQUETE_4 + DEST_PAQUETE_4 + PRECIO_PAQUETE_4);
		System.out.println(NRO_EXIT + EXIT);
		System.out.println("Atención: precio promocional a Disney");
		System.out.println("Elija el Paquete que desea adquirir: ");
		paqElegido = Integer.parseInt(input.nextLine());

		while (paqElegido < 0 || paqElegido > 4) {
			System.out.println("Error, número de paquete no existe");
			paqElegido = Integer.parseInt(input.nextLine());
		}
		while (paqElegido != 0) {

			System.out.println("Ingrese el nombre del cliente :");
			nombPax = input.nextLine();

			System.out.println("Ingrese la cantidad de pasajeros");
			cantPax = Integer.parseInt(input.nextLine());

			switch (paqElegido) {

			case 1:
				System.out.println("Destino del paquete: " + DEST_PAQUETE_1);
				precioPaq = PRECIO_PAQUETE_1;
				break;

			case 2:
				System.out.println("Destino del paquete: " + DEST_PAQUETE_2);
				precioPaq = PRECIO_PAQUETE_2;
				break;

			case 3:
				System.out.println("Destino del paquete: " + DEST_PAQUETE_3);
				precioPaq = PRECIO_PAQUETE_3;
				break;

			case 4:
				System.out.println("Destino del paquete: " + DEST_PAQUETE_4);
				precioPaq = PRECIO_PAQUETE_4;
				break;

			default:

			}
			System.out.println("Cantidad de Pasajeros: " + cantPax);
			System.out.println("Monto total Paquete: " + cantPax * precioPaq);
			System.out.println("");

			System.out.println("*** Destinos y precios ***");

			System.out.println(NRO_PAQUETE_1 + DEST_PAQUETE_1 + PRECIO_PAQUETE_1);
			System.out.println(NRO_PAQUETE_2 + DEST_PAQUETE_2 + PRECIO_PAQUETE_2);
			System.out.println(NRO_PAQUETE_3 + DEST_PAQUETE_3 + PRECIO_PAQUETE_3);
			System.out.println(NRO_PAQUETE_4 + DEST_PAQUETE_4 + PRECIO_PAQUETE_4);
			System.out.println(NRO_EXIT + EXIT);
			System.out.println("Atención: precio promocional a Disney");
			System.out.println("Elija el Paquete que desea adquirir: ");
			paqElegido = Integer.parseInt(input.nextLine());

		}
		input.close();
	}
}
