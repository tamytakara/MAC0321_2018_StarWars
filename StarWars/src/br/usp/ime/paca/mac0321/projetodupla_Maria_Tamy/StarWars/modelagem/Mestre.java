package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Mestre extends Jedi{
	
	private boolean videncia;
	private boolean imortalidade;
	
	public Mestre (int codJedi, String nome, Cla cla,int vida,  int dominioForca, int dominioSabre, Habilidade[] habilidades, Planeta planeta, Academia academia, String anoNascimento) {
		setCodJedi(codJedi);
		setNome(nome);
		setCla(cla);
		setVida(vida);
		setDominioForca(dominioForca);
		setDominioSabre(dominioSabre);
		setHabilidades(habilidades);
		setVidencia(false);
		setImortalidade(false);
		setEstagioTreinamento(3);
		setPlaneta(planeta);
		setAcademia(academia);
		setAnoNascimento(anoNascimento);
	}

	public boolean isVidencia() {
		return videncia;
	}

	public void setVidencia(boolean videncia) {
		this.videncia = videncia;
	}

	public boolean isImortalidade() {
		return imortalidade;
	}

	public void setImortalidade(boolean imortalidade) {
		this.imortalidade = imortalidade;
	}

}
