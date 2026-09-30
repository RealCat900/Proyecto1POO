package SumaAreasEJ3;

public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
}