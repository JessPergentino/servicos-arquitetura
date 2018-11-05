package br.ucsal.model;

public class Animal {

	private int id;
	private String nomeVulgar;
	private String nomeCientifico;
	private String imagemURL;
	private Classe classe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeVulgar() {
		return nomeVulgar;
	}

	public void setNomeVulgar(String nomeVulgar) {
		this.nomeVulgar = nomeVulgar;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getImagemURL() {
		return imagemURL;
	}

	public void setImagemURL(String imagemURL) {
		this.imagemURL = imagemURL;
	}

	public Classe getclasse() {
		return classe;
	}

	public void setclasse(Classe classe) {
		this.classe = classe;
	}

}
