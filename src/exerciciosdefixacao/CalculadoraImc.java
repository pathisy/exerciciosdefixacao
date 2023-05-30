package exerciciosdefixacao;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		double peso = entrada.nextDouble();

		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();

		entrada.close();

		double imc = calcularImc(peso, altura);
		String Categoria = categoriaIMC(imc);

		System.out.println("Seu IMC é : " + imc + "e você se encontra na categoria " + Categoria);
	}

	public static double calcularImc(double peso, double altura) {
		return peso / (altura * altura);
	}

public static String categoriaIMC(double imc) {
	if (imc <= 18.5) {
		return " abaixo do seu peso ideal!";
	} else if (imc >= 18.5 && imc <= 24.9) {
		return " seu peso ideal!";
	} else if (imc >= 25 && imc <= 29.9) {
		return "acima do seu peso ideal!";
	} else {
			return "obesidade grau I!";
		}
}
}
