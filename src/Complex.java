/*  Complex.java    
    Author: William Woodruff
    Represents a complex number (a + bi) in terms of real and imaginary parts.
    Coded 3/15/13
    Modified 9/13/13
 */

public class Complex
{

  //instance variables
  private double real, imag;
  
  //default constructor
  public Complex()
  {
    real = 0.0;
    imag = 0.0;
  }
  
  //constructor taking specific a and b values
  public Complex(double re, double im)
  {
    real = re;
    imag = im;
  }
  
  //accessors
  public double getReal() {return real;}
  public double getImag() {return imag;}
  
  //mutators
  public void setReal(double re) {real = re;}
  public void setImag(double im) {imag = im;}

  //conversion functions
  
  //toInt
  //converts the current Complex instance into an integer, if possible
  public int toInt()
  {
    if (this.getImag() != 0)
      throw new ComplexConversionException();
    else
      return (int) (this.getReal());
  }
  
  //toFloat
  //converts the current Complex instance into a float, if possible
  public float toFloat()
  {
    if (this.getImag() != 0)
      throw new ComplexConversionException();
    return (float) (this.getReal());
  }
  
  //toDouble
  //converts the current Complex instance into a Double, if possible
  public double toDouble()
  {
    if (this.getImag() != 0)
      throw new ComplexConversionException();
    else
      return (this.getReal());
  }
  
  //equals
  //determines whether one Complex is 'equal' to another based on real and imag parts
  //@param Complex c the Complex being compared
  //@return true if equal, false otherwise
  public boolean equals(Complex c)
  {
    if (c.getReal() == this.getReal() && c.getImag() == this.getImag()) return true;
    
    return false;
  }
  
  //toString
  //returns a String explaining the calling Complex instance
  public String toString()
  {
    return "This complex has a real part of " + real + " and an imaginary part of " + imag + ".\n"; 
  }
  
  //strRep
  //returns a literal representation of the complex number in a+bi form 
  public String strRep()
  {
    return real + " + " + imag + "i\n"; 
  }
  
}