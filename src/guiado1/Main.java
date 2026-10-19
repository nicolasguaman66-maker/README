package guiado1;

public class Main {

    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

    /*dispositivo1.nombre = "Iphone 17 Pro Max";
    dispositivo1.tipo = "Dispositivo";
    dispositivo1.activo = false;

    dispositivo2.nombre = "MacBoock";
    dispositivo2.tipo = "Tecnologia";
    dispositivo2.activo = false;

    dispositivo1.activar();
    dispositivo1.mostrarEstado();
    dispositivo1.mostrarInformacion();*/

    /*dispositivo1.setNombre("Iphone 17 pro max");
    dispositivo1.setTipo("Dispositivo");
    dispositivo1.setActivo(false);*/

        System.out.println(dispositivo1.getNombre());
        System.out.println(dispositivo1.getTipo());
        System.out.println(dispositivo1.getActivo());

        dispositivo1.mostrarEstado();
        dispositivo1.activar();

    }


}
