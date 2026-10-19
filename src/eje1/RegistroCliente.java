package eje1;

public class RegistroCliente {
    int id;
    private String nombre;
    private String correo;
    private boolean activo;
    public static int contador=0;

    public RegistroCliente(String nombre, String correo){
        contador++;
        this.nombre=nombre;
        this.correo=correo;

    }

    public static int getContador() {
        return contador;
    }

    public void desctivar() {
        this.activo=false;
    }

    public void Activar () {
        this.activo = true;
    }

    public boolean isActivo() {
        return activo;
    }

    public void mostrarinfo(){
        System.out.println(" Nombre: "+ nombre + " correo "+correo );

    }
}
