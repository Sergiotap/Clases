Proceso P3_2_4
	//Bloque de definiciones
	Definir num Como Real;
	//Bloque de instrucciones
	Escribir "Introduzca un número positivo para saber su raíz cuadrada";
	Leer num;
	Mientras num < 0 Hacer
		Escribir "Error, no se admiten números negativos, Introduzca un número positivo para saber su raíz cuadrada";
		Leer num;
	FinMientras
	Escribir "La raíz cuadrada de ",num," es la siguiente:";
	num <- rc(num);
	Escribir num;
FinProceso