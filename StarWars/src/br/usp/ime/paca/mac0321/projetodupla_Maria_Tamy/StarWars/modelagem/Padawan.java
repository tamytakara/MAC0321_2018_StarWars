package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Padawan extends Jedi{
	
	private boolean ConstruirSabre;
	
	public Padawan(int codJedi, String nome, Cla cla, int vida, int dominioForca, int dominioSabre, Habilidade[] habilidades, Planeta planeta, Academia academia,String anoNascimento) {
		setCodJedi(codJedi);
		setNome(nome);
		setCla(cla);
		setVida(vida);
		setDominioForca(dominioForca);
		setDominioSabre(dominioSabre);
		setHabilidades(habilidades);
		setConstruirSabre(false);
		setEstagioTreinamento(1);
		setPlaneta(planeta);
		setAcademia(academia);
		setAnoNascimento(anoNascimento);
	}

	public boolean isConstruirSabre() {
		return ConstruirSabre;
	}

	public void setConstruirSabre(boolean construirSabre) {
		ConstruirSabre = construirSabre;
	}
}
