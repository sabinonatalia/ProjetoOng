package Ong;

import java.util.Scanner;

public abstract class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String celular;
	
	public Pessoa(String nome, String endereco, String telefone, String celular) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;	
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;	
	}
	
		public void cadastro() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		setNome(input.next());

		System.out.println("Digite o endereço: ");
		setEndereco(input.next());
		
		System.out.println("Digite o número do telefone: ");
		setTelefone(input.next());
		
		System.out.println("Digite o número de celular: ");
		setCelular(input.next());
	}
		
		
	public void imprimir() {
		System.out.println("Classe pessoa");
	}

}
