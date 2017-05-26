public class Porta {
	private int paraQualSala;
	private boolean trancada;

	public Porta(){
		paraQualSala = -1;
		trancada = false;
	}

	public boolean isTrancada() {
		return trancada;
	}

	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}

	public int getParaQualSala() {
		return paraQualSala;
	}

	public void setParaQualSala(int paraQualSala) {
		this.paraQualSala = paraQualSala-1;
	}

}
