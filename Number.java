public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    return 0;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    double otherValue = other.getValue();
    double value = this.getValue();
    if (value == 0) {
      return (otherValue == 0);
    }
    if (otherValue == 0) {
      return (value == 0);
    }
    else {
      double difference = value - otherValue;
      double ratio = 2 * difference/(value + otherValue);
      if (ratio < 0) {
        ratio = 0 - ratio;
      }
      return (ratio < 0.00001);
    }
  }
}
