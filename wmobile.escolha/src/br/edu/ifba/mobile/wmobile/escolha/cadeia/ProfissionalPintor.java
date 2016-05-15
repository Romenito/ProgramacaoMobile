package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalPintor extends Profissional{

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Pintor) {
			return "Obrigado pela a confiança!! Aguarde o Pintor Caio Pereira Sondré" + "\n"
					+ " de CPF 43562789-98 entrará em contato com você.";
		}
		return "Não há mais Profissionais disponiveis";
	}

}
