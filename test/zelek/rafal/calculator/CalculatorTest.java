package zelek.rafal.calculator;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class CalculatorTest {
	Calculator sut = new Calculator();

	@Test
	public void testThat1Plus3Is4() {
		final int result = sut.add(1,3);
		assertSame(result, 4);
	}

	@Test
	public void testThat0Plus0Is0() {
		final int result = sut.add(0,0);
		assertSame(result, 0);
	}

	@Test
	public void testThatNegative10Plus10Is0() {
		final int result = sut.add(-10,10);
		assertSame(result, 0);
	}

	@Test
	public void testThat10DividedBy10GivesSomeOf1(){
		final Optional<Integer> result = sut.div(10, 10);
		assertEquals(result, Optional.of(1));
	}
	
	@Test
	public void testThat10DividedByNegative10GivesSomeOfNegative1(){
		final Optional<Integer> result = sut.div(10, -10);
		assertEquals(result, Optional.of(-1));
	}
	
	@Test
	public void testThat10DividedBy0GivesNone(){
		final Optional<Integer> result = sut.div(10, 0);
		assertEquals(result, Optional.empty());
	}
	
	@Test
	public void testThat0DividedBy0GivesNone(){
		final Optional<Integer> result = sut.div(0, 0);
		assertEquals(result, Optional.empty());
	}
	
	@Test
	public void testThat0DividedBy10GivesSomeOf0(){
		final Optional<Integer> result = sut.div(0, 10);
		assertEquals(result, Optional.of(0));
	}

	@Test
	public void testThatSqrtFromNegative4GivesNone(){
		final Optional<Integer> result = sut.sqrt(-4);
		assertEquals(result, Optional.empty());
	}

	@Test
	public void testThatSqrtFrom0GivesSomeOf0(){
		final Optional<Integer> result = sut.sqrt(0);
		assertEquals(result, Optional.of(0));
	}

	@Test
	public void testThatSqrtFrom4GivesSomeOf2(){
		final Optional<Integer> result = sut.sqrt(4);
		assertEquals(result, Optional.of(2));
	}
	
	@Test
	public void testThatRandomFunctionReturnsGeneratedRandomNumber(){

	}
	
}
