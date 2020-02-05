
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {

	private static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPostiveALessThanB() {
		double actual = calculator.action(1, 3);
		assertEquals(3, actual);
	}
	
	@Test
	void testPostiveALargerThanB() {
		double actual = calculator.action(5,2);
		assertEquals(2.5, actual);
	}

	
	@AfterEach
	void tearDown() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
}
