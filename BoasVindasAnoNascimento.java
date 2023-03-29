import java.util.Scanner;
public class BoasVindasAnoNascimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Digite o seu nome ");
		nome = scan.nextLine();
		System.out.println("bem vindo, "+nome+" Me informe a sua idade! ");
		idade = scan.nextInt();
		System.out.println("Você nasceu em "+(2023 - idade));
	}

}
