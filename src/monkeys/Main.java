package monkeys;

public class Main {

	public static void main(String[] args) {
		Banana banana1 = new Banana();
		Monkey monkey1 = new Monkey("Rikki", 14, 61.4f, banana1);
		Monkey monkey2 = new Monkey("Simba", 8, 34.6f);
		
		
		monkey1.introduceSelf();
		monkey1.makeNoise();
		
		monkey2.introduceSelf();
		monkey2.makeNoise();
		
		banana1.introduceSelf();
		
		monkey1.giveBananaTo(monkey2);
		
		banana1.printMyOwner();
		
		monkey1.hasBanana();
		monkey2.hasBanana();
		
		//monkey1.giveBananaTo(takesMonkeyobject);
		
//		monkey2.hasBanana();
		
	//	banana.printMyOwner();

	}
}