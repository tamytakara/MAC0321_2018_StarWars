package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars;

import java.util.Random;

import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.GreenHouseControls.Restart;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.controller.Controller;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.controller.Event;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem.Academia;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem.Cla;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem.Habilidade;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem.Lorde;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem.Mestre;
import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.modelagem.Planeta;

public class StarWarsControls extends Controller {
	private Mestre jedi;
	private Lorde sith;
	private boolean game=true;
	
	public StarWarsControls() {
		long tm = System.currentTimeMillis();
		addEvent(new InstanciaJedi(tm));
		addEvent(new InstanciaSith(tm+1000));
		System.out.println("Que a batalha comece!");
	}
	
	private class InstanciaJedi extends Event {
		public InstanciaJedi(long eventTime) {
			super(eventTime);
		}

		public void action() {
			Habilidade h1= new Habilidade(2, "Habilidade B", 5, 1);
			Habilidade h2= new Habilidade(4, "Habilidade D", 5, 2);
			Habilidade h3= new Habilidade(6, "Habilidade F", 10, 2);
			Habilidade h4= new Habilidade(8, "Habilidade G", 10, 1);
			Habilidade[] habilidades1 = {h1, h2, h3, h4};
			Planeta planeta1 = new Planeta(1, "Planeta Korriban", "Sistema Horuset", "Capital do Porto", 18984, "Vermelho");
			Academia academia1= new Academia(1,"Academia Jedi Coruscant", planeta1, 0);
			Cla cla1= new Cla(1,"Clã do Urso",1);
			jedi = new Mestre(1, "Yoda", cla1, 20, 95, 100, habilidades1, planeta1, academia1, "896 ABY");
			jedi.setImortalidade(true);
			jedi.setVidencia(true);
		}

		public String description() {
			return ("Jedi "+jedi.getNome()+" preparado");
		}
	}
	
	private class InstanciaSith extends Event {
		public InstanciaSith(long eventTime) {
			super(eventTime);
		}

		public void action() {
			Habilidade h1= new Habilidade(1, "Habilidade A", 4, 2);
			Habilidade h2= new Habilidade(3, "Habilidade C", 4, 1);
			Habilidade h3= new Habilidade(4, "Habilidade E", 9, 1);
			Habilidade h4= new Habilidade(7, "Habilidade H", 9, 2);
			Habilidade[] habilidades2 = {h1, h2, h3, h4};
			Planeta planeta2 = new Planeta(2, "Planeta Tatooine", "Sistema Tatooine", "Capital do Tatooine", 9876, "Marrom");
			Academia academia2= new Academia(2,"Academia Sith Korriban", planeta2, 1);
			sith = new Lorde(2,"Darth Vader",20,100, 95, habilidades2, academia2, "346 ABY", 95, true, true, true, planeta2);
		}

		public String description() {
			return ("Sith "+sith.getNome()+" preparado");
		}
	}
	
	private class EscolhaJedi extends Event {
		public EscolhaJedi(long eventTime) {
			super(eventTime);
		}

		public void action() {
			jedi.setUltimaAcao(new Random().nextInt(5));
		}

		public String description() {
			return (jedi.getNome()+" se preparando...");
		}
	}
	
	private class EscolhaSith extends Event {
		public EscolhaSith(long eventTime) {
			super(eventTime);
		}

		public void action() {
			sith.setUltimaAcao(new Random().nextInt(5));
		}

		public String description() {
			return sith.getNome()+" se preparando...";
		}
	}
	
	private class Batalha extends Event {
		public Batalha(long eventTime) {
			super(eventTime);
		}

		public void action() {
			int dano=0;
			if(jedi.getUltimaAcao()==0||sith.getUltimaAcao()==0) {
				if(jedi.getUltimaAcao()==0) {
					System.out.println(jedi.getNome()+" se esquivou");
					Habilidade sithAtaque = sith.getHabilidades()[(sith.getUltimaAcao()-1)];					
					if(sithAtaque.getTipoHabilidade()==1) {
						//Ao esquivar de um ataque de força, o jedi só é afetado na metade do dano normal
						dano = (sithAtaque.getDanoHabilidade()*sith.getDominioForca()/200);
						jedi.setVida(jedi.getVida()-dano);
						System.out.println(sith.getNome()+" usou ataque de força: "+sithAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
					}
					if(sithAtaque.getTipoHabilidade()==2) {
						System.out.println(sith.getNome()+" usou ataque de sabre: "+sithAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
					}
				}  
				if(sith.getUltimaAcao()==0){
					System.out.println(sith.getNome()+" se esquivou");	
					Habilidade jediAtaque = jedi.getHabilidades()[jedi.getUltimaAcao()-1];					
					if(jediAtaque.getTipoHabilidade()==1) {
						//Ao esquivar de um ataque de força, o jedi só é afetado na metade do dano normal
						dano = (jediAtaque.getDanoHabilidade()*jedi.getDominioForca()/200);
						sith.setVida(sith.getVida()-dano);
						System.out.println(jedi.getNome()+" usou ataque de força: "+jediAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
					}
					if(jediAtaque.getTipoHabilidade()==2) {
						System.out.println(jedi.getNome()+" usou ataque de sabre: "+jediAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
					}
				}
			}else {
				Habilidade sithAtaque = sith.getHabilidades()[(sith.getUltimaAcao()-1)];
				Habilidade jediAtaque = jedi.getHabilidades()[jedi.getUltimaAcao()-1];
				if(sithAtaque.getTipoHabilidade()==1||jediAtaque.getTipoHabilidade()==1) {
					if(jediAtaque.getTipoHabilidade()==1&&sithAtaque.getTipoHabilidade()==1) {
						dano = (jediAtaque.getDanoHabilidade()*jedi.getDominioForca()/100);
						sith.setVida(sith.getVida()-dano);
						System.out.println(jedi.getNome()+" usou ataque de força: "+jediAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
						
						dano = (sithAtaque.getDanoHabilidade()*sith.getDominioForca()/100);
						jedi.setVida(jedi.getVida()-dano);		
						System.out.println(sith.getNome()+" usou ataque de força: "+sithAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);										
					}
					if(jediAtaque.getTipoHabilidade()==1&&sithAtaque.getTipoHabilidade()==2) {
						dano = (jediAtaque.getDanoHabilidade()*jedi.getDominioForca()/100);
						sith.setVida(sith.getVida()-dano);
						System.out.println(jedi.getNome()+" usou ataque de força: "+jediAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
						
						dano = (sithAtaque.getDanoHabilidade()*sith.getDominioSabre()/100);
						jedi.setVida(jedi.getVida()-dano);		
						System.out.println(sith.getNome()+" usou ataque de sabre: "+sithAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);	
					}
					if(jediAtaque.getTipoHabilidade()==2&&sithAtaque.getTipoHabilidade()==1) {
						dano = (sithAtaque.getDanoHabilidade()*sith.getDominioForca()/100);
						jedi.setVida(jedi.getVida()-dano);		
						System.out.println(sith.getNome()+" usou ataque de força: "+sithAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);	
						
						dano = (jediAtaque.getDanoHabilidade()*jedi.getDominioSabre()/100);
						sith.setVida(sith.getVida()-dano);
						System.out.println(jedi.getNome()+" usou ataque de sabre: "+jediAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
					}
				} else {
					if(sithAtaque.getTipoHabilidade()==2||jediAtaque.getTipoHabilidade()==2) {
						dano = (jediAtaque.getDanoHabilidade()*jedi.getDominioSabre()/100);
						sith.setVida(sith.getVida()-dano);
						System.out.println(jedi.getNome()+" usou ataque de sabre: "+jediAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);
						
						dano = (sithAtaque.getDanoHabilidade()*sith.getDominioSabre()/100);
						jedi.setVida(jedi.getVida()-dano);		
						System.out.println(sith.getNome()+" usou ataque de sabre: "+sithAtaque.getNomeHabilidade());
						System.out.println("Dano: "+dano);	
						
					}
				}
			}
				
		}

		public String description() {
			return "Rodada encerrada";
		}
	}
	
	private class AnalisarRodada extends Event {
		public AnalisarRodada(long eventTime) {
			super(eventTime);
		}

		public void action() {
			if(jedi.getVida()<=0&&sith.getVida()<=0) {
				game=false;
				System.out.println("Jogo empatado!");
				System.exit(0);
			}else {
				if(sith.getVida()<=0) {
					game=false;
					System.out.println(jedi.getNome()+" ganhou!");	
					System.exit(0);				
				}
				if(jedi.getVida()<=0) {
					game=false;
					System.out.println(sith.getNome()+" ganhou!");
					System.exit(0);				
				}
			}
		}

		public String description() {
			return "Sith se preparando...";
		}
	}
	
	 //An example of an action() that inserts a
	// new one of itself into the event list:
	private int rings;
	private class Bell extends Event {
		public Bell(long eventTime) {
			super(eventTime);
		}

		public void action() {
			// Ring bell every 2 seconds, rings times:
			System.out.println("Bing!");
			if(--rings > 0)
			addEvent(new Bell(
			System.currentTimeMillis() + 2000));
		}

		public String description() {
			return "Ring bell";
		}
	}

	public class Restart extends Event {
		public Restart(long eventTime) {
			super(eventTime);
		}

		public void action() {
			long tm = System.currentTimeMillis();
			// Instead of hard-wiring, you could parse
			// configuration information from a text
			// file here:
						
			rings = 1;
			addEvent(new EscolhaJedi(tm+1000));
			addEvent(new EscolhaSith(tm+1000));
			addEvent(new Batalha(tm+3000));
			addEvent(new AnalisarRodada(tm+5000));
			addEvent(new Restart(tm + 7000));
			//addEvent(new ThermostatNight(tm));
			// Can even add a Restart object!
		}

		public String description() {
			return "Aberta a rodada";
		}
	}

}