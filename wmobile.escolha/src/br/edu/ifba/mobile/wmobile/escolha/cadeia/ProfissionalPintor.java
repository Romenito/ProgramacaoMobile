package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public class ProfissionalPintor extends Profissional{

	@Override
	public String escolher(EscolhaProfissional escolha) {
		if (escolha == EscolhaProfissional.Pintor) {
			return "Obrigado pela a confian�a!! Aguarde o Pintor Caio Pereira Sondr�" + "\n"
					+ " de CPF 43562789-98 entrar� em contato com voc�.";
		}
		return "N�o h� mais Profissionais disponiveis";
	}

}
