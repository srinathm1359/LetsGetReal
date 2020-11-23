public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno < 0) {
      nume = -nume;
      deno = -deno;
    }
    numerator = nume;
    denominator = deno;
    this.reduce();
    if (denominator == 0) {
      denominator = 1;
      numerator = 0;
    }
  }

  public double getValue(){
    return ((double)numerator)/((double)denominator);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber reciprocal = new RationalNumber(denominator,numerator);
    return reciprocal;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1) {
      return numerator + "";
    } else {
      return numerator + "/" + denominator;
    }

  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    /*http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html*/
    //First make a and b nonnegative integers
    if (a < 0) {
      a = -a;
    }
    if (b < 0) {
      b = -b;
    }
    if (a == 0) {
      return b;
    }
    return (gcd(b%a,a));
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(numerator,denominator);
    numerator = numerator/gcd;
    denominator = denominator/gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int newNum = numerator*other.getNumerator();
    int newDenom = denominator*other.getDenominator();
    RationalNumber product = new RationalNumber(newNum,newDenom);
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return (this.multiply(other.reciprocal()));
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int otherNum = other.getNumerator();
    int otherDenom = other.getDenominator();
    int newNum = numerator*otherDenom + denominator*otherNum;
    int newDenom = denominator*otherDenom;
    RationalNumber sum = new RationalNumber(newNum,newDenom);
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
