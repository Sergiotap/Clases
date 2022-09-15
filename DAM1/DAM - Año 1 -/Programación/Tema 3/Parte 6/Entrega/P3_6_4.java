import java.util.Scanner;

public class P3_6_4 {
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		int num;
		int contp=0,conti=0,contm3=0;
		int sumap=0, sumai=0, sumam3=0;
		int valor=1;
		do {
		System.out.println("Cuantos numeros quieres sumar");
		num=entr.nextInt();
		} while (num<=0);
		
		while (contp<num || conti<num || contm3<num) {
			if (valor%2==0 && contp<num){
				contp++;
				sumap+=valor;
			}
			if (valor%2!=0 && conti<num){
				conti++;
				sumai+=valor;
			}
			if (valor%3==0 && contm3<num) {
				contm3++;
				sumam3+=valor;
			}
			valor++;
			
		};
		System.out.println("La suma de los "+num+" primeros pares es: "+sumap);
		System.out.println("La suma de los "+num+" primeros impares es: "+sumai);
		System.out.println("La suma de los "+num+" primeros multiplos es: "+sumam3);
	}
}
