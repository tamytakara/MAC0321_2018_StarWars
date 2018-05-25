package br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars;

import br.usp.ime.paca.mac0321.projetodupla_Maria_Tamy.StarWars.StarWarsControls;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  GreenHouse Controls -- classe para testar o Controller
		*/
		StarWarsControls gc = new StarWarsControls();
		long tm = System.currentTimeMillis();
		gc.addEvent(gc.new Restart(tm));
		gc.run();
	}

}
