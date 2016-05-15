package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalPedreiro extends Profissional{

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Pedreiro) {
			return "Obrigado pela a confiança!! Aguarde o Pedreiro Jonathas Silva Bernardes" + "\n"
					+ " de CPF 99048733-98 entrará em contato com você.";
		}
		return proximo.escolher(escolha);
	}

}
