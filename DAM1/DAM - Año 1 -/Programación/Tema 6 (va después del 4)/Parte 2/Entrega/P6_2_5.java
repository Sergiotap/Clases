import java.util.Scanner;
import java.io.IOException;
public class P6_2_5 {
	public static void main(String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String frase, palabra;
			System.out.println("Introduzca una frase");
			frase=entr.nextLine();
			System.out.println("Introduzca una palabra");
			palabra=entr.nextLine();
			System.out.println("La palabra se encuentra en la posición "+frase.trim().lastIndexOf(palabra));	
	}
}