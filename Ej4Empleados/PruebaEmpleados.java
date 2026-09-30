package Ej4Empleados;

public class PruebaEmpleados {
    public static void main(String[] args) {

        Empleado v = new Vendedor("Ana", 1200, 450);
        Empleado g = new Gerente("Luis", 2000, 800);

        System.out.printf("%s → $%,.2f%n", v, v.calcularSueldo());
        System.out.printf("%s → $%,.2f%n", g, g.calcularSueldo());
    }
}