package eje5;

public class registro {
    private int direccionip;
    private double horadeentrada;
    private boolean permitida;

    registro(int direccionip, double horadeentrada){
        this.direccionip = direccionip;
        System.out.println("direccion "+ direccionip);
        this.horadeentrada = horadeentrada;
        System.out.println("horadeentrada "+ horadeentrada );

    }
    public void perimitido(){
        this.permitida= true;
    }
    public void nopermitida(){
        this.permitida=false;
    }

    public boolean isperimitido(){
        return permitida;
    }


}
