package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public abstract class Sith extends Ser {
	private int codSith;
	private String novoNome; 
	private int percentualRaiva; 
	private boolean telepatia;
	private boolean telecinese; 
	private boolean persuasao; 
	
	public int getCodSith() {
		return getCodSer();
	}
	public void setCodSith(int codSith) {
		setCodSer(codSith);
	}
	public String getNovoNome() {
		return getNome();
	}
	public void setNovoNome(String novoNome) {
		setNome(novoNome);
	}
	public int getPercentualRaiva() {
		return percentualRaiva;
	}
	public void setPercentualRaiva(int percentualRaiva) {
		this.percentualRaiva = percentualRaiva;
	}
	public boolean isTelepatia() {
		return telepatia;
	}
	public void setTelepatia(boolean telepatia) {
		this.telepatia = telepatia;
	}
	public boolean isTelecinese() {
		return telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		this.telecinese = telecinese;
	}
	public boolean isPersuasao() {
		return persuasao;
	}
	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}
}
