import java.util.Scanner;
public class SomaSimples1003{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores de A e B respectivamente: ");
		int A = scan.nextInt();
		int B = scan.nextInt();

		int S = A + B;
		System.out.println("SOMA = " + S);
		scan.close();
	}
}