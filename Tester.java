public class Tester {
  public static void main(String[] args) {
    //Tests for RealNumber()
    //Testing equals() for RealNumber()
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
    System.out.println(One.add(alsoOne));
    System.out.println(One.add(notOne));
    System.out.println(One.add(newReal1));
    //Testing multiply() for RealNumber()
    System.out.println(One.multiply(alsoOne));
    System.out.println(notOne.multiply(alsoOne));
    //Testing divide() for RealNumber()
    System.out.println(One.divide(alsoOne));
    //System.out.println(One.divide(newReal1));
    //Throws RuntimeException
    //Testing subtract() for RealNumber()
    System.out.println(One.subtract(nonZero));
    System.out.println(One.subtract(newReal1));
    System.out.println(alsoOne.subtract(notOne));
    //Tests for RationalNumber()
    //Testing toString() and RationalNumber()
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
    //Testing getValue()
    System.out.println(OneRational.getValue());
    System.out.println(overZero.getValue());
    System.out.println(threeFourths.getValue());
    System.out.println(sixEighths.getValue());
    System.out.println(negativeThreeFourths.getValue());
    System.out.println(Three.getValue());
  }
}
