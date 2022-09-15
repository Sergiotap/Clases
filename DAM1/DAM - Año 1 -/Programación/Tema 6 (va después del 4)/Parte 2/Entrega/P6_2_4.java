import java.util.Scanner;
import java.io.IOException;
public class P6_2_4 {
	public static void main (String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String frase;
		do {
			System.out.println("Introduce una palabra para saber si es infinitiva, si no introduce nada, se detendrá el programa");
			frase=entr.nextLine();
			if (frase.endsWith("ar") || frase.endsWith("er") || frase.endsWith("ir")) {System.out.println(frase+" Se considera una palabra infinitiva");
			} else {
				if (frase.length()!=0) {
				System.out.println("No se considera una palabra infinitiva");};
				};
		} while (frase.length()!=0);
	}
}