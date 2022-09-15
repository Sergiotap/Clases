import java.util.Scanner;
import java.io.IOException;
public class P6_2 {
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		String nombre1, nombre2;
		int num1,num2;
		do {
		System.out.println("Introduzca un nombre");
		nombre1=entr.nextLine();
		System.out.println("Introduzca otro nombre");
		nombre2=entr.nextLine();
		num1=nombre1.length();
		num2=nombre2.length();
		if (nombre1.equalsIgnoreCase(nombre2)) { 
			System.out.println("ERROR! Debe introducir nombres diferentes");
		};
		} while (nombre1.equalsIgnoreCase(nombre2));
		if (num1>num2) {
			System.out.println(nombre1.toUpperCase()+" Es el nombre más largo y tiene "+num1+" carácteres");
		} else {
			if (num2>num1) {
			System.out.println(nombre2.toUpperCase()+" Es el nombre más largo y tiene "+num2+" carácteres");	
			} else {
				System.out.println("Ambos nombres tienen la misma cantidad de carácteres que serían los siguientes: "+num1);
			};
		};
	}
}