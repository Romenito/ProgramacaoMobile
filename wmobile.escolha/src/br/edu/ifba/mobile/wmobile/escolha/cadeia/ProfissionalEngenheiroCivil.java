package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalEngenheiroCivil extends Profissional {

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.EngenheiroCivil) {
			return "Obrigado pela a confian�a!! Aguarde o Engenheiro Civil Eduardo Morais Soares" + "\n"
					+ " de CREA 34562892-98 entrar� em contato com voc�.";

		}
		return proximo.escolher(escolha);
	}
}
