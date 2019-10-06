package monkeys;

public class Monkey {
	private String monkeyName;
	private int monkeyAge;
	private float monkeyWeight;
	private Banana banana;
	
	public Monkey (String name, int age, float weight, Banana banana) {
		this.monkeyName = name;
		this.monkeyAge = age;
		this.monkeyWeight = weight;
		this.banana = new Banana ();
	}
	
	public Monkey (String name, int age, float weight) {
		this.monkeyName = name;
		this.monkeyAge = age;
		this.monkeyWeight = weight;
	}
	
	public void introduceSelf() {
	System.out.println("Hi my name is " + monkeyName + ". Im a " + monkeyAge + " year old Monkey, and I weigh " + monkeyWeight + " kilo's.");
	}
	
	public void makeNoise() {
		System.out.println("OOH OOH AAH AAH!");
	}
	
	public Banana giveBananaTo(Monkey monkeyobj) {
		
	}
	
	public void krijgBanaan() {
		
	}
	
	public boolean hasBanana() {
		return boolean;
	}
}
