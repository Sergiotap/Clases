Proceso P3_1_14
	
	//Bloque de definiciones
	Definir dia Como Entero;
	
	//Bloque de variables
	dia <- 0;
	
	//Bloque de instrucciones
	Mientras dia > 7 o dia < 1 Hacer
		
		Escribir "Seleccione un número del 1 al 7 para saber qué día de la semana es";
		Leer dia;
		
		Segun dia Hacer
			1:
				Escribir "Ha seleccionado el día - 1 - que sería el lunes";
			2:
				Escribir "Ha seleccionado el día - 2 - que sería el martes";
			3:
				Escribir "Ha seleccionado el día - 3 - que sería el miércoles";
			4:
				Escribir "Ha seleccionado el día - 4 - que sería el jueves";
			5:
				Escribir "Ha seleccionado el día - 5 - que sería el viernes";
			6:
				Escribir "Ha seleccionado el día - 6 - que sería el sábado";
			7:	
				Escribir "Ha seleccionado el día - 7 - que sería el domingo";
				
			De otro modo
				
				Escribir "Ha seleccionado un número inválido, por favor, repita la selección";
			
		FinSegun
		
	FinMientras
	
FinProceso
