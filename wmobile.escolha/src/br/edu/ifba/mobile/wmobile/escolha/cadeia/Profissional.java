package br.edu.ifba.mobile.wmobile.escolha.cadeia;

public abstract class Profissional {

	protected Profissional proximo = null;

	public void setProximoProfissional(Profissional proximo) {
		if (this.proximo != null) {
			this.proximo.setProximoProfissional(proximo);
		} else {
			this.proximo = proximo;
		}
	}

	public abstract String escolher(EscolhaProfissional escolha);

}
