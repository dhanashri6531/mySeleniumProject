package parallel;

import org.testng.annotations.Test;

public class ParallelExe2 {
	@Test
	public void testMethod_4() {
		System.out.println("Test method 4 executed >>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod_5() {
		System.out.println("Test method 5 executed >>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod_6() {
		System.out.println("Test method 6 executed >>>"+Thread.currentThread().getId());
		
	}

}
