import java.util.Scanner;


public class numerosPares {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    
    int numero;
        int sumaPares = 0; 
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scan.nextInt();

            if (numero == 0) {
                break; 
            }

            
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }

       
        System.out.println("La suma de los números pares es: " + sumaPares);
        
        scan.close();
     }
}
