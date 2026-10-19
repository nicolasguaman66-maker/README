package eje4;

public class usuario {
    private String nombre;
    private String correo;
    private int contraseña;



    public void setContraseña(int contraseña) {
        if (contraseña >= 10000000 && contraseña <= 99999999) {
            this.contraseña = contraseña;
        }else{
            System.out.println("La contraseña es incorrecta ");}
    }

    public int getContraseña() {
        return contraseña;
    }

    public usuario (String nombre, String correo){
        this.nombre=nombre;
        this.correo=correo;
    }
    public void mostrarinfo(){
        System.out.println("Nombre "+ nombre);
        System.out.println("correo "+ correo);

    }
}
