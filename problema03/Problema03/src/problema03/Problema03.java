/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingresar el nombre del empleado");
        String nombre = entrada.nextLine();

        System.out.printf("Ingresar tipo de empleado:\n1\n2\n3\n4\n5\n");
        int tipo = entrada.nextInt();

        System.out.println("Ingresar el sueldo del empleado");
        double sueldo = entrada.nextDouble();
        double aumento;

        switch (tipo) {
            case 1:
                aumento = (sueldo * (0.05)) + sueldo;
                System.out.printf("\nNombre: %s\n"
                        + "Tipo de empleado: $%d\nsueldo: $%.1f\nAumento: $%.1f",
                        nombre, tipo, sueldo, aumento);
                break;

            case 2:
                aumento = (sueldo * (0.07)) + sueldo;
                System.out.printf("\nNombre: %s\n"
                        + "Tipo de empleado: $%d\nsueldo: $%.1f\nAumento: $%.1f",
                        nombre, tipo, sueldo, aumento);
                break;

            case 3:
                aumento = (sueldo * (0.09)) + sueldo;
                System.out.printf("\nNombre: %s\n"
                        + "Tipo de empleado: $%d\nsueldo: $%.1f\nAumento: $%.1f",
                        nombre, tipo, sueldo, aumento);
                break;

            case 4:
                aumento = (sueldo * (0.12)) + sueldo;
                System.out.printf("\nNombre: %s\n"
                        + "Tipo de empleado: $%d\nsueldo: $%.1f\nAumento: $%.1f",
                        nombre, tipo, sueldo, aumento);
                break;

            case 5:
                aumento = (sueldo * (0.15)) + sueldo;
                System.out.printf("\nNombre: %s\n"
                        + "Tipo de empleado: $%d\nsueldo: $%.1f\nAumento: $%.1f",
                        nombre, tipo, sueldo, aumento);

            default:
                System.out.println("ERROR:Tipo de empleado no encontrado");
                break;

        }
    }

}
