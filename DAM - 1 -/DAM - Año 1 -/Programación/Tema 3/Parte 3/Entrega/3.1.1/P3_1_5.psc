Proceso P3_1_5
	
	//Bloque de definiciones
	Definir edad Como Entero;
	Definir nota Como Real;
	Definir gen Como Caracter;
	
	//Bloque de instroducción a teclado
	Escribir "Introduzca su edad";
	Leer edad;
	Escribir "Introduzca su nota";
	Leer nota;
	Escribir "Introduzca su género (Introduzca F para femenino y M para masculino)";
	Leer gen;
	gen <-mayusculas(gen);
	
	
	//Bloque de instrucciones
	Si edad >= 5 y edad >= 18 y gen = 'F' Entonces
		Escribir "ACEPTADA";
		
	Sino 
		Si edad >= 5 y edad >= 18 y gen = 'M' Entonces
			Escribir "ACEPTADO";
			
		SiNo
			Escribir "NO ACEPTADO";
			
		FinSi
		
	FinSi
	
FinProceso
