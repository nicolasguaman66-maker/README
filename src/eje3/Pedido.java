package eje3;

public class Pedido {
    private int num;
    private String cliente;
    private double total;
    private String estado;
    public static int contador=0;
    public static int ventas=0;


    public Pedido(String cliente, double total) {
        contador++;
        this.num=contador;
        this.cliente = cliente;
        this.total= total;
        estado= "Pendiente";

    }

    public void confirmar(){
        if (!estado.equals("Confirmado")) {
            estado = "Confirmado";
            ventas += total;
        }
    }

    public static int getVentas() {
        return ventas;
    }

    public static int getContador(){
        return contador;
    }


    public int getNum() {
        return num;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }
}
