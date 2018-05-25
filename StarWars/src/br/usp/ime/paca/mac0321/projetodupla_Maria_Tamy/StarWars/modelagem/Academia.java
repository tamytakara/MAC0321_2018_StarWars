package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Academia {
	private int codAcademia;
	private String nomeAcademia;
	private Planeta planetaAcademia;
	private int tipoAcademia; /*0-Jedi 1-Sith*/
	public int getCodAcademia() {
		return codAcademia;
	}
	public void setCodAcademia(int codAcademia) {
		this.codAcademia = codAcademia;
	}
	public String getNomeAcademia() {
		return nomeAcademia;
	}
	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}
	public Planeta getPlanetaAcademia() {
		return planetaAcademia;
	}
	public void setPlanetaAcademia(Planeta planetaAcademia) {
		this.planetaAcademia = planetaAcademia;
	}
	public int getTipoAcademia() {
		return tipoAcademia;
	}
	public void setTipoAcademia(int tipoAcademia) {
		this.tipoAcademia = tipoAcademia;
	}
	
	public Academia(int codAcademia, String nomeAcademia, Planeta planetaAcademia, int tipoAcademia) {
		setCodAcademia(codAcademia);
		setNomeAcademia(nomeAcademia);
		setPlanetaAcademia(planetaAcademia);
		setTipoAcademia(tipoAcademia);
	}
}
