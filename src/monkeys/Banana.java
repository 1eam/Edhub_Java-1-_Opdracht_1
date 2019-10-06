package monkeys;

public class Banana {
	
	Monkey owner;

	public void introduceSelf() {
		System.out.println("Im a Banana");
		}
	
	public void printMyOwner() {
	System.out.println("Im a Banana, My owner is" + owner.monkeyName);
	}
	
	public boolean imHere() {
		return true;
	}
}
