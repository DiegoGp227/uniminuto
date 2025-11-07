package org.example;

/**
 * Clase que representa un perro.
 * Extiende de AnimalDomestico y añade atributos específicos de perros.
 */
public class Perro extends AnimalDomestico {
    /**
     * Raza del perro (por ejemplo: Labrador, Pastor Alemán, etc.)
     */
    public String raza;


    /**
     * Constructor de la clase Perro.
     *
     * @param nombre El nombre del perro
     * @param edad La edad del perro en años
     * @param razaPerro La raza del perro
     */
    public Perro(String nombre, int edad, String razaPerro) {
        super(nombre, edad);
        raza = razaPerro;
    }


    /**
     * Implementación del método emitirSonido específico para perros.
     *
     * @return String con el ladrido característico del perro
     */
    @Override
    public String emitirSonido() {
        return "¡Guau!";
    }


}
