package Calculate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

	private static Calculation calculation;

	@BeforeAll
	static void setUp() {
		calculation = new Calculation();
		calculation.num1 = 20;
		calculation.num2 = 10;
	}

	@DisplayName("더하기 기능 테스트")
	@Test
	void plusCalculate() {
		int result = calculation.plusCalculate();
		assertEquals(30, result);
	}

	@DisplayName("빼기 기능 테스트")
	@Test
	void minusCalculate() {
		int result = calculation.minusCalculate();
		assertEquals(10, result);
	}

	@DisplayName("나누기 기능 테스트")
	@Test
	void divCalculate() {
		int result = calculation.divCalculate();
		assertEquals(2, result);
	}

	@DisplayName("곱하기 기능 테스트")
	@Test
	void multiCalculate() {
		int result = calculation.multiCalculate();
		assertEquals(200, result);
	}
}