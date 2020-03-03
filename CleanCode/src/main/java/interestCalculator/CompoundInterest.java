/**
 * 
 */
package interestCalculator;

/**
 * @author Vishwanath Reddy
 *
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	private static final Logger logger = LogManager.getLogger(CompoundInterest.class.getName());
	
	public double CompoundInterestCalculator(double principle, int compoundedPerUnit, double time, double rate) {
		logger.info("Compound Interest is being calculated");
		return (principle * Math.pow(1 + (rate / compoundedPerUnit), compoundedPerUnit * time)) - principle;
	}
}
