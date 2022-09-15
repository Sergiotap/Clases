import java.util.Scanner;
import java.io.IOException;
public class P6_3_8 {
	public static void main (String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		System.out.println("Se generarán 10 número aleatorios entre 1 y 999");
		int cont=0;
		double num;
		do {
			cont++;
			num=(int)(1+(Math.random()*999));
			System.out.println(num);
		} while (cont!=10);
	}
}