/**
 * 
 */
package constructionCostEstimationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import constructionCostEstimation.CostEstimator;

/**
 * @author Vishwanath Reddy
 *
 */
public class ConstructCostEstimationTest {

	@Test
	public void test() {
		CostEstimator costEstimator =new CostEstimator();
		assertEquals(15000,costEstimator.estimatedCostForConstruction(2,10,false),0);
		assertEquals(-1,costEstimator.estimatedCostForConstruction(2,10,true),0);
		assertEquals(25000,costEstimator.estimatedCostForConstruction(3,10,true),0);
		assertEquals(18000,costEstimator.estimatedCostForConstruction(3,10,false),0);
		assertEquals(12000,costEstimator.estimatedCostForConstruction(1,10,false),0);
		assertEquals(-1,costEstimator.estimatedCostForConstruction(1,10,true),0);
		assertEquals(-1,costEstimator.estimatedCostForConstruction(6,10,true),0);
	}
	
	
}


