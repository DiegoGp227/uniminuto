package org.example;

/**
 * Clase que representa un animal doméstico.
 * Extiende de Animal e implementa la interfaz Mascota.
 */
public class AnimalDomestico extends Animal implements Mascota {
        /**
         * Constructor de la clase AnimalDomestico.
         *
         * @param nombre El nombre del animal doméstico
         * @param edad La edad del animal doméstico en años
         */
        public AnimalDomestico(String nombre, int edad) {
            super(nombre, edad);
        }


        /**
         * Implementación del método emitirSonido para animales domésticos.
         *
         * @return String con un sonido genérico de animal doméstico
         */
        @Override
        public String emitirSonido() {
            return "Sonido doméstico";
        }


        /**
         * Implementación del método jugar de la interfaz Mascota.
         * Imprime un mensaje indicando que el animal juega con su dueño.
         */
        @Override
        public void jugar() {
            System.out.println(nombre + " juega con su dueño");
        }
}

