Proceso P3_1_1
	
	//Bloque definición
	Definir a Como Entero;
	
	//Teclado
	Escribir "Introduce un número para saber si es positivo, negativo o 0";
	Leer a;
	
	//Instrucciones
	Si a > 0 Entonces
		Escribir "Es un número positivo";
		
	SiNo
		Si a = 0 Entonces
			Escribir "Su número es 0";
			
		SiNo	
			Escribir "Es un número negativo";
			
		FinSi
	FinSi

FinProceso
