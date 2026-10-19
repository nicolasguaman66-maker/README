package eje6;

public class LuzInteligente {


    private int idLuz;
    private int nivelBrillo; // 0-100
    private boolean encendida;

    // Constructor
    public LuzInteligente(int idLuz) {
        this.idLuz = idLuz;
        this.nivelBrillo = 50;
        this.encendida = false;
    }

    public void encender() {
        if (encendida) {
            System.out.println("Luz " + idLuz + ": ya estaba encendida.");
        } else {
            encendida = true;
            System.out.println("Luz " + idLuz + ": encendida.");
        }
    }

    public void apagar() {
        if (!encendida) {
            System.out.println("Luz " + idLuz + ": ya estaba apagada.");
        } else {
            encendida = false;
            System.out.println("Luz " + idLuz + ": apagada.");
        }
    }


    public void ajustarBrillo(int nuevoNivel) {
        if (!encendida) {
            System.out.println("Luz " + idLuz + ": no se puede ajustar el brillo, está apagada.");
        } else if (nuevoNivel < 0 || nuevoNivel > 100) {
            System.out.println("Luz " + idLuz + ": brillo inválido (" + nuevoNivel + "). Debe estar entre 0 y 100.");
        } else {
            nivelBrillo = nuevoNivel;
            System.out.println("Luz " + idLuz + ": brillo ajustado a " + nivelBrillo + "%.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Luz " + idLuz + " | Estado: " + (encendida ? "ENCENDIDA" : "APAGADA")
                + " | Brillo: " + nivelBrillo + "%");
    }
}