import java.util.Scanner;
import java.io.IOException;
public class P3_5_2 {
	public static void main(String[] args) throws IOException {
			Scanner entr = new Scanner(System.in);
			char letra=0;
			System.out.println("Introduce un caracter para saber si es una letra mayuscula, minuscula o numero");
			letra=(char)System.in.read();
			if (letra>=48 && letra<=57) {
			System.out.println("El valor introducido es un digito");
			} else {
				if (letra>=65 && letra<=90) {
					System.out.println("El valor introducido es una letra mayuscula");
				} else {
					if (letra>=97 && letra<=122) {
						System.out.println("Es una letra minuscula");
					} else { 
						System.out.println("Es otro tipo de caracter");
					}
				}
			}		
			System.out.println(letra);
	}
}