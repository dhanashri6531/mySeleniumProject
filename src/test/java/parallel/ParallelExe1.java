package parallel;

import org.testng.annotations.Test;

public class ParallelExe1 {
	@Test
	public void testMethod_1() {
		System.out.println("Test method 1 executed >>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod_2() {
		System.out.println("Test method 2 executed >>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod_3() {
		System.out.println("Test method 3 executed >>>"+Thread.currentThread().getId());
		
	}

}
