package util;
import constant.NumberToWordConstant;
import exception.InvalidNumberRange;
/**
 * BritishNumberConverter
 * */
public class BritishNumberConverter implements BaseNumberConverter {

	public String convert(int number) {
		String pre = "";
		String curr = "";

		try {
			if (number < 1 || number > 999999999) {
				throw new InvalidNumberRange("Invalid Number Range");
			}else {
				int place = 0;
				do {
					int n = number % 1000;
					if (n != 0) {
						String s = convertLessThanOneThousand(n);
						curr = s + NumberToWordConstant.SPECIAL_SERIES[place] + curr;
					}
					place++;

					number /= 1000;
				} while (number > 0);
			}
		}catch (InvalidNumberRange e) {
			//throw e;
			System.out.println("Exception:"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
		return (pre + curr).trim();

	}
}
