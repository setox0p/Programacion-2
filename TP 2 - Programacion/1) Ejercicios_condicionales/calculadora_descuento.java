import java.util.Scanner;

public class calculadora_descuento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Escriba el precio del producto: ");
        double precio = sc.nextDouble();
        
        System.out.print("Escriba la categoría del producto (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
        
        double descuento = 0;
        
        
        if (categoria == 'A') {
            descuento = 0.10;
        } else if (categoria == 'B'){
            descuento = 0.15;
        } else if (categoria == 'C'){
            descuento = 0.20;
        } else {
            System.out.println("Ingrese una categoria valida (A, B o C). No se aplica descuento");
        }
        
        
        double precioFinal = precio - (precio * descuento);
        
        
        System.out.println("Precio Original: " + precio);
        System.out.println("Precio con descuento: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
