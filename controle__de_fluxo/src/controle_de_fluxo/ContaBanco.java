package controle_de_fluxo;

import java.util.Scanner;
import entities.ContaTerminal;

public class ContaBanco {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			ContaTerminal rect = new ContaTerminal();
			
			System.out.println("Por favor, digite o numero da conta:");
			rect.numero = sc.nextInt();
			System.out.println("Por favor, digite o numero da agencia:");
			rect.agencia = sc.next();
			System.out.println("Por favor, digite o nome do cliente:");
			rect.nome_cliente = sc.next();
			System.out.println("Por favor, digite o saldo:");
			rect.saldo = sc.nextDouble();
			
			System.out.printf("Ola " + rect.nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + rect.agencia + ", conta " + rect.numero + " e seu saldo R$ " + rect.saldo + " ja esta disponivel para saque.");
			sc.close();
		}
	}

