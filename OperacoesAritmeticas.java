import java.util.Scanner;

public class OperacoesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int soma, multiplicacao;
		double divisao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número! ");
		num1 = scan.nextInt();
		System.out.println("Digite outro núero! ");
		num2 = scan.nextInt();
		soma = num1 + num2;
		System.out.println("A soma dos dois números é "+soma);
		multiplicacao = soma * 3;
		System.out.println("a soma multiplicada por 3 é "+multiplicacao);
		divisao = multiplicacao / 2;
		System.out.println("A metade da multiplicacao é "+divisao);
	}

}
