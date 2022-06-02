Proceso P3_1_9
	
	//Bloque de definiciones
	Definir a,b,c,d,e Como Real;
	
	//Bloque de introducción por teclado
	Escribir "Introduzca el primer valor";
	Leer a;
	Escribir "Introduzca el Segundo valor";
	Leer b;
	Escribir "Introduzca el tercer valor";
	Leer c;
	Escribir "Introduzca el cuarto valor";
	Leer d;
	Escribir "Introduzca el quinto valor";
	Leer e;
	
	//Bloque de variables
	
	Si a<b y a<c y a<d y a<e Entonces
		Escribir "El número de menor valor es el siguiente: ", a;
		
	Sino
		Si b<c y b<d y b<e Entonces
			Escribir "El número de menor valor es el siguiente: ", b;
			
		SiNo
			Si c<a y c<d y c<e Entonces
				Escribir "El número de menor valor es el siguiente: ", c;
				
			SiNo
				Si d<a y d<b y d<e Entonces
					Escribir "El número de menor valor es el siguiente: ", d;
					
				SiNo 
					Escribir "El número de menor valor es el siguiente: ", e;
					
				FinSi
					
			FinSi
			
		FinSi
		
	FinSi
	
	
	
	
	
	
FinProceso
