package br.com.fatec.atividade.exercicio;

import br.com.fatec.atividade.Mensagem;

/**
 * @author Karen 26 de fev de 2018
 */
public class Robo {

	private Mensagem mensagem;

	public String falar() {
		return "[ <" + mensagem.getMensagem() + "> ]";
	}

	public void setMensagem(Mensagem mensagem) {

		this.mensagem = mensagem;

	}
}
