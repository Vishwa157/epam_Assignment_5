/**
 * 
 */
package constructionCostEstimation;

/**
 * @author Vishwanath Reddy
 *
 */
public class StandardConstructOption {
	private double costPerSqaureFeet = 1200;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}
