package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalCarpinteiro extends Profissional{

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Carpinteiro) {
			return "Obrigado pela a confian�a!! Aguarde o Carpinteiro Augustos Gusm�o Andrade" + "\n"
					+ " de CPF 35769002-98 entrar� em contato com voc�.";
		}
		return proximo.escolher(escolha);
	}

}
