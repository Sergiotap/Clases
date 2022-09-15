Proceso P3_2_2
	
	//Bloque de definiciones
	Definir name Como Caracter;
	Definir pri,seg,ter,media,num,mediag Como Real;
	Definir j,x,g Como Entero;
	
	//Bloque de asignaciones
	mediag <- 0;

	//Instrucciones
	
	Para j<-0 Hasta 4 Con Paso 1 Hacer
		media <- 0;
		Escribir "Dime tu nombre, campeón";
		Leer name;
		Escribir name, " Dime tu primera nota";
		Leer pri;
		Escribir name, " Dime tu segunda nota";
		Leer seg;
		Escribir name, " Dime tu tercera nota";
		Leer ter;
		media <- media+((pri+seg+ter)/3);
		mediag <- mediag+media;
		
	Finpara
	
		mediag <- mediag/5;
	Escribir "La media del grupo es la siguiente: ", mediag ;
	
FinProceso
