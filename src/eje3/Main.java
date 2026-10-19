package eje3;

public class Main {
    static void main() {
        Pedido p1= new Pedido("Nico",12.2);
        System.out.println("Cliente "+ p1.getNum() + " Total "+ p1.getTotal()+ " estado "
                + p1.getEstado() );
        p1.confirmar();
        System.out.println("venta "+ p1.getEstado()+ " venta total "+ p1.getVentas());


    }
}