Proceso P3_2_15
	Definir num,buc,acum Como Entero;
	Escribir"Introduzca un número para saber si es primo";
	Leer num;
	buc <- 0;
	acum <- 0;
	Mientras buc <> num Hacer
		buc <- buc+1;
		Si num mod(buc) = 0 Entonces
			acum <- acum+1;
		FinSi
	FinMientras
	Si acum = 2 Entonces
		Escribir"El número introducido es primo";
	SiNo
		Escribir "No se considera un número primo";
	FinSi
FinProceso
