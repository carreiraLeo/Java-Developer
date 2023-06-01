import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String agencia, nomeCliente;
		float saldo;
		
		System.out.print("Por favor, digite o número da Agência:");
		agencia = scanner.nextLine();
		
		System.out.print("Digite seu nome:");
		nomeCliente = scanner.nextLine();
		
		System.out.print("Digite o saldo inicial: ");
		saldo = scanner.nextFloat();
		
		ContaTerminal conta = new ContaTerminal(agencia, nomeCliente, saldo);
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
				conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
				
	}

}
