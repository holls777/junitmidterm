package Junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.MyClass;

public class project {

	@Test
	public void test() {
		boolean thing=MyClass.ReturnTrue();
		assertTrue(thing);
		int num1=1;
		int num2=2;
		int num3=MyClass.AddTwoNumbers(num1,num2);
		assertEquals(num3,3);
	}

}
