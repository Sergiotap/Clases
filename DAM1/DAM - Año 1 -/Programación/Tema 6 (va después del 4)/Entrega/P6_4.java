import java.util.Scanner;
import java.io.IOException;
public class P6_4 {
	public static void main(String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String pala1,pala2,pala3;
		System.out.println("Bienvenido al programa que te ordena palabras según el diccionario, introduzca 3 palabras");
		System.out.println("Introduce una palabra: ");
		pala1=entr.nextLine();
		System.out.println("Introduce una segunda palabra: ");
		pala2=entr.nextLine();
		System.out.println("Introduce una tercera palabra: ");
		pala3=entr.nextLine();
		if (pala1.compareTo(pala2) <0 && pala1.compareTo(pala3) <0) {
			System.out.println(pala1+" es mayor que");
			if (pala2.compareTo(pala3)<0) {
				System.out.println(pala2+" es mayor que");
				System.out.println(pala3+" que es el menor de todos");
			} else {
				System.out.println(pala3+" es mayor que");
				System.out.println(pala2+" que es el menor de todos");
			};
		} else {
			if (pala2.compareTo(pala3) <0) {
				System.out.println(pala2+" es mayor que");
				if (pala3.compareTo(pala1)<0) {
					System.out.println(pala3+" es mayor que");
					System.out.println(pala1+" que es el menor de todos");
				} else {
					System.out.println(pala1+" es mayor que");
					System.out.println(pala3+" que es el menor de todos");
				};
			} else {
				if (pala3.compareTo(pala2) <0) {
				System.out.println(pala3+" es mayor que");
			} if (pala1.compareTo(pala2)<0) {
				System.out.println(pala1+" es mayor que");
				System.out.println(pala2+" que es el menor de todos");
			} else {
				System.out.println(pala2+" es mayor que");
				System.out.println(pala1+" que es el menor de todos");
				};
			};
		};
	}
}