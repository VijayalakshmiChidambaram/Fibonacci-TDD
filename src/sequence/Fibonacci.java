package sequence;

public abstract class Fibonacci {
  protected abstract int calculateFibonacci(int position);

  int fibonacci(int position){
    if (position < 0) {
      throw new RuntimeException("Invalid index position");
    }

    return calculateFibonacci(position);
  }
}