import java.util.Scanner;
public class Salario1008{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o numero do funcionario: ");
		int num = scan.nextInt();
		System.out.println("Informe as horas trabalhadas: ");
		int horas = scan.nextInt();
		System.out.println("Informe o que recebe por hora: ");
		float salario = scan.nextFloat();

		float resultado = horas * salario;
		System.out.println("Numero = " + num);
		System.out.println("Salario = R$ " + resultado);
		scan.close();
	}
}