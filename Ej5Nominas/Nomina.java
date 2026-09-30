package Ej5Nominas;

import java.util.ArrayList;

public class Nomina {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Vendedor("Ana", 1200, 450));
        empleados.add(new Gerente("Luis", 2000, 800));
        empleados.add(new Vendedor("Sofía", 1100, 900));
        empleados.add(new Gerente("Marco", 1800, 400));

        // Primero, mostrar todos
        System.out.println("Nómina completa:");
        for (Empleado e : empleados) {
            System.out.printf("  %-25s → $%,.2f%n", e, e.calcularSueldo());
        }

        // Encontrar el mejor pagado
        Empleado mejorPagado = empleados.get(0);

        for (Empleado e : empleados) {
            if (e.calcularSueldo() > mejorPagado.calcularSueldo()) {
                mejorPagado = e;
            }
        }

        System.out.printf("%nMejor pagado: %s con $%,.2f%n",
                mejorPagado, mejorPagado.calcularSueldo());
    }
}