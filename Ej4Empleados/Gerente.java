package Ej4Empleados;

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bono;
    }
}