import java.util.*;
public class A_P_3_Temperaturas {
	public static void main (String [] args) {
		int mes,dias,tempd,tempn,m=2,totaltempd=0,totaltempn=0,masbajan=0,diamasbaja=0;
		double mediad,mediadmes=0;
		String nombre,nombremasbaja="";
		Scanner entrada = new Scanner (System.in);
		dias=30;
		for (int a=1; a<dias+1; a++) {
			totaltempd=0;
			totaltempn=0;
			System.out.println("Introduzca el nombre del responsable de la medicion");
			nombre=entrada.nextLine();
			for (int i=1; i<5; i++) {
				System.out.println("Introduzca el registro numero "+i+" de las tempertaturas diurnas");
				do {
					tempd=entrada.nextInt();
					if (tempd>0 || tempd<-20) {
						System.out.println("ERROR. Las temperaturas deben estar comprendidas entre 0º Y -20º. Vuelve a probar");
					}else  totaltempd=totaltempd+tempd; 
				}while (tempd>0 || tempd<-20);
			}
			mediad=(double)totaltempd/4;
			System.out.println("La temperatura media diurna del dia "+a+" es de: "+mediad+"º");
			mediadmes=mediadmes+mediad;
			for (int i=1; i<5; i++) {
				System.out.println("Introduzca el registro numero "+i+" de las tempertaturas nocturnas");
				do {
					tempn=entrada.nextInt();
					if (tempn>0 || tempn<-20) {
						System.out.println("ERROR. Las temperaturas deben estar comprendidas entre 0º Y -20º. Vuelve a probar");
					}else { 
						if (tempn<masbajan) { 
							masbajan=tempn;
							diamasbaja=a;
							nombremasbaja=nombre;
						}
						totaltempn=totaltempn+tempn; 
					}
				}while (tempn>0 || tempn<-20);
			}
			entrada.nextLine();
			System.out.println("La temperatura media nocturna del dia "+a+" es de: "+(double)totaltempn/4+"º");
		}
		System.out.println("La temperatura media diurna del mes es: "+mediadmes/dias+"º");
		System.out.println("El dia en que se registro la temperatura nocturna mas baja fue el dia numero "+diamasbaja+" y el responsable de la medicion era: "+nombremasbaja);
	}
}
		