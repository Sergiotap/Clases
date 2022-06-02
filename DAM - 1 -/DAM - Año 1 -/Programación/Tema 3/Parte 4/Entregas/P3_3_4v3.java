import java.util.*;
public class P3_3_4v3 {
	public static void main(String[] args) {
	//Definiciones
	int alum,bus,nbus;
	double precio;
	Scanner entr= new Scanner(System.in);
	//Introduccion por teclado
	System.out.println("Cuantos alumnos asistiran a la excursion?");
	alum=entr.nextInt();
	precio=0;
	nbus=0;
	//Instrucciones
	bus=alum/60;
	nbus=nbus+bus;
	if (alum%60!=0) {
		nbus++;
	}
	if (alum<30) {
		System.out.println("Se requiere un minimo de 30 alumnos para realizar la excursion");
	} else {
		if (alum>=100) {
			precio=alum*65;
		} else {
			if (alum>=50) {
				precio=alum*70;
			} else {
					precio=alum*95;
			}
		}
	}
	if (alum>=30) {
		precio=precio+4000*nbus;
		System.out.println("Se debera pagar un total de: "+precio+" euros");
		}
	}
}