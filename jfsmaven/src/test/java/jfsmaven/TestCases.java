package jfsmaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {

	
	@Test
	void test2() {
		testcasses unittest = new testcasses();
		int received_result=unittest.add(15, 5);
		assertEquals(20,received_result,"my message");
		
		
	}

}
