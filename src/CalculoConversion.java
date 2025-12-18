import java.util.Scanner;

public class CalculoConversion {

    public static void convertir(String origen, String destino, Scanner lectura, ConversionMoneda peticion) {

        try {
            System.out.print("Ingrese el monto a convertir: ");
            double monto = Double.parseDouble(lectura.nextLine());

            Moneda moneda = peticion.conversion(origen, destino);
            double resultado = monto * moneda.conversion_rate();

            System.out.printf("%.2f %s = %.2f %s%n", monto, origen, resultado, destino);

        } catch (NumberFormatException e) {
            System.out.println("Monto inválido");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
