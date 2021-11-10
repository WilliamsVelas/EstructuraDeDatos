package examen2estructuradedatos;

public class Estudiante {
     private String nombre, apellido, cedula;
	 private int edad, promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String cedula, int edad, int promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public int getPromedio() {
        return promedio;
    }

}
