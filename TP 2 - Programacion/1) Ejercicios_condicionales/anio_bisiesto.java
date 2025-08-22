
import java.util.Scanner;


public class anio_bisiesto{
    
         public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             
             System.out.print("Escriba el año: ");
             int anio = scan.nextInt();
             
              if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}