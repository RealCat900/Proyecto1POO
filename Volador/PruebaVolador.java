package Volador;

import java.util.ArrayList;

public class PruebaVolador {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Pajaro("Piolín", 1));
        animales.add(new Perro("Firulais", 3));
        animales.add(new Gato("Michi", 2));
        animales.add(new Pajaro("Tweety", 2));

        for (Animal a : animales) {
            System.out.println(a);
            a.hacerSonido();

            if (a instanceof Volador) {
                Volador v = (Volador) a;
                v.volar();
            } else {
                System.out.println(a + " no puede volar.");
            }
            System.out.println();
        }
    }
}