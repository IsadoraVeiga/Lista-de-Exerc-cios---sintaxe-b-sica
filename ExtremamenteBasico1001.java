import java.util.Scanner;
public class ExtremamenteBasico1001{
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe os valores de A e B respectivamente: ");
	double A = scan.nextDouble();
	double B = scan.nextDouble();
	double X = A + B;
	System.out.println("X = " + X);
	scan.close();
	}
}