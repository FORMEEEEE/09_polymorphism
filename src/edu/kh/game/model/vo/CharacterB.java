package edu.kh.game.model.vo;

public class CharacterB extends CharacterA{
	
	private int hp;
	
	public CharacterB() {}

	public CharacterB(int hp) {
		super();
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return super.toString() + ", hp=" + hp;
	}
	
	


}
