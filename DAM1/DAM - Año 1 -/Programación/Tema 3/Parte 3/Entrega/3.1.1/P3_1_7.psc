Proceso P3_7_1
	
	//Bloque de definiciones
	Definir anno Como Entero;
	
	//Bloque de introducción
	Escribir "Introduzca el año para comprobar si es bisiesto";
	Leer anno;
	
	//Bloque de instrucciones
	Si anno mod 4 = 0 Entonces
		Escribir anno," Es un año bisiesto";
		
	Sino 
		Si anno mod 100 = 0 y anno mod 400 = 0 Entonces
			Escribir "Es un año bisiesto";
			
		SiNo
			Escribir "No se considera un año bisiesto";
			
		FinSi
		
	FinSi

	
	
	


	
	
	
	
	
	
FinProceso
