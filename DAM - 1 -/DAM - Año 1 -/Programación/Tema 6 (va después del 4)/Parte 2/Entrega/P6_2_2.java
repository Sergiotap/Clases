import java.util.Scanner;
import java.io.IOException;
public class P6_2_2 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String frase;
		System.out.println("Introduzca una frase");
		frase=entr.nextLine();
		frase = frase.replaceAll("a","A");
		frase = frase.replaceAll("e","E");
		frase = frase.replaceAll("i","I");
		frase = frase.replaceAll("o","O");
		frase = frase.replaceAll("u","U");
		System.out.println(frase);
	}
}