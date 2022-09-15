Proceso E2_1_4
	//Bloque de definiciones
	Definir nota Como Real;
	//Bloque de introducción
	Escribir "Escribe un número";
	Leer nota;
	//Bloque de instrucciones
	Si nota < 5 Entonces
		Escribir "Insuficiente";
	Sino	
		Si nota = 5 Entonces
			Escribir"Suficiente";
		SiNo
			Si nota = 6 Entonces
				Escribir"Bien";
			SiNo
				Si nota <= 8 Entonces
					Escribir"Notable";
				Sino	
					Si nota >= 9 Entonces
						Escribir"Sobresaliente";
					Finsi
				FinSi
			FinSi
		FinSi
	Finsi	
FinProceso