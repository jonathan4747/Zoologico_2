package com.codingdojo;

public class Murcielago extends Mamifero {
	public void volar() {
		System.out.println("ssss sssss sssss sssss");
		setNivel_energia(getNivel_energia()-50); 	
	}
	
	public void comerHumanos() {
		System.out.println("aaaummmm aaaummm");
		setNivel_energia(getNivel_energia()+25);
	}
	
	public void atacarPueblo() {
		System.out.println("Fuegoo!!! fuegoo!!");
		setNivel_energia(getNivel_energia()-100);
	}


}
