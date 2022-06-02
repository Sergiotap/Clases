import java.util.Scanner;
public class P3_4_1 {
	public static void main(String[] args) {
	Scanner entr= new Scanner(System.in);
	int num1,num2,selec;
	num1=0;
	num2=0;
	selec=0;
	do {
		System.out.println("Bienvenido a la javalculadora");
		System.out.println("Elija una opcion para realizar");
		System.out.println("- 1 - SUMAR");
		System.out.println("- 2 - RESTAR");
		System.out.println("- 3 - Resto de una division (MOD)");
		System.out.println("- 4 - DIVISION (entera)");
		selec=entr.nextInt();
		if  (selec<1 || selec>4) {
			System.out.println("ERROR! Debe introducir una opcion entre 1 y 4");
		}
	} while (selec<1 || selec>4);
	System.out.print("Introduce un primer valor");
	num1=entr.nextInt();
	System.out.print("Introduce un segundo valor");
	num2=entr.nextInt();
	switch (selec) {
		case 1:
		num1=num1+num2;
		break;
		case 2:
		num1=num1-num2;
		break;
		case 3:
		num1=num1%num2;
		break;
		case 4:
		num1=num1/num2;
		break;
	};
	System.out.println("El resultado de la operacion es el siguiente: "+num1+"");
	}
}