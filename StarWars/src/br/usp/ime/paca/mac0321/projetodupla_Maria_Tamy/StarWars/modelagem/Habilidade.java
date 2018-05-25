package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Habilidade {
	private int codHabilidade;
	private String nomeHabilidade;
	private int danoHabilidade;
	private int tipoHabilidade; /*1-Tipo força 2-Tipo Sabre*/
	
	public int getCodHabilidade() {
		return codHabilidade;
	}
	public void setCodHabilidade(int codHabilidade) {
		this.codHabilidade = codHabilidade;
	}
	public String getNomeHabilidade() {
		return nomeHabilidade;
	}
	public void setNomeHabilidade(String nomeHabilidade) {
		this.nomeHabilidade = nomeHabilidade;
	}
	public int getDanoHabilidade() {
		return danoHabilidade;
	}
	public void setDanoHabilidade(int danoHabilidade) {
		this.danoHabilidade = danoHabilidade;
	}
	
	public int getTipoHabilidade() {
		return tipoHabilidade;
	}
	public void setTipoHabilidade(int tipoHabilidade) {
		this.tipoHabilidade = tipoHabilidade;
	}
	public Habilidade() {
		
	}
	public Habilidade (int codHabilidade, String nomeHabilidade, int danoHabilidade, int tipoHabilidade) {
		setCodHabilidade(codHabilidade);
		setNomeHabilidade(nomeHabilidade);
		setDanoHabilidade(danoHabilidade);
		setTipoHabilidade(tipoHabilidade);
	}
}
