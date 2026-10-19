package eje9;

public class Clasificador {


    private double valorEntrada;
    private double umbral;
    private String resultado;

    // Constructor
    public Clasificador(double umbral) {
        this.umbral = umbral;
        this.valorEntrada = 0;
        this.resultado = "SIN EVALUAR";
    }
    //Asigna el valor de entrada
    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public void evaluar() {
        if (valorEntrada >= umbral) {
            resultado = "POSITIVO";
        } else {
            resultado = "NEGATIVO";
        }
    }

    public void mostrarResultado() {
        System.out.println("Valor: " + valorEntrada
                + " | Umbral: " + umbral
                + " | Resultado: " + resultado);
    }
}
