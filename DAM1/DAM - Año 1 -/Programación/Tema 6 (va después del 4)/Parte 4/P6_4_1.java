import java.util.Scanner;
import java.io.IOException;
public class P6_4_1 {
	public static void main (String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		int num,num2;
		String g,g2;
			num=(int)(100000+(Math.random()*999999));
			System.out.println(num);
			System.out.println("Introduce el número que deseas quitar");
			num2=entr.nextInt();
			g = String.valueOf(num2);
			g2 = String.valueOf(num);
			g2 = g2.replaceAll(g,"");
			System.out.println(g2);
	}
}