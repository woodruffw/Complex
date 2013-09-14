/**
* @author     William Woodruff <woodrufw @ bxscience.edu>
* @version    0.9
* @since      2013-3-15
*/
public class ComplexConversionException extends RuntimeException
{

  /**
  * Default constructor.
  */
  public ComplexConversionException()
  {
    super("Complex has unconvertible imaginary part."); 
  }
  
  /**
  * Constructor taking String argument for a custom message.
  * 
  * @param message the message to be used
  */
  public ComplexConversionException(String message)
  {
    super(message); 
  }
}