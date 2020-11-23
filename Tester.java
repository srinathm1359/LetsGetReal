public class Tester {
  public static void main(String[] args) {
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
  }
}
