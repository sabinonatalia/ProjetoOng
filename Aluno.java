package Ong;

import java.util.Scanner;

public class Aluno extends Pessoa{

	
	public Aluno(String nome,String identidade, String endereco, String telefone, String celular, String responsavel, String turma) {
		super(nome, endereco, telefone, celular);
		this.responsavel = responsavel;
		this.turma = turma;
		this.identidade = identidade;
		
	}    
		
	    Scanner ler = new Scanner(System.in);
		
	    private String turma;
		private String responsavel;
		private String identidade;
		
		
		public void CadastroAluno () {
			System.out.println("Digite seu nome: ");
			this.setNome(ler.nextLine());
			System.out.println("Digite sua turma: ");
			this.turma = ler.nextLine();
			System.out.println("Digite seu CPF: ");
			this.identidade= ler.nextLine();
			System.out.println("Digite seu endereço: ");
			this.setEndereco(ler.nextLine());
			System.out.println("Digite seu telefone: ");
			this.setTelefone(ler.nextLine());
			System.out.println("Digite seu celular: ");
			this.setCelular(ler.next());
			System.out.println("Nome do Responsável: ");
			this.responsavel =ler.next();
			System.out.println("\nCadastro finalizado com sucesso!");
		 
	}
		
	public void imprimir() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.identidade);
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("Responsavel: " + this.responsavel);
	
	}
	

}
