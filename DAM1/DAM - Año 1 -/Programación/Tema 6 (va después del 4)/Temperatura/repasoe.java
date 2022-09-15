import java.util.Scanner;
public class repasoe {
	public static void main (String[] args) {
		Scanner entr = new Scanner(System.in);
		int num=0;
		do {
		System.out.println("Introduzca un número");
		num=entr.nextInt();
		if (num<1||num>20) {System.out.println("ERROR! debe introducir un valor superior a 0 e inferior a 21");};
		} while (num<1||num>20);
		for (int i=1;i<=num;i++) {
			for (int j=1;j<=i;j++) {
				if (num>9) {
				System.out.print(j+" ");
				} else {
				System.out.print(j+"  ");
				}
			}
		for (int j=i;j<num;j++) {
			System.out.print("0000");
		}
		for (int j=i;j<num;j++) {
			System.out.print("   ");
		}
			for (int j=i;j>0;j--) {
				if (j==1) { System.out.println("  "+j); 
				} else {
					if (j>9) {
						System.out.print(" "+j);
					} else {
						System.out.print("  "+j);
					}
				}
			}	
		}		
	}
}