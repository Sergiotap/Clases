import java.util.Scanner;
import java.io.IOException;

public class P3_5_6 {
	public static void main(String[] args) throws IOException  {
		Scanner entr = new Scanner(System.in);
		double prod, pago, devol, prod1, pago1, devold;
		do {
			System.out.println("Introduzca el valor del producto");
			prod=entr.nextDouble();
			if (prod>50) {System.out.println("ERROR! El precio máximo es 50");};
		} while (prod<0 || prod>50);
		
		do {
			System.out.println("Introduzca el importe dado");
			pago=entr.nextDouble();
			if (pago<prod) {System.out.println("ERROR! Debe introducir un valor superior al precio del producto");};
		} while (pago<prod);
		pago1=pago;
		prod1=prod;
		if (pago1==prod1) { 
			devol=0;
			System.out.println("El cambio seria el siguiente: "+(int)devol+" euros");
		} else {
			devol=pago1-prod1;
			if (devol>=50) { 
			devold=devol;
			devol=devol%50;
			double cincuenta=(int)devold/50;	
			System.out.println(cincuenta);
			};
			if (devol>=20) { 
			devold=devol;
			devol=devol%20;
			double veinte=(int)devold/20;
			System.out.println(veinte);	
			};
			if (devol>=10) { 
			devold=devol;
			devol=devol%10;
			double diez=(int)devold/10;
			System.out.println(diez);	
			};
			if (devol>=5) { 
			devold=devol;
			devol=devol%5;
			double cinco=(int)devold/5;
			System.out.println(cinco);	
			};
			if (devol>=2) { 
			devold=devol;
			devol=devol%2;
			double dos=(int)devold/2;
			System.out.println(dos);	
			};
			if (devol>=1) { 
			devold=devol;
			devol=devol%1;
			double uno=(int)devold/2;
			System.out.println(uno);	
			};
			if (devol>=0.50) { 
			devold=devol;
			devol=devol%0.50;
			double cincent=(int)devold/0.50;
			System.out.println(cincent);
			};
			if (devol>=0.20) { 
			devold=devol;
			devol=devol%0.20;
			double veincent=(int)devold/0.20;
			System.out.println(veincent);	
			};
			if (devol>=0.10) { 
			devold=devol;
			devol=devol%0.10;
			double diezcent=(int)devold/0.10;
			System.out.println(diezcent);	
			};
			if (devol>=0.05) { 
			devold=devol;
			devol=devol%0.05;
			double cincocent=(int)devold/0.05;
			System.out.println(cincocent);	
			};
			if (devol>=0.02) { 
			devold=devol;
			devol=devol%0.02;
			double doscent=(int)devold/0.02;
			System.out.println(doscent);	
			};
			if (devol>=0.01) { 
			devold=devol;
			devol=devol%0.01;
			double uncent=(int)devold/0.01;
			System.out.println(uncent);	
			};
		};
		
	}
}