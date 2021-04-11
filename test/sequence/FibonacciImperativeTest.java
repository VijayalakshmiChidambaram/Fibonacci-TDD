package sequence;

public class FibonacciImperativeTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciImperative();
  }
}
