package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalArquiteto extends Profissional {
	

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Arquiteto) {
			return "Obrigado pela a confiança!! Aguarde o Arquiteto João Gustavo Soares" + "\n"
					+ " de CREA 35769002-98 entrará em contato com você.";
		}
		return proximo.escolher(escolha);
	}
}
