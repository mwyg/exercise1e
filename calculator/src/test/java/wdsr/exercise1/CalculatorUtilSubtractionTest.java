package wdsr.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilSubtractionTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test
	public void test3minus1() {
		// given
		when(calculator.subtract(3, 1)).thenReturn(2);

		// when
		String actual = calcUtil.getSubstractionText(3, 1);

		// then
		assertEquals("3 - 1 = 2", actual);
	}

	@Test
	public void testSubtractProperlyEmbeddedNegativeValuesWithBrackets() {
		// given
		when(calculator.subtract(-3, -1)).thenReturn(-2);

		// when
		String actual = calcUtil.getSubstractionText(-3, -1);

		// then
		assertEquals("-3 - -1 = -2", actual);
	}
}
