Proceso p3_1_2
	// Bloque de definiciones
	Definir tarifa,precio Como Real;
	// Bloque de introducción por teclado
	Escribir 'Introduzca el precio de la tarifa';
	Leer tarifa;
	Escribir 'Introduzca el precio de venta';
	Leer precio;
	// Bloque de instrucciones
	precio <- precio*100/tarifa;
	precio <- abs(precio-100);
	Escribir 'El porcentaje de ahorro es el siguiente ',precio,'%';
FinProceso
