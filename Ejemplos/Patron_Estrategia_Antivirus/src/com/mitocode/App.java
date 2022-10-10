package com.mitocode;

import com.mitocode.strategy. *;

public class App {

	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
	}

}
