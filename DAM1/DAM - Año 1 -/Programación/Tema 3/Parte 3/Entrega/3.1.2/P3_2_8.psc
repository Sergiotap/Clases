Proceso P3_2_8
	//Bloque de definiciones
	Definir n,i,r,cont,contf Como Entero;
	Definir rep Como Cadena;
	//Bloque de asignaciones
	cont <- 0;
	contf <- 0;
	rep <- "si";
	//Bucle
	Mientras rep = "si" Hacer
		//Introducción de datos
		Escribir "Introduce un numero para resolver su tabla de multiplicar";
		Leer n;
		Para i<-1 Hasta 10 Con Paso 1 Hacer
			Escribir n, "x", i, "=";
			Leer r;
			Si r=n*i Entonces
				Escribir "CORRECTO";
				cont <- cont+1;
			SiNo
				Escribir "INCORRECTO";
				contf <- contf+1;
			FinSi
		FinPara
		Escribir "¿Desea repetir el proceso?";
		Leer rep;
		rep <- minusculas(rep);
	FinMientras
	Escribir "Ha tenido un total de ",cont," respuestas correctas";
	Escribir "Ha tenido un total de ",contf," respuestas incorrectas";
FinProceso
