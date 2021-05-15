package Ong;

import java.util.Scanner;

public class Doador extends Pessoa{

	
	public Doador(String nome, String endereco, String telefone, String celular,String doacao, int quantDoacao) {
		super(nome, endereco, telefone, celular);
		this.doacao = doacao;
		this.quanDoacao = quantDoacao;
		this.identidade = identidade;

	}

	private String doacao;
	private int quanDoacao;
	private String identidade;
	
	Scanner ler = new Scanner(System.in);
	
	public void CadastroDoador () {
		System.out.println("Digite seu nome: ");
		this.setNome(ler.nextLine());
		System.out.println("Digite seu Identidade: ");
		this.identidade = ler.nextLine();
		System.out.println("Digite seu endereço: ");
		this.setEndereco(ler.nextLine());
		System.out.println("Digite seu telefone: ");
		this.setTelefone(ler.next());
		System.out.println("Digite seu celular: ");
		this.setCelular(ler.next());
		System.out.println("\nCadastro finalizado com sucesso!");
		imprimir();
		
	}

	public String getDoacao() {
		return doacao;
	}

	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}

	public int getQuanDoacao() {
		return quanDoacao;
	}

	public void setQuanDoacao(int quantidade) {
		this.quanDoacao = quantidade;
	}
	
	public void imprimir() {
		System.out.println("\nNome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: : " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
	}
	
	public void Doacao() {
		System.out.println("\nQual equipamento doado: ");
		this.setDoacao(ler.next());
		System.out.println("Qual a quantidade de equipamento: ");
		this.setQuanDoacao(ler.nextInt());
		System.out.println("\nMaterial doado: " + this.doacao);
		System.out.println("Quantidade: " + this.quanDoacao);
		System.out.println("\nObrigade por sua doação!");
	}
	
}
