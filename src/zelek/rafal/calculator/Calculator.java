package zelek.rafal.calculator;

import java.util.Optional;

public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public Optional<Integer> div(int i, int j) {
		if(j == 0)
			return Optional.empty();
		else
			return Optional.of(i/j);
	}

	public Optional<Integer> sqrt(int i) {
		if(i < 0)
			return Optional.empty();
		else
			return Optional.of((int)Math.sqrt(i));
	}

}
