import java.util.Scanner;
public class P6_3_2 {
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		double e=2.71828,pot;
		String cont;
		do {
			System.out.println("Introduzca la potencia");
			pot=entr.nextInt();
			e=Math.pow(e,pot);
			System.out.println("El valor de e elevado a la potencia añadida es: "+e);
			System.out.println("Desea continuar (Si/No)");
			entr.nextLine(); //buffer
			cont=entr.nextLine();
		} while (cont.equalsIgnoreCase("Si"));
	}
}