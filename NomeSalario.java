import java.util.Scanner;

public class NomeSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nome;
		double salario;
		System.out.println("Digite o seu nome ");
		nome = scan.nextLine();
		System.out.println("Me informe o seu salário! ");
		salario = scan.nextDouble();
		System.out.println("Bem vindo, "+nome+"! Você ganha "+salario+".");
	}

}
