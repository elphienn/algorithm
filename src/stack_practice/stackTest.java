package stack_practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class stackTest {
	mainStack ms = new mainStack();

	@Test
	public void testIsOpen() {
		assertTrue(ms.isOpen('('));
	}

}
