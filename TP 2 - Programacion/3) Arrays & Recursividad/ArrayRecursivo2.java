public class ArrayRecursivo2 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        
        System.out.println("Precios originales: ");
        mostrarPreciosRecursivos(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        mostrarPreciosRecursivos(precios, 0);
    }
    
    public static void mostrarPreciosRecursivos(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            mostrarPreciosRecursivos(array, indice + 1);
        }
    }
    
}
