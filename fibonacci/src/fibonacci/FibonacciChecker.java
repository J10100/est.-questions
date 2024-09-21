package fibonacci;
import java.util.Scanner;

public class FibonacciChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = scanner.nextInt();
		
		if (isFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		}
		
		scanner.close();

	}
	
	public static boolean isFibonacci(int num) {
		if (num == 0 || num == 1) {
			return true;
		}
		
		int fib1 = 0;
		int fib2 = 1;
		int fibonacci = 1;
		
		while (fibonacci < num) {
			fibonacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonacci;
		}
	
	    return fibonacci == num;

    }
}
