package constant;

/**
 * 
 * @author Mona
 *All the static constant value which we need during the convert.
 */
public final class NumberToWordConstant {
	private NumberToWordConstant() {
		
	}
	public static String NUMBER_HUNDRED = " HUNDRED";
	public static String AND = " AND";
	public static final String ERROR = "Invalid Number,Please Enter number between 0 to 999999999";
	public static final String[] SPECIAL_SERIES = { "", " THOUSAND", " MILLION"};
	public static final String[] TEN_SERIES = { "", " TEN", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY",
			" SEVENTY", " EIGHTY", " NINETY" };
	public static final String[] SERIES = { "", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN",
			" EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN",
			" SEVENTEEN", " EIGHTEEN", " NINETEEN" };
}