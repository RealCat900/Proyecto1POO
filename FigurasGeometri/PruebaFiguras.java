package FigurasGeometri;

public class PruebaFiguras {
    public static void main(String[] args) {

        Circulo c = new Circulo(3);
        Cuadrado q = new Cuadrado(4);

        System.out.println(c.getNombre() + " → " + c.calcularArea());
        System.out.println(q.getNombre() + " → " + q.calcularArea());
    }
}
