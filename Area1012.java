import java.util.Scanner;
public class Area1012{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores de A, B e C respectivamente: ");
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();

		double triangulo = (A * C)/2;
		double circulo = Math.pow(C,2) * 3.14159;
		double trapezio = ((A + B) * C)/2;
		double quadrado = Math.pow(B,2);
		double retangulo = A * B;

		System.out.println("TRIANGULO = " + triangulo);
		System.out.println("CIRCULO = " + circulo);
		System.out.println("TRAPEZIO = " + trapezio);
		System.out.println("QUADRADO = " + quadrado);
		System.out.println("RETANGULO = " + retangulo);
		scan.close();
	}
}