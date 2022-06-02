import java.util.*;

public class P3_3_5 {
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		//Definiciones
		String dia;
		double llama, hora, precio;
		//Introducción por teclado
		System.out.println("¿Cuanto tiempo dura la llamada?");
		llama=entr.nextDouble();
		System.out.println("¿A que hora realizo la llamada?");
		hora=entr.nextDouble();
		entr.nextLine();
		System.out.println("¿Que dia se realizo la llamada?");
		dia=entr.nextLine();
		precio=0;
		//Instrucciones
		if (llama <= 5 ) {
			precio=1;	
		} else {
			if (llama<=8) {
				precio=1.80;
			} else {
				if (llama<=10 ) {
					precio=2.50;
				} else {
						precio=3;
					}
			}
		}
		if (dia.equalsIgnoreCase("domingo")) {
			precio=precio*1.03;
		} else {
			if (!dia.equalsIgnoreCase("domingo") && hora<14.00 ) {
				precio=precio*1.15;
			} else {
				(!dia.equalsIgnoreCase("domingo")) {
					precio=precio*1.10;
				}
			}
		}
	System.out.println("Va a pagar un total de: "+precio+"euros");
	}
}