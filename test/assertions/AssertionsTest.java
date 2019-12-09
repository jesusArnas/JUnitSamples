package assertions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import dependenciesSample.CreateNewUserDate;
import dependenciesSample.User;

public class AssertionsTest {

	@Test
	public void multipleAssertion()
	{
		String ANY_NAME = "name";
		String ANY_EMAIL = "name@domain";

		User user = new User(ANY_NAME, ANY_EMAIL);
		
		assertAll("user",
	            () -> assertEquals(ANY_NAME, user.getName()),
	            () -> {
	            	String email = user.getEmail();
	            	
	            	assertTrue(email.startsWith("n"));
	            	assertTrue(email.endsWith("n"));
	            });
	}
	
	@Test
	public void manageNoExpectedException()
	{
		String ANY_NAME = "name";
		String ANY_EMAIL = "name@domain";
		
		CreateNewUserDate service = new CreateNewUserDate();

		User result = assertDoesNotThrow(() -> {
			return service.Execute(ANY_NAME, ANY_EMAIL);
        });
	}
	
	@Test
	public void manageExpectedException()
	{
		String NULL_NAME = null;
		String ANY_EMAIL = "name@domain";
		
		CreateNewUserDate service = new CreateNewUserDate();

		assertThrows(Exception.class, () -> {
			service.Execute(NULL_NAME, ANY_EMAIL);
        });
	}
}
