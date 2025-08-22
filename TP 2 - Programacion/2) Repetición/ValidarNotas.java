
import java.util.Scanner;

public class ValidarNotas {
   public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int nota;
                        
       
       do {
          System.out.print("Ingrese una nota (0-10): ");
          nota = scan.nextInt();
          
          
          if (nota < 0 || nota > 10){
              System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
          }
       } while (nota < 0 || nota > 10);
       
       System.out.println("Nota guardada correctamente.");
       
       scan.close();
    
    
    }
}    
