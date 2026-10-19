
package eje7;

public class Dispositivo{

    //Atributos
    private String nombre;
    private  String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar en blanco.");
        } else {
            this.nombre = nombre;
            System.out.println("Nombre asignado correctamente.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar en blanco.");
        } else {
            this.nombre = nombre;
            System.out.println("Nombre asignado correctamente.");
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}