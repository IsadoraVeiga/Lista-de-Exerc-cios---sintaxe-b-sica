import java.util.Scanner;
public class OMaior1013{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores: ");
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int maiorAB = (Math.abs(A - B) + A + B)/2;
		int maior = (Math.abs(C - maiorAB) + C + maiorAB)/2;

		System.out.println("maior valor = " + maior);
		scan.close();
	}
}