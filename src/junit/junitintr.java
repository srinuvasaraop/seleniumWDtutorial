package junit;

import static org.junit.Assert.*;
import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitintr {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("executed before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("executed after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("executed before ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("executed after ");
	}

	@Test
	public void test1() {
		System.out.println("executed test1");
	}

	@Test
	public void test2() {
		System.out.println("executed test1");
	}

}
