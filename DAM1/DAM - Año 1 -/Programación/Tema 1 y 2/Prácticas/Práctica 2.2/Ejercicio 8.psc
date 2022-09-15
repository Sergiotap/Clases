Proceso P2_2_8
	
	//Definir
	Definir npie,mill,met,pul,yar Como Real;
	
	Escribir "Introduzca un valor para convertir";
	Leer npie;
	
	//bucle
	Mientras npie <= 0 Hacer
		Escribir "No se admiten números negativos, introduzca un valor positivo";
		Leer npie;
	FinMientras
	
	//Variables
	pul <- npie*12;
	met <- pul*0.0254;
	yar <- npie*3;
	mill <- npie*1609;
	
	//Se vienen cositas
	Escribir "Su valor en pulgadas es el Siguiente: ", pul," pulgadas";
	Escribir "Su valor en metros es el Siguiente: ", met," metros";
	Escribir "Su valor en yardas es el Siguiente: ", yar," yardas";
	Escribir "Su valor en millas es el Siguiente: ", mill," millas";
	
FinProceso
