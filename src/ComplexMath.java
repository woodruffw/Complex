/*  ComplexMath.java
    Author: William Woodruff
    Provides a set a functions for basic operations on Complex objects
    Coded 9/13/13
*/

public class ComplexMath
{
  
  //conjugate
  //calculates and returns a Complex equal to the conjugate of c
  public static Complex conjugate(Complex c)
  {
    return new Complex(c.getReal(), -c.getImag()); 
  }
  
  //reciprocal
  //calculates and returns a Complex equal to the reciprocal of c
  public static Complex reciprocal(Complex c) 
  {
    double scale = (c.getReal() * c.getReal()) + (c.getImag() * c.getImag());

    double re = c.getReal() / scale;
    double im = c.getImag() / scale;

    return new Complex(re, im);
  }
  
  //add
  //calculates and returns a Complex equal to the addition of c1 and c2
  public static Complex add(Complex c1, Complex c2)
  {
    double re = c1.getReal() + c2.getReal();
    double im = c1.getImag() + c2.getImag();
    return new Complex(re, im);
  }

  //add
  //calculates and returns a Complex equal to the addition of c and num
  public static Complex add(Complex c, double num)
  {
    return new Complex(c.getReal() + num, c.getImag());
  }
  
  //subtract
  //calculates and returns a Complex equal to the subtraction of c2 from c1
  public static Complex subtract(Complex c1, Complex c2)
  {
    double re = c1.getReal() - c2.getReal();
    double im = c1.getImag() - c2.getImag();
    return new Complex(re, im);
  }

  //subtract
  //calculates and returns a Complex equal to the subtraction of num from c
  public static Complex subtract(Complex c, double num)
  {
    return new Complex(c.getReal() - num, c.getImag());
  }
  
  //multiply
  //calculates and returns a Complex equal to the multiplication of c1 and c2
  public static Complex multiply(Complex c1, Complex c2)
  {
    double re = c1.getReal() * c2.getReal() - c1.getImag() * c2.getImag();
    double im = c1.getReal() * c2.getImag() + c1.getImag() * c2.getReal();
    return new Complex(re, im);
  }

  //multiply
  //calculates and returns a Complex equal to c * num
  public static Complex multiply(Complex c, double num)
  {
    return new Complex(c.getReal() * num, c.getImag() * num);
  }
  
  //divide
  //calculates and returns a Complex equal to the division c1 / c2
  public static Complex divide(Complex c1, Complex c2)
  {
    Complex conj = ComplexMath.conjugate(c2);

    Complex numerator = ComplexMath.multiply(c1, conj);
    double denominator = ComplexMath.multiply(c2, conj).toDouble();

    return ComplexMath.divide(numerator, denominator);
  }

  //divide
  //calculates and returns a Complex equal to the division c / num
  public static Complex divide(Complex c, double num)
  {
    return new Complex(c.getReal() / num, c.getImag() / num);
  }
  
  //pow
  //calculates and returns a Complex equal to c^raise
  public static Complex pow(Complex c, int raise)
  {
    if (raise == 1) return new Complex(c.getReal(), c.getImag());
    
    else if (raise == 0) return new Complex(1, 0);
    
    else
    {
      Complex orig = new Complex(c.getReal(), c.getImag());
      Complex ret = new Complex(c.getReal(), c.getImag());
      
      for (int i = 1; i < raise; i++)
        ret = ComplexMath.multiply(orig, ret);
      
      return ret;
    }
  }
  
  //mag
  //calculates the magnitude (hypotenuse) of c
  public static double mag(Complex c)
  {
    return Math.hypot(c.getReal(), c.getImag()); 
  }
  
}