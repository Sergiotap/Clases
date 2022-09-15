import java.util.Scanner;
public class P3_3_7 {
	public static void main(String[] args) {
		//Definiciones
		Scanner entr = new Scanner(System.in);
		//Entrada
		System.out.println("Introduzca un numero para saber cuantos dias tiene ese mes");
		int num=entr.nextInt();
		//Instrucciones
		do {
			switch (num) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				System.out.println("El mes elegido tiene 31 dias");
				break;
				case 4:
				case 6:
				case 9:
				case 11:
				System.out.println("El mes elegido tiene 30 dias");
				break;
				case 2:
				System.out.println("Febrero tiene 28 dias y 29 si el anio es bisiesto");
				break;
			}
			if (num<=0 && num>12) {
				System.out.println("ERROR! Debe introducir un valor entre 1 y 12");
			}
		} while (num<=0 && num>12);
	}
}