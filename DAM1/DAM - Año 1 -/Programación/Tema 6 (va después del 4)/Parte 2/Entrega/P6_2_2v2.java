import java.util.Scanner;
import java.io.IOException;
public class P6_2_2v2 {
	public static void main (String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String frase;
		System.out.println("Introduce una frase");
		frase=entr.nextLine();
		frase=frase.replace('a','A').replace('e','E').replace('i','I').replace('o','O').replace('u','U');
		System.out.println(frase);
	}
}