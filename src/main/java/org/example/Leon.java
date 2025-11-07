package org.example;

/**
 * Clase que representa un león.
 * Extiende de AnimalSalvaje y define el rugido característico del león.
 */
public class Leon extends AnimalSalvaje {
    /**
     * Constructor de la clase Leon.
     *
     * @param nombre El nombre del león
     * @param edad La edad del león en años
     */
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }


    /**
     * Implementación del método emitirSonido específico para leones.
     *
     * @return String con el rugido característico del león
     */
    @Override
    public String emitirSonido() {
        return "¡Rooaar!";
    }
}
