package org.example;

/**
 * Clase abstracta que representa un animal genérico.
 * Sirve como clase base para todos los tipos de animales del zoológico.
 */
public abstract class Animal {
    /**
     * Nombre del animal
     */
    public String nombre;

    /**
     * Edad del animal en años
     */
    public int edad;


    /**
     * Método abstracto que debe ser implementado por las subclases
     * para definir el sonido característico de cada animal.
     *
     * @return String con el sonido que emite el animal
     */
    public abstract String emitirSonido();


    /**
     * Constructor de la clase Animal.
     *
     * @param nombre El nombre del animal
     * @param edad La edad del animal en años
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    /**
     * Imprime por consola la información básica del animal.
     * Muestra el nombre y la edad del animal.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", edad: " + edad);
    }
}
