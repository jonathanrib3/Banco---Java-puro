package Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	int i;
	boolean stop;
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	Scanner sca = new Scanner(System.in);
	GerenciaCliente gerCli = new GerenciaCliente();
	public ArrayList<Conta> getListaConta() {
		return contas;
	}
	
	
	
	public String listar() {
		String infos = "";
		for(int i=0;i<contas.size();i++) {
			infos += contas.get(i).imprime() + "\n" ;
		}
		return infos;
	}

	public boolean adicionar(){
		Conta contaNova = new Conta();
        contas.add(contaNova);
        return contas.size() > 0;
	}

	public boolean remove(String N) {
		if(contas.size() == 0) {
			return false;
		}else {
			for(int index=0;index<contas.size();index++) {
				if(N.compareTo(contas.get(index).getNumero()) == 0) {
					contas.remove(index);
					return true;
				}
			}
			return false;
		}
	}
	
	public int getSizeConta() {
		return contas.size();
	}
	public String pesquisar(String numero) {
		for(int i=0;i<contas.size();i++) {
			if(numero.compareTo(contas.get(i).getNumero()) == 0) {
				return contas.get(i).imprime();
			}
		}
		return "Conta não existente";
	}
	
}
