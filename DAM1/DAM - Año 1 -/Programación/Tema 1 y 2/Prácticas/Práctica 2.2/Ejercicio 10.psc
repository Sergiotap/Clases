Proceso P2_2_10
	
	Definir num, num2,num3 Como Entero;
	
	Escribir "Escribe un número de 2 cifras";
	Leer num;
	
	Mientras num <9 o num >= 100 Hacer
			Escribir "Es incorrecto introduce un número de 2 cifras";
			Leer num;
	FinMientras
	
	num2 <- trunc(num/10);
	num3 <- num mod 10;
	
	Escribir "El valor invertido es el siguiente ", num3, num2;
	
FinProceso
