package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalEngenheiroCivil extends Profissional {

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.EngenheiroCivil) {
			return "Obrigado pela a confiança!! Aguarde pois o Engenheiro Civil Eduardo Morais Soares" + "\n"
					+ " de número CREA: 34562892-98 entrará em contato com você.";

		}
		return proximo.escolher(escolha);
	}
}
