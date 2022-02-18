package com.codingdojo;

public class TestMurcielago {

	public static void main (String arg[]) {
		Murcielago murcielago = new Murcielago();
		murcielago.MostrarEnergia();
		
		murcielago.atacarPueblo();
		murcielago.atacarPueblo();
		murcielago.atacarPueblo();
		murcielago.MostrarEnergia();
		murcielago.comerHumanos();
		murcielago.comerHumanos();
		murcielago.MostrarEnergia();
		murcielago.volar();
		murcielago.volar();
		murcielago.MostrarEnergia();
	}
}
