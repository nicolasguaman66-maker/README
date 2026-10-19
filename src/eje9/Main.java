package eje9;

public class Main {

    public static void main(String[] args) {

        Clasificador c = new Clasificador(50);

        // POSITIVO
        c.setValorEntrada(72.5);
        c.evaluar();
        c.mostrarResultado();

        // NEGATIVO
        c.setValorEntrada(30);
        c.evaluar();
        c.mostrarResultado();


        Clasificador c2 = new Clasificador(0.5);
        c2.setValorEntrada(0.3);
        c2.evaluar();
        c2.mostrarResultado();
    }
}