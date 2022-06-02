import java.util.Scanner;
import java.io.IOException;
public class P3_8_3 {
	public static void main(String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		int alt,anch;
		int cont,cont2;
		do {
			System.out.println("Introduce el ancho del cuadrado");
			anch=entr.nextInt();
			System.out.println("Introduce el largo del cuadrado");
			alt=entr.nextInt();
			if (anch<0 || alt<0) {System.out.println("ERROR, tienes que introducir más de uno");};
		} while (anch<0 || alt<0);
		alt-=2;
		cont=0;
		while (cont!=anch) {
			cont++;
			System.out.print("*");
			if (cont==anch) {System.out.print("\n");};
		};
		cont=0;
		cont2=2;
		while (cont!=alt) {
			cont++;
			System.out.print("*");
			while (cont2!=anch) {
				System.out.print(" ");
				if (cont2+1==anch) {System.out.print("*");};
				cont2++;};
		cont2=2;
		System.out.print("\n");
		};
		cont=0;
		while (cont!=anch) {
			cont++;
			System.out.print("*");
		};
	}
}