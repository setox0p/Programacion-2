import java.util.Scanner;

public class edad {

 
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Escriba su edad: ");
        int edad = sc.nextInt();
        
        
        if (edad < 12) {
            System.out.println("Sos un niño.");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Sos adolescente");
        } else {
            System.out.println("Sos adulto mayor");
        }
    }
 }
