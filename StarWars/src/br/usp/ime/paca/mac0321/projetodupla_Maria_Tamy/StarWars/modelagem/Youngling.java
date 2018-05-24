package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Youngling extends Jedi{
	private boolean colherCristais;

	public boolean isColherCristais() {
		return colherCristais;
	}

	public void setColherCristais(boolean colherCristais) {
		this.colherCristais = colherCristais;
	} 
	
	public Youngling(int codJedi, String nome, Cla cla, int vida, int dominioForca, int dominioSabre, Habilidade[] habilidades, Planeta planeta, Academia academia, String anoNascimento) {
		setCodJedi(codJedi);
		setNome(nome);
		setCla(cla);
		setVida(vida);
		setDominioForca(dominioForca);
		setDominioSabre(dominioSabre);
		setHabilidades(habilidades);
		setColherCristais(false);
		setEstagioTreinamento(0);
		setPlaneta(planeta);
		setAcademia(academia);
		setAnoNascimento(anoNascimento);
	}
	
}
