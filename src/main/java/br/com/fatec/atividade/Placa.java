package br.com.fatec.atividade;

/**
 * @author Karen 26 de fev de 2018
 */
public class Placa {
	private Mensagem mensagem;

	public Placa() {
	}

	public String ler() {

		return "[ <" + mensagem.getMensagem() + "> ]";

	}

	public void setMensagem(Mensagem mensagem) {

		this.mensagem = mensagem;

	}
}
