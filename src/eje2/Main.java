package eje2;

 public class Main {
     static void main() {
         Producto p1 = new Producto("laptop",14.1 ,12);
         Producto p2 = new Producto("sapo", 12.2, 10);
         p1.mostrarinformacion();
         p2.mostrarinformacion();
         System.out.println("Total de productos registrados: "
                 + Producto.getContador());
     }
}
