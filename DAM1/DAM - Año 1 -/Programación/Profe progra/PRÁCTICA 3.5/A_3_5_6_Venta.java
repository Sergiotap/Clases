import java.util.*;
public class A_3_5_6_Venta {
	public static void main(String[] args){
	double venta,precio;
		int total,cambio50=0,cambio20=0,cambio10=0,cambio5=0,cambio2=0,cambio1=0,cambio05=0,cambio02=0,cambio01=0,cambio005=0,cambio002=0,cambio001=0;;
		Scanner entrada=new Scanner(System.in);
		do {
			System.out.println("Introduzca el precio de la venta");
			venta=entrada.nextDouble();
			if (venta<=0)System.out.println("No puedes comprar algo con un valor negativo o igual a 0");
			if (venta>50) System.out.println("El precio limite es de 50 euros");
		}while (venta<=0 || venta>50); 
		do {
			System.out.println("Introduzca el precio pagado");
			precio=entrada.nextDouble();
			if (precio<=0)System.out.println("No puedes pagar algo con un valor negativo o igual a 0");
			if (precio<venta)System.out.println("El dinero no es suficiente");
		}while (precio<=0 || precio<venta); 
		total=(int)(100*(precio-venta));
		
		if ((total/5000)>=1) {
			cambio50=total/5000; 
			total=total-(5000*cambio50);
		}if ((total/2000)>=1) {
			cambio20=total/2000; 
			total=total-(2000*cambio20);
		 } if ((total/1000)>=1) {
			   cambio10=total/1000; 
			   total=total-(1000*cambio10); 
		   } if ((total / 500)>=1) {
			   cambio5=total / 500; 
			   total=total-(500*cambio5);
		     } if ((total / 200)>=1) {
			     cambio2=total / 200; 
			     total=total-(200*cambio2);
		       } if ((total / 100)>=1) {
		    	   System.out.println("1 euro.:"+total);
					cambio1=total / 100; 
					total=total-(100*cambio1);
				} if ((total / 50)>=1) {
					System.out.println("50 cts.:"+total);
					cambio05=total / 50; 
					total=total-(50*cambio05);
				  } if ((total / 20)>=1) {
					  System.out.println("20 cts.:"+total);
						cambio02=total / 20; 
						total=total-(20*cambio02);
					} if ((total / 10)>=1) {
						System.out.println("10 cts.:"+total);
						cambio01=total / 10; 
						total=total-(10*cambio01);
					} if ((total / 5)>=1) {
						System.out.println("5 cts.:"+total);
						cambio005=total / 5; 
						total=total-(5*cambio005);
					  } if ((total / 2)>=1) {
						  System.out.println("2 cts.:"+total);
							cambio002=total / 2; 
							total=total-(2*cambio002);
						} 
					  System.out.println("1 cts.:"+total);
					  cambio001=total; 
						  
		System.out.print("Su cambio es de:\n "+cambio50+" billetes de 50 euros\n "+cambio20);
		System.out.print(" billetes de 20 euros\n "+cambio10+" billetes de 10 euros\n "+cambio5+" billetes de 5 euros\n "+cambio2+" monedas de 2 euros\n "+cambio1+" monedas de 1 euro\n "+cambio05+" monedas de 50 centimos\n "+cambio02+" monedas de 20 centimos\n "+cambio01+" monedas de 10 centimos\n "+cambio005+" monedas de 5 centimos\n "+cambio002+" monedas de 2 centimos\n "+cambio001+" monedas de 1 centimo\n");
			
	}			
}	