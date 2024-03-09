package parallel;

import org.testng.annotations.Test;

public class ParallelExe3 {
	@Test
	public void testMethod_7() {
		System.out.println("Test method 7 executed >>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod_8() {
		System.out.println("Test method 8 executed >>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void testMethod_9() {
		System.out.println("Test method 9 executed >>>"+Thread.currentThread().getId());
		
	}

}
