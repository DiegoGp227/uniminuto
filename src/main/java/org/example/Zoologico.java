package org.example;

/**
 * Clase que representa un zoológico.
 * Gestiona una colección de animales y proporciona operaciones sobre ellos.
 */
public class Zoologico {
    /**
     * Array que almacena los animales del zoológico
     */
    private Animal[] animales;

    /**
     * Contador que indica el número de animales actualmente en el zoológico
     */
    private int contador = 0;


    /**
     * Constructor de la clase Zoologico.
     *
     * @param capacidad La capacidad máxima de animales que puede albergar el zoológico
     */
    public Zoologico(int capacidad) {
        animales = new Animal[capacidad];
    }


    /**
     * Agrega un animal al zoológico si hay espacio disponible.
     *
     * @param a El animal a agregar al zoológico
     */
    public void agregarAnimal(Animal a) {
        if (contador < animales.length) {
            animales[contador++] = a;
        }
    }


    /**
     * Hace que todos los animales del zoológico emitan su sonido.
     * Imprime en consola el nombre de cada animal junto con su sonido característico.
     */
    public void hacerSonarATodos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(animales[i].nombre + ": " + animales[i].emitirSonido());
        }
    }

}
