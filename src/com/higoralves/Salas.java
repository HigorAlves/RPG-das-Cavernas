package com.higoralves;

public class Salas {
	private enum _sala{
		//Sala(int Portas,int PortaAberta,int PortaPoção, int qtTrolls, int qtOuro, int qtDiamante, int qtMachado, int qtPoção)
		
		sala01(2,0,0,0,0,0,0,0);//,sala02(2),sala03(2),sala04(2),sala05(2),sala06(2),sala07(2),sala08(2),sala09(2),sala10(2),sala11(2),sala12(3),sala14(2),sala15(2),sala16(2),sala17(2),sala18(2),sala19(2),sala20(2);
		
		private int qtPortas, portaAberta, portaPocao, qtTrolls, qtOuro, qtDiamante, qtMachado, qtPocao;
		//Construtor do enum
		_sala(int qPorta, int pAberta, int pPocao, int qTrolls, int qOuro, int qDiamante, int qMachado, int qPocao){
			qtPortas = qPorta;
			portaAberta = pAberta;
			portaPocao = pPocao;
			qtTrolls = qTrolls;
			qtOuro = qOuro;
			qtDiamante = qDiamante;
			qtMachado = qMachado;
			qtPocao = qPocao;
		}
		/*
		private int getValor(){
			return qtPortas;
		}
		private String getTexto(){
			return texto;
		}
		private int setValor(int valor){
			qtPortas = valor;
			return qtPortas;
		}
		
		private String setTexto(String sTexto){
			texto = sTexto;
			return texto;
		}
		/*
		*/
	}
	
	_sala mySalas;
	
	public void update(){
		mySalas = _sala.sala01;
	}
}
