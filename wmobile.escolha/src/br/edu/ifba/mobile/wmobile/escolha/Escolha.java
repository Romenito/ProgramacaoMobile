package br.edu.ifba.mobile.wmobile.escolha;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.escolha.cadeia.EscolhaProfissional;
import br.edu.ifba.mobile.wmobile.escolha.cadeia.Profissional;
import br.edu.ifba.mobile.wmobile.escolha.cadeia.ProfissionalArquiteto;
import br.edu.ifba.mobile.wmobile.escolha.cadeia.ProfissionalCarpinteiro;
import br.edu.ifba.mobile.wmobile.escolha.cadeia.ProfissionalEngenheiroCivil;
import br.edu.ifba.mobile.wmobile.escolha.cadeia.ProfissionalPedreiro;
import br.edu.ifba.mobile.wmobile.escolha.cadeia.ProfissionalPintor;

@ManagedBean(name = "esc")
@SessionScoped 

public class Escolha {
	private String email = "";
	private String nome = "";
	private String sobrenome = "";
	private String telefone = "";
	private String mostrar = "";

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMostrarEscolha() {
		return mostrar;
	}

	public List<String> getProfissionais() {
		List<String> escolha = new ArrayList<String>();
		escolha.add("Arquiteto");
		escolha.add("Engenheiro Civil");
		escolha.add("Pedreiro");
		escolha.add("Carpinteiro");
		escolha.add("Pintor");

		return escolha;
	}

	public void setProfissionalEscolhido(String escolheProfissional) {
		EscolhaProfissional escolhe = EscolhaProfissional.Nenhum_Profissional;
		if (escolheProfissional.equals("Arquiteto")) {
			escolhe = EscolhaProfissional.Arquiteto;
		} else if (escolheProfissional.equals("Engenheiro Civil")) {
			escolhe = EscolhaProfissional.EngenheiroCivil;
		} else if (escolheProfissional.equals("Pedreiro")) {
			escolhe = EscolhaProfissional.Pedreiro;
		} else if (escolheProfissional.equals("Carpinteiro")) {
			escolhe = EscolhaProfissional.Carpinteiro;
		} else if (escolheProfissional.equals("Pintor")) {
			escolhe = EscolhaProfissional.Pintor;
		}

		Profissional profissionais = new ProfissionalArquiteto();
		profissionais.setProximoProfissional(new ProfissionalEngenheiroCivil());
		profissionais.setProximoProfissional(new ProfissionalPedreiro());
		profissionais.setProximoProfissional(new ProfissionalCarpinteiro());
		profissionais.setProximoProfissional(new ProfissionalPintor());

		System.out.println(" Email enviado para o devido profissional contendo os seguintes dados: Nome: " + nome + " "
				+ sobrenome + ", E-mail: " + email + " e Telefone: " + telefone);
		mostrar = profissionais.escolher(escolhe);

	}

}
