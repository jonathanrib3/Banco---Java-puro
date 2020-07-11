package Teste;

import java.util.ArrayList;
import java.util.Scanner;



public class GerenciaCliente {
	int i;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	Scanner sca = new Scanner(System.in);
	public ArrayList<Cliente> getListaCliente(){
		return clientes;
	}
	
	public boolean adicionar(String nome, String cpf, String telefone, Banco ban) {
            Cliente client = new Cliente();
            client.entrada2(nome,cpf,telefone);
            client.setBancoCliente(ban);
            clientes.add(client);
            return clientes.size() > 0;
	}
	
	public void listar() {
		int i;
		for(i=0 ; i<clientes.size() ; i++) {
			 System.out.println(clientes.get(i).imprimir()+ "\n" + clientes.get(i).ban.listar());
		}
	}
	/*
	public boolean existCpf(Cliente clienteAVerCpf) {
		int index;
		String cpfCopy;

		for(index = 0 ; index<clientes.size(); index++) {
			 cpfCopy = clientes.get(i).cpf ;
			if(clienteAVerCpf.cpf == clientes.get(i).cpf) {
				return true;
			}
		}
		return false;
	}
	*/
}
