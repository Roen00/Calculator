package zelek.rafal.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testThat1Plus3Is4() {
		Calculator sut = new Calculator();
		int result = sut.add(1,3);
		assertSame(result, 4);
	}

	@Test
	public void testThat0Plus0Is0() {
		Calculator sut = new Calculator();
		int result = sut.add(0,0);
		assertSame(result, 0);
	}

	@Test
	public void testThatNegative10Plus10Is0() {
		Calculator sut = new Calculator();
		int result = sut.add(-10,10);
		assertSame(result, 0);
	}
	
}
