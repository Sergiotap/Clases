import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int cuatro[];
		int sumaPar=0, sumaImpar=0, contPar=0, contImpar=0;
		cuatro=new int[10];
		for (int i = 0; i < cuatro.length; i++) {
			System.out.println("Inserte el número a comprobar:");
			cuatro[i]=sc.nextInt();
			while(cuatro[i]<=0) {
				System.out.println("El número ha de ser mayor que 0, vuelve a introducirlo:");
				cuatro[i]=sc.nextInt();
			}
			if (i%2==0) {
				sumaPar+=cuatro[i];
				contPar++;
			}
			else {
				sumaImpar+=cuatro[i];
				contImpar++;
			}
		}
		System.out.println("la media de las posiciones pares es "+((double)sumaPar/contPar)+" y la media de posiciones impares es "+((double)sumaImpar/contImpar));
		sc.close();
	}
}
