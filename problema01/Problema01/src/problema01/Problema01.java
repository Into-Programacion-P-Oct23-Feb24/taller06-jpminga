/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingresar el primer numero");
        double n1 = entrada.nextDouble();

        System.out.println("Ingresar el segundo numero");
        double n2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Operacion requerida");
        String operaciones = entrada.nextLine();
        double resultado;

        operaciones = operaciones.toLowerCase();

        if (n1 > n2) {
            switch (operaciones) {
                case "suma":
                    resultado = n1 + n2;
                    System.out.printf("\nTipo: %s\n"
                            + "Resultado: %.1f", operaciones, resultado);
                    break;

                case "resta":
                    resultado = n1 - n2;
                    System.out.printf("\nTipo: %s\n"
                            + "Resultado: %.1f", operaciones, resultado);
                    break;

                case "multiplicacion":
                    resultado = n1 * n2;
                    System.out.printf("\nTipo: %s\n"
                            + "Resultado: %.1f", operaciones, resultado);
                    break;

                case "divicion":
                    resultado = n1 / n2;
                    System.out.printf("\nTipo: %s\n"
                            + "Resultado: %.1f", operaciones, resultado);
                    break;

                default:
                    System.out.println("Operación aritmetica no reconocida");
                    break;
            }
        } else {
            System.out.println("ERROR: segundo numero mayor al primero");
        }

    }

}
