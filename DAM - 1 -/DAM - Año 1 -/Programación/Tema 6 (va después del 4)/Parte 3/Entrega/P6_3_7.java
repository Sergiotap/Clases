import java.util.Scanner;
import java.io.IOException;
public class P6_3_7 {
	public static void main (String [] args) {
		Scanner entr = new Scanner(System.in);
		double num,num2;
		System.out.println("Introduzca un número real");
		num=entr.nextDouble();
		num2=Math.round(num);
		System.out.println("Su número es redondeado a : "+num2);	
	}
}