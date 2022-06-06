package chapter9;

public class Main {
	public static void main(String[] args) {

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h1 = new Hero();
		h1.name = "湊";
		h1.hp = 100;
		h1.sword = s;

		System.out.println("現在の武器は" + h1.sword.name);

		Hero h2 = new Hero();
		h2.name = "静弥";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "ハリーポッター";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

		System.out.println("h1→" + h1.hp);
		System.out.println("h2→" + h2.hp);
	}

}
