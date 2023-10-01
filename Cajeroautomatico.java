package cajeroautomatico;

import java.util.Scanner;

public class Cajeroautomatico {

    public static void main(String[] args) {
        double dd = 200.1;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Bienvenido al Cajero Automatico\n"
                + "1. Consulta saldo\n"
                + "2. Depositar dinero\n"
                + "3. Retirar dinero\n"
                + "Seleccionar una opcion: ");
        int opciones = Integer.parseInt(lectura.next());
        String cajero;
        switch (opciones) {
            case 1:
                cajero = "Su Saldo de usuario es";
                System.out.println("Su Saldo de usuario es:" + dd);
                break;
            case 2:
                cajero = "Depositar Dinero";
                System.out.print("¿Cuanto dinero quiere depositar?: ");
                
                double deposito = Double.parseDouble(lectura.next());
                dd += deposito;
                System.out.println("Su saldo es: " + dd);
                break;
            case 3:
                cajero = "Retirar dinero";
                System.out.println("¿Cuanto dinero quiere retirar?");
                double retiro = Double.parseDouble(lectura.next());
                if (retiro <= dd) {
                    dd -= retiro;
                    System.out.println("Retiro exitoso, Su nuevo saldo es: " + dd);
                } else {
                    System.out.println("Fondos insuficientes");
                }
                break;
            default:
                System.out.println("Opción no válida. Seleccione otra opción:");
                break;
        }

    }

}
