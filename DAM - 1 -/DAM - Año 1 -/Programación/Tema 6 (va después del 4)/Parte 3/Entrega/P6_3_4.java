import java.util.Scanner;
public class P6_3_4 {
	public static void main(String [] args) {
		double num;
		do {
		Scanner entr = new Scanner(System.in);
		System.out.println("Introduce un número para truncarlo");
		num=entr.nextDouble();
		if (num<=0) {System.out.println("Pero vamos a ver gilipollas, quieres introducir un valor superior a 0");};
		} while (num<=0);
		num=(int)num;
		System.out.println(num);
	}
}