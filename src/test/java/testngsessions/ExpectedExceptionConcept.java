package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;

	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void searchText() {
		System.out.println("macbook");
		 int i = 10 / 0;

		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		// obj.name = "Tom";

		System.out.println("bye");

	}
}
