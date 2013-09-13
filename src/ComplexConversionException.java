/*  ComplexConversionException.java    
    Author: William Woodruff
    Thrown in the event that a Complex cannot be converted into a real number.
    Two constructors: One standard message, one customizable message
    Coded 3/15/13
 */

public class ComplexConversionException extends RuntimeException
{
  //standard message
  public ComplexConversionException()
  {
    super("Complex has unconvertible imaginary part."); 
  }
  
  //custom message
  public ComplexConversionException(String message)
  {
    super(message); 
  }
}