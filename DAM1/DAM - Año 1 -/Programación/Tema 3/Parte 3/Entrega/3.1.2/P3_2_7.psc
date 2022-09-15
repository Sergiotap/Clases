Proceso P3_1_7
	//Bloque de definiciones
	Definir n,i,r Como Entero;
	Definir rep Como Cadena;
	rep <- "si";
	Mientras rep = "si" Hacer
		//Introducción de datos
		Escribir "Introduce un numero para resolver su tabla de multiplicar";
		Leer n;
		Para i<-1 Hasta 10 Con Paso 1 Hacer
			Escribir n, "x", i, "=";
			Leer r;
			Si r=n*i Entonces
				Escribir "CORRECTO";
			SiNo
				Escribir "INCORRECTO";
			FinSi
		FinPara
		Escribir "¿Desea repetir el proceso?";
		Leer rep;
		rep <- minusculas(rep);
	FinMientras
FinProceso
