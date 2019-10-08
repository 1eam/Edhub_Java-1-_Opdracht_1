package monkeys;

public class Monkey {
	public String monkeyName;
	private int monkeyAge;
	private float monkeyWeight;
	public Banana banana;

	public Monkey(String name, int age, float weight, Banana banana) {
		this.monkeyName = name;
		this.monkeyAge = age;
		this.monkeyWeight = weight;
	}

	public Monkey(String name, int age, float weight) {
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

	public void giveBananaTo(Monkey monkeyobj, Banana myBanana) {
		monkeyobj.banana = myBanana;
		myBanana.owner = monkeyobj;
		
	}
	

	public void giveMyBananaTo(Monkey monkeyobj) {
		monkeyobj.banana = this.banana;
		this.banana.owner = monkeyobj;
		this.banana=null;
		
	}
	

	public boolean hasBanana() {
		//check if this.Monkey.banana == new banana
		return true;
	}

}