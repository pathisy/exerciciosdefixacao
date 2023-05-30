import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int tabuada = teclado.nextInt();
		teclado.close();
		
		for (int contador = 10; contador >= 1; contador--) {
			int multiplicador = tabuada * contador;
			System.out.print(tabuada + " x " + contador + " = " + multiplicador);
			System.out.println(" ");
			
		}
		System.out.println(" ");
	}
}
