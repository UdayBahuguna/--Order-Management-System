package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;




class TestCalculator {

	 static Calculator cal;
		
	    @BeforeAll
		public static void setUp()
		{
			cal = new Calculator();
		}
		@Test
		void testingSum() {
			
			//when
			int result = cal.sum(5, 4);
			//then
			assertEquals(9, result);
			
		}
		
		@Test
		void testingMul()
		{
			
			int result= cal.mul(5, 6);
			assertEquals(30, result);
		}

		@AfterAll
		public static void cleanUp()
		{
			cal = null;
		}
}
