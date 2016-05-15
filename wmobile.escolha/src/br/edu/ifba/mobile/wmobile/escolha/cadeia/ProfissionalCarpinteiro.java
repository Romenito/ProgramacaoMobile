package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalCarpinteiro extends Profissional{

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Carpinteiro) {
			return "Obrigado pela a confiança!! Aguarde o Carpinteiro Augustos Gusmão Andrade" + "\n"
					+ " de CPF 35769002-98 entrará em contato com você.";
		}
		return proximo.escolher(escolha);
	}

}
