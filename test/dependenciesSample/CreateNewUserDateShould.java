package dependenciesSample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import dependenciesSample.CreateNewUserDate;
import dependenciesSample.User;

public class CreateNewUserDateShould {

	@Test
	public void Given_name_and_email_when_execute_then_success()
	{
		CreateNewUserDate sut = new CreateNewUserDate();
		
		User result = assertDoesNotThrow(() -> {
			return sut.Execute("valid name", "valid email");
        });
        
		assertThat(result, is(new User("valid name", "valid email")));
	}
}
