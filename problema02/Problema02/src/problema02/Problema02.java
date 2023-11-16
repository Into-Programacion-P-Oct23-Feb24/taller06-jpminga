/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingresar el nombre del propietarioo del vehiculo");
        String propietario = entrada.nextLine();

        System.out.printf("Ingresar tipo de vehiculo dependiendo la "
                + "siguiente tabla\nPara vehiculos livianos ingresar '1'\n"
                + "Para vehiculo grande particular ingresar'2'\n"
                + "Para taxi '3'\nPara bus urbano ingresar '4' \n");
        int tipo = entrada.nextInt();

        System.out.println("Ingresar valor del vehiculo");
        double valorVehiculo = entrada.nextDouble();
        double monto;

        switch (tipo) {
            case 1:
                monto = (valorVehiculo * (0.0001)) + 2;
                System.out.printf("\nPeaje'AvenidaLoja'\nPropietario: %s\n"
                        + "Valor: $%.1f\nPeaje: $%.1f",
                         propietario, valorVehiculo, monto);
                break;

            case 2:
                monto = (valorVehiculo * (0.0002)) + 2.5;
                System.out.printf("\nPeaje'AvenidaLoja'\nPropietario: %s\n"
                        + "Valor: $%.1f\nPeaje: $%.1f",
                         propietario, valorVehiculo, monto);
                break;

            case 3:
                monto = (valorVehiculo * (0.0004)) + 1.5;
                System.out.printf("\nPeaje'AvenidaLoja'\nPropietario: %s\n"
                        + "Valor: $%.1f\nPeaje: $%.1f",
                         propietario, valorVehiculo, monto);
                break;

            case 4:
                monto = (valorVehiculo * (0.0005)) + 2.2;
                System.out.printf("\nPeaje'AvenidaLoja'\nPropietario: %s\n"
                        + "Valor: $%.1f\nPeaje: $%.1f",
                         propietario, valorVehiculo, monto);

            default:
                System.out.println("ERROR:Tipo de vehiculo ingresado no "
                        + "reconocido");
                break;
        }
    }

}
