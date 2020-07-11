package Teste;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.lang.IndexOutOfBoundsException;
public class Main {
	public static void main(String args[]) {
		double quantia =0;
		int chose = 0;
		Scanner sc = new Scanner(System.in);
		GerenciaCliente gerCli = new GerenciaCliente();
		
		//Banco ban = new Banco();
		//Cliente c = new Cliente();

		
		//Conta2 cont2 = new Conta2();
		//GerenciaCliente ger = new GerenciaCliente();
		
		do {
		System.out.println("1 - Adicionar cliente\n2 - Criar conta \n3- Remover conta\n4 - Listar\n5- Depositar\n6 - Debitar\n"
						   + "7- Pesquisa conta\n8 - Sair");
		chose = Integer.parseInt(sc.nextLine());
		switch(chose) {
		case 1: 
			Banco ban = new Banco();
			System.out.println("Entre com o nome, cpf e telefone do cliente respectivamente: ");
			try {
			gerCli.adicionar(sc.nextLine(), sc.nextLine(), sc.nextLine(), ban);
			} catch(NumberFormatException e){
				System.out.println("Par�metros errados, re-digite por favor");
			}
			break;
		case 2:
			System.out.println("Em qual cliente deseja criar uma conta? sendo 0 o primeiro: ");
			gerCli.listar();
			int index = 0;
			try {
				index = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("O tipo de dado deve ser um n�mero inteiro apenas");
			} 
			try {
				gerCli.getListaCliente().get(index).ban.adicionar();
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("�ndice inv�lido");
			}
			
			break;
		case 3:
			System.out.println("Em qual cliente deseja remover a conta? Sendo 0 a primeira: ");
			gerCli.listar();
			int index2 = 0;
			try {
			index2 = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("O tipo de dado deve ser um n�mero inteiro apenas");
			} catch(IndexOutOfBoundsException e) {
				System.out.println("�ndice inv�lido");
			}
			System.out.println("Digite o n�mero da conta a ser removida do " + gerCli.getListaCliente().get(index2).getNome());
			String numero = sc.nextLine();
			gerCli.getListaCliente().get(index2).ban.remove(numero);
			break;
		case 4:
			gerCli.listar();
			break;
		}
		}while(chose != 8);
	}
}
