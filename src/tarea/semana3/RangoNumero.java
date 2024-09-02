package tarea.semana3;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class RangoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 10) {
            System.out.println("El número está en el rango de 1 a 10.");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("El número está en el rango de 11 a 20.");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("El número está en el rango de 21 a 30.");
        } else {
            System.out.println("El número está fuera de los rangos especificados.");
        }
    }
}