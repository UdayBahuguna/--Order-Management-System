package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@BeforeAll
	public static void setUp() {

		System.out.println("excecuted once before all test case methods");
	}

	@BeforeEach
	public void xyz() {
		System.out.println("executed before every test case method");
	}

	@Test
	public void test1() {

		System.out.println("test1 test method");

	}

	@Test
	public void test2() {

		System.out.println("test2 test method");


	}

	@AfterAll
	public static void tearDown() {
		System.out.println("excecuted once aftter all test case methods");
	}
}

