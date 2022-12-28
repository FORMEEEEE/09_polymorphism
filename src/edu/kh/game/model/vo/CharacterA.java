package edu.kh.game.model.vo;

public class CharacterA {

	private int str;
	private int dex;
	private int lux;
	
	public CharacterA() {}

	public CharacterA(int str, int dex, int lux) {
		super();
		this.str = str;
		this.dex = dex;
		this.lux = lux;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getLux() {
		return lux;
	}

	public void setLux(int lux) {
		this.lux = lux;
	}

	@Override
	public String toString() {
		return " [str=" + str + ", dex=" + dex + ", lux=" + lux ;
	}
	
	
	
}
