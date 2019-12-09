package parametrizedTest;

import static org.junit.Assert.assertThat;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import parametrizedTest.AgeValidator;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IsValidAgeShould {

	@ParameterizedTest
	@MethodSource("isValidAgeDataProvider")
	
	void isValidAge(int age, boolean expected) {
		AgeValidator validator = new AgeValidator();
		
		assertThat(validator.isAdult(age), is(expected));
	}
	
	static Stream<Arguments> isValidAgeDataProvider() {
        return Stream.of(
                arguments(Integer.MIN_VALUE, false),
                arguments(Integer.MAX_VALUE, false),
                arguments(0, false),
                arguments(1, false),
                arguments(-1, false),
                arguments(17, false),
                arguments(18, true),
                arguments(19, true),
                arguments(64, true),
                arguments(65, true),
                arguments(66, false)
        );
    }
}
