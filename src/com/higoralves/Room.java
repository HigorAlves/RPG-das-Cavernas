package com.higoralves;

public class Room {
	@SuppressWarnings("unused")
	private enum RoomContent{
		//SALA00(int Portas,int PortaAberta,int PortaPo��o, int qtTrolls, int qtOuro, int qtDiamante, int qtMachado, int qtPo��o)
		SALA01(2,0,0,0,0,0,0,0),SALA02(2,0,0,0,0,0,0,0),SALA03(2,0,0,0,0,0,0,0),SALA04(2,0,0,0,0,0,0,0);
		
		private int qtPortas, portaAberta, portaPocao, qtTrolls, qtOuro, qtDiamante, qtMachado, qtPocao;
		
		RoomContent(int qtPortas, int portaAberta, int portaPocao, int qtTrolls, int qtOuro, int qtDiamante, int qtMachado, int qtPocao){
			this.qtPortas = qtPortas;
			this.portaAberta = portaAberta;
			this.portaPocao = portaPocao;
			this.qtTrolls = qtTrolls;
			this.qtOuro = qtOuro;
			this.qtDiamante = qtDiamante;
			this.qtMachado = qtMachado;
			this.qtPocao = qtPocao;
		}
		
		/*Gets & Sets*/
		public int getQtPortas() {
			return qtPortas;
		}

		public void setQtPortas(int qtPortas) {
			this.qtPortas = qtPortas;
		}

		public int getPortaAberta() {
			return portaAberta;
		}

		public void setPortaAberta(int portaAberta) {
			this.portaAberta = portaAberta;
		}

		public int getPortaPocao() {
			return portaPocao;
		}

		public void setPortaPocao(int portaPocao) {
			this.portaPocao = portaPocao;
		}

		public int getQtTrolls() {
			return qtTrolls;
		}

		public void setQtTrolls(int qtTrolls) {
			this.qtTrolls = qtTrolls;
		}

		public int getQtOuro() {
			return qtOuro;
		}

		public void setQtOuro(int qtOuro) {
			this.qtOuro = qtOuro;
		}

		public int getQtDiamante() {
			return qtDiamante;
		}

		public void setQtDiamante(int qtDiamante) {
			this.qtDiamante = qtDiamante;
		}

		public int getQtMachado() {
			return qtMachado;
		}

		public void setQtMachado(int qtMachado) {
			this.qtMachado = qtMachado;
		}

		public int getQtPocao() {
			return qtPocao;
		}

		public void setQtPocao(int qtPocao) {
			this.qtPocao = qtPocao;
		}
		
	}
	
	public void Update(){
	}
}