package br.com.fatec.atividade;

/**
 * @author Karen 26 de fev de 2018
 */
public class HelloWorld implements Mensagem {
	private String nome;

	public HelloWorld() {
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getMensagem() {

		return "Hello World! Hello " + nome + "!";

	}
}
