package Main;

public class Main {
    static void main() {
        RegistroCliente r1 = new RegistroCliente("Nico", "paulo");

        r1.mostrarinfo();
        r1.Activar();
        System.out.println("Cliente activo "+ r1.isActivo());
        r1.desctivar();
        r1.mostrarinfo();
        System.out.println("Cliente activo "+ r1.isActivo());
    }
}
