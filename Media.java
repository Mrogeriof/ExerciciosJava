import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a sua primeira nota! ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a sua segunda nota! ");
		nota2 = scan.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.printf("\n Sua média é %.1f", media);
	} 

}
