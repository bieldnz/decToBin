package controller;

import controllerPilha.ControllerPilha;

public class ControllerConvert {
	
	ControllerPilha pilha;
	
	public ControllerConvert() {
		this.pilha = new ControllerPilha(null);
	}
	
	public String decToBin(int dec) throws Exception {
		int resto = 0;
		String bin = "";
		
		while(dec != 0) {
			resto = dec % 2;
			pilha.push(resto);
			dec = dec / 2;
			bin = resto + bin;
		}
		
		bin = desempilhar();
		
		System.out.println(bin);
		return bin;
	}
	
	private String desempilhar() throws Exception {
		String num = "";
		while(pilha.size() > 0) {
			num = num + pilha.pop() + "";
		}
		return num;
	}
	
}
