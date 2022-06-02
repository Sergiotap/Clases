Proceso P3_2_11
	//Bloque de definiciones
	Definir a Como Real;
	Definir buc Como Entero;
	Definir bin,cache Como Caracter;
	//Introducción por teclado
	Escribir "Escribe un número para pasar a binario";
	leer a;
	//Iniciar variables
	buc <- 0;
	bin <- "";
	cache <- "";
	//Bucle
	Mientras a >= 1 Hacer
		buc <- a mod(2);
		cache <- ConvertirAtexto(buc);
		bin <- concatenar(cache,bin);
		a <- a/2;
		a <- trunc(a);
	FinMientras
	Escribir "El número introducido en binario es el siguiente: ",bin;	
FinProceso