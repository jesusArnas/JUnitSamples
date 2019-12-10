package dependenciesSample;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.Times;

import dependenciesSample.CreateNewUserWS;
import dependenciesWS.SendWelcomeEmailWebService;

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
	
	@Test
	public void Given_name_and_email_with_mock_when_execute_then_success()
	{
		SendWelcomeEmailWebService wsMock = mock(SendWelcomeEmailWebService.class);
		when(wsMock.send())
			.thenReturn(true);
			
		
		CreateNewUserWS sut = new CreateNewUserWS();
		
		boolean success = assertDoesNotThrow(() -> {
			return sut.Execute("valid name", "valid email", wsMock);
        });
        
		assertThat(success, is(true));
		
		verify(wsMock, times(1))
			.send();
	}
	
	@Test
	public void Given_name_and_email_with_spy_when_execute_then_success()
	{
		SendWelcomeEmailWebService wsSpy = spy(SendWelcomeEmailWebService.class);
//		when(wsSpy.send())
//		.thenReturn(true);
			
		CreateNewUserWS sut = new CreateNewUserWS();
		
		boolean success = assertDoesNotThrow(() -> {
			return sut.Execute("valid name", "valid email", wsSpy);
        });
        
		assertThat(success, is(true));
		
		verify(wsSpy, times(1))
			.send();
	}
}
