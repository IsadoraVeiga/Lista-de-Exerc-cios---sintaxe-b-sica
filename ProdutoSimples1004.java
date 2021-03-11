import java.util.Scanner;
public class ProdutoSimples1004{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois valores: ");
		double A = scan.nextDouble();
		double B = scan.nextDouble();

		double P = A * B;
		System.out.println("PROD = " + P);
		scan.close();
	}
}