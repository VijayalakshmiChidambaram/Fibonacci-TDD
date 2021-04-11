package sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciMemoizedRecursionTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciMemoizedRecursion();
  }

  @Test
  public void verifyMemoizedRecursiveIsFasterThanRecursive() {
    assertTrue(timeTakenToRunFibonacci(new FibonacciMemoizedRecursion()) * 10 <
      timeTakenToRunFibonacci(new FibonacciRecursive()));
  }

  private long timeTakenToRunFibonacci(Fibonacci instance) {
    long start = System.currentTimeMillis();
    instance.fibonacci(31);
    return System.currentTimeMillis() - start;
  }
}
