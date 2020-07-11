package Teste;

import java.util.Scanner;

public class Cliente {
	private String cpf,telefone,nome;
	Scanner sc = new Scanner(System.in);
	Banco ban;
	Conta conta;
	public void setBancoCliente(Banco ban) {
		this.ban = ban;
		
	}
	
	
	public void setContaCliente(Conta conta) {
		this.conta = conta;
	}
	
	public String imprimir() {
		return ("CPF.........................................................." + cpf
				+ "\nNome.........................................................."+ nome
				+ "\nTelefone.........................................................."+ telefone);
	}
	public void entrada2(String nome, String cpf, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void entrada() {
		System.out.println("Digite seu nome" );
		nome = sc.next();
		System.out.println("Digite seu cpf: ");
		cpf = sc.next();
		System.out.println("Digite seu telefone: ");
		telefone = sc.next();
	}
	public String listaContaCliente(Banco ban) {
		String infos = imprimir() + ban.listar();
		return infos;
	}
}
