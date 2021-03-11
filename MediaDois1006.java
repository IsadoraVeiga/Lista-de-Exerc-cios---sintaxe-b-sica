import java.util.Scanner;
public class MediaDois1006{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		double A,B,C;
		do{
			System.out.println("Informe a primeira nota: ");
			A = scan.nextDouble();
		}while(A<0 || A>10);

		do{
			System.out.println("Informe a segunda nota: ");
			B = scan.nextDouble();
		}while(B<0 || B>10);

		do{
			System.out.println("Informe a terceira nota: ");
			C = scan.nextDouble();
		}while(C<0 || C>10);

		double media = ((A * 2) + (B * 3) + (C * 5))/10;
		System.out.println("MEDIA = " + media);
		scan.close();
	}
}