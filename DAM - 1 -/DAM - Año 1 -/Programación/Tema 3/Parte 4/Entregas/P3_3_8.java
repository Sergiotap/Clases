import java.util.Scanner;
public class P3_3_8 {
	public static void main(String[] args) {
		//Definiciones
		Scanner entr = new Scanner(System.in);
		//Muestra en pantalla y buclesito
		int zon;
		double cost;
		cost=0;
		zon=0;
		do {
			System.out.println("Bienvenid@ a VuelosLocos, por favor, elija su zona: ");
			System.out.println("- ZONA 1 - America del Norte - 24.00 euros por gramo - ");
			System.out.println("- ZONA 2 - America Central - 20.00 euros por gramo - ");
			System.out.println("- ZONA 3 - America del Sur - 21.00 euros por gramo - ");
			System.out.println("- ZONA 4 - Europa - 10.00 euros por gramo -");
			System.out.println("- ZONA 5 - Asia 18.00 euros por gramo -");
			zon=entr.nextInt();
			if (zon<0 || zon>5) {
				System.out.println("ERROR! Debe introducir una zona horaria disponible");
			};
		} while (zon<0 || zon>5);
		do {	
			System.out.println("Introduzca el peso en gramos que va a transportar (Con un maximo de 5kg)");
			cost=entr.nextDouble();
			if (cost<0 || cost>5000) {
			System.out.println("ERROR! Debe introducir un peso de entre 1 y 5000 gramos");
			};
		} while (cost<0 || cost>5000);
		switch (zon) {
			case 1:
			cost=cost*24;
			break;
			case 2:
			cost=cost*20;
			break;
			case 3:
			cost=cost*21;
			break;
			case 4:
			cost=cost*10;
			break;
			case 5:
			cost=cost*18;
			break;
		};
		System.out.println("Se debe abonar una cantidad de: " +cost+ " euros por el peso del paquete introducido");
	}
}