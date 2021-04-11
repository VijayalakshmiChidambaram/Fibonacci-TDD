package sequence;

public class FibonacciRecursive extends Fibonacci {
  @Override
  public int calculateFibonacci(int position) {
    if(position < 2){
      return 1;
    }

    return calculateFibonacci(position - 1) + calculateFibonacci(position - 2);
  }
}
