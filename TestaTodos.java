package br.com.generation.polimorfismo;

import java.util.Scanner;

public class TestaTodos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		String nome;
		
		acoes a1 = new Cachorro();
		acoes a2 = new Cavalo();
		acoes a3 = new Preguiça();
		Cachorro cr = new Cachorro();
		Cavalo cv = new Cavalo();
		Preguiça p1 = new Preguiça();
		
		System.out.println("Digite o nome do cachorro: ");
		nome=entrada.next();
		cr.setNome(nome);
		
		System.out.println("Digite a idade do cachorro: ");
		idade=entrada.nextInt();
		cr.setIdade (idade);
		
		
		System.out.println("Digite o nome do cavalo: ");
		nome=entrada.next();
		cv.setNome(nome);
		
		System.out.println("Digite a idade do cavalo: ");
		idade=entrada.nextInt();
		cv.setIdade(idade);
		
		
		System.out.println("Digite o nome da preguiça: ");
		p1.setNome(nome);
		nome=entrada.next();

		System.out.println("Digite a idade da preguiça: ");
		idade=entrada.nextInt();
		p1.setIdade(idade);
		
		
		System.out.println("O nome do cachorro é " + cr.getNome() + " e sua idade é " + cr.getIdade() + " anos");
		System.out.println();
		a1.acao();
		System.out.println();
		a1.som();

		System.out.println("O nome do cavalo é " + cv.getNome() + "e sua idade é " + cv.getIdade() + " anos");
		System.out.println();
		a2.acao();
		System.out.println();
		a2.som();
		
		System.out.println("O nome da preguiça é " + p1.getNome() + " e sua idade é " + p1.getIdade() + " anos");
		System.out.println();
		a3.acao();
		System.out.println();
		a3.som();
		entrada.close();
	}

}
