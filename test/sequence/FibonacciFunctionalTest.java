package sequence;

public class FibonacciFunctionalTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciFunctional();
  }
}
