Complex
========

### What is Complex?

Complex is very simple!

It's an implementation of complex numbers (you know, a + bi), something that Java has been sorely lacking.

All together, it's only three files:

- Complex.java - The Complex type itself. Stores real and imaginary parts as doubles, offers some conversion/equality/output functions, and that's it.
- ComplexMath.java - Some basic mathematical functions, reworked to function with the Complex type. Includes add, subtract, multiply, divide, pow, and so forth.
- ComplexConversionException.java - A RuntimeException subclass designed to shout at you if you try to convert a Complex into a primitive.

### How efficient is it?

Honestly, I don't know. 
