Proceso P3_2_14
	Definir a Como Entero;
	Escribir"Seleccione una opción";
	Escribir"- 1 - Para hacer algo";
	Escribir"- 2 - Para hacer otra cosa";
	Escribir"- 3 - Para salir";
	Leer a;
	Mientras a <> 3 Hacer
		Segun a Hacer
			1:
				Escribir "Has hecho algo";
			2:
				Escribir "Has hecho otra cosa";
			3:
				Escribir "Salir";
				a <- a+3;
			De otro modo
			Escribir "Has seleccionado una opción inválida";
			Escribir "Si desea salir introduzca - 3 -";
		FinSegun
		Escribir"Seleccione una opción";
		Leer a;
	FinMientras
FinProceso