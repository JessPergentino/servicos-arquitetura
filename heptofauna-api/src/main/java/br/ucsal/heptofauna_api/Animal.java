package br.ucsal.heptofauna_api;

public class Animal {
	private int id;
	private String nomeVulgar;
	private String nomeCientifico;
	private String imagemUrl;
	private Classe classe;
	private Familia familia;
	private Filo filo;
	private Genero genero;
	private Ordem ordem;

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

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Filo getFilo() {
		return filo;
	}

	public void setFilo(Filo filo) {
		this.filo = filo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

}
