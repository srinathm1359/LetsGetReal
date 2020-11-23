public class Tester {
  public static void main(String[] args) {
    //Tests for RealNumber()
    //Testing equals() for RealNumber()
    System.out.println("\nTesting equals() for RealNumber()");
    RealNumber newReal1 = new RealNumber(0.0);
    RealNumber newReal2 = new RealNumber(0.0);
    RealNumber nonZero = new RealNumber(1.0);
    RealNumber notOne = new RealNumber(1.0001);
    RealNumber One = new RealNumber(1.0);
    RealNumber alsoOne = new RealNumber(1.000009);
    System.out.println(newReal1.equals(newReal2));//true
    System.out.println(newReal1.equals(nonZero));//false
    System.out.println(nonZero.equals(newReal1));//false
    System.out.println(nonZero.equals(notOne));//false
    System.out.println(nonZero.equals(One));//true
    System.out.println(nonZero.equals(alsoOne));//true
    //Testing add() for RealNumber()
    System.out.println("\nTesting add() for RealNumber()");
    System.out.println(One.add(alsoOne));
    System.out.println(One.add(notOne));
    System.out.println(One.add(newReal1));
    //Testing multiply() for RealNumber()
    System.out.println("\nTesting multiply() for RealNumber()");
    System.out.println(One.multiply(alsoOne));
    System.out.println(notOne.multiply(alsoOne));
    //Testing divide() for RealNumber()
    System.out.println("\nTesting divide() for RealNumber()");
    System.out.println(One.divide(alsoOne));
    //System.out.println(One.divide(newReal1));
    //Throws RuntimeException
    //Testing subtract() for RealNumber()
    System.out.println("\nTesting subtract() for RealNumber()");
    System.out.println(One.subtract(nonZero));
    System.out.println(One.subtract(newReal1));
    System.out.println(alsoOne.subtract(notOne));
    //Tests for RationalNumber()
    //Testing toString() and RationalNumber()
    System.out.println("\nTesting toString() and RationalNumber()");
    RationalNumber OneRational = new RationalNumber(8,8);
    RationalNumber overZero = new RationalNumber(2,0);
    RationalNumber threeFourths = new RationalNumber(3,4);
    RationalNumber sixEighths = new RationalNumber(6,8);
    RationalNumber negativeThreeFourths = new RationalNumber(3,-4);
    RationalNumber Three = new RationalNumber(9,3);
    System.out.println(OneRational);
    System.out.println(overZero);
    System.out.println(threeFourths);
    System.out.println(sixEighths);
    System.out.println(negativeThreeFourths);
    System.out.println(Three);
    //Testing getValue() for RationalNumber()
    System.out.println("\nTesting getValue() for RationalNumber()");
    System.out.println(OneRational.getValue());
    System.out.println(overZero.getValue());
    System.out.println(threeFourths.getValue());
    System.out.println(sixEighths.getValue());
    System.out.println(negativeThreeFourths.getValue());
    System.out.println(Three.getValue());
    //Testing getNumerator() for RationalNumber()
    System.out.println("\nTesting getNumerator() for RationalNumber()");
    System.out.println(OneRational.getNumerator());
    System.out.println(overZero.getNumerator());
    System.out.println(threeFourths.getNumerator());
    System.out.println(sixEighths.getNumerator());
    System.out.println(negativeThreeFourths.getNumerator());
    System.out.println(Three.getNumerator());
    //Testing getDenominator() for RationalNumber()
    System.out.println("\nTesting getDenominator() for RationalNumber()");
    System.out.println(OneRational.getDenominator());
    System.out.println(overZero.getDenominator());
    System.out.println(threeFourths.getDenominator());
    System.out.println(sixEighths.getDenominator());
    System.out.println(negativeThreeFourths.getDenominator());
    System.out.println(Three.getDenominator());
    //Testing reciprocal() for RationalNumber()
    System.out.println("\nTesting reciprocal() for RationalNumber()");
    System.out.println(OneRational.reciprocal());
    System.out.println(overZero.reciprocal());
    System.out.println(threeFourths.reciprocal());
    System.out.println(sixEighths.reciprocal());
    System.out.println(negativeThreeFourths.reciprocal());
    System.out.println(Three.reciprocal());
    //Testing equals() for RationalNumber()
    System.out.println("\nTesting equals() for RationalNumber()");
    System.out.println(threeFourths.equals(sixEighths));
    System.out.println(sixEighths.equals(OneRational));
    //Testing multiply() for RationalNumber()
    System.out.println("\nTesting multiply() for RationalNumber()");
    System.out.println(threeFourths.multiply(negativeThreeFourths));
    System.out.println(Three.multiply(OneRational));
    //Testing divide() for RationalNumber()
    System.out.println("\nTesting divide() for RationalNumber()");
    System.out.println(threeFourths.divide(Three));
    System.out.println(threeFourths.divide(negativeThreeFourths));
    System.out.println(OneRational.divide(Three));
    System.out.println(OneRational.divide(overZero));
    System.out.println(overZero.divide(threeFourths));
    //Testing add() for RationalNumber()
    System.out.println("\nTesting add() for RationalNumber()");
    RationalNumber fourSevenths = new RationalNumber(4,7);
    System.out.println(threeFourths.add(fourSevenths));
    System.out.println(negativeThreeFourths.add(fourSevenths));
    System.out.println(OneRational.add(threeFourths));
  }
}
