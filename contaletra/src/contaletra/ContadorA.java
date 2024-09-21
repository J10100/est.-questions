package contaletra;
import java.util.Scanner;

public class ContadorA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe uma string: ");
		String texto = scanner.nextLine();
		int quantidade = contarLetraA(texto);
		
		if (quantidade > 0) {
			System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + quantidade + " vez(es) na string.");
		} else {
			System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
		}
		
		scanner.close();
	}
	
	public static int contarLetraA(String texto) {
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (letra == 'a' || letra == 'A') {
				contador++;
			}
		}
		
		return contador;
	}

}
