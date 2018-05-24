package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Cavaleiro extends Jedi{

	private boolean aprovacaoTeste;
	
	public Cavaleiro(int codJedi, String nome, Cla cla, int vida, int dominioForca, int dominioSabre, Habilidade[] habilidades,Planeta planeta, Academia academia, String anoNascimento) {
		setCodJedi(codJedi);
		setNome(nome);
		setCla(cla);
		setVida(vida);
		setDominioForca(dominioForca);
		setDominioSabre(dominioSabre);
		setHabilidades(habilidades);
		setAprovacaoTeste(false);
		setEstagioTreinamento(2);
		setPlaneta(planeta);
		setAcademia(academia);
		setAnoNascimento(anoNascimento);
	}

	public boolean isAprovacaoTeste() {
		return aprovacaoTeste;
	}

	public void setAprovacaoTeste(boolean aprovacaoTeste) {
		this.aprovacaoTeste = aprovacaoTeste;
	}

}
