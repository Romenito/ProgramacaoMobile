package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalArquiteto extends Profissional {
	

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Arquiteto) {
			return "Obrigado pela a confian�a!! Aguarde o Arquiteto Jo�o Gustavo Soares" + "\n"
					+ " de CREA 35769002-98 entrar� em contato com voc�.";
		}
		return proximo.escolher(escolha);
	}
}
