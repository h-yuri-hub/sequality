package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumAll(int x, int y) {
    Calculate calculate = new Calculate();
    int all = 0;
    for (int i = x; i <= y; i++) {
      all = calculate.sum(i, all);
    }

    return all;
  }

  public double average(int x, int y) {
    int all = sumAll(x, y);
    int counter = y - x + 1;
    double calc = (double) all / counter;

    return calc;

  }

  public int ki_all(int x, int y) {

    Calculate calculate = new Calculate();
    int ki_all = 0;
    int i;
    for (i = x; i <= y; i++) {
      if (i % 2 == 1) {
        ki_all = calculate.sum(i, ki_all);
      }
    }
    return ki_all;

  }

  public int gu_all(int x, int y) {

    Calculate calculate = new Calculate();
    int gu_all = 0;
    int i;
    for (i = x; i <= y; i++) {
      if (i % 2 == 0) {
        gu_all = calculate.sum(i, gu_all);
      }
    }
    return gu_all;

  }

  public static int main(String[] args) {

    return 0;

  }
}
