/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author johao
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //Declaracion de variables
        double metaAho;
        int opcion;
        double gastoAli = 0;
        double gastoTrans = 0;
        double gastoEdu = 0;
        double gastoOtros = 0;
        double valor;
        int tipo;
        int totalMovimientos = 0;
        double totalIngresos = 0;
        double totalGastos = 0;
        double balance = 0;
        double porcentajeGastos;
        double ahorroDisponible;
        double diferenciaMeta;

        System.out.printf("-----------------------------------------------------------"
                + "\nSistema de planificación y seguimiento del ahorro personal\n"
                + "-----------------------------------------------------------\n\n");

        //Establece una meta
        System.out.print("Ingrese su meta de ahorro mensual: ");
        metaAho = entrada.nextDouble();

        while (metaAho <= 0) {

            System.out.printf("El valor ingresado no puede ser mrnor o igual a 0\n"
                    + "Vuelva a ingresar la meta de ahorro: ");
            metaAho = entrada.nextDouble();
        }

        // Opciones de acciones 
        System.out.printf("Opciones de registro\n1. Ingreso\n2. Gasto\n0. Finalizar\n");
        System.out.printf("Ingrese la accion que quiere hacer: ");
        opcion = entrada.nextInt();

        while (opcion < 0 || opcion > 2) {

            System.out.printf("Opcion invalida\nElija una de las opciones:"
                    + "\n1. Ingreso\n2. Gasto\n0. Finalizar\n"
                    + "Ingrese la accion que quiere hacer: ");
            opcion = entrada.nextInt();

        }
        while (opcion == 1 || opcion == 2) {

            System.out.printf("Ingrese el valor:");
            valor = entrada.nextDouble();
            while (valor <= 0) {

                System.out.printf("El valor no puede ser de 0 o inferior\n"
                        + "Ingrese de nuevo el valor:");
                valor = entrada.nextDouble();
            }

            if (opcion == 1) {

                totalIngresos = totalIngresos + valor;
                totalMovimientos = totalMovimientos + 1;
                balance = totalIngresos - totalGastos;

                System.out.printf("Gasto: %.2f\nBalance: %.2f\n", valor, balance);
            } else {
                System.out.printf("Tipo de gasto\n1. Alimentacion\n2. Transporte"
                        + "\n3. Educacion\n4. Otros gastos\nSeleccione tipo de gasto:");
                tipo = entrada.nextInt();

                while (tipo < 1 || tipo > 4) {

                    System.out.printf("Dato invalido\nTipo de gasto\n1. "
                            + "Alimentacion\n2. Transporte"
                            + "\n3. Educacion\n4. Otros gastos\nSeleccione tipo de gasto:");
                    tipo = entrada.nextInt();
                }
                if (tipo == 1) {
                }

            }

        }
    }

}
