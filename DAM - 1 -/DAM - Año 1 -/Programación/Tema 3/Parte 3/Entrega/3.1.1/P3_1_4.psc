Proceso P3_1_4
	
	//Bloque de definiciones
	Definir numb,nump,total1 Como Real;
	
	//Teclado
	Escribir "Introduce el número base";
	Leer numb;
	Escribir "Introduce la potencia";
	Leer nump;
	
	//Instrucciones
	Si nump > 0 Entonces
		total1 <- (numb^nump);
		Escribir "El valor final del número es el siguiente: ", total1;
		
	SiNo
		Si nump = 0 Entonces 
			total1 <- (numb^0);
			Escribir "El valor final del número es el siguiente: ", total1;
			
		SiNo
			total1 <- (1/nump);
			Escribir "El valor final del número es el siguiente: ", total1;
			
		FinSi
		
	FinSi
FinProceso
