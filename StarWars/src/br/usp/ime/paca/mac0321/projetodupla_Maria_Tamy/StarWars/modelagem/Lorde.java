package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem;

public class Lorde extends Sith {
	
	
	public Lorde(int codSith, String nome, int vida, int dominioForca, int dominioSabre, Habilidade[] habilidades, Academia academia, String anoNascimento, int percentualRaiva, boolean telepatia, boolean telecinese, boolean persuasao, Planeta planeta) {
		setCodSith(codSith);
		setNome(nome);
		setVida(vida);
		setDominioForca(dominioForca);
		setDominioSabre(dominioSabre);
		setHabilidades(habilidades);
		setEstagioTreinamento(1);
		setAcademia(academia);
		setAnoNascimento(anoNascimento);
		setPercentualRaiva(percentualRaiva);
		setTelepatia(telepatia);
		setTelecinese(telecinese);
		setPersuasao(persuasao);
		setPlaneta(planeta);
	}
}
