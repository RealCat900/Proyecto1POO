package SumaAreasEJ3;

import java.util.ArrayList;

public class SumaAreas {
    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(1.5));
        figuras.add(new Cuadrado(2));
        figuras.add(new Circulo(5));

        double suma = 0;

        for (FiguraGeometrica f : figuras) {
            double area = f.calcularArea();
            System.out.printf("%-10s → área = %.2f%n", f.getNombre(), area);
            suma += area;
        }

        System.out.printf("%nÁrea total: %.2f%n", suma);
    }
}