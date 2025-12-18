import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConversionMoneda peticion = new ConversionMoneda();

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("""
        ===============================
        Conversor de Monedas
        1) USD → CLP
        2) CLP → USD
        3) USD → EUR
        4) EUR → USD
        5) USD → ARS
        6) Otra conversión
        7) Salir
        ===============================
        Elija una opción:
        """);

            try {
                opcion = Integer.parseInt(lectura.nextLine());

                switch (opcion) {
                    case 1:
                        CalculoConversion.convertir("USD", "CLP", lectura, peticion);
                        break;
                    case 2:
                        CalculoConversion.convertir("CLP", "USD", lectura, peticion);
                        break;
                    case 3:
                        CalculoConversion.convertir("USD", "EUR", lectura, peticion);
                        break;
                    case 4:
                        CalculoConversion.convertir("EUR", "USD", lectura, peticion);
                        break;
                    case 5:
                        CalculoConversion.convertir("USD", "ARS", lectura, peticion);
                        break;
                    case 6:
                        conversionLibre(lectura, peticion);
                        break;
                    case 7:
                        System.out.println("Ejecución Finalizada");
                        break;
                    default: System.out.println("Opción inválida");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número");
            }
        }
    }

    static void conversionLibre(Scanner lectura, ConversionMoneda peticion) {
        System.out.print("Ingrese la moneda de origen (ej: USD): ");
        String origen = lectura.nextLine().toUpperCase();

        System.out.print("Ingrese la moneda de destino (ej: CLP): ");
        String destino = lectura.nextLine().toUpperCase();

        CalculoConversion.convertir(origen, destino, lectura, peticion);
    }


}
