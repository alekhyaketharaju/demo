package Demo1.demo;

import junit.framework.TestCase;

public class additionTest2 extends TestCase {
	public void testAddition()
	{
		additionClass addClass =new additionClass();
		assertEquals(2,addClass.addOne(1));
	}
	public void testTwoNumberAddition()
	{
		additionClass addClass =new additionClass();
		assertEquals(4,addClass.addTwoNumbers(1,3));
	}
}
