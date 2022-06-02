import java.util.Scanner;
import java.io.IOException;
public class P6_3 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String palabra, palabra2;
		int acumulador;
		System.out.println("Introduce una palabra");
		palabra=entr.nextLine();
		acumulador=-1;
		do {
			System.out.println("Introduce otra palabra");
			palabra2=entr.nextLine();
			acumulador+=1;
		} while (!(palabra.equals(palabra2)));	
		System.out.println("Se han introducido las siguientes palabras distintas: "+acumulador);
	} 
}