package tarea.semana3;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class DivisiblePorTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else {
            System.out.println("El número no es divisible por 3.");
        }
    }
}
