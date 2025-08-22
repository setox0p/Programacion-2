import java.util.Scanner;

public class costoEnvio {

    public static double calcularCostoEnvio(double peso, String zona) {
        
        zona = zona.trim().toLowerCase();
        
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            System.out.println("Zona invalida. Costo de envio 0.");
            return 0.0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();

       scan.nextLine();

        System.out.print("Ingrese zona de envio (Nacional/Internacional): ");
        String zona = scan.nextLine();

     
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        scan.close();
    }
}