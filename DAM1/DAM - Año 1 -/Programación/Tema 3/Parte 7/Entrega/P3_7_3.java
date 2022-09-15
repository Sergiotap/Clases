import java.util.Scanner;
import java.io.IOException;
public class P3_7_3 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int day,month,year;
		int mdia=0;
		do {
			System.out.print("Introduce un dia ");
			day=scan.nextInt();
			System.out.print("Introduce un mes ");
			month=scan.nextInt();
			System.out.print("Introduce un anio ");
			year=scan.nextInt();
			if (day <=0 || day<31 && month<=0 || month>31) {System.out.println("ERROR, intoduzca una fecha válida");};
		} while (day <=0 || day<31 && month<=0 || month>31);	
				if ( day<=0 || day>31 ) {
				System.out.println("Se ha introducido un dia invalido");
				System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
			} else {
				if (month<=0 || month>12) {
					System.out.println("Ha introducido un mes invalido");
					System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
				} else {
					if (month==2) {
						if (year%4==0 && year%100!=100 || year%400==0) {
								if (day>29) {
								System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
								System.out.println("El dia introducido es incorrecto porque febrero en un anio bisiesto y no tiene mas de 29 dias");
								} else {
									System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
									mdia=29;
								}
						} else { 
									if (day>28) {
										System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
										System.out.println("El dia introducido es incorrecto porque febrero no es anio bisiesto y no tiene mas de 28 dias");
										} else {
											System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
											mdia=28;
										}
								}
					} else {
						if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
								System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
								mdia=31;
						} else {
							if (day>30) {
								System.out.println("La fecha "+day+"/"+month+"/"+year+" es incorrecta");
								System.out.println("La fecha es incorrecta porque el mes introducido no tiene 31 dias o mas");
							} else {
								System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
								mdia=30;
							}
						}
					}
				}
			};
			day++;
			if (day>mdia) {
				day=1;
				month++;
				if (month>12) {
					month=1;
					year++;
				};
			};
			System.out.println("La fecha sumando un día, sería la siguiente: "+day+"/"+month+"/"+year);			
	}
}