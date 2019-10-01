package monkeys;

public class Main {

	public static void main(String[] args) {
		Monkey monkey1 = new Monkey("Rikki", 14, 61.4f);
		Monkey monkey2 = new Monkey("Simba", 8, 34.6f);
		
		monkey1.introduceSelf();
		monkey1.makeNoise();
		
		monkey2.introduceSelf();
		monkey2.makeNoise();
		monkey2.makeNoise();
	}

}
