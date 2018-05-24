package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public abstract class Jedi extends Ser{
	
	private Cla cla; 
	
	public int getCodJedi() {
		return getCodSer();
	}
	public void setCodJedi(int codJedi) {
		setCodSer(codJedi);
	}
	public Cla getCla() {
		return cla;
	}
	public void setCla(Cla cla) {
		this.cla = cla;
	}	
}
