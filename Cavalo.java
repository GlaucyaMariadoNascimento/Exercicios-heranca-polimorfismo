package br.com.generation.polimorfismo;

public class Cavalo  extends Animal implements acoes {

	@Override
	public void acao() {
		// TODO Auto-generated method stub
		System.out.println("O cavalo esta correndo rumo a porteira");
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("IIIIRRRRI IIIIRRRRI \n ");
		
	}

}
