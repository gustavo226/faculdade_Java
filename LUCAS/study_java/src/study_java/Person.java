package study_java;

public class Person {
	private String name;
	
	public void say_hello() {
		System.out.println("Hello " + name);
		System.out.println("COMP 1.8");
	}
	
	public void set_name(String value) {
		name = value;
		System.out.println("Name is set to: " + name);
	}
	
	public Person(String name) {
		set_name(name);
		say_hello();
	}
	
}

class NPC extends Person {
	final int BASEHP = 100;
	double hp;
	
	public void set_hp(double value) {
		hp = BASEHP * value;
		System.out.println("HP was set to: " + hp);
	}
	
	public NPC (String name, double mod) {
		super(name);
		set_hp(mod);
	}
}