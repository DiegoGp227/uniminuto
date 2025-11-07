package org.example;

/**
 * Clase principal del programa del Zoológico.
 * Contiene el método main que ejecuta la demostración del sistema.
 */
public class Main {
    /**
     * Método principal que ejecuta el programa.
     * Crea varios animales, los agrega al zoológico y demuestra
     * sus diferentes comportamientos.
     *
     * @param args Argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
            // Crear instancias de diferentes tipos de animales
            Perro p = new Perro("Rex", 3, "Labrador");
            Pajaro j = new Pajaro("Piolín", 2);
            Leon l = new Leon("Simba", 4);


            // Crear el zoológico y agregar los animales
            Zoologico z = new Zoologico(10);
            z.agregarAnimal(p);
            z.agregarAnimal(j);
            z.agregarAnimal(l);


            // Hacer que todos los animales emitan su sonido
            z.hacerSonarATodos();


            // Demostrar comportamientos específicos de cada animal
            j.volar();
            p.jugar();
            l.cazar();
    }
}