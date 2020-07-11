package Teste;

import java.time.LocalDate;
import java.util.Random;


public class Conta {
	
	private String numero;
	private double saldo;
	Random rand = new Random();
	Cliente c = new Cliente();
	private int idCliente = rand.nextInt(999-100)+100;
	LocalDate datalocal = LocalDate.now();
	
	
	
	public Conta() {
		geraNumero();
	}
	/*
	public void entrada() {
		System.out.println("Qual o nome do portador da conta?");
		c.nome = sc.next();
		System.out.println("Ok agora digite o cpf de " + c.nome + ":" );
		c.cpf = sc.next();
		System.out.println("Qual o telefone de " + c.nome + "?");
		c.telefone = sc.next();
		System.out.println("Por fim, digite o numero da conta: ");
		numero = sc.nextInt();
	}
	*/
	private String geraNumero() {
		this.numero = (rand.nextInt(999-100)+100) + "-" + 0;
		return numero;
	}
	public double depositar(double valor) {
		setSaldo(saldo+valor);
		return saldo;
	}
	
	public boolean debitar(double valor) {
		//double saldoCopia = saldo;
		if(getSaldo() == 0) {
			return false;
		}else {
			if(valor > saldo) {
				return false;
			}else {
				setSaldo(saldo-valor);
				//System.out.println("Saldo atual: " + saldo);
				return true;
				}
		    }
	}
	public String getDono(Cliente c) {
		return c.imprimir();
	}
	public String imprime() {
		return ("Data abertura...................................................."+ datalocal
				+ "\nNumero.........................................................."+ getNumero()
				+ "\nSaldo.........................................................."+ getSaldo()
				+ "\n--------------------------------------------------------------------------------");
	}
	/*2
	public void imprime() {
		System.out.println("Data abertura...................................................."+ datalocal);
		System.out.println("Nome.........................................................."+ c.nome);
		System.out.println("CPF.........................................................."+ c.cpf);
		System.out.println("Telefone........................................................."+ c.telefone);
		System.out.println("Numero.........................................................."+ numero);
		System.out.println("Saldo.........................................................."+ saldo);
		System.out.println("--------------------------------------------------------------------------------");
	}
	*/
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	/*
	public void setIdCliente() {
		this.idCliente = ;
	}
	public int getIdCliente() {
		return idCliente;
	}
	*/
}
