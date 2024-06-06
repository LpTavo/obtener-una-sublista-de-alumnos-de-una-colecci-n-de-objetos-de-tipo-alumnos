import java.util.*;
import java.util.stream.Collectors;

class Alumno {
    private int codigo;
    private String nombre;
    private String apellido;
    private String genero;
    private int semestre;

    public Alumno(int codigo, String nombre, String apellido, String genero, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una lista de alumnos
        List<Alumno> alumnos = Arrays.asList(
                new Alumno(1, "John", "Doe", "M", 3),
                new Alumno(2, "Alice", "Smith", "F", 2),
                new Alumno(3, "Bob", "Johnson", "M", 4),
                new Alumno(4, "Emily", "Jones", "F", 3)
        );

        // Obtener una sublista de alumnos que se encuentren en el tercer semestre
        List<Alumno> sublista = alumnos.stream()
                .filter(alumno -> alumno.getSemestre() == 3)
                .collect(Collectors.toList());

        // Imprimir la sublista de alumnos
        sublista.forEach(System.out::println);
    }
}
