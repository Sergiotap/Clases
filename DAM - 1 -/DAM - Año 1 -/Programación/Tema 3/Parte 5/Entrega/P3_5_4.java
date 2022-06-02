import java.util.Scanner;
public class P3_5_4{
	public static void main(String[] args) {
		int num,fact;
		Scanner entr = new Scanner(System.in);
		do {	
			System.out.println("Introduce un numero para saber su factorial");
			num=entr.nextInt();
			if (num <1) {
				System.out.println("ERROR! debe introducir un valor superior a 0");
			}
		} while (num<1);
		fact=num;
		for (int i=num-1;i>=1;i--) {
			fact=fact*i;
			}
		System.out.println("Su factorial sería el siguiente: "+fact);
	}
}