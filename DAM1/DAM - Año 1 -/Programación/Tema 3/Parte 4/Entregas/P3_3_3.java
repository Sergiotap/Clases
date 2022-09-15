import java.util.*;        

public class P3_3_3 {
	public static void main(String[] args) {
		//Identificar variables
		int day,month,year;
		//Introducción por teclado
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un dia ");
		day=scan.nextInt();
		System.out.print("Introduce un mes ");
		month=scan.nextInt();
		System.out.print("Introduce un anio ");
		year=scan.nextInt();
		//Condiciones
		if ( day<=0 || day>31 ) {
			System.out.println("Se ha introducido un dia invalido");
			System.out.print("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
		} else {
			if (month<=0 || month>12) {
				System.out.println("Ha introducido un mes invalido");
				System.out.print("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
			} else {
				if (month==2) {
					if (year%4==0 && year%100!=100 || year%400==0) {
							if (day>29) {
							System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
							System.out.println("El dia introducido es incorrecto porque febrero en un anio bisiesto y no tiene mas de 29 dias");
							} else {
								System.out.print("La fecha "+day+"/"+month+"/"+year+" es correcta");
							}
					} else { 
								if (day>28) {
									System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
									System.out.println("El dia introducido es incorrecto porque febrero no es anio bisiesto y no tiene mas de 28 dias");
									} else {
										System.out.print("La fecha "+day+"/"+month+"/"+year+" es correcta");
									}
							}
				} else {
					if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
							System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
					} else {
						if (day>30) {
							System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
							System.out.println("La fecha es incorrecta porque el mes introducido no tiene 31 dias o mas");
						} else {
							System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
						}
					}
				}
			}
		}
	}
}