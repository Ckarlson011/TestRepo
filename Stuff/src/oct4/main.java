package oct4;

public class main {
	public static void main(String[] args) {
		// Program at the "interface" defined in the superclass.
		// Declare instances of the superclass, substituted by subclasses.
		Monster m1 = new FireMonster("r2u2"); // upcast
		Monster m2 = new WaterMonster("u2r2"); // upcast
		Monster m3 = new StoneMonster("r2r2"); // upcast

		// Invoke the actual implementation
		System.out.println(m1.attack()); // Run FireMonster's attack()
		System.out.println(m2.attack()); // Run WaterMonster's attack()
		System.out.println(m3.attack()); // Run StoneMonster's attack()

		// m1 dies, generate a new instance and re-assign to m1.
		m1 = new StoneMonster("a2b2"); // upcast
		System.out.println(m1.attack()); // Run StoneMonster's attack()

		// We have a problem here!!!
		Monster m4 = new Monster("u2u2");
		System.out.println(m4.attack()); // garbage!!!
	}
}

class Monster {
	protected String name;
	
	public Monster() {
		
	}
	
	public Monster(String name) {
		this.name = name;
	}
	
	public String attack() {
		return "!^_&^$@+%$* I don't know how to attack!";
	}
}

class FireMonster extends Monster {
	public FireMonster(String name) {
		super.name = name;
	}
	
	public String attack() {
		return "Attack with fire!";
	}
}

class WaterMonster extends Monster {
	public WaterMonster(String name) {
		super.name = name;
	}
	
	public String attack() {
		return "Attack with water!";
	}
}

class StoneMonster extends Monster {
	public StoneMonster(String name) {
		super.name = name;
	}
	
	public String attack() {
		return "Attack with stones!";
	}
}