import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero, antecessor, sucessor;
		System.out.println("Digite um número ! ");
		numero = scan.nextInt();
		antecessor = --numero;
		numero++;
		sucessor = ++numero;
		System.out.println("O antecessor do seu número é "+antecessor+" e o sucessor é "+sucessor+".");

	}

}
