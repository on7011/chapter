package chapter9;

public class Wizard {
	
	String name;
	int hp;
	
	public void heal(Hero h) {
		h.hp = h.hp + 10;
		System.out.println(h.name + "のHPを１０回復した！");
	}

}
