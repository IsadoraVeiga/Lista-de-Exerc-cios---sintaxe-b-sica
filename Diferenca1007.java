import java.util.Scanner;
public class Diferenca1007{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores: ");
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int resultado = (A * B) - (C * D);
		System.out.println("DIFERENCA = " + resultado);
		scan.close();
	}
}