package monkeys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BananaTest {

	@Test
	void testIntroduceSelf() {
		Banana b = new Banana();
		b.introduceSelf();
//		void expected = System.out.println("Im a Banana");
//		assertEquals(expected, actual, "");

	}

	@Test
	void testPrintMyOwner() {
		
	}

}

//I came to the conclusion that void methods cannot be unit tested
//Because they dont take in parameters to process & dont produce a value