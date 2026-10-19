package guiado1;

public class Dispositivo {

    private String nombre;
    private String tipo;
    private boolean activo;
    private static int contador = 0;

    public Dispositivo () {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }

    }

    public String getNombre() {

        return nombre;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setActivo(boolean activo) {

        this.activo = activo;
    }

    public boolean getActivo() {

        return activo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);

    }

    public void activar() {
        if (activo == false) {
            activo = true;
            System.out.println("Activado");
        } else {
            System.out.println("Activo");
        }


    }

    public void desactivar(){

        activo = false;

    }

    void mostrarEstado() {
        System.out.println("Activo: " + activo);

    }

    public static int getTotalCreados() {
        return contador;
    }



}