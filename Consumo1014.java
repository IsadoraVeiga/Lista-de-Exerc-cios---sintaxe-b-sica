import java.util.Scanner;
public class Consumo1014{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe  distancia total percorrida(em KM): ");
		int X = scan.nextInt();
		System.out.println("Informe o total de combustivel gasto: ");
		double Y = scan.nextDouble();

		double consumo = X/Y;
		System.out.println("km/l = " + consumo);
		scan.close();
	}
}