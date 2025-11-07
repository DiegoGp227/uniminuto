package org.example;

/**
 * Clase que representa un pájaro.
 * Extiende de Animal e implementa la interfaz Volador.
 */
public class Pajaro extends Animal implements Volador {
    /**
     * Constructor de la clase Pajaro.
     *
     * @param nombre El nombre del pájaro
     * @param edad La edad del pájaro en años
     */
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }


    /**
     * Implementación del método volar de la interfaz Volador.
     * Imprime un mensaje indicando que el pájaro está volando.
     */
    @Override
    public void volar() {
        System.out.println(nombre + " está volando");
    }


    /**
     * Implementación del método emitirSonido específico para pájaros.
     *
     * @return String con el piar característico del pájaro
     */
    @Override
    public String emitirSonido() {
        return "Pío pío";
    }
}
