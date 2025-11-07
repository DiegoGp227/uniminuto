package org.example;

/**
 * Clase que representa un animal salvaje.
 * Extiende de Animal y añade comportamientos específicos de animales salvajes.
 */
public class AnimalSalvaje extends Animal {
    /**
     * Constructor de la clase AnimalSalvaje.
     *
     * @param nombre El nombre del animal salvaje
     * @param edad La edad del animal salvaje en años
     */
    public AnimalSalvaje(String nombre, int edad) {
        super(nombre, edad);
    }


    /**
     * Método que simula la acción de cazar del animal salvaje.
     * Imprime un mensaje indicando que el animal está cazando.
     */
    public void cazar() {
        System.out.println(nombre + " está cazando");
    }


    /**
     * Implementación del método emitirSonido para animales salvajes.
     *
     * @return String con un sonido genérico de animal salvaje
     */
    @Override
    public String emitirSonido() {
        return "Sonido salvaje";
    }
}
