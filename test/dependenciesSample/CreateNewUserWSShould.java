package dependenciesSample;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import dependenciesSample.CreateNewUserWS;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class CreateNewUserWSShould {

	@Test
	public void Given_name_and_email_when_execute_then_success()
	{
		CreateNewUserWS sut = new CreateNewUserWS();
		
		boolean success = assertDoesNotThrow(() -> {
			return sut.Execute("valid name", "valid email");
        });
        
		assertThat(success, is(true));
	}
}
