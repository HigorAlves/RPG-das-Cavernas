package com.higoralves;

public enum Phrases {
	InitialText("Ola mundo");
	
	private String Txt;
	Phrases(String Txt){
		this.Txt = Txt;
	}
	
	public String getTxt() {
		return Txt;
	}
	public void setTxt(String txt) {
		Txt = txt;
	}
}
