import java.util.Scanner;
public class CalculoSimples1010{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o codigo da peca 1, o numero de pecas e o valor unitario de cada peca: ");
		int cod = scan.nextInt();
		int num = scan.nextInt();
		float valor = scan.nextFloat();
		System.out.println("Informe o codigo da peca 2, o numero de pecas e o valor unitario de cada peca: ");
		int cod2 = scan.nextInt();
		int num2 = scan.nextInt();
		float valor2 = scan.nextFloat();

		double total = (num * valor) + (num2 * valor2);
		System.out.println("VALOR A PAGAR = R$ " + total);
		scan.close();
	}
}