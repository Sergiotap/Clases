package PRÁCTICA_7_5;

import java.util.Arrays;

public class Alumno {
    String nombre, apellidos;
    int edad;
    String[] modulos = new String[5];

    public Alumno(String nombre, String apellidos, int edad, String[] modulos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.modulos = modulos;
    }

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", modulos=" + Arrays.toString(modulos) +
                '}';
    }
}
