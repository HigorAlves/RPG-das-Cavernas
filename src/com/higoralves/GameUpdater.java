package com.higoralves;

import java.util.concurrent.ThreadLocalRandom;

public class GameUpdater {

	//Fun��o para gera��o de numeros randomicos
	public int random(int min, int max){
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}
}
