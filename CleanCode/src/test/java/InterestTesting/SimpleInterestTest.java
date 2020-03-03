/**
 * 
 */
package InterestTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import interestCalculator.SimpleInterest;

/**
 * @author Vishwanath Reddy
 *
 */
public class SimpleInterestTest {

	@Test
	public void test() {
		SimpleInterest s = new SimpleInterest();
		double testOutput = s.SimpleInterestCalculator(2000.0, 3.0, 6.0);
		assertEquals(360, testOutput,0);
	}

}
