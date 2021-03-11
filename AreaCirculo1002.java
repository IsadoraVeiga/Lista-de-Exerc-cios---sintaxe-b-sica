import java.util.Scanner;
public class AreaCirculo1002{
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o raio: ");
	double raio = scan.nextDouble();

	double A = Math.pow(raio,2) * 3.14159;
	System.out.println("A= " + A);
	scan.close();
	}
}