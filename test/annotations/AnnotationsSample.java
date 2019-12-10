package annotations;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@TestInstance(Lifecycle.PER_METHOD)
public class AnnotationsSample {

	private Date NOW = Calendar.getInstance().getTime();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

	
	@BeforeAll
	public void beforeAll()
	{
		System.out.println("beforeAll");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("beforeEach");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1: " + formatter.format(NOW));
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2: " + formatter.format(NOW));
	}
	
	@AfterAll
	public void afterAll()
	{
		System.out.println("afterAll");
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("afterEach");
	}
}
