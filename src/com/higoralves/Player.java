package com.higoralves;

public class Player {
	@SuppressWarnings("unused")
	private enum Status{
		LIFE, NAME;
	}
	
	@SuppressWarnings("unused")
	private enum Bag{
		ITEM1(""), ITEM2(""), ITEM3(""), ITEM4(""), ITEM5(""), WEAPON("");
		
		private String Txt;
		Bag(String Txt){
			this.Txt = Txt;
		}
		private String getTxt() {
			return Txt;
		}
		private void setTxt(String txt) {
			Txt = txt;
		}
		
	}
}
