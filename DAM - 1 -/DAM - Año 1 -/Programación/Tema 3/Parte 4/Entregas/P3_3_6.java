import java.util.Scanner;
public class P3_3_6 {
	public static void main(String[] args) {
		//Definiciones
		Scanner entr = new Scanner(System.in);
		System.out.print("Introduzca el numero del dado ");
		int dad=entr.nextInt();
			do {
				switch (dad) {
					case 1:
						System.out.print("En la cara opuesta esta el 6");
						break;
					case 2:
						System.out.print("En la cara opuesta esta el 5");
						break;
					case 3:
						System.out.print("En la cara opuesta esta el 4");
						break;
					case 4:
						System.out.print("En la cara opuesta esta el 3");
						break;
					case 5:
						System.out.print("En la cara opuesta esta el 2");
						break;
					case 6:
						System.out.print("En la cara opuesta esta el 1");
						break;
					}
					if (dad<=0 || dad>6) {
						System.out.println("ERROR! Debe introducir un numero entre el 1 y el 6");
					}
			} while (dad<=0 && dad>6);
	}
} 