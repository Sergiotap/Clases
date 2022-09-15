Proceso Ejercicio_4
	
	Definir tot Como Real;
	Definir dat Como Real;
	Definir rep Como Real;
	tot <- 0;
	rep <- 0;
	
	Repetir
		Escribir "Introduzca un valor";
		Leer dat;
		tot <- tot+dat;
		rep <- rep+1;
	Hasta Que rep >= 5;	
	
	Escribir "El número total es el siguiente", tot;
	
FinProceso
