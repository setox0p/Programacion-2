import java.util.Scanner;

public class CalculoPrecio {
    
    
    public static double calculoPrecioFinal(double precioBase, double impuesto, double descuento){
       
        double imp = impuesto / 100;
        double desc = descuento / 100;
        
        double precioFinal = precioBase + (precioBase * imp) - (precioBase * desc);
        
        return precioFinal;
    }
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();
        
        
        System.out.print("Ingrese el impuesto (sin %): ");
        double impuesto = scan.nextDouble();
        
        
        System.out.print("Ingrese el descuento (sin %): ");
        double descuento = scan.nextDouble();
        
        
        
        double resultado = calculoPrecioFinal(precioBase, impuesto, descuento);
        System.out.print("El precio final es: " + resultado);
        System.out.println("");
        
        scan.close();
        
    }
    
}
