package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalPedreiro extends Profissional {

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Pedreiro) {
			return "Obrigado pela a confian�a!! Aguarde pois o Pedreiro Jonathas Silva Bernardes" + "\n"
					+ " de n�mero CPF: 99048733-98 entrar� em contato com voc�.";
		}
		return proximo.escolher(escolha);
	}

}
