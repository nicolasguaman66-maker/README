package eje2;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static  int contador=0;

    public Producto(String nombre,double precio, int stock) {
        contador++;
        this.id=contador;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public static int getContador() {
        return contador;
    }

    public void mostrarinformacion(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("------------------------");
    }
}
