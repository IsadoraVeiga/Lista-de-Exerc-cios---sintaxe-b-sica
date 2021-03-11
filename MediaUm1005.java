import java.util.Scanner;
public class MediaUm1005{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		double A, B;

		do{
			System.out.println("Informe a primeira nota: ");
			A = scan.nextDouble();
		}while(A<0 || A>10);

		do{
			System.out.println("Informe a segunda nota: ");
			B = scan.nextDouble();
		}while(B<0 || B>10);

		double media = ((A * 3.5) + (B * 7.5))/11;
		System.out.println("MEDIA = " + media);
		scan.close();
	}
}