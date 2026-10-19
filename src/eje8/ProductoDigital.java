package eje8;

public class ProductoDigital {


    private String nombre;
    private double precio;
    private int stock;


    public ProductoDigital(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void mostrarInfo() {
        System.out.println("Producto: " + nombre
                + " | Precio: $" + precio
                + " | Stock: " + stock);
    }
}
