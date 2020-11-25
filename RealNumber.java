public class RealNumber extends Number
{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
     RealNumber sum = new RealNumber(value + other.getValue());
     return sum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(value * other.getValue());
    return product;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double otherValue = other.getValue();
    if (otherValue != 0) {
      RealNumber ratio = new RealNumber(value/otherValue);
      return ratio;
    } else {
      throw new RuntimeException("Error: Cannot divide by 0");
    }
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double otherValue = other.getValue();
    RealNumber difference = new RealNumber(value - otherValue);
    return difference;
  }
}
