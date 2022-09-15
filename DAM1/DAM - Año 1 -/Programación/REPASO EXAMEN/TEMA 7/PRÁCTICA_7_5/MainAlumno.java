package PRÁCTICA_7_5;

public class MainAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Elle", "Lawliet", 24, new String[]{"Programación", "Bases de Datos", "Sistemas Operativos"});
        Alumno a2 = new Alumno("Pepito", "Perez", 21, new String[]{"Programación"});
        Alumno a3 = new Alumno("Javi", "Madrid", 20, new String[]{"Programación", "Lenguaje de Marcas"});

        System.out.println("Datos Tercer Objeto: ");
        System.out.println(a3.toString());

        //Procesar Alumnos
        procesarObjeto(a1);
        procesarObjeto(a2);
        procesarObjeto(a3);

        System.out.println("INFORME DE ASIGNATURAS");
        for (int i = 0; i < asignaturas.length && asignaturas[i] != null; i++) {
            System.out.println(asignaturas[i] + ": " + numAsig[i]);
        }
    }

    static String[] asignaturas = new String[6];
    static int[] numAsig = new int[6];

    public static void procesarObjeto(Alumno a) {
        //Procesar alumno 1
        for (int i = 0; i < a.modulos.length; i++) {
            String asignaturaBuscada = a.modulos[i];
            int j = 0;
            while (j < asignaturas.length && asignaturas[j] != null && !asignaturas[j].equals(asignaturaBuscada)) {
                j++;
            }
            if (j < asignaturas.length) {
                if (asignaturas[j] == null) {
                    asignaturas[j] = asignaturaBuscada;
                    numAsig[j] = 1;
                } else {
                    numAsig[j]++;
                }
            }
        }
    }
}
