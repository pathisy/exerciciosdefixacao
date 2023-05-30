import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int tabuada = teclado.nextInt();
		teclado.close();

		int contador = 10;
		while (contador >= 1) {
			int resultado = tabuada * contador;
			System.out.print(tabuada + " x " + contador + " = " + resultado);
			System.out.println(" ");
			contador--;
		}

	}
}
