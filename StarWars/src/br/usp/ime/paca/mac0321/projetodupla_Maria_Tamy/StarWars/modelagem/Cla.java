package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Cla {
	private int codCla;
	private String nomeCla; 
	private int codMestreResponsavel;
	
	
	public int getCodCla() {
		return codCla;
	}
	public void setCodCla(int codCla) {
		this.codCla = codCla;
	}
	public String getNomeCla() {
		return nomeCla;
	}
	public void setNomeCla(String nomeCla) {
		this.nomeCla = nomeCla;
	}
	public int getCodMestreResponsavel() {
		return codMestreResponsavel;
	}
	public void setCodMestreResponsavel(int codMestreResponsavel) {
		this.codMestreResponsavel = codMestreResponsavel;
	}
	
	public Cla(int codCla, String nomeCla, int codMestreResponsavel ) {
		setCodCla(codCla);
		setCodMestreResponsavel(codMestreResponsavel);
		setNomeCla(nomeCla);
	}
}
