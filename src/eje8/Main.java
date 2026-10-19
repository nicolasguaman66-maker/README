package eje8;

public class Main {

    public static void main(String[] args) {
        ProductoDigital p1 = new ProductoDigital("Ebook de Java", 12.99, 50);
        ProductoDigital p2 = new ProductoDigital("Jva edition", 20, 25 );

        System.out.println("--- Información de los productos ---");
        p1.mostrarInfo();
        p2.mostrarInfo();

        // Opcional: probar los setters y los getters
        System.out.println("\n--- Después de modificar el primer producto ---");
        p1.setPrecio(9.99);
        p1.setStock(p1.getStock() - 1);
        p1.mostrarInfo();
    }
}