package eje6;


    public class Main {

        public static void main(String[] args) {
            LuzInteligente luz1 = new LuzInteligente(1);
            LuzInteligente luz2 = new LuzInteligente(2);

            System.out.println("--- Estado inicial ---");
            luz1.mostrarEstado();
            luz2.mostrarEstado();

            System.out.println("\n--- Simulación ---");
            luz1.encender();
            luz1.ajustarBrillo(80);   // válido
            luz1.ajustarBrillo(150);  // fuera de rango

            luz2.encender();
            luz2.apagar();
            luz2.ajustarBrillo(30);   // no funciona: está apagada

            System.out.println("\n--- Estado final ---");
            luz1.mostrarEstado();
            luz2.mostrarEstado();
        }
    }

