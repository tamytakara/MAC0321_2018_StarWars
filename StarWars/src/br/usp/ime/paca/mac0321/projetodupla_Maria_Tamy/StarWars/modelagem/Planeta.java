package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Planeta {
	private int codPlaneta;
	private String nomePlaneta;
	private String sistemaPlaneta;
	private String capitalPlaneta;
	private int diametroPlaneta; 
	private String corPlaneta;
	
	public int getCodPlaneta() {
		return codPlaneta;
	}
	public void setCodPlaneta(int codPlaneta) {
		this.codPlaneta = codPlaneta;
	}
	public String getNomePlaneta() {
		return nomePlaneta;
	}
	public void setNomePlaneta(String nomePlaneta) {
		this.nomePlaneta = nomePlaneta;
	}
	public String getSistemaPlaneta() {
		return sistemaPlaneta;
	}
	public void setSistemaPlaneta(String sistemaPlaneta) {
		this.sistemaPlaneta = sistemaPlaneta;
	}
	public String getCapitalPlaneta() {
		return capitalPlaneta;
	}
	public void setCapitalPlaneta(String capitalPlaneta) {
		this.capitalPlaneta = capitalPlaneta;
	}
	public int getDiametroPlaneta() {
		return diametroPlaneta;
	}
	public void setDiametroPlaneta(int diametroPlaneta) {
		this.diametroPlaneta = diametroPlaneta;
	}
	public String getCorPlaneta() {
		return corPlaneta;
	}
	public void setCorPlaneta(String corPlaneta) {
		this.corPlaneta = corPlaneta;
	} 
	
	public Planeta(int codPlaneta, String nomePlaneta, String sistemaPlaneta, String capitalPlaneta, int diametroPlaneta, String corPlaneta) {
		setCodPlaneta(codPlaneta);
		setNomePlaneta(nomePlaneta);
		setSistemaPlaneta(sistemaPlaneta);
		setCapitalPlaneta(capitalPlaneta);
		setDiametroPlaneta(diametroPlaneta);
		setCorPlaneta(corPlaneta);
	}
	
}
