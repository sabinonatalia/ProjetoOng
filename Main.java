package Ong;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		//Teste doação ok
		Doador doa = new Doador(null, null, null, null, null, 0);
		
		Aluno alu = new Aluno (null, null, null, null, null, null, null);
		
		int opt;
		
			System.out.println("==== Escola Estadual Ermelino Matarazzo ====");
			System.out.println("\n======== ONG TECHTODOS ========");
			System.out.println("\n=== Projeto Alune Conectade ===");
			System.out.println("\nDigite uma opção:  \n 1- Aluno \n 2- Doador \n 3- Sair");
			opt = ler.nextInt();
			if(opt == 1) {
				alu.CadastroAluno();
			}
			else if (opt == 2){
				doa.CadastroDoador();
				doa.Doacao();
				
			}
			else {
				System.out.println("Você saiu do sistema!");
			}
			ler.close();
	}

}
