package order;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.MethodOrderer.Random;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(Alphanumeric.class)
//@TestMethodOrder(Random.class)
public class OrderTests {

	@Test
	@Order(1)
	public void testA()
	{
		System.out.println("AAA");
	}
	
	@Test
	public void testB()
	{
		System.out.println("BBB");
	}
	
	@Test
	public void testC()
	{
		System.out.println("CCC");
	}
	
	@Test
	public void aTestD()
	{
		System.out.println("DDD");
	}
}