Proceso P3_1_10
	
	//Bloque de definiciones
	Definir a,b,mayor,menor Como Real;
	
	//Bloque de introducción
	Escribir "Introduzca el valor A";
	Leer a;
	Escribir "Introduzca el valor B";
	Leer b;
	
	//Bloque de variables
	mayor <- 0;
	menor <- 0;
	
	//Bloque de instrucciones
	Si a>b Entonces
		mayor <- mayor+a;
		menor <- menor+b;
	Sino
		mayor <- mayor+b;
		menor <- menor+a;
	FinSi
	
	Escribir "El valor mayor es el siguiente: ",mayor, " y el valor menor es el siguiente: ",menor;
	
FinProceso
