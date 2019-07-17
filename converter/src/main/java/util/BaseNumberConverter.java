package util;

import constant.NumberToWordConstant;

/**
 * BaseNumberConverter , which can be reusable for all type
 * @author mona
 *
 */
public interface BaseNumberConverter {
	
	default String convert(int number)throws Exception {
		return null;		
	}
	
	// default method to all NumberClassType
	default String convertLessThanOneThousand(int number) {
		boolean removeAnd = false;
		String curr;
		if (number % 100 < 20) {
			curr = NumberToWordConstant.SERIES[number % 100];
			number /= 100;
			removeAnd = true;
		} else {
			curr = NumberToWordConstant.SERIES[number % 10];
			number /= 10;

			curr = NumberToWordConstant.TEN_SERIES[number % 10] + curr;
			number /= 10;
		}
		if (number == 0)
			return curr;
		return removeAnd == true ? NumberToWordConstant.SERIES[number] + NumberToWordConstant.NUMBER_HUNDRED + curr
				: NumberToWordConstant.SERIES[number] + NumberToWordConstant.NUMBER_HUNDRED + NumberToWordConstant.AND
						+ curr;
	}
	 
}
