package sequence;

public class FibonacciRecursiveTest implements FibonacciTest{
  @Override
  public Fibonacci createFibonacci() { return new FibonacciRecursive(); }
}
