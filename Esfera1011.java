import java.util.Scanner;
public class Esfera1011{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do raio: ");
		double raio = scan.nextDouble();
		
		double volume = Math.pow(raio,3) * 3.14159 * (4/3.0);
		System.out.println("VOLUME = " + volume);
		scan.close();
	}
}