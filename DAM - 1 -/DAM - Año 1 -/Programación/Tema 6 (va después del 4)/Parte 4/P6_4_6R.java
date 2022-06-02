import java.util.Scanner;
import java.io.IOException;
public class P6_4_6R {
	public static void main (String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String frase;
		int aux=0;
		System.out.println("Introduce una frase");
		frase=entr.nextLine();
		int longfrase=frase.length();
		System.out.println("la longitud de la frase es la siguiente: "+longfrase);
		
		int posini = (int) (Math.random()*longfrase);
		System.out.println(posini);
		int posfin = (int) (Math.random()*longfrase);
		System.out.println(posfin);
		
		if (posini>posfin) {
			aux=posini;
			posini=posfin;
			posfin=aux;
		};
		
		String subcadena = frase.substring(posini,posfin);
		aux=posfin;
		System.out.println(subcadena);
		
	}
}