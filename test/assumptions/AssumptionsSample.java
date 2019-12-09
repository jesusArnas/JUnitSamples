package assumptions;

import static org.junit.Assume.assumeThat;
import static org.hamcrest.Matchers.*;

import java.util.Calendar;


import org.junit.jupiter.api.Test;

public class AssumptionsSample {

	@Test
	public void onlyRunOnMonday()
	{
		assumeThat("only run on Monday", Calendar.getInstance().get(Calendar.DAY_OF_WEEK), is(Calendar.MONDAY));
	}
	
	@Test
	public void onlyRunOnWednesday()
	{
		assumeThat("only run on Wednesday", Calendar.getInstance().get(Calendar.DAY_OF_WEEK), is(Calendar.WEDNESDAY));
	}
	
	@Test
	public void runAlways()
	{
		assumeThat("only run on Wednesday", 1, is(1));
	}
}
