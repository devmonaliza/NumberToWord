package exception;
/**
 * User defined Exception
 *
 */
public class NumberConverterException extends Exception {
	
	private static final long serialVersionUID = 1L;

	NumberConverterException(String exceptionMsg) {
		super(exceptionMsg);
	   }
}
