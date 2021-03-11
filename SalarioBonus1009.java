import java.util.Scanner;
public class SalarioBonus1009{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do vendedor: ");
		String nome = scan.next();
		System.out.println("Informe o salario fixo: ");
		double salario = scan.nextDouble();
		System.out.println("Informe as vendas efetuadas (em dinheiro): ");
		float vendas = scan.nextFloat();

		double resultado = (vendas * 0.15) + salario;
		System.out.println("TOTAL = R$ " + resultado);
		scan.close();
	}
}