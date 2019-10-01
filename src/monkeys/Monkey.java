package monkeys;

public class Monkey {
	private String monkeyName;
	private int monkeyAge;
	private float monkeyWeight;
	
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
	
	public void geefBanaan() {
		
	}
	
	public void krijgBanaan() {
		
	}
}
