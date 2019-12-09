package annotations;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class SharedDataShould {
	
	private Date now = new Date();
	private static Date nowStatic = new Date();
	
	@Test
	public void printAnyDate()
	{
		printDate();
		assertThat(true, is(true));
	}
	
	@Test
	public void printOtherDate()
	{
		printDate();
		assertThat(true, is(true));
	}

	private void printDate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
		System.out.println("Atributo : " + formatter.format(this.now));
		System.out.println("Estatico : " + formatter.format(nowStatic));
	}
}
