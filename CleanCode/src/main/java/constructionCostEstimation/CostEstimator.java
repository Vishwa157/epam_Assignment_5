/**
 * 
 */
package constructionCostEstimation;

/**
 * @author Vishwanath Reddy
 *
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CostEstimator {
	
	private static final Logger logger = LogManager.getLogger(CostEstimator.class.getName());
	
	public double estimatedCostForConstruction(int typeOfConstruction, double AreaOfHouse, boolean Automation) {
		
		logger.info("estimateCost method is running");
		switch(typeOfConstruction){
		case 1:{
			if(!Automation) {
				logger.info("Standard Construct Option without the choice of Automation");
				return (new StandardConstructOption().estimator(AreaOfHouse));
			}
			else {
				logger.error("Invalid option, as the result -1 is returned");
				return -1;
			}
		}
		case 2:{
			if(!Automation) {
				logger.info("Above Standard Construct Option without the choice of Automation");
				return (new AboveStandardConstructOption().estimator(AreaOfHouse));
			}
			else {
				logger.error("Invalid option, as the result -1 is returned");
				return -1;
			}
		}
		case 3:{
			if(!Automation) {
				logger.info("High Standard Construct Option without the choice of Automation");
				return (new HighStandardConstructOption().estimator(AreaOfHouse));
			}
			else {
				logger.info("Automated High Standard Construct Option with Automation");
				return (new AutomatedHighStandardConstructOption().estimator(AreaOfHouse));
			}
		}
		}
		
		logger.error("Invalid choice is selected, as the result -1 is returned");
		
	return -1;
	}

}
