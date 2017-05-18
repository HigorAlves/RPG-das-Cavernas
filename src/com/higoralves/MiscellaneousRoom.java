package com.higoralves;

public class MiscellaneousRoom {
	private int Ouro, Diamante, Machado, Pocao;
	
	MiscellaneousRoom(int Ouro, int Diamante, int Machado, int Pocao){
		this.Ouro = Ouro;
		this.Diamante = Diamante;
		this.Machado = Machado;
		this.Pocao = Pocao;
	}

	public int getOuro() {
		return Ouro;
	}

	public void setOuro(int ouro) {
		Ouro = ouro;
	}

	public int getDiamante() {
		return Diamante;
	}

	public void setDiamante(int diamante) {
		Diamante = diamante;
	}

	public int getMachado() {
		return Machado;
	}

	public void setMachado(int machado) {
		Machado = machado;
	}

	public int getPocao() {
		return Pocao;
	}

	public void setPocao(int pocao) {
		Pocao = pocao;
	}
}
