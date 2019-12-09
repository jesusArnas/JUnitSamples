package basicSample;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import basicSample.Calculator;

class CalculatorShould {

	@Test
	void given_two_positive_integers_when_add_return_sum() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertThat(result, equalTo(5));
	}
}
