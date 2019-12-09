package parametrizedTest;

public class AgeValidator {

	public Object isAdult(int age) {
		return age >= 18 && age <= 65;
	}

}
