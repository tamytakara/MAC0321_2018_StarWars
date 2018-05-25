package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public abstract class Ser {
	private int codSer;
	private String nome;
	private String anoNascimento;
	private int vida;
	private int estagioTreinamento; 
	/* Em Jedi> Outros-Youngling 3-Padawan 2-Cavaleiro 1-Mestre
	 * Em Sith> Outros- Aprendiz 1-Lorde*/
	private int dominioForca; /*Campo que varia de 0 a 100, sendo 0 mais fraco e 100 mais forte*/
	private int dominioSabre; /*Campo que varia de 0 a 100, sendo 0 mais fraco e 100 mais forte*/
	private Habilidade[] habilidades;
	private Planeta planeta;
	private Academia academia;
	private int ultimaAcao;

	public int getCodSer() {
		return codSer;
	}
	public void setCodSer(int codSer) {
		this.codSer = codSer;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getEstagioTreinamento() {
		return estagioTreinamento;
	}
	public void setEstagioTreinamento(int estagioTreinamento) {
		this.estagioTreinamento = estagioTreinamento;
	}
	public int getDominioForca() {
		return dominioForca;
	}
	public void setDominioForca(int dominioForca) {
		this.dominioForca = dominioForca;
	}
	public int getDominioSabre() {
		return dominioSabre;
	}
	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	public Habilidade[] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Habilidade[] habilidades) {
		this.habilidades = habilidades;
	}
	public Planeta getPlaneta() {
		return planeta;
	}
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}
	public int getUltimaAcao() {
		return ultimaAcao;
	}
	public void setUltimaAcao(int ultimaAcao) {
		this.ultimaAcao = ultimaAcao;
	}
}
