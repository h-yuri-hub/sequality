package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalclateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    assertEquals(expected, calculate.sumAll(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0);

  }

  public void testKigu() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.ki_all(1, 10));
    expected = 30;
    assertEquals(expected, calculate.gu_all(1, 10));

  }

}
