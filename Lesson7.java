public class Tester {
  public static void main(final String[] args) {
    final ArithmeticProgression ap = new ArithmeticProgression(0, 0);
    ap.fm = 4;
    ap.diff = 2;
    ap.n = 5;
    ap.an = 8;
    ap.printGeneralSeries();
    System.out.println(ap.memberCalculation());
    System.out.println(ap.calculateN());
  }
}
//////////////////////////////////////////////////////
public class ArithmeticProgression {
  int fm;
  int diff;
  int n;
  int an;
  public ArithmeticProgression(int fm, int diff) {
    this.fm = fm;
    this.diff = diff;
  
  public void printGeneralSeries() {
    System.out.println("An = " + this.fm + "+(n-1)*" + this.diff);
  }
  public int memberCalculation() {
    return this.fm + (this.n - 1) * this.diff;
  }
  public double calculateN() {
      int count = this.fm;
      int state = 0;
      while (count <= this.an) {
          if (count == this.an) {
              state = 1;
              break;
          }
          count = count + this.diff;
      }
      return state;
  }
}
