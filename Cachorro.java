package br.com.generation.polimorfismo;

public class Cachorro extends Animal implements acoes {

	@Override
	public void acao() {
		// TODO Auto-generated method stub
		System.out.println("O cachorro está correndo pela casa toda");
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("AUAUAUA AUAUAUA \n ");
	}

}
