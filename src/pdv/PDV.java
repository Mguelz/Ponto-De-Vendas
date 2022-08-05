package pdv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double total, desconto, totalDesconto, valorPago, troco;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");

		// entrada1
		System.out.println("PSV");
		System.out.print("Valor Total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();

		// processamento1
		totalDesconto = total - (desconto * total) / 100;

		// saida1
		System.out.println("Total com desconto:  R$ " + formatador.format(totalDesconto));

		// entrada2
		System.out.println("_________________________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();

		// processamento2
		troco = valorPago - totalDesconto;

		// saida2
		System.out.println("Troco: R$ " + formatador.format(troco));

		teclado.close();

	}

}
